package cpTextBook_network.ep03_UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class NewsClient {
	public static void main(String[] args) {
		
		try {
			DatagramSocket datagramcSocket = new DatagramSocket();
			
			//구독하고 싶은 뉴스 주제 보내기
			String data = "정치";
			byte[] bytes = data.getBytes("UTF-8");
			DatagramPacket sendPacket = new DatagramPacket(bytes, bytes.length, new InetSocketAddress("localHost", 50001));
			datagramcSocket.send(sendPacket);
			
			while(true) {
				
				//뉴스받기
				DatagramPacket receivepaPacket = new DatagramPacket(new byte[1024], 1024);
				datagramcSocket.receive(receivepaPacket);
				
				//문자열로 변환
				String news = new String(receivepaPacket.getData(), 0, receivepaPacket.getLength(), "UTF-8");
				System.out.println(news);
				
				//10번쨰 뉴스를 받으면 while문 종료
				if(news.contains("뉴스10")) {
					break;
				}
				
			}
			
			//소켓 닫기
			datagramcSocket.close();
		} catch(Exception e) {
			
		}
		
	}

}
