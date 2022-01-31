package com.company;

import java.util.ArrayList;
import java.util.List;

public class Graph<E> implements NodeLabeledGraph<E>, EdgelabeledGraph<E>, PropertyLabeledGraph<E>{
    private List<Node> nodeList;
    private List<Edge> edgeList;
    private int graph_id;
    private static int count;

    public Graph(){
        count++;
        nodeList = new ArrayList<>();
        edgeList = new ArrayList<>();
        this.graph_id = count;
    }


    @Override
    public void addNode(Node node) {
        this.nodeList.add(node);
    }

    @Override
    public void addEdge(Edge edge) {
        this.edgeList.add(edge);
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
    public void addMandatoryProperties(E mandProp) {

    }

    @Override
    public void addOptionalProperties(E opProp) {

    }
}
