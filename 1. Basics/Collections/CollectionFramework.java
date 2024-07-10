package Collections;

import java.util.*;

public class CollectionFramework {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(10);
        list.add(2,7);
        System.out.println("Array List: " + list);

        //LinkedList
        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(1);
        linkedlist.add(8);
        linkedlist.add(1,5);
        System.out.println("Linked List: " + linkedlist);

        //Vector
        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.add("B");
        vector.add("C");
        System.out.println("Vector: " + vector);

        //Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());

        //Queue
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(3);
        queue.offer(10);
        queue.offer(2);
        queue.offer(5);
        queue.offer(2);
        System.out.println("Linked List using Queue: " + queue);
        queue.poll();
        System.out.println(queue);

        //PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(12);
        priorityQueue.offer(20);
        priorityQueue.offer(5);
        priorityQueue.offer(1);
        priorityQueue.offer(8);
        System.out.println("Priority Queue: " + priorityQueue);

        //ArrayQueue
        Deque<Integer> arraydeque = new ArrayDeque<>();
        arraydeque.offer(10);
        arraydeque.offer(15);
        arraydeque.offer(20);
        arraydeque.offer(25);
        System.out.println("Double Ended Queue: " + arraydeque);
        arraydeque.offerFirst(5);
        arraydeque.offer(30);
        System.out.println("Double Ended Queue: " + arraydeque);
        arraydeque.poll();
        System.out.println("Double Ended Queue: " + arraydeque);
        arraydeque.pollLast();
        System.out.println("Double Ended Queue: " + arraydeque);

        //HashSet
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(10);
        set.add(15);
        set.add(25);
        set.add(15);
        System.out.println("Hash Set: " + set);

        //LinkedHashSet
        LinkedHashSet<Integer> lhset = new LinkedHashSet<>();
        lhset.add(5);
        lhset.add(2);
        lhset.add(2);
        lhset.add(10);
        System.out.println("Linked Hash Set: " + lhset);

        //TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(15);
        treeSet.add(4);
        treeSet.add(35);
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(8);
        System.out.println("Tree Set: " + treeSet);

        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));

    }
}
