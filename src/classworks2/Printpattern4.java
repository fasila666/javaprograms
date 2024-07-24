package classworks2;

public class Printpattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		for(int i=1;i<=num;i++) {
			for(int j=num;j>i;j--) {
				System.out.print(" ");
				}
			for(int k=1;k<=(2*i-1) ; k++ ) {
			      System.out.print("*");
			}
		System.out.println();
		}

	}

}
