package com.company;

import java.util.List;

public class LogicalGraphSchema<E> extends ConceptualGraphSchema<E> implements PropertyLabeledGraph<E>{


    @Override
    public void addMandatoryNodeProperty(E mandNodeProp) {

    }

    @Override
    public void addOptionalNodeProperty(E opNodeProp) {

    }

    @Override
    public void addMandatoryEdgeProperty(E mandEdgeProp) {

    }

    @Override
    public void addOptionalEdgeProperty(E opEdgeProp) {

    }

    @Override
    public String toString() {
        return "LogicalGraphSchema{ " + super.toString() + " }";
    }
}
