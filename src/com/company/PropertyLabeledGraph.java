package com.company;

import java.util.List;

public interface PropertyLabeledGraph<E> extends DirectedMultigraph{
    public void addMandatoryProperties(List<E> mandPropList);
    public void addOptionalProperties(List<E> opPropList);
}
