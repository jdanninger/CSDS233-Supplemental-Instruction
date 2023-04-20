import java.util.*;

public class Graph {
    public Graph() {
        adjList = new ArrayList<>();
    }

    List<Node> adjList = new ArrayList<>();

    private class Node {
        public String data;
        public Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // debug data
    public void printGraph() {
        for (Node node : adjList) {
            System.out.print(node.data + " -> ");
            Node temp = node.next;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    // add vertex
    public void addVertex(String data) {
        Node node = new Node(data);
        adjList.add(node);
    }

    // get vertex
    public Node getVertex(String data) {
        for (Node node : adjList) {
            if (node.data.equals(data)) {
                return node;
            }
        }
        return null;
    }

    // add edge
    public void addEdge(String data1, String data2) {
        Node node1 = getVertex(data1);
        Node node2 = getVertex(data2);
        if (node1 == null || node2 == null) {
            System.out.println("Invalid vertex");
            return;
        }
        Node temp = node1.next;
        node1.next = node2;
        node2.next = temp;
    }
    // remove vertex

    // remove edge

    // get neighbors of a vertex

    public static void main(String args[]) {
        Graph testGraph = new Graph();
        testGraph.addVertex("A");
        testGraph.addVertex("B");
        testGraph.addVertex("C");
        testGraph.addVertex("D");
        testGraph.addVertex("E");
        testGraph.addEdge("A", "E");
        testGraph.printGraph();
    }

}
