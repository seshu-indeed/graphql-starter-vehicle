package com.example.graphqlstartervehicle.dao.entity;

import java.util.ArrayList;
import java.util.List;

public abstract class ActionableEntity implements CanPerformActions {

    protected List<Action> actions = new ArrayList<>();

    @Override
    public List<Action> getActions() {
        return actions;
    }

    @Override
    public void addAction(Action action) {
        actions.add(action);
    }

}