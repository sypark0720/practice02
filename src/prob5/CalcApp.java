package prob5;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		//scan하여 받기
		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		int first = sc.nextInt();
		char second = sc.next().charAt(0);
		int third = sc.nextInt();
		
		
		switch(second){
		case '+':
			Add add = new Add();
			add.calculate(first,third);
			break;
		case '-':
			Sub sub = new Sub();
			sub.calculate(first,third);
			break;
		case '*':
			Mul mul = new Mul();
			mul.calculate(first,third);
			break;
		case '/':
			Div div = new Div();
			div.calculate(first,third);
			break;			
		}
		System.out.println(">> quit");	
	}
}
