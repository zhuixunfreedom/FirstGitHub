package cn.kgc.java01;

import java.util.Scanner;

public class java_work_12and21 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("������һ����ֵ��");
		int n = input.nextInt();
		int m =1;
		int i;
		int sum=0;
		
			for(i=1;m<=n;m++) {
				 
				i=i*(m);
				sum+=i;
			}
			System.out.println("�ײ��ǣ�"+i);
			System.out.print("���ײ�ĺ��ǣ�"+sum);
		
		
	}
}
