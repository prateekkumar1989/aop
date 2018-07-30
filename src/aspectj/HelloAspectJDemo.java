package aspectj;

import java.io.File;
import java.util.Scanner;

public class HelloAspectJDemo {
	
	  public static void sayHello() {
	      System.out.println("Hello");
	  }
	 
	  public static void greeting()  {
	      
	      String name = new String("John");
	      
	      sayHello();
	      
	      long a = 0;
	      Long b = 0L;
	      
	      if( new File("D:\\file.txt").exists()) System.out.println("Equal");
	      else  System.out.println("Not equal");
	      
	  }
	  
	  
	  public static void main(String[] args) {        
	      
	      sayHello();
	      
	      System.out.println("--------");
	      
	      sayHello();
	      
	      System.out.println("--------");
	      
	      greeting();
	      
	      
	  }
	 
	}
