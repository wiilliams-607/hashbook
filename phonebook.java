package methods;

import java.util.HashMap;
import java.util.Scanner;

public class phonebook {
 

 static HashMap<String ,String> will = new HashMap<>();


static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		String name;
		String num;
		int a ;
		int b =0;
		while(b<3) {
	
		System.out.println("enter your option");
		 System.out.println("1.create contacts") ;  
	  System.out.println("2.delete");
	 System.out.println("3.search");
	 System.out.println("4.display");
		a = scanner.nextInt();
		switch(a) {
		case 1:   create(); break;
		case 2:  delete();break;
		case 3: search();break;
		case 4:display(); break;
		
		}
		
		}
      
	}
     public static void create() {
    	 
    	 System.out.println("enter name");
    	 scanner.nextLine();
    	String name = scanner.nextLine();
    	 System.out.println("enter number");
    	String num= scanner.nextLine();
    	will.put(name,num);
    	 
	
}
     public static void delete() {
    	 System.out.println("enter name of the person you want to delete");
    	 scanner.nextLine();
    	 String name = scanner.nextLine();
    	 if(will.containsKey(name)) {
    		 will.remove(name);
    		 
    		 
    	 }
     }
     public static void search() {
    	 System.out.println("enter name to search");
    	 scanner.nextLine();
    	 String name = scanner.nextLine();
    	 if(!will.isEmpty()) {
    	 if(will.containsKey(name)) {
    		 for(String Key : will.keySet()) {
    			 String value = will.get(Key);
    			 System.out.println(Key + value);
    		 }
    		 
    		 
    	 }
    	 else if(!will.containsKey(name)) {
    		 System.out.println("user not found");
    	 }
    	 }
    	 else
    		 System.out.println("no record found");
     }
     public static void display() {
    	 for(String Key: will.keySet()) {
    		 String value = will.get(Key);
    		 System.out.println(Key + value);
    	 }
     }
}

