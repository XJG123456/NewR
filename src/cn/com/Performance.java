package cn.com;

public class Performance extends Thread{

	volatile boolean iscount=true;
	public void run(){
		while (iscount) {
			System.out.println(Thread.currentThread().getName()+"��ʼ������");
			for(int i=0;i<6;i++){
				System.out.println(Thread.currentThread().getName()+"������"+(++i)+"��");
				Thread.yield();
			}
		}
		System.out.println(Thread.currentThread().getName()+"˫��ֹͣ���ҵ�ս��������");
	}
	
}

	

