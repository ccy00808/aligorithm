package firstChapter.EuclideanGCD;

import java.util.Scanner;

public class EuclideanCommonMax {
	//���Դ�Լ���ĺ���,�����϶������Լ��,�������Ҫ��֤p>q
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
//			System.out.println("�������ֵ�� "+p+" "+q+" �����Լ���ǣ�" + gcd(p,q));//�����ԭ�򣬾�̬����ֻ�ܵ��þ�̬������Ҫ��ʹ�ã�ֻ���������󣬷���ֻ�ܶ��徲̬����
			System.out.println("�������ֵ�� "+p+" "+q+" �����Լ���ǣ�" + commonMax.gcd(p,q));
		}
	}

}
