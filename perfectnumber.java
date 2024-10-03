import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	     int sum=0;
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		for(int i=1;i<n;i++){
		    if(n%i==0){
		        sum +=i;
		    }
		}
		if(sum==n){
		    System.out.println("it is a perfect number");
		}
		else{
		    System.out.println("it is not a perfect number");
		}
	}
}
