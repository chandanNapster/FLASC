package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Node<K,V> {

    private static int NODE_ID = 0;
    private Map<K,V> mProperties;
    private Map<K,V> oProperties;

    public Node(){
        this.NODE_ID = NODE_ID + 1;
        this.mProperties = new HashMap<>();
    }

    public Node(HashMap<K,V> mProperties){
        this.NODE_ID = NODE_ID + 1;
        this.mProperties = mProperties;
    }

    public static int getNodeId() {
        return NODE_ID;
    }

    public static void setNodeId(int nodeId) {
        NODE_ID = nodeId;
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
        return "Node{" +"Node ID = "+ this.NODE_ID + "," +
                "mProperties=" + mProperties +
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
}
