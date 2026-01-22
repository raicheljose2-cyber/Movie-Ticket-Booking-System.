import java.util.Scanner;
public class Assognment22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number of elements ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		System.out.print("enter the elements of array ");
		for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
		sum+=arr[i];
		
		}
		double avg=(double)sum/2;
		System.out.println("sum of the elemnts "+sum);
		System.out.println("avg of elemnts "+avg);
		
		
		
		
	}}


