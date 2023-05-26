package ep36_37;

import java.util.Arrays;

public class ByteToStringExample {
	
	public static void main(String[] args) {
		
		String data = "자바";
		byte[] arr1 = data.getBytes();
		System.out.println(Arrays.toString(arr1));
		
		String str1 = new String(arr1);
		System.out.println("str1: " + str1);
		
		
//		byte[] arr2 = data.getBytes("Euc-KR");
//		System.out.println(Arrays.toString(arr2));
//		
//		String str2 = new String(arr2, "euc-kr");
//		
//		String str2 = new String(arr1);
//		System.out.println("str1: " + str1);
		
		
	}

}
