package com.company;

import java.util.ArrayList;
import java.util.List;

public class BasicConceptualGraphSchema<E> implements NodeLabeledGraph<E>,EdgelabeledGraph<E> {

    private List<E> nodeList;
    private List<E> edgeList;
    private int edgeCount;
    private int nodeCount;
    private static int eCount;
    private static int nCount;

    public BasicConceptualGraphSchema(){
        eCount= 0;
        nCount = 0;
        nodeList = new ArrayList<E>();
        edgeList = new ArrayList<E>();
    }

    @Override
    public void addNode(Node node) {
        if(nodeCount < 2) this.nodeList.add((E)node);
        nCount++;
        nodeCount = nCount;
    }

    @Override
    public void addEdge(Edge edge) {
        if(eCount <= 1) this.edgeList.add((E) edge);
        eCount++;
        edgeCount = eCount;
    }

    @Override
    public Node Source(Edge e) {
        return e.getSource();
    }

    @Override
    public Node Target(Edge e) {
        return e.getTarget();
    }

    @Override
    public void addEdgeLabels(Label label) {

    }

    @Override
    public void addNodeLabels(Label label) {

    }

    @Override
    public String toString() {
        return "BasicConceptualGraphSchema{" +
                "nodeList=" + nodeList +
                ", edgeList=" + edgeList +
                '}';
    }
}
