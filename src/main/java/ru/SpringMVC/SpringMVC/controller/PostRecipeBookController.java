package ru.SpringMVC.SpringMVC.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.SpringMVC.SpringMVC.data.Recipe;
import ru.SpringMVC.SpringMVC.service.RecipeService;

@Controller
@RequiredArgsConstructor
public class PostRecipeBookController {

    private final RecipeService recipeService;


    @PostMapping("/recipes/create")
    public String addRecipe(@RequestParam String name, @RequestParam String description, Model model) {
        Recipe newRecipe = new Recipe(0, name, description);
        recipeService.saveRecipe(newRecipe);
        return "redirect:/recipes";
    }


    @PostMapping("/recipes/{name}/delete")
    public String deleteRecipe(@PathVariable String name) {
        recipeService.deleteRecipeByName(name);
        return "redirect:/recipes";
    }
}