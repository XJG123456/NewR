package cn.com;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		byte[] b={0,1,2};
		System.out.println(b[1]);
		List<Integer> l=new ArrayList<Integer>();
		l.add(0);
		l.add(1);
		l.add(2);
		System.out.println(l.get(1));
 	}
}
