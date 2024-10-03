import java.util.*;
public class Main
{
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		String str1 = "0";
		int sum=0;
		for (int i=0;i<str.length();i++){
		if(str.charAt(i)>'A'&& str.charAt(i)<='Z'||str.charAt(i)>'a'&&str.charAt(i)<='z'){
		        
		}
		else{
		        str1+=str.charAt(i);
		}
	}
	sum+=Integer.parseInt(str1);
	System.out.println(sum);
}
}
