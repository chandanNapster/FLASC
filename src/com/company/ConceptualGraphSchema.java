package com.company;

import java.util.ArrayList;
import java.util.List;

public class ConceptualGraphSchema<E> extends BasicConceptualGraphSchema{
    private List<E> nodeList;
    private List<E> edgeList;


    public ConceptualGraphSchema(){
        nodeList = new ArrayList<E>();
        edgeList = new ArrayList<E>();
    }

    @Override
    public void addNode(Node node) {
        this.nodeList.add((E)node);

    }

    @Override
    public void addEdge(Edge edge) {
        this.edgeList.add((E) edge);
    }

    @Override
    public String toString() {
        return "ConceptualGraphSchema{" +
                "nodeList=" + nodeList +
                ", edgeList=" + edgeList +
                '}';
    }
}
