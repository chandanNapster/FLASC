package com.company;

public class Edge<K,V> implements Comparable {
    private Node source;
    private Node target;
    private int edge_id;
    private static int count;

    public Edge(){
        count++;
        this.edge_id = count;
        source = null;
        target = null;
    }

    public Edge(Node source, Node target){
        count++;
        this.edge_id = count;
        this.source = source;
        this.target = target;
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

    @Override
    public String toString() {
        return "Edge{" +
                "source=" + source +
                ", target=" + target +
                ", edge_id=" + edge_id +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (source.equals((Node) o)) return 0;
        else return 1;
    }
}
