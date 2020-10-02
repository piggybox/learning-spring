package com.feelingSpring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.AccessLevel;

@Data
@Entity
public class Ingredient {
    @Id
    private Integer id;
    private String name;
    private String type;
}