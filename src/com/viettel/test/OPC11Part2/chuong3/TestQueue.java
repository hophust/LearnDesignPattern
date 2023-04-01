package com.viettel.test.OPC11Part2.chuong3;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        System.out.println(queue.offer(10)); // true
        System.out.println(queue.offer(4)); // true
        System.out.println(queue.offer(6)); // true
        System.out.println(queue.add(5)); // true
        System.out.println(queue.offer(9)); // true
        System.out.println(queue);
        System.out.println(queue.peek()); // 10
        System.out.println(queue.poll()); // 10
        System.out.println(queue.poll()); // 4
        System.out.println(queue.peek()); // null
    }
}
