import java.util.Scanner;
public class Assignment25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("enter 5 numbers ");
		
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("reversed array");
		for(int i=4;i>=0;i--) {
			System.out.println(arr[i]);
		}
		
		

	}

}
