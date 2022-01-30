package com.company;

import java.util.List;

public interface NodeLabeledGraph<E> extends DirectedMultigraph {
    public void addNodeLabels(Label label);
}
