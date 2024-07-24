package javaprojects;

public class Operators {
	public static void main(String arg[]) {
	
		// ARITHMETIC operators
		
		int num1=100,num2=30,sum,sub,mod,mul;
		float div;
		
		sum=num1+num2;
		sub=num1-num2;
		mul=num1*num2;
		div=num1/num2;
		mod=num1%num2;
	
		System.out.println("sum is  :"  +sum);
		System.out.println("sub is   :"  +sub);
		System.out.println("division is " +div);
		System.out.println("multiple is  " +mul);
		System.out.println("mod is       " +mod); 
		
		
		
		
		//UNARY OPERATOR
		int a = 10;
		int c=-a;
		boolean d=true;
		boolean e=!d;
		System.out.println("unary minus  :"+c  );
		System.out.println("not is   :"+e  );  
		
		
		
		
		
		
		// INCREMENT OPERATORS
		 int a1=10;
		 a1++;
		 System.out.println("post increment of a"  +a1);
		 ++a1;
		 System.out.println("pre increment of a"  +a1); 
		 
		
		
		
		//BITWISE COMPLIMENT
		int a2=10;
		int f=~a2;
		System.out.println(" bitwise compliment of a  :"  +f); 
		
		
		
		//RELATIONAL OPERETORS
	    int a=10,b=30;
		boolean J,K,L,M,N;
		J= a>b;
		K=a>=b;
		L=a<=b;
		M=a==b;
		N=a!=b;
		
		System.out.println("a>b is  :"+J);
		System.out.println("a>=b is  :"+K);
		System.out.println("a<=b is  :"+L);
		System.out.println("a==b is  :"+M);
		System.out.println("a!=b is  :"+N);      
		
		
		
		
		
		
	// LOGICAL operators (!,$$,||)
	
	int n1=20,n2=40;
	
	boolean b7=((n1>n2)&&(n1<n2)); // false
	boolean b8=((n1>n2)||(n1<n2)); 
	boolean b9=((n1>n2)^(n1<n2)); 
	boolean b10=((n1>n2)&&(n1<n2)); 
	
	System.out.println(" this is   :"+b7);
	System.out.println(" this is    :"+b8);
	System.out.println(" this is    :"+b9);
	
	boolean b2=true;
	System.out.println("logical not   is :"+(!b2));
     System.out.println("logical and is  :" +b7);
	System.out.println("logical or is   :"    +b8);
	System.out.println("(!b7||b8)  :"    +(!b7||b8));
	System.out.println("(!b7&&b8)  :"    +(!b7&&b8));
	System.out.println("(!b7||b8)&&(b7||b8)  :"    +(!((b7|| b8)&& (b7||b8))));
	System.out.println("((!b7||b8 || b7||b8))  :"    +(!((b7||b8)||(b7||b8)))); 
		
		
		
		
		
		
	
	//CONDITION
	int res,num1=100,num2=50;
	res=(num1>num2)?(num1+num2): (num1-num2);
	String res1,res2;
	res1=num1>0? "positive numbers" : "negative numbers";
	res2=(num1%2==0)? "oddnumbers":"even numbers";
	System.out.println("result is  :"+res);
	System.out.println("res1  :"   +res1);
	System.out.println("res2 is   :"+res2); 
	
	
	
	
	
	
	//TERNARY OPERATORS OR CONDITIONAL OPERATORS
	
	int a1=10,a2=20,a3;
	a3=a1>a2?a1:a2;
	System.out.println(a3);
	
	
   
    
    
    
    // BITWISE operators   (& |  ^)
    
    int xx=4, yy=4;
    
	int res =xx & yy;
	
    System.out.println("result  ="+res);
    
    int res1 =xx | yy;
	
    System.out.println("result  ="+res1);
    
    int res2=xx ^ yy;
	
    System.out.println("result  ="+res2);
    
    
    
    
    
	
    
    // SHIFT operators(<<  >>  >>>)
    
    System.out.println(xx<<2);  // left shift
    System.out.println(xx>>2);  // right shift
    System.out.println(xx>>>2);  // unsigned right shift
    System.out.println(Integer.toBinaryString(12)); // binary value
    
    
    
	}
}
