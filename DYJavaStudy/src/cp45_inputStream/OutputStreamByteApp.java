package cp45_inputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamByteApp {

	public static void main(String[] args) {

		
		OutputStream os = null;

		try {
			System.out.println("===== Start =====");
			
			os = new FileOutputStream("C:/Temp/os_byte.dat");

			byte b1 = 1;
			byte b2 = 2;
			byte b3 = 3;
			
			os.write(b1);
			os.write(b2);
			os.write(b3);
			
			os.flush();
			os.close();
			
			System.out.println("\n===== End =====");

		} catch (IOException e) {
			System.out.println("\n===== catch() :  IOException =====");
			e.printStackTrace();
		} finally {
			// releases all system resources from the streams
			try {
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				System.out.println("\n===== finally() :  IOException  =====");
				e.printStackTrace();
			}
		}
	}

}
