package ru.SpringMVC.SpringMVC.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.SpringMVC.SpringMVC.data.Recipe;
import ru.SpringMVC.SpringMVC.service.RecipeService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class GetRecipeBookController {

    private final RecipeService recipeService;

    @GetMapping("/recipes")
    public String getRecipes(Model model) {
        List<Recipe> recipes = recipeService.findRecipeByName("");
        model.addAttribute("recipes", recipes);
        return "recipes";
    }

    @GetMapping("/recipes/create")
    public String showAddRecipeForm(Model model) {
        return "create";
    }

    @GetMapping("/recipes/delete/{name}")
    public String showDeleteRecipeForm(@PathVariable String name, Model model) {
        model.addAttribute("recipeName", name);
        return "delete";
    }
}
