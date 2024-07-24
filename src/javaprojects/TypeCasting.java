package javaprojects;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// widening
		char value= 'a';
		int num= value;
		float exp=num;
		System.out.println("value=" +value+"\nnum ="+num+"\nexp="+exp);
		
		
		
		float value1= 1000.0f;
		int num1= (int) value1;
		char value2= (char)num1;
		System.out.println("value1=" +value1+"\nnum1="+num+"\nvalue2="+value2);
	}

}
