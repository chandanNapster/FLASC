package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node node1 = new Node();
        Map map1 = new HashMap();
        map1.put("Name", 2.4);
        map1.put("Age", null);
        map1.put("Salary", "Double");
        node1.setmProperties(map1);

        Node node2 = new Node();
        Map map2 = new HashMap();
        map2.put("Name","String");
        node2.setmProperties(map2);

        Edge edge = new Edge(node1,node2);
        List NodeList = new ArrayList();
        List EdgeList = new ArrayList();
        NodeList.add(node1);
        NodeList.add(node2);
        EdgeList.add(edge);

        Graph graph = new Graph();


        List<Graph> lGraph = new ArrayList<>();
        lGraph.add(graph);

        for(Graph g : lGraph){
            System.out.println(g);
        }
    }
}
