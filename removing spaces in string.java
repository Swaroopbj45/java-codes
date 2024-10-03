import java.util.*;
public class Main
{
	public static void main(String[] args) {
	        String str1="";
	        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++){
		        if(str.charAt(i)!=' '){
		                str1+=str.charAt(i);
		        }
		}
		System.out.println(str1);
	}
}
