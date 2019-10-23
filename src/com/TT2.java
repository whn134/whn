package com;
import java.util.Random;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class TT2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Sign judge = new Sign();
		Random random = new Random();
		/*
		// 生成的运算题存储到外部文件result.txt中
		PrintWriter over;
		try {
			over = new PrintWriter("E:/result.txt");// 输出的路径和文件名
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
*/
		// 设置题的数目
		System.out.println("输入题的数目：");
		int number = reader.nextInt();

		System.out.println("输入操作数的范围：");
		int range = reader.nextInt();    
		
		
		System.out.println("输入结果的取值范围：");
		int reasultrange = reader.nextInt();    
		
		System.out.println("是否有负数（输入Y/N）：");
		char minus = reader.next().charAt(0);
		int  MinusYesOrNo = 0;    //判断是否含负数
		if(minus == 'Y' || minus ==  'y') {
			MinusYesOrNo = 1;               //1时为包括负数
		}else if(minus == 'N' || minus ==  'n') {
			MinusYesOrNo = 0;              //0时为不包括负数
		}else {
			System.out.println("输入的数字违法!!!");
			System.exit(1);
		}
		
		System.out.println("是否有乘除法（输入Y/N）：");
		char MultiplyAndDivide = reader.next().charAt(0);
		int  MultiplyAndDivideYesOrNo = 0;    //判断是否含乘除法
		if(MultiplyAndDivide == 'Y' || MultiplyAndDivide ==  'y') {
			MultiplyAndDivideYesOrNo = 1;               //1时为包括乘除法
		}else if(MultiplyAndDivide == 'N' || MultiplyAndDivide ==  'n') {
			MultiplyAndDivideYesOrNo = 0;              //0时为不包括乘除法
		}else {
			System.out.println("输入的字符违法!!!");
			System.exit(1);
		}
		
		
		int temp = 0;
		double reasult = 0;
		while(true) {
			// 生成两个随机数:
			double randomNumber1= (int) ((Math.random() * range + 1) * (Math.random() > 0.5 ? 1 : -1));
			double randomNumber2= (int) ((Math.random() * range + 1) * (Math.random() > 0.5 ? 1 : -1));
			if(MinusYesOrNo == 0 && (randomNumber1 < 0 || randomNumber2 < 0)) {
				continue;                                             //判断是否包括负数
			}
			// sign为生成的运算符，输入1-4代表+-*/
			 //加减乘除
			int sign=(random.nextInt(4) + 1);

			switch(sign) {
			case 1:
				reasult = randomNumber1 + randomNumber2;
				if(reasult <= reasultrange) {
					judge.switchSign(randomNumber1, randomNumber2, reasult, sign);
					temp++;
					break;
				}
			case 2:
				reasult = randomNumber1 - randomNumber2;
				if(reasult <= reasultrange) {
					judge.switchSign(randomNumber1, randomNumber2, reasult, sign);
					temp++;
					break;
				}
			case 3:
				reasult = randomNumber1 * randomNumber2;
				if(MultiplyAndDivideYesOrNo == 1 && reasult <= reasultrange) {
					judge.switchSign(randomNumber1, randomNumber2, reasult, sign);
					temp++;
					break;	
				}

			case 4:
				reasult = randomNumber1 / randomNumber2;
				if(MultiplyAndDivideYesOrNo == 1 && reasult <= reasultrange) {
					judge.switchSign(randomNumber1, randomNumber2, reasult, sign);
					temp++;
					break;
				}
			}
			if(temp == number ) {
				break;
		}
			
		}

	}

}
	
	
	
	

