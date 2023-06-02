package cpTextBook_network.ep02TCP;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExample {

	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("localhost",50001);
			
			System.out.println("[클라이언트] 연결 성공");
			//----------------------------------------------//
			
			String sendMessage = "나는 자바가 싫어~~";
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(sendMessage);
			dos.flush();
			System.out.println("[클라이언트] 데이터 보냄: " + sendMessage);
			
			//데이터 받기
			DataInput dis = new DataInputStream(socket.getInputStream());
			String recieveMessage = dis.readUTF();
			System.out.println("[클라이언트] 데이터 받음: " + recieveMessage);
			
			
			//----------------------------------------------//
			
			
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
		} catch (UnknownHostException e) {
			
		} catch (IOException e) {}

	}

}
