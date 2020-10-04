package feelingspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import feelingspring.entity.Ingredient;
import feelingspring.repository.IngredientRepository;

@RestController
@RequestMapping(path = "/", produces = "application/json")
@CrossOrigin(origins = "*")
public class JPAController {

    @Autowired
    private IngredientRepository inRepo;

    @GetMapping("/query/{id}")
    public ResponseEntity<List<Ingredient>> query(@PathVariable("id") Long id) {
        return new ResponseEntity<>(inRepo.findAllByNativeQuery(), HttpStatus.OK);
    }
}
