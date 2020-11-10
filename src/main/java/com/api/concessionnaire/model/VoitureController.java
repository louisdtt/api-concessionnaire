package com.api.concessionnaire.model;

import com.api.concessionnaire.model.exceptions.AlreadyExistingException;
import com.api.concessionnaire.model.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/voitures")
public class VoitureController {

    @Autowired
    private VoitureRepository voitureRepository;

    @GetMapping
    public List<Voiture> getVoitures() {
        return voitureRepository.findAll();
    }

    @GetMapping("/{voitureId}")
    public Optional<Voiture> getVoiture(@PathVariable("voitureId") int voitureId) throws ResourceNotFoundException {
        Optional<Voiture> optionalVoiture = voitureRepository.findById(voitureId);

        if (optionalVoiture.isPresent()) {
            return optionalVoiture;
        } else {
            throw new ResourceNotFoundException("Voiture " + voitureId + "not found.");
        }
    }

    @PostMapping
    public void createVoiture(@RequestBody Voiture newVoiture) throws AlreadyExistingException {
        final Optional<Voiture> optionalVoiture = voitureRepository.findById(newVoiture.getId());

        if (optionalVoiture.isPresent()) {
            throw new AlreadyExistingException("Voiture " + newVoiture.getId() + " already exists.");
        } else {
            voitureRepository.save(newVoiture);
        }
    }

    @PutMapping("/{voitureId}")
    public Voiture updateVoiture(@RequestBody Voiture newVoiture, @PathVariable("voitureId") int id) {
        return voitureRepository.findById(id).map(voiture -> {
            voiture.setName(newVoiture.getName());
            voiture.setMarque(newVoiture.getMarque());
            voiture.setClient(newVoiture.getClient());
            return voitureRepository.save(voiture);
        }).orElseGet(() -> {
            newVoiture.setId(id);
            return voitureRepository.save(newVoiture);
        });
    }

    @DeleteMapping("/{id}")
    public void deleteVoiture(@PathVariable int id) {
        voitureRepository.deleteById(id);
    }
}
