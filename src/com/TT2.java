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
		// ���ɵ�������洢���ⲿ�ļ�result.txt��
		PrintWriter over;
		try {
			over = new PrintWriter("E:/result.txt");// �����·�����ļ���
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
*/
		// ���������Ŀ
		System.out.println("���������Ŀ��");
		int number = reader.nextInt();

		System.out.println("����������ķ�Χ��");
		int range = reader.nextInt();    
		
		
		System.out.println("��������ȡֵ��Χ��");
		int reasultrange = reader.nextInt();    
		
		System.out.println("�Ƿ��и���������Y/N����");
		char minus = reader.next().charAt(0);
		int  MinusYesOrNo = 0;    //�ж��Ƿ񺬸���
		if(minus == 'Y' || minus ==  'y') {
			MinusYesOrNo = 1;               //1ʱΪ��������
		}else if(minus == 'N' || minus ==  'n') {
			MinusYesOrNo = 0;              //0ʱΪ����������
		}else {
			System.out.println("���������Υ��!!!");
			System.exit(1);
		}
		
		System.out.println("�Ƿ��г˳���������Y/N����");
		char MultiplyAndDivide = reader.next().charAt(0);
		int  MultiplyAndDivideYesOrNo = 0;    //�ж��Ƿ񺬳˳���
		if(MultiplyAndDivide == 'Y' || MultiplyAndDivide ==  'y') {
			MultiplyAndDivideYesOrNo = 1;               //1ʱΪ�����˳���
		}else if(MultiplyAndDivide == 'N' || MultiplyAndDivide ==  'n') {
			MultiplyAndDivideYesOrNo = 0;              //0ʱΪ�������˳���
		}else {
			System.out.println("������ַ�Υ��!!!");
			System.exit(1);
		}
		
		
		int temp = 0;
		double reasult = 0;
		while(true) {
			// �������������:
			double randomNumber1= (int) ((Math.random() * range + 1) * (Math.random() > 0.5 ? 1 : -1));
			double randomNumber2= (int) ((Math.random() * range + 1) * (Math.random() > 0.5 ? 1 : -1));
			if(MinusYesOrNo == 0 && (randomNumber1 < 0 || randomNumber2 < 0)) {
				continue;                                             //�ж��Ƿ��������
			}
			// signΪ���ɵ������������1-4����+-*/
			 //�Ӽ��˳�
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
	
	
	
	

