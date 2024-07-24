package classworks2;

public class Multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {24,50,29};
		int size=10;
		for(int num:arr) {
			System.out.println("multiplication table for"+num);
			
			for(int i=1;i<=size;i++) {
				
				System.out.println(num+ "x" +i + "=" +(num*i));
			}
			System.out.println();
		}

	}

}
