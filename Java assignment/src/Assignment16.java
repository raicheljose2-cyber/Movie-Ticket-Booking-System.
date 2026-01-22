import java.util.Scanner;
public class Assignment16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number ");
		int n=sc.nextInt();
		int sum=0;
		while(n>0) {
			sum=sum+n%10;
			n=n/10;
		}
		System.out.println("sum of digits is "+sum);
		

	}

}
