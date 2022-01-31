package com.company;

import java.util.HashMap;
import java.util.Map;

public class Edge<K,V> implements Comparable {
    private Node source;
    private Node target;
    private Map<K,V> mPropertiesList;
    private Map<K,V> oPropertiesList;
    private int edge_id;
    private static int count;

    public Edge(){
        count++;
        this.edge_id = count;
        source = null;
        target = null;
        mPropertiesList = new HashMap<>();
        oPropertiesList = new HashMap<>();
    }

    public Edge(Node source, Node target){
        count++;
        this.edge_id = count;
        this.source = source;
        this.target = target;
        mPropertiesList = new HashMap<>();
        oPropertiesList = new HashMap<>();
    }

    public Node getSource() {
        return source;
    }

    public void setSource(Node source) {
        this.source = source;
    }

    public Node getTarget() {
        return target;
    }

    public void setTarget(Node target) {
        this.target = target;
    }

    public void setMandatoryProp(K key, V value){
        setMandatoryPropStr(new Property(key,value));
    }

    public void setOptionalProp(K key, V value){
        setOptionalPropStr(new Property(key,value));
    }

    private void setMandatoryPropStr(Property<K, V> mandatoryProp) {
        this.mPropertiesList.put(mandatoryProp.getKey(), mandatoryProp.getValue());
    }

    private void setOptionalPropStr(Property<K, V> optionalProp) {
        this.oPropertiesList.put(optionalProp.getKey(),optionalProp.getValue());
    }

    @Override
    public String toString() {
        return "Edge{" +
                "source=" + source + "\n" +
                ", target=" + target + "\n" +
                ", mPropertiesList=" + mPropertiesList + "\n" +
                ", oPropertiesList=" + oPropertiesList + "\n"+
                ", edge_id=" + edge_id +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
