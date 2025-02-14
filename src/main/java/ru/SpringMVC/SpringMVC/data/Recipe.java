package ru.SpringMVC.SpringMVC.data;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "recipe")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "recipe_seq")
    @SequenceGenerator(name = "recipe_seq", sequenceName = "recipe_seq", allocationSize = 1)
    @Column(name = "id")
    private int id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "description", nullable = false)
    private String description;
}
