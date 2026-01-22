import java.util.Scanner;
public class Assignment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter first number ");
		int a=sc.nextInt();
		System.out.print("enter sec number ");
		int b=sc.nextInt();
		System.out.println("enter operator (+,-,*,/): ");
		char op=sc.next().charAt(0);
		switch(op) {
		case '+':
			System.out.println("result is "+(a+b));
			break;
		
		case '-':
			System.out.println("result is "+(a-b));
			break;
		case '*':
			System.out.println("result is "+(a*b));
			break;
		case '/':
			System.out.println("result is "+(a/b));
			break;
		default:
			System.out.println("invalid");
		
	
		
	}
	}

}
