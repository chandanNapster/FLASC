package com.company;

public interface DirectedMultigraph<K,V>  {
    public void addNode(Node node);
    public void addEdge(Edge edge);
    public Node<K,V> Source(Edge e);
    public Node<K,V> Target(Edge e);
}
