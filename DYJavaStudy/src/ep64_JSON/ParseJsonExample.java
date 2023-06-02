package ep64_JSON;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParseJsonExample {

	public static void main(String[] args) throws IOException {
		
		//파일로부터 제이슨 읽기
		BufferedReader br = new BufferedReader(new FileReader("c:/Temp/member.json", Charset.forName("UTF-8")));
		
		
		String json = br.readLine();
		br.close();
		
		JSONObject root = new JSONObject(json);
		
		//속성 정보 읽기
		System.out.println("id: " + root.getString("id"));
		System.out.println("name: " + root.getString("id"));
		System.out.println("age: " + root.getInt("age"));
		System.out.println("student: " + root.getBoolean("student"));
		
		///객체 속성정보 읽기
		JSONObject tel = root.getJSONObject("tel");
		System.out.println("home: "+ tel.getString("home"));
		System.out.println("mobile: "+ tel.getString("mobile"));
		
		JSONArray skill = root.getJSONArray("skill");
		System.out.println("skill: ");
		for(int i=0; i <skill.length(); i++) {
			System.out.println(skill.get(i) + ",");
		}

	}

}
