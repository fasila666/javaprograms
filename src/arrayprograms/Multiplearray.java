package arrayprograms;

public class Multiplearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//	array declaration
		int arr[][]=new int [3][3];
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;

		arr[1][0]=10;
		arr[1][1]=20;
		arr[1][2]=30;

		arr[2][0]=10;
		arr[2][1]=20;
		arr[2][2]=30;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j] + " \t");
			}
			System.out.println();
		} 
		System.out.println();
		
		// declaration with initialization
		
		int a[][]= {{1,2},{3,4},{5,7}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				
				System.out.print(a[i][j] + "\t");
			}
			
			System.out.println();
		}
	}

}
