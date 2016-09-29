package hw;
import java.util.Scanner;
public class hw01_105021040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int money = scn.nextInt();
		int a1 = scn.nextInt();
		int a2 = scn.nextInt();
		int a3 = scn.nextInt();
		int p = a1*15+a2*20+a3*30;
		if(p<=money){
			System.out.println("50元硬幣有:"+(money-p)/50 + "個");
			System.out.println("5元硬幣有:"+((money-p)%50)/5 + "個");
			System.out.println("1元硬幣有:"+((money-p)%50)%5 + "個");
		}else{
			System.out.print(0);
		}
	}

}
