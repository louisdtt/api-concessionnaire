package com.api.concessionnaire.model;

import com.api.concessionnaire.model.exceptions.AlreadyExistingException;
import com.api.concessionnaire.model.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/marques")
public class MarqueController {

    @Autowired
    private MarqueRepository marqueRepository;

    @GetMapping
    public List<Marque> getMarques() {
        return marqueRepository.findAll();
    }

    @GetMapping("/{marqueId}")
    public Optional<Marque> getMarque(@PathVariable("marqueId") int marqueId) throws ResourceNotFoundException {
        Optional<Marque> optionalMarque = marqueRepository.findById(marqueId);

        if (optionalMarque.isPresent()) {
            return optionalMarque;
        } else {
            throw new ResourceNotFoundException("Marque " + marqueId + "not found.");
        }
    }

    @PostMapping
    public void createMarque(@RequestBody Marque newMarque) throws AlreadyExistingException {
        final Optional<Marque> optionalMarque = marqueRepository.findAll().stream().filter(Marque -> Marque.getId() == newMarque.getId()).findFirst();

        if (optionalMarque.isPresent()) {
            throw new AlreadyExistingException("Marque " + newMarque.getId() + " already exists.");
        } else {
            marqueRepository.save(newMarque);
        }
    }

    @PutMapping("/{marqueId}")
    public Marque updateMarque(@RequestBody Marque newMarque, @PathVariable("marqueId") int id) {
        return marqueRepository.findById(id).map(marque -> {
            marque.setName(newMarque.getName());
            return marqueRepository.save(marque);
        }).orElseGet(() -> {
            newMarque.setId(id);
            return marqueRepository.save(newMarque);
        });
    }

    @DeleteMapping("/{id}")
    public void deleteMarque(@PathVariable int id) {
        marqueRepository.deleteById(id);
    }
}
