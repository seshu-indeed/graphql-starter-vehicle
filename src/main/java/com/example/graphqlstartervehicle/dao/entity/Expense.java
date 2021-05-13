package com.example.graphqlstartervehicle.dao.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.List;

@Data
@Builder
@EqualsAndHashCode
public class Expense extends ActionableEntity {
    private static final long serialVersionUID = 1L;

    long id;

    int amount;

    Category category;

}