package ru.SpringMVC.SpringMVC.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.SpringMVC.SpringMVC.data.Recipe;
import ru.SpringMVC.SpringMVC.data.RecipeDao;

import java.util.List;

@Service(value = "recipeService")
@RequiredArgsConstructor
public class RecipeService {

    private final RecipeDao recipeDao;

    public List<Recipe> findRecipeByName(String name) {
        return recipeDao.findRecipesByName(name);
    }

    public void deleteRecipeByName(String name) {
        recipeDao.deleteRecipeByName(name);
    }

    public Recipe saveRecipe(Recipe recipe) {
        return recipeDao.saveRecipe(recipe);
    }
}
