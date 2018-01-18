package cn.com;

public class ActCheng extends Thread{

	public void run(){
		System.out.println(Thread.currentThread().getName()+"加入了战斗");
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+"攻击了隋军"+(++i));
		}
		System.out.println(Thread.currentThread().getName()+"击退了隋军");
	}
}
