package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Graph graph = new Graph();
    Graph graph1 = new Graph(new Node(), new Edge());
    graph.setNode(new Node());
    graph.setNode(new Node());

        List<Graph> lGraph = new ArrayList<>();
        lGraph.add(graph);
        lGraph.add(graph1);

        for(Graph g : lGraph){
            System.out.println(g);
        }
    }
}
