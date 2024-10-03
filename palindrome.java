import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String S=sc.nextLine();
        StringBuffer sb=new StringBuffer(S);
        sb.reverse();
        String S2=sb.toString();
        if(S.equals(S2)){
        System.out.println("it is a palindrome");
        }
    else{
        System.out.println("it is not a palindrome");
    }
}
}