package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class Node<K,V> implements Comparable{

    private int node_id;
    private Map<K,V> mPropertiesList;
    private Map<K,V> oPropertiesList;
    private static int count;

    public Node(){
        count++;
        this.node_id = count;
        this.mPropertiesList = new HashMap<>();
        this.oPropertiesList = new HashMap<>();
    }

//    public Node(HashMap<K,V> mProperties){
//        count++;
//        this.node_id = count;
//        this.mProperties = mProperties;
//    }

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
        return "Node{" +
                "node_id=" + node_id +
                ", mPropertiesList=" + mPropertiesList +
                ", oPropertiesList=" + oPropertiesList +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
