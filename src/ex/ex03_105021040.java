package ex;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 105021040 洪聖傑
 */
import java.util.Scanner;
public class ex03_105021040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int d = scn.nextInt();
		int e = ((c-a)*60)+d-b;
		int h;
		int g=e/30;
		if(g<=4){
		h=g*30;
		System.out.print(g);
	}else{
		if(g<=8){
		g=120+(g-4)*40;
	}else{
		g=280+(g-8)*60;
		System.out.print(g);
		
	}
	}
	}
}

