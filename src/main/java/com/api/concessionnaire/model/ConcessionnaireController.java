package com.api.concessionnaire.model;

import com.api.concessionnaire.model.exceptions.AlreadyExistingException;
import com.api.concessionnaire.model.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/concessionnaires")
public class ConcessionnaireController {

    @Autowired
    private ConcessionnaireRepository concessionnaireRepository;

    @GetMapping
    public List<Concessionnaire> getConcessionnaires() {
        return concessionnaireRepository.findAll();
    }

    @GetMapping("/{concessionnaireId}")
    public Optional<Concessionnaire> getConcessionnaire(@PathVariable("concessionnaireId") int concessionnaireId) throws ResourceNotFoundException {
        Optional<Concessionnaire> optionalConcessionnaire = concessionnaireRepository.findById(concessionnaireId);

        if (optionalConcessionnaire.isPresent()) {
            return optionalConcessionnaire;
        } else {
            throw new ResourceNotFoundException("Concessionnaire " + concessionnaireId + "not found.");
        }
    }

    @PostMapping
    public void createConcessionnaire(@RequestBody Concessionnaire newConcessionnaire) throws AlreadyExistingException {
        final Optional<Concessionnaire> optionalConcessionnaire = concessionnaireRepository.findById(newConcessionnaire.getId());

        if (optionalConcessionnaire.isPresent()) {
            throw new AlreadyExistingException("Concessionnaire " + newConcessionnaire.getId() + " already exists.");
        } else {
            concessionnaireRepository.save(newConcessionnaire);
        }
    }

    @PutMapping("/{concessionnaireId}")
    public Concessionnaire updateConcessionnaire(@RequestBody Concessionnaire newConcessionnaire, @PathVariable("concessionnaireId") int id) {
        return concessionnaireRepository.findById(id).map(concessionnaire -> {
            concessionnaire.setName(newConcessionnaire.getName());
            concessionnaire.setAdresse(newConcessionnaire.getAdresse());
            concessionnaire.setMarques(newConcessionnaire.getMarques());
            return concessionnaireRepository.save(concessionnaire);
        }).orElseGet(() -> {
            newConcessionnaire.setId(id);
            return concessionnaireRepository.save(newConcessionnaire);
        });
    }

    @DeleteMapping("/{id}")
    public void deleteConcessionnaire(@PathVariable int id) {
        concessionnaireRepository.deleteById(id);
    }
}
