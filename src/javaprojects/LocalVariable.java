package javaprojects;

public class LocalVariable {
	public void add() {
		int num1 = 8,num2=10,sum;
		sum=num1+num2;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalVariable ob= new LocalVariable();
		ob.add();
	}

}
