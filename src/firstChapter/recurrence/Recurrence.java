package firstChapter.recurrence;

import java.util.Scanner;

import javax.xml.parsers.FactoryConfigurationError;

public class Recurrence {
	
	/*****************************
	 * 算法说明，f(n) = f(n-1)+n
	 * 使用递归的方法进行编程
	 * 递归编程都必须包含return的值，否则没有回调的值
	 * 无法继续计算
	 *****************************/
	public int fac( int n ){
		
		int f;
		if( n<0 ){
			System.out.println("输入错误");
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
			System.out.println("第" + n + "位同学的年龄是：" + nage);
		}
	}
}
