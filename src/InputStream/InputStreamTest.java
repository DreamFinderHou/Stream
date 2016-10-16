package InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(InputStream in = new FileInputStream("C:\\Users\\houshaoli\\Desktop\\OutputSreamTest.txt")){
			byte[] input = new byte[4];
			
			System.out.println("available bytes = " + in.available());
			while(true){
				int r = in.read(input);
				if(r==-1)
					break;
			}
			
			for(byte i : input){
				System.out.println(i);
			}
			
		}catch(IOException e){
			System.err.println(e.getMessage());
		}
	}

}
