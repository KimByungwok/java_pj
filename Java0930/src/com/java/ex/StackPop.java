package com.java.ex;

import java.util.LinkedList;
import java.util.Stack;

public class StackPop {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		System.out.println("Stack push : " + stack.push("아이언맨"));
		System.out.println("Stack push : " + stack.push("스파이더맨"));
		System.out.println("Stack push : " + stack.push("토르"));
		System.out.println("Stack push : " + stack.push("블랙 위도우"));
		System.out.println("Stack push : " + stack.push("닉퓨리"));
		System.out.println("Stack push : " + stack.push("헐크"));
		System.out.println("Stack push : " + stack.push("앤트맨"));
		System.out.println("Stack push : " + stack.push("블랙팬서"));
		System.out.println("=================================");

		int n1 = stack.search("닉퓨리");
		if (n1 != -1)
			System.out.println("stack에서\"닉퓨리\"의 위치: " + n1);
		else
			System.out.println("stack에\"닉퓨리\"는 없다");

		System.out.println("==========================");
		while (!stack.empty()) {
			Object obj = stack.pop();
			System.out.println("stack에서 pop: " + obj);
		}

		LinkedList<String> queue = new LinkedList<String>();
		System.out.println("queue offer : " + queue.offer("아이언맨"));
		// offer 는 집어 넣는 것
		System.out.println("queue offer : " + queue.offer("스파이더맨"));
		System.out.println("queue offer : " + queue.offer("토르"));
		System.out.println("queue offer : " + queue.offer("블랙위도우"));
		System.out.println("queue offer : " + queue.offer("닉퓨리"));
		System.out.println("queue offer : " + queue.offer("헐크"));
		System.out.println("queue offer : " + queue.offer("앤트맨"));
		System.out.println("queue offer : " + queue.offer("블랙팬서"));
		System.out.println("======================================");

		int n2 = queue.indexOf("블랙위도우");
		if (n2 != -1)
			System.out.println("queue에서 \"블랙위도우\"의 위치: " + n2);
		else
			System.out.println("queue에 \"블랙위도우\"는 없다");

		System.out.println("================================");

		while (!queue.isEmpty()) {
			Object obj = queue.poll();
			System.out.println(("queue에서 poll: " + obj));
		}

	}
}
