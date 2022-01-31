package com.company;

public class Property<K,V> {
    private K key;
    private V value;

    public Property(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Property{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
