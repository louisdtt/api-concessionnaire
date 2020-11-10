package com.api.concessionnaire.model;

import com.api.concessionnaire.model.exceptions.AlreadyExistingException;
import com.api.concessionnaire.model.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/adresses")
public class AdresseController {

    @Autowired
    private AdresseRepository adresseRepository;

    @GetMapping
    public List<Adresse> getAdresses() {
        return adresseRepository.findAll();
    }

    @GetMapping("/{adresseId}")
    public Optional<Adresse> getAdresse(@PathVariable("adresseId") int adresseId) throws ResourceNotFoundException {
        Optional<Adresse> optionalAdresse = adresseRepository.findById(adresseId);

        if (optionalAdresse.isPresent()) {
            return optionalAdresse;
        } else {
            throw new ResourceNotFoundException("Adresse " + adresseId + "not found.");
        }
    }

    @PostMapping
    public void createAdresse(@RequestBody Adresse newAdresse) throws AlreadyExistingException {
        final Optional<Adresse> optionalAdresse = adresseRepository.findById(newAdresse.getId());

        if (optionalAdresse.isPresent()) {
            throw new AlreadyExistingException("Adresse "+ newAdresse.getId() +" already exists.");
        } else {
            adresseRepository.save(newAdresse);
        }
    }

    @PutMapping("/{adresseId}")
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

    @DeleteMapping("/{id}")
    public void deleteAdresse(@PathVariable int id) {
        adresseRepository.deleteById(id);
    }
}
