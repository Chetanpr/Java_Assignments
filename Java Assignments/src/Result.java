import java.util.Scanner;

public class Result {

	 public static void main(String[] args) {
	        Scanner scan=new Scanner(System.in);
	        int a= scan.nextInt();
	        int b= scan.nextInt();
	        int c= scan.nextInt();
	        if(a>=60 && b>=60 && c>=60){
	            System.out.println("Pass");
	        }
	        else if(a>=60 && b>=60 && c<=60 || a>=60 && b<=60 && c>=60 || a<=60 && b>=60 && c>=60){
	            System.out.println("promoted");
	        }
	        else{
	            System.out.println("fail");
	        }
	    }

}

