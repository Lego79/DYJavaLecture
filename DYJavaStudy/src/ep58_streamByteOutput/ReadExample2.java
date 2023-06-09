package ep58_streamByteOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadExample2 {

	public static void main(String[] args) {
		
		InputStream is = null;
		
		try {
			is = new FileInputStream("C:/Temp/test2.db");
			
			byte[] data = new byte[100];
			
			while(true) {
				int num = is.read(data);
				if(num == -1) break;
				
				for(int i=0; i<num; i++) {
					System.out.println(data[i]);
				}				
			}
			
			is.close();
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
