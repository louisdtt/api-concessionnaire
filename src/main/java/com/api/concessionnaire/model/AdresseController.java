package com.api.concessionnaire.model;

import com.api.concessionnaire.model.exceptions.AlreadyExistingException;
import com.api.concessionnaire.model.exceptions.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("adresse")
public class AdresseController {

    private AdresseRepository adresseRepository;

    @GetMapping("/adresses")
    public List<Adresse> getAdresses() {
        return adresseRepository.findAll();
    }

    @GetMapping("/adresses/{adresseId}")
    public Optional<Adresse> getAdresse(@PathVariable("adresseId") int adresseId) throws ResourceNotFoundException {
        Optional<Adresse> optionalAdresse = adresseRepository.findById(adresseId);

        if (optionalAdresse.isPresent()) {
            return optionalAdresse;
        } else {
            throw new ResourceNotFoundException(MessageFormat.format("Adresse: {} not found.", adresseId));
        }
    }

    @PostMapping("/adresses")
    public void createAdresse(@RequestBody Adresse newAdresse) throws AlreadyExistingException {
        final Optional<Adresse> optionalAdresse = adresseRepository.findAll().stream().filter(adresse -> adresse.getId() == newAdresse.getId()).findFirst();

        if (optionalAdresse.isPresent()) {
            throw new AlreadyExistingException(MessageFormat.format("Adresse: {} already exists.", newAdresse.getId()));
        } else {
            adresseRepository.save(newAdresse);
        }
    }

    @PutMapping("/adresses/{adresseId}")
    public Adresse updateAdresse(@RequestBody Adresse newAdresse, @PathVariable("adresseId") int id) {
        return adresseRepository.findById(id).map(adresse -> {
            adresse.setNumRue(newAdresse.getNumRue());
            adresse.setRue(newAdresse.getRue());
            adresse.setCodePostal(newAdresse.getCodePostal());
            adresse.setVille(newAdresse.getVille());
            return adresseRepository.save(adresse);
        }).orElseGet(() -> {
            newAdresse.setId(id);
            return adresseRepository.save(newAdresse);
        });
    }

    @DeleteMapping("/adresses/{id}")
    public void deleteAdresse(@PathVariable int id) {
        adresseRepository.deleteById(id);
    }
}
