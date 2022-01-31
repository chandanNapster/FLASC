package com.company;

import java.util.List;

public interface PropertyLabeledGraph<E> extends DirectedMultigraph{
    public void addMandatoryNodeProperty(E mandNodeProp);
    public void addOptionalNodeProperty(E opNodeProp);
    public void addMandatoryEdgeProperty(E mandEdgeProp);
    public void addOptionalEdgeProperty(E opEdgeProp);

}
