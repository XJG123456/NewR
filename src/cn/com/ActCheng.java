package cn.com;

public class ActCheng extends Thread{

	public void run(){
		System.out.println(Thread.currentThread().getName()+"������ս��");
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+"���������"+(++i));
		}
		System.out.println(Thread.currentThread().getName()+"���������");
	}
}
