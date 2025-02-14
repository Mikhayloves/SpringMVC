package ru.SpringMVC.SpringMVC.data;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface DataRecipe extends CrudRepository<Recipe, Integer> {

    List<Recipe> findByName(String name);

    @Modifying
    @Transactional
    @Query("DELETE FROM Recipe r WHERE r.name = :name")
    void deleteByName(@Param("name") String name);

    List<Recipe> findAll();
}
