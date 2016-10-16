package OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(OutputStream out = new FileOutputStream("C:\\Users\\houshaoli\\Desktop\\OutputSreamTest.txt")){
			out.write(12);
		}catch(IOException e){
			System.err.println(e.getMessage());
		}
	}

}
