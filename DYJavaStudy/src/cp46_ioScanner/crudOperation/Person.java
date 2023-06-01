package cp46_ioScanner.crudOperation;

import java.util.List;

public class Person {
	


    public Person(){

    }

    private String id;
    private String name;
    private int age;
    private String sex;

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getSex() {
        return sex;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public Person(String id, String name, int age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void printInfo() {

     
            
            System.out.print("." + "아이디=" + id);
            System.out.print(" | 이름="+ name);
            System.out.print(" | 나이="+ age);
            System.out.println(" | 성별="+ sex);


       
    }
}
