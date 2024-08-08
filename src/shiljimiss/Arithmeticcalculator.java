package shiljimiss;


abstract class calculator{
	public abstract void add(int a,int b);
	public abstract void sub(int a, int b);
	public abstract void mul(int a,int b);
	public abstract void div(int a,int b);
}
	class Additions extends calculator{

	@Override
	public void add(int a,int b) {
		// TODO Auto-generated method stub
		int sum;
		sum=a+b;
		System.out.println(sum);
		
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		int sub;
		sub=a-b;
		System.out.println(sub);
		
	}

	@Override
	public void mul(int a,int b) {
		// TODO Auto-generated method stub
		int mul=a*b;
		System.out.println(mul);
		
	}

	@Override
	public void div(int a,int b) {
		// TODO Auto-generated method stub
		int div=a/b;
		System.out.println(div);
		
	}
}
public class Arithmeticcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Additions ob=new  Additions();
		ob.add(10,20);
		ob.sub(20,10);
		ob.mul(10,10);
		ob.div(20,2);
	}

}
