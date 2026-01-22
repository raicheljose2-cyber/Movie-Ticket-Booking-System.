import java.util.Scanner;
public class Assignment19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number of terms ");
		int n=sc.nextInt();
		int a=0; 
		int b=1;
		System.out.print(a+" "+b+" ");
		for(int i=3;i<=n;i++) {
		int c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
		}
	}

}
