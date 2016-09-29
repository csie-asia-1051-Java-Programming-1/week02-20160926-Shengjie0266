package hw;
import java.util.Scanner;
public class hw03_105021040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		if(n%400==0){
			System.out.print("閏");
		}else{
		if(n%100==0){
			System.out.print("不閏");
		}else{
		if(n%4==0){
			System.out.print("閏");
		}else{
			System.out.print("不閏");
		}
		}
		}
	}

}
