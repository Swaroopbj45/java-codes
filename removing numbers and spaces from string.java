import java.util.*;
public class Main
{
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		String str1 = "";
		for(int i=0;i<str.length();i++){
		        if(str.charAt(i)!='0' && str.charAt(i)!='1' && str.charAt(i)!='2' && str.charAt(i)!='3' && 
		        str.charAt(i)!='4' && str.charAt(i)!='5' && str.charAt(i)!='6' && str.charAt(i) !='7' &&
		        str.charAt(i)!='8' && str.charAt(i)!='9' && str.charAt(i)!=' '){
		                str1+=str.charAt(i);
		        }
		}
		System.out.println("After removing: "+str1);
	}
}
