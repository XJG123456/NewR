package cn.com;

public class Contrller extends Thread{

	public void run(){
		System.out.println("��ӭ��ҹۿ����������Ϸ,���ʵĽ�Ŀ���Ͽ�ʼ��");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		
		System.out.println("��˵����ĩ�꣬���·���");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		
		Performance psui=new Performance();
		Performance plong=new Performance();
		
		Thread tsui=new Thread(psui, "���");
		Thread tlong=new Thread(plong,"�����");
		tsui.start();
		tlong.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("˫�����ҽ�ս�У�ɱ������ҧ��");
		Thread chengThread=new Thread(new ActCheng(),"��ҧ��");
		
		psui.iscount=false;
		plong.iscount=false;
		
		chengThread.start();
		try {
			chengThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("�Դ�����̫ƽ");
	}
	public static void main(String[] args) {
		new Contrller().start();
	}
}
