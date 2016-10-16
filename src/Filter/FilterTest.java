package Filter;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FilterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(InputStream in = new BufferedInputStream(new FileInputStream("C:\\Users\\houshaoli\\Desktop\\OutputSreamTest.txt"))){
			byte[] input = new byte[5];
			while(true){
				int r = in.read(input);
				if(r == -1)
					break;
			}
			
			for(byte b : input){
				System.out.println(b);
			}
		}catch(IOException e){
			System.err.println(e.getMessage());
		}
	}

}
