package com.aksa.sample.proj.test;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	
	public static void main(String[] args) {

		Queue<Integer> queue=new LinkedList<>();
		queue.add(100);
		queue.add(200);
		queue.add(300);
		queue.add(400);
		queue.add(500);
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		queue.add(600);
		queue.poll();
		System.out.println(queue);
		
	}

}
