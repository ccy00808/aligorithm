package firstChapter.recurrence;

import java.util.Scanner;

import javax.xml.parsers.FactoryConfigurationError;

public class Recurrence {
	
	/*****************************
	 * �㷨˵����f(n) = f(n-1)+n
	 * ʹ�õݹ�ķ������б��
	 * �ݹ��̶��������return��ֵ������û�лص���ֵ
	 * �޷���������
	 *****************************/
	public int fac( int n ){
		
		int f;
		if( n<0 ){
			System.out.println("�������");
		}
		if( n==0 || n==1 ){
			return 1;
		}
		f = fac(n-1)*n;
		return f;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		int nage;
		Recurrence recurrence = new Recurrence();;
		while(true){
			n = in.nextInt();
			nage = recurrence.fac(n);
			System.out.println("��" + n + "λͬѧ�������ǣ�" + nage);
		}
	}
}
