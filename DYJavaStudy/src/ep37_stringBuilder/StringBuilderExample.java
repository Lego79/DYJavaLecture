package ep37_stringBuilder;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		String data = new StringBuilder()
				.append("DEFG")
				.insert(0, "ABC")
				.delete(3,4)
				.toString();
		
		System.out.println(data);

	}

}
