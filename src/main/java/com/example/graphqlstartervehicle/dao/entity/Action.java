package com.example.graphqlstartervehicle.dao.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@Builder
@EqualsAndHashCode
public class Action {

    private ActionType type;
    @Builder.Default private Date timestamp = new Date();

}