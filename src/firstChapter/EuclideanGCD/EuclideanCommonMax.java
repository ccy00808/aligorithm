package firstChapter.EuclideanGCD;

import java.util.Scanner;

public class EuclideanCommonMax {
	//求自大公约数的函数,两个肯定是最大公约数,这个函数要保证p>q
	public int gcd( int p, int q ){
		if( q == 0 ) return p;
		int r = p % q;
		return gcd(q, r);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		EuclideanCommonMax commonMax = new EuclideanCommonMax();
		int p, q, r;
		while(true)
		{
			q = in.nextInt();
			p = in.nextInt();
			if( p<q )
			{
				r = p; p = q; q = r;
			}
//			System.out.println("您输入的值： "+p+" "+q+" 的最大公约数是：" + gcd(p,q));//错误的原因，静态方法只能调用静态方法，要想使用，只能声明对象，否则只能定义静态方法
			System.out.println("您输入的值： "+p+" "+q+" 的最大公约数是：" + commonMax.gcd(p,q));
		}
	}

}
