package com.example.graphqlstartervehicle.dao.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.Optional;

@Data
@Builder
@EqualsAndHashCode
public class Category extends ActionableEntity {

    private static final long serialVersionUID = 1L;

    long id;

    String code;

    Optional<Category> parent;

    List<String> tags;

    String definition;

}