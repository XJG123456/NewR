package cn.com;

public class Performance extends Thread{

	volatile boolean iscount=true;
	public void run(){
		while (iscount) {
			System.out.println(Thread.currentThread().getName()+"开始进攻了");
			for(int i=0;i<6;i++){
				System.out.println(Thread.currentThread().getName()+"进攻第"+(++i)+"波");
				Thread.yield();
			}
		}
		System.out.println(Thread.currentThread().getName()+"双方停止激烈的战争结束！");
	}
	
}

	

