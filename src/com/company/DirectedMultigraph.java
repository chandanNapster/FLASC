package com.company;

public interface DirectedMultigraph<K,V>  {
    public Node<K,V> getNode();
    public Edge<K,V> getEdge();
    public Node<K,V> Source(Edge e);
    public Node<K,V> Target(Edge e);
}
