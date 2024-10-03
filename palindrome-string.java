import java.util.*;
public class Main
{
	public static void main(String[] args) {
	        String rev="";
	        Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine(); 
	      //  String str1=str;
	        for(int i=str.length()-1;i>=0;i--){
	                rev+=str.charAt(i);
	        }
	       // str1=str;
	        if(str.equals(rev)){
		System.out.println("palindrome");
	        }
	        else{
	                System.out.println("not a palindrome");
	        }
}
}
//**int first=0;
// int last=str.length()-1;
//while(first<last){
       // if(str.charAt(first)!= str.charAt(last))
       // return false;
        
//}