package collections;

import java.util.Stack;

public class Stackprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack li=new Stack();
		li.push("fasila");
		li.push("favas");
		li.push("faris");
		li.push("fasi");
		li.push("faizal");
		li.push("farzin");
		
		System.out.println("display the elements"+li);
		
		li.push(21);
		li.push("fas");
		
		for(int i=0;i<li.size();i++) {
			System.out.println(" \n elements are "+li.get(i));
		}
		System.out.println("top of the element "+li.peek());
		
		li.pop();
		System.out.println(li);
		System.out.println("top of the element "+li.peek());
		
	}

}
