package cn.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class PictureBSAN {

	private static String getImageBASE(){
		String imageBath="C://new.jpg";
		byte[] b=null;
		InputStream in=null;
		try {
			in=new FileInputStream(imageBath);
			b=new byte[in.available()];
			in.read(b);
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		BASE64Encoder encoder=new BASE64Encoder();
		String s=encoder.encode(b);
				
		return s;
	}
	private static boolean getImage(String imageBath){
		String st="D://coey.jpg";
		byte[] bb=null;
		if(imageBath==null){
			return false;
		}
		BASE64Decoder decoder=new BASE64Decoder();
		try {
			bb=decoder.decodeBuffer(imageBath);
			for(int i=0;i<bb.length;i++){
				if(bb[i]<0){
					bb[i]+=256;
				}
			}
			OutputStream o=new FileOutputStream(st);
			o.write(bb);
			o.close();
			return true;
		} catch (IOException e1) {
			e1.printStackTrace();
			return false;
		}
		
	}
	
	
	public static void main(String[] args) {
		String ss=getImageBASE();
		System.out.println(ss);
		getImage(ss);
	}
}
