package ru.SpringMVC.SpringMVC.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository(value = "recipeDao")
public class RecipeDao {
    @SuppressWarnings("uncheck")
    @Autowired
    private DataRecipe dataRecipe;

    public List<Recipe> findRecipesByName(String name) {
        if (name == null || name.isBlank()) {
            return dataRecipe.findAll();
        }
        return dataRecipe.findByName(name);
    }

    @Transactional
    public void deleteRecipeByName(String name) {
        dataRecipe.deleteByName(name);
    }

    public Recipe saveRecipe(Recipe recipe) {
        return dataRecipe.save(recipe);
    }
}