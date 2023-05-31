package ep57_byteStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test1.db");
			
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			String ac = "300";
			
			os.write(a);
			os.write(b);
			os.write(c);
//			os.write(ac);
			
			os.flush();
			os.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
