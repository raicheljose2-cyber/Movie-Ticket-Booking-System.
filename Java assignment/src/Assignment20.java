import java.util.Scanner;

public class Assignment20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		int n=sc.nextInt();
		boolean isPrime=true;
		if(n<=1) {
			isPrime=false;
		}
		else {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					isPrime=false;
				    break;
				}
			}
		
		}
		if(isPrime) {
			System.out.println("primenumber");
		}
			else {
				System.out.println("not prime");
			}

	}

}
