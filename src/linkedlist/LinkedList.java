/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Maruf
 */
public class LinkedList {
    Node head;
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        list.head.next = second;
        second.next = third;
        
        Node n = list.head;
        while(n != null){
            System.out.print(n.data+" ");
            n= n.next;
        }
    }
}
