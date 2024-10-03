import java.util.*;
public class Main
{
	public static void main(String[] args) {
	        boolean s=true;
	        Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1:");
		String str1 = sc.nextLine();
		System.out.println("Enter string 2:");
		String str2 = sc.nextLine();
		char arr1[]=str1.toLowerCase().toCharArray();
		char arr2[]=str2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		s=Arrays.equals(arr1,arr2);
		if(s){
		        System.out.println("anagrams");
		}
		else{
		        System.out.println("Not anagrams");
		}
	}
}
