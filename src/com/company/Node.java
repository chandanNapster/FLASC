package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class Node<K,V> implements Comparable{

    private int node_id;
    private Map<K,V> mProperties;
    private Map<K,V> oProperties;
    private static int count;

    public Node(){
        count++;
        this.node_id = count;
        this.mProperties = new HashMap<>();
        this.oProperties = new HashMap<>();
    }

    public Node(HashMap<K,V> mProperties){
        count++;
        this.node_id = count;
        this.mProperties = mProperties;
    }

    public int getNode_id() {
        return this.node_id;
    }

    public void setNode_id(int node_id) {
        this.node_id = node_id;
    }

    public Map<K, V> getmProperties() {
        return mProperties;
    }

    public void setmProperties(Map<K, V> mProperties) {
        this.mProperties = mProperties;
    }

    public Map<K, V> getoProperties() {
        return oProperties;
    }

    public void setoProperties(Map<K, V> oProperties) {
        this.oProperties = oProperties;
    }

    @Override
    public String toString() {
        return "Node{" +
                "node_id=" + node_id +
                ", mProperties=" + mProperties +
                ", oProperties=" + oProperties +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node<?, ?> node = (Node<?, ?>) o;
        return getmProperties().equals(node.getmProperties()) && getoProperties().equals(node.getoProperties());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getmProperties(), getoProperties());
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
