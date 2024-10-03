import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int number = sc.nextInt();
		for (int i =1;i<=number;i++){   
		int r=0;
	    int t = i;
		    while (t>0){
		        int d =t % 10;
		        r=r*10+d;
		        t=t/10;
		    }
		    if(i==r){
		    System.out.print(r+" ");
		    }
		
		}
	}
}