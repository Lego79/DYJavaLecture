package cp46_ioScanner.crudOperation;

import java.util.List;
import java.util.Scanner;

import cp44_collectionList.bookList.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Manager {

    private List<Person> personList;



    public Manager(List<Person> personList) {
        this.personList = personList;
    }

    public Manager() {
        this.personList = new ArrayList<>();
    }

//    public void printPersonList() {
//        System.out.println("[전체 출력]");
//        for (Person person : personList) {
//            person.printInfo();
//            System.out.println();
//        }
//    }

    public void printPersonList() {
        int cnt = 1;
        for(int i=0; i < personList.size(); i++) {
            
            System.out.print(cnt + "." + "아이디=" + personList.get(i).getId());
            System.out.print(" | 이름="+ personList.get(i).getName());
            System.out.print(" | 나이="+ personList.get(i).getAge());
            System.out.println(" | 성별="+ personList.get(i).getSex());
            cnt++;
            
//            for (Person person : personList) {
//                System.out.print(cnt + ".");
//                person.printInfo();
//                cnt++;

        }
    }
    public void addPerson(Scanner sc) {
        System.out.print("ID를 입력하세요 => ");
        String id = sc.nextLine();
        System.out.print("이름을 입력하세요 =>  ");
        String name = sc.nextLine();
        System.out.print("나이를 입력하세요 =>  ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("성별을 입력하세요 => ");
        String sex = sc.nextLine();

        Person person = new Person(id, name, age, sex);
       
        
        
        for(int i=0; i < personList.size(); i++) {
        	if(personList.get(i).getId().equals(id)) {
        		System.out.println("\n인원을 추가할 수 없습니다. 동일한 ID가 존재합니다");
        		return;
        	}  
        } personList.add(person);
        
        
        
    }

    public void updatePerson(Scanner sc) { 
        System.out.print("ID를 입력하세요 => ");
        String id = sc.nextLine();
        System.out.print("이름을 입력하세요 =>  ");
        String name = sc.nextLine();
        System.out.print("나이를 입력하세요 =>  ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("성별을 입력하세요 => ");
        String sex = sc.nextLine();        
        
    	for(int i=0; i < personList.size(); i++) {
    		
    	if(id.equals(personList.get(i).getId())) {
    		
    		personList.get(i).setId(id);
    		personList.get(i).setName(name);
    		personList.get(i).setAge(age);
    		personList.get(i).setSex(sex);
    		
    		}
    	
    	} 
    }

    public void deletePerson(Scanner sc) {
        System.out.print("ID를 입력하세요 => ");
        String id = sc.nextLine();
    	for(int i=0; i < personList.size(); i++ ) {
        	if(id.equals(personList.get(i).getId())) {
        		 personList.remove(i);
    		}
    		
    	}

    }

    public void selectPersonBySex(Scanner sc) {
    	System.out.print("성별을 입력하세요(값 : F,M) =>");
        String sex = sc.nextLine();
        int cnt = 1;
    	for(int i=0; i < personList.size(); i++ ) {
        	if(sex.equals(personList.get(i).getSex())) {
        		System.out.print(cnt + ".");
        		personList.get(i).printInfo();
//                System.out.print(cnt + "." + "아이디=" + personList.get(i).getId());
//                System.out.print(" | 이름="+ personList.get(i).getName());
//                System.out.print(" | 나이="+ personList.get(i).getAge());
//                System.out.println(" | 성별="+ personList.get(i).getSex());
                cnt++;
    		}
    		
    	}

    }

    

    public void selectPersonByBetweenAge(Scanner sc) {
    	
    	System.out.print("시작 나이를 입력하세요 =>");
        int startAge = Integer.parseInt(sc.nextLine());
    	System.out.print("종료 나이를 입력하세요 =>");
        int endAge = Integer.parseInt(sc.nextLine());
        int cnt = 1;
    	for(int i=0; i < personList.size(); i++ ) {
        	if(personList.get(i).getAge()>= startAge && personList.get(i).getAge() <= endAge) {
                
                System.out.print(cnt + "." + "아이디=" + personList.get(i).getId());
                System.out.print(" | 이름="+ personList.get(i).getName());
                System.out.print(" | 나이="+ personList.get(i).getAge());
                System.out.println(" | 성별="+ personList.get(i).getSex());
                cnt++;
    		}
    		
    	}

    }




}
