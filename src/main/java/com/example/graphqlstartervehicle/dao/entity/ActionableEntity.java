package com.example.graphqlstartervehicle.dao.entity;

import java.util.List;

public abstract class ActionableEntity implements CanPerformActions {

    protected List<Action> actions;

    @Override
    public List<Action> getActions() {
        return actions;
    }

    @Override
    public void addAction(Action action) {
        actions.add(action);
    }

}