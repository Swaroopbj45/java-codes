import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int c=0;
	    int s=0,r=0,m=0,t;
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		t=n;
		while(n>0){
		    n=n/10;
		    c++;
		}
		System.out.println(c);
		while(n>0){
		    m=n%10;
		    r += Math.pow(m, c);
		    n=n/10;
		  }
		  if(t==r){
		      System.out.println("amstrong");
		  }
		  else{
		      System.out.println("not amstrong");
		  }
	}
}
