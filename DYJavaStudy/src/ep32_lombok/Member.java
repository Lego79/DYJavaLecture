package ep32_lombok;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Member {
	
	private String id;
	private String name;
	private int age;

}
