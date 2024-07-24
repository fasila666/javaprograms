package stringprogramms;

public class Stringprogrammes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// char array
		
	/*	char elements[]= {'h','s','e','r'};
		//for(int i=0;i<elements.length;i++) {
			
		//	System.out.println(elements[i]);
	//	}
		
		
		System.out.println(elements);
		
// literal ----> stores in string constant pool
		
		String name= "fasila";
		String name1= "fasila";
		System.out.println(name==name1);
		System.out.println(name +" v.p ");
		
		//new keyword ----> stores in heap memory
		String newname= new String("fasila");
		
		System.out.println(newname==name);
		System.out.println(newname.equals("name"));
		
		name.concat(newname);  // cant change string is immutable
		
		String nam=name.concat(newname);
		System.out.println(nam);

      
  // BUFFER STRING
      
      StringBuffer name2=new StringBuffer("fasi");
      StringBuffer name3=new StringBuffer("fas");
      name2.append("fathima");
      System.out.println(name2);
      
      name2.append("rasiya");
      System.out.println(name2);   */
      
 // method of string
      
      String s1="india";
      String s2="country";
      System.out.println(s1.length());
      
 //charAt 
      String s3="fasilavp";
      char c=s3.charAt(3);
      System.out.println(c);
      
 //   java string COMPARETO
      String s4="rasiya";
      String s5="RASIYA";
      String s6="ras";
      String s7="ra";
      
      System.out.println(s4.compareTo(s5));
 // endswith
      String a="india is good";
      System.out.println(a.endsWith("good"));
      
 //STARTSWITH
      
      String a1="india is good";
      System.out.println(a.startsWith("good"));
      
 // EQUALS
      
      String n="hello";
      String n1="HELLO";
      String n2="hello";
      
      System.out.println(n.equals(n1));
      System.out.println(n.equals(n2));
 //Equalignore   
      
      String t="hello";
      String t1="HELLO";
      String t2="hello";
      
      System.out.println(t.equalsIgnoreCase(t1));
      System.out.println(t.equalsIgnoreCase(t2));
      
 // tolowercase
      String t3="HELLO";
      System.out.println(t3.toLowerCase());
// touppercase      
      String t4="hello";
      System.out.println(t4.toUpperCase());
      
 // sequence of byte
      
      String t5="ABCD";
      byte b[]=t5.getBytes();
      for(int i=0;i<t5.length();i++) {
    	  System.out.println(b[i]); 
      }
      
// substring   
      
      String t6="programming";
      System.out.println(t6.substring(3));
      System.out.println(t6.substring(3,9));
  // REPLACE
      
      String t7="programming";
      System.out.println(t7.replace('o', 'a'));
      
      
 // trim
      String t8="programming                    ";
      String t9="java";
      System.out.println(t8.trim()+t9);
      
	}

}
