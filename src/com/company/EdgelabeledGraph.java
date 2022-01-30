package com.company;

import java.util.List;

public interface EdgelabeledGraph<E> extends DirectedMultigraph{
    public void addEdgeLabels(Label label);
}
