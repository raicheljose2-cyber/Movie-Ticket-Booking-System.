import java.util.Scanner;
public class Assignment18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number");
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		while(n>0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		if(temp==rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
		

	}

}
