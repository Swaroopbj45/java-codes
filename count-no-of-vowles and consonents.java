import java.util.*;
public class Main
{
	public static void main(String[] args) {
	        int c=0,v=0,s=0;
	        Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++){
		        str=str.toLowerCase();
		        if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
		               v+=1;
		        }
		        else if(str.charAt(i)==' '){
		               s+=1; 
		        }
		        else{
		                c+=1;
		        }
		}
		System.out.println("no of vowles:"+v);
		System.out.println("no of consonents:"+c);
		System.out.println("no of spaces:"+s);
	}
}
