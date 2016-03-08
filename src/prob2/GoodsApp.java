package prob2;

import java.util.Scanner;

public class GoodsApp {
	
		public static void main(String[] args) {
		

	    Goods[] GoodsArray = new Goods[3];
		
	    //GoodsArray생성
		for(int i=0; i<3; i++){		
	
		//한 줄 스캔하여 나누기
		Scanner s = new Scanner(System.in);
		String data1 = s.nextLine();
		String[] data2 = data1.split(" ");
		
		//GoodsArray에 넣기
		GoodsArray[i]= new Goods(data2[0], data2[1], data2[2]);
		}
		
		System.out.println(GoodsArray[0]);
		System.out.println(GoodsArray[1]);
		System.out.println(GoodsArray[2]);		
	}
}
