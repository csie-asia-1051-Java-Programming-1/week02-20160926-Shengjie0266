package hw;
import java.util.Scanner;
public class hw02_105021040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int h = scn.nextInt();
		int s = scn.nextInt();
		if(s==1){
		double a =(h-80)*0.7;
		System.out.println("男生的標準體重為:"+a);
		}else{
		if(s==2){
		double a =(h-70)*0.6;
		System.out.println("女生的標準體重為:"+a);
		}
		}
	}

}
