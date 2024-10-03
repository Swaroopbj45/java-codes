import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Weight(kilograms):");
	    int w = sc.nextInt();
	    System.out.println("Enter Height(Meters):");
	    float h = sc.nextFloat();
	    int c;
	    float BMI=1;
	    BMI=w/(h*h);
		System.out.println(BMI);
		if(BMI<18){
		    c=0;
		}
		else if(BMI>=18 && BMI<25){
		    c=1;
		}
		else if(BMI>=25 && BMI<30){
		    c=2;
		}
		else if(BMI>=30 && BMI<40){
		    c=3;
		}
		else{
		    c=4;
		}
		System.out.println("category:"+c);
	}
}
