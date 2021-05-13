package com.example.graphqlstartervehicle.dao.entity;

import java.util.List;

public interface CanPerformActions {

    List<Action> getActions();

    void addAction(Action action);

}