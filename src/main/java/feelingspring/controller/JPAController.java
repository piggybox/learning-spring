package feelingspring.controller;

import java.util.List;

import feelingspring.entity.Ingredient;
import feelingspring.repository.IngredientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JPAController {

    @Autowired
    private IngredientRepository inRepo;

    @GetMapping("/queryAll")
    public List<Ingredient> queryAll() {
        return inRepo.findAllByNativeQuery();
    }
}
