package cn.com;

public class Contrller extends Thread{

	public void run(){
		System.out.println("欢迎大家观看隋唐演义大戏,精彩的节目马上开始了");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		
		System.out.println("话说隋唐末年，天下纷争");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		
		Performance psui=new Performance();
		Performance plong=new Performance();
		
		Thread tsui=new Thread(psui, "隋军");
		Thread tlong=new Thread(plong,"起义军");
		tsui.start();
		tlong.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("双方激烈交战中，杀出个程咬金");
		Thread chengThread=new Thread(new ActCheng(),"程咬金");
		
		psui.iscount=false;
		plong.iscount=false;
		
		chengThread.start();
		try {
			chengThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("自此天下太平");
	}
	public static void main(String[] args) {
		new Contrller().start();
	}
}
