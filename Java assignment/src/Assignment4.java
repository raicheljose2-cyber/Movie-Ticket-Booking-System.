import java.util.Scanner;
public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number ");
		int a=sc.nextInt();
		System.out.println("enter second number ");
		int b=sc.nextInt();
		System.out.println("enter third number ");
		int c=sc.nextInt();
		if(a>b && a>c) {
			System.out.println("largest number is "+a);
		}
		else if(b>c) {
			System.out.println("largest number is "+b);
		}
		else {
			System.out.println("largest number is "+c);
		}
		

	}

}
