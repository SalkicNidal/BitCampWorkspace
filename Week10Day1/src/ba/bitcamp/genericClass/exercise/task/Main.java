package ba.bitcamp.genericClass.exercise.task;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		Application MyApplication = new Application("Games", 2014, 7.1, 23);
		Application MyApplication1 = new Application("Photo", 2014, 7.1, 23);
		Application MyApplication2 = new Application("Race Game", 2015, 7.1, 23);
		Application MyApplication3 = new Application("Games3", 2014, 7.1, 23);

		
		
		MyLinkedList<Application> list = new MyLinkedList<Application>();
		
		list.addFirst(MyApplication);
		list.addLast(MyApplication3);
		list.addFirst(MyApplication1);
		list.add(MyApplication2, 1);
		
		System.out.println(list.search(MyApplication));
		System.out.println(list.contains(MyApplication2));
		System.out.println(list);
		
		LinkedList<Application> list1 = new LinkedList<Application>();
		
		list1.addAll(list1);
		System.out.println(list1);
		
	
		MyStack<Application> stack = new MyStack<Application>();
		
		
		Editor editor1 = new Editor("Games", 2010, 3.4, 45, false, Editor.Type.PHOTO);
		Editor editor2 = new Editor("Games1", 2010, 3.4, 45, false, Editor.Type.TEXT);
		Editor editor3 = new Editor("Games2", 2010, 3.4, 45, false, Editor.Type.VIDEO);
		
		list.addFirst(editor3);
		System.out.println(list);
		
		stack.addAll(list1);
		stack.push(editor2);
		stack.push(MyApplication1);
		System.out.println(stack);
		
		

	}

}
