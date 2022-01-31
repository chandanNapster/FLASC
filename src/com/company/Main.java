package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node node1 = new Node();
        node1.setMandatoryProp("name",DataType.STRING);
        node1.setMandatoryProp("age",DataType.INTEGER);

        Node node2 = new Node();
        node2.setMandatoryProp("name",DataType.STRING);
        node2.setMandatoryProp("age",DataType.INTEGER);
        node2.setMandatoryProp("Salary",DataType.DOUBLE);

        Node node3 = new Node();
        node3.setMandatoryProp("name",DataType.STRING);
        node3.setMandatoryProp("age",DataType.INTEGER);




        Edge edge = new Edge(node1,node2);
        edge.setMandatoryProp("owns",DataType.STRING);
//        List NodeList = new ArrayList();
//        List EdgeList = new ArrayList();
//        NodeList.add(node1);
//        NodeList.add(node2);
//        EdgeList.add(edge);

//        Graph graph = new Graph();
//
//
//        List<Graph> lGraph = new ArrayList<>();
//        lGraph.add(graph);
//
//        for(Graph g : lGraph){
//            System.out.println(g);
//        }

//        BasicConceptualGraphSchema bcg = new BasicConceptualGraphSchema();
//        bcg.addNode(node1);
//        bcg.addNode(node2);
//        bcg.addNode(node1);
//        bcg.addEdge(edge);
//        System.out.println(bcg.Source(edge));
//        System.out.println(bcg.Target(edge));

        DirectedMultigraph cg = new ConceptualGraphSchema();
        cg.addNode(node1);
        cg.addNode(node2);
        cg.addNode(node3);
        cg.addEdge(edge);
        System.out.println(cg.Source(edge));
        System.out.println(cg.Target(edge));
        System.out.println(cg);


    }
}
