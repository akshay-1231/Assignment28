package javaproject;
import java.util.Scanner;

public class Harshad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("Enter a num ");

		int n;       

		Scanner sc = new Scanner(System.in);

		n=sc.nextInt();                        //n=18

		int rem = 0;

		int m=n;
                                                          //m=18
		while(n>0){

		rem += n%10;       //gives last digit of number       //18%10=rem=8   //second iteration n=1 ,1%10=1  rem=8+1=9

		n=n/10;                                               //n=18/10=1     //1/10=0

		}

		if(m%rem==0){                                       // 18/9=2

		System.out.println("Harshad Number");            //harshad num

		}else{

		System.out.println("Not Harshad number");

		}

		}

		}
		