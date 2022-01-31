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

        Node node4 = new Node();
        node4.setMandatoryProp("name",DataType.STRING);
        node4.setMandatoryProp("age",DataType.INTEGER);

        Node node5 = new Node();
        node5.setMandatoryProp("name",DataType.STRING);
        node5.setMandatoryProp("age",DataType.INTEGER);




        Edge edge1 = new Edge(node1,node2);
        Edge edge2 = new Edge(node1,node3);
        Edge edge3 = new Edge(node2, node4);
        Edge edge4 = new Edge(node2,node5);
        Edge edge5 = new Edge(node2,node3);
        edge1.setMandatoryProp("owns",DataType.STRING);

        AddToList add = new AddToList();
        add.addtoList(node1);
        add.addtoList(node2);
        add.addtoList(node3);
        add.addtoList(node4);
        add.addtoList(node5);
        add.addtoList(edge1);
        add.addtoList(edge2);
        add.addtoList(edge3);
        add.addtoList(edge4);
        add.addtoList(edge5);



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

//        DirectedMultigraph cg = new ConceptualGraphSchema();
//        cg.addNode(node1);
//        cg.addNode(node2);
//        cg.addNode(node3);
//        cg.addEdge(edge);
//        System.out.println(cg.Source(edge));
//        System.out.println(cg.Target(edge));
//        System.out.println(cg);

         DirectedMultigraph lg = new LogicalGraphSchema();

         for(Object o : add.getList()){
//             System.out.println(o.getClass().getName());
             if(o.getClass().getName().equals("com.company.Node")) lg.addNode((Node) o);
             else lg.addEdge((Edge) o);
         }
//         lg.addNode(node1);
//         lg.addNode(node2);
//         lg.addNode(node3);
//         lg.addNode(node4);
//         lg.addNode(node5);
//         lg.addEdge(edge1);
//         lg.addEdge(edge2);
//         lg.addEdge(edge3);
//         lg.addEdge(edge4);
//         lg.addEdge(edge5);
         System.out.println(lg);




    }

    public static class AddToList<E>{
        List<E> nodeAndEdgesList = new ArrayList<>();

        public void addtoList(E e){
            nodeAndEdgesList.add(e);
        }

        public List<E> getList(){
            return nodeAndEdgesList;
        }
    }
}
