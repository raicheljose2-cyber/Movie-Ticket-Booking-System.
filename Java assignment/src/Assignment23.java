import java.util.Scanner;
public class Assignment23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of terms");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int evencount=0;
		int oddcount=0;
		
		System.out.println("enter the array elemnts");
		for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		
			 if(arr[i]%2==0) {
				 evencount+=1;
			 }
				 else{
					 oddcount+=1;
				 }
		}
		 System.out.println("count of even nos"+evencount);
		 System.out.println("count of odd nos  "+oddcount);
		
		

	}

}
