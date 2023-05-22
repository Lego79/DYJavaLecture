package ep19_typeTransformation;

public class App {

	public static void main(String[] args) {
			
		Parent parent = new Child();
		
		//페어런트 타입으로 필드와 메소드 사용
		
		parent.field = "data1";
		parent.method1();
		parent.method2();
//		parent.field2 불가능
//		parent.method3(); 불가능
		
		Child child = (Child) parent;
		
		child.field2 = "data2";
		child.method3
		
		();
		

	}

}
