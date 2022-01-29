package com.company;

public class Graph<E> implements DirectedMultigraph{
    private static int GRAPH_ID = 0;
    private Node node;
    private Edge edge;

    public Graph(){
        this.GRAPH_ID = this.GRAPH_ID + 1;
        this.node = null;
        this.edge = null;
    }

    public Graph(Node node, Edge edge ){
        this.GRAPH_ID = this.GRAPH_ID + 1;
        this.node = node;
        this.edge = edge;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public void setEdge(Edge edge) {
        this.edge = edge;
    }

    @Override
    public Node getNode() {
        return null;
    }

    @Override
    public Edge getEdge() {
        return null;
    }

    @Override
    public Node Source(Edge e) {
        return null;
    }

    @Override
    public Node Target(Edge e) {
        return null;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "node=" + node +
                ", edge=" + edge +
                '}';
    }
}
