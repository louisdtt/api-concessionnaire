package com.api.concessionnaire.model;

import com.api.concessionnaire.model.exceptions.AlreadyExistingException;
import com.api.concessionnaire.model.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    @GetMapping("/{clientId}")
    public Optional<Client> getClient(@PathVariable("clientId") int clientId) throws ResourceNotFoundException {
        Optional<Client> optionalClient = clientRepository.findById(clientId);

        if (optionalClient.isPresent()) {
            return optionalClient;
        } else {
            throw new ResourceNotFoundException("Client " + clientId + "not found.");
        }
    }

    @PostMapping
    public void createClient(@RequestBody Client newClient) throws AlreadyExistingException {
        final Optional<Client> optionalClient = clientRepository.findAll().stream().filter(Client -> Client.getId() == newClient.getId()).findFirst();

        if (optionalClient.isPresent()) {
            throw new AlreadyExistingException("Client " + newClient.getId() + " already exists.");
        } else {
            clientRepository.save(newClient);
        }
    }

    @PutMapping("/{clientId}")
    public Client updateClient(@RequestBody Client newClient, @PathVariable("clientId") int id) {
        return clientRepository.findById(id).map(client -> {
            client.setName(newClient.getName());
            client.setVoitures(newClient.getVoitures());
            return clientRepository.save(client);
        }).orElseGet(() -> {
            newClient.setId(id);
            return clientRepository.save(newClient);
        });
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable int id) {
        clientRepository.deleteById(id);
    }
}
