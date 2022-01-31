package com.company;

import java.util.List;

public interface PropertyLabeledGraph<E> extends DirectedMultigraph{
    public void addMandatoryProperties(E mandProp);
    public void addOptionalProperties(E opProp);
}
