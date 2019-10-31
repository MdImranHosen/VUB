//////////////////::::::::::::: User Input integer Number to Output Even and Odd Number ::::::::::::::://////////
package imranhosen;

/**
 *
 * @author MD IMRAN HOSEN
 */

//Create File name Imran.java
import java.util.Scanner;
public class Imran {
    
   public static void main(String arr[]){
       
   try {
       int number;
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter One Integer Number: ");
    number = obj.nextInt(); 
    
    // nextDouble(); for Double value get to user
    // nextFloat(); for Float Value get to user
    // nextLine(); for String Value get to user
    // nextLong(); for Long value get to user
    // nextShort(); for Short value get to user
    //nextBoolean(); for Boolean value ge to user
    
    System.out.print("Even Number is : ");
    for(int i=1; i<= number; i++){
      if(i%2==0){
       System.out.print(i+", ");
      }
              
    }
    System.out.println(" \n -----------------------------");
    
    System.out.print("Odd Number is : ");
    
    for(int m=1; m<=number; m++){
        
        if(m%2!=0){
         System.out.print(m+", ");
        }
    }
    System.out.println();
     
   
   } catch(Exception e){
       System.out.print("Only Integer Number Allow. \n");
    }
    
   }
}
/////////////////:::::::::::::::::::: User input to Prime Number Output ::::::::::::::::::://///////////

//Create Package name imranhosen
package imranhosen;

/**
 *
 * @author MD IMRAN HOSEN
 */

//Create File name Imran.java
import java.util.Scanner;
public class Imran {
   public static void main(String arr[]){
   
       try {
       int i, n, m=0, f=0;
       Scanner obj = new Scanner(System.in);
       System.out.print("Enter One Integer Number : ");
       n = obj.nextInt();
       m = n/2;
       if(n==0 || n==1){
       System.out.print(n+" is not Prime Number. \n");
       } else{
         for(i=2; i<=m; i++){
          if(n%i==0){
            System.out.print(n+" is not Prime Number. \n");
            f=1;
            break;
          }
         }
       }
       if(f==0){
       System.out.print(n+" is Prime Number. \n");
       }
       
       } catch(Exception e){
        System.out.print("Only Allow Integer Number.\n");
       }
   
   } 

}

/////////////////:::::::::::::::::::::::User input to Factorial Number Output ::::::::::::::////////////
//Create Package name imranhosen
package imranhosen;

/**
 *
 * @author MD IMRAN HOSEN
 */

//Create File name Imran.java
import java.util.Scanner;
public class Imran {
   public static void main(String arr[]){
   
       try {
      
        Scanner obj = new Scanner(System.in);
        int n, number, fact=1;
        System.out.print("Enter One Integer Number: ");
        number = obj.nextInt();
        for(n=1; n<=number; n++){
            
          fact = fact*n;
          
        }
        System.out.print("Factorial of "+number+" is "+fact+" \n");
       
       } catch(Exception e){
        System.out.print("Only Allow Integer Number.\n");
       }
   
   } 

}

/////::::::::::::::::: Date and Time :::::::::::::::::://///////////

import java.time.*;
import java.time.format.*;
public class Imran {
    
   public static void main(String arr[]){
       
   try {
     LocalDate dt =  LocalDate.now(); // LocalDateTime, LocalTime, LocalDate
     System.out.print(dt+" \n");
       
    DateTimeFormatter fmdate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String fmd = dt.format(fmdate);
    System.out.println("After formatting: " + fmd);
   
   } catch(Exception e){
       System.out.print("Only Integer Number Allow. \n");
    }
    
   }
}


/////////////////////////////////:::::::::::::::::::::: 30-10-2019 :::::::::::://///////////////////
package mdimranhosen;

/**
 *
 * @author MD IMRAN HOSEN
 */
public class MdImranHosen {
  
    public static void main(String[] array){
        int num = 7;
        if(num > 9){
        System.out.println("The Number is "+num);
        
        }
        for(int i=1; i<=10; i++){
         System.out.println(i);
        }
    System.out.println("I'm MD IMRAN HOSEN");
    
    if(num%2==0){
    System.out.println("Even Number");
    } else{
     System.out.println("Odd Number");
    }
    
    
    // Even Number Output is ...
    System.out.print("Even Number is: ");
    for(int m=1; m<=22; m++){
     if(m%2==0){
      System.out.print(" "+m);
     }
    }
    System.out.println();
    
    
  // Odd Number Output with Java.....
 System.out.print("Odd Number is: ");
    for(int f=1; f<=22; f++){
       
        if(f%2 != 0){
         System.out.print(" "+f);
        }
    }
   
    System.out.println();
      
      // Student Marks output...
      
       int marks = 89;
       
       if(marks<50){
       System.out.println("Fail");
       } else if(marks>=50 && marks<60){
        System.out.println("D Grade");
       } else if(marks>=60 && marks<70){
       System.out.println("C Grade");
       } else if(marks>=70 && marks<80){
       System.out.println("B Grade");
       } else if(marks>=80 && marks<90){
       System.out.println("A Grade");
       } else if(marks>=90 && marks<100){
       System.out.println("A+ Grade");
       } else{
        System.out.println("Invalied");
       }
      //// End
    
    
    
    }
    
          
}

///// Input String Integer, Float .... to output

import java.io.*;
class JavaApplication1{
 public static void main(String arg[])throws IOException{
  Integer roll;
  Float cg;
  String r_roll,r_cg,name;
  InputStreamReader in=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(in);
  System.out.println("Enter Your Name: ");
  name=br.readLine();
  System.out.print("Enter Your Roll No: ");
  r_roll=br.readLine();
  roll=Integer.valueOf(r_roll);
  System.out.print("Enter Your CG: ");
  r_cg=br.readLine();
  cg=Float.valueOf(r_cg);
  System.out.println("Hi !!!\n"+name);
  System.out.println("\n Your roll No is: "+roll);
  System.out.println("\n \n Your CG is: "+cg);
 }

}

////////::::::::::::::::::::::: User Input Integer Number to Even Number Output :::::::::::: with Java ::::::://////

package imranhosen;

/**
 *
 * @author MD IMRAN HOSEN
 */
import java.io.*;
public class Imran {
 public static void main(String arr[])throws IOException {
  Integer even_num;
  String r_even_num;
  InputStreamReader in = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(in);
  
  System.out.print("Enter Number: ");
  r_even_num = br.readLine();
  even_num = Integer.valueOf(r_even_num);
  
  System.out.print("Even Numbe is :");
  
  
   for(Integer i=1; i<=even_num; i++){
       
      if(i%2 == 0){
       System.out.print(" "+i);
      }
      
   }
 }
}
////////:::::::::::::: User to input integer number to output Odd Number ::::::::::::::://////////

package imranhosen;

/**
 *
 * @author MD IMRAN HOSEN
 */
import java.io.*;
public class Imran {
 public static void main(String arr[])throws IOException {
  int num;
  String r_num;
  InputStreamReader in = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(in);
  System.out.print("Enter Integer Number : ");
  r_num = br.readLine();
  num = Integer.valueOf(r_num);
  System.out.print("Odd Number is: ");
  for(int i=1; i<= num; i++){
   if(i%2 != 0){
   System.out.print(" "+i);
   }
  }
  System.out.println();
  
 }
}

//////////// :::::::::::::: Java in Break and continue Use and input to user :::::::::::::::::::////////

package imranhosen;

/**
 *
 * @author MD IMRAN HOSEN
 */
import java.io.*;
public class Imran {
 public static void main(String arr[])throws IOException {
    int num;
    String r_num;
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(in);
    System.out.print("Enter Integer Number : ");
    r_num = br.readLine();
    num = Integer.valueOf(r_num);
    
   for(int i=1; i<= num; i++) {
    if(i==3){
     //System.out.println("This Number is "+i);
     break; // continue;
    }
    System.out.println(i);
   }
 }
}
///////////::::::::::::::::::: Static and non-static Method Access to another Method :::::::::::://////////
package imranhosen;

/**
 *
 * @author MD IMRAN HOSEN
 */
import java.io.*;
public class Imran {
 
 public static void hosen(int number){
   System.out.print("This Number is : "+number+" \n");
 }
 public  void myMethod(){
 
     System.out.print("I am Md Imran Hosen \n");
 }
public static void main(String arr[])throws IOException {
   Imran obj = new Imran();
  obj.myMethod();
  int num;
  String r_num;
  InputStreamReader in = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(in);
  System.out.print("Enter One Integer Number : ");
  r_num = br.readLine();
  num = Integer.valueOf(r_num);
  hosen(num);
}
}

/////////////////:::::::::::::: Abstract class use in java :::::::::::::::::::://///////////

package imranhosen;

/**
 *
 * @author MD IMRAN HOSEN
 */

//Create file name is Person.java
abstract class Person {
  public String name = "Md Imran Hosen";
  public Integer roll = 150011;
  public abstract void study(); 
}

// Create File name is Student.java
public class Student extends Person{
 int graduationYear = 2019;
 
 public void study(){
   System.out.print("Studying all day Long.");
 }
 
}

//create file name is MyClass.java
public class MyClass {
    
    public static void main(String arr[]){
      Student st = new Student();
      
      System.out.print(st.graduationYear+" \n");
      System.out.println("Name is: "+st.name);
      System.out.println("Roll is : "+st.roll);
      st.study();
    }
}
////////::::::::::::::::::::: Private and getter and setter use :::::::::::::::::////////////

//Create file name is Person.java
public class Person {
  private String name;
  
  //Getter
  public String getName(){
   return name;
  }
  //Setter
  public void setName(String newName){
   this.name = newName;
  }
}

//create file name is MyClass.java
public class MyClass {
    
    public static void main(String arr[]){
      Person ps = new Person();
       ps.setName("Md Imran Hosen \n");
       System.out.print(ps.getName());
       
      }
}
//::::::::::::::::::::::::: import Scanner class and input keybord to output Even Number with try catch block use :::::://///////////
package imranhosen;

/**
 *
 * @author MD IMRAN HOSEN
 */
import java.util.Scanner;
public class Imran {
   public static void main(String arr[]){
    try{
    Scanner obj = new Scanner(System.in);
    int num;
    String newName;
    System.out.print("Enter Integer Number: ");
    newName = obj.nextLine();
    num = Integer.valueOf(newName);
    System.out.println("Number is :"+num);
    
    System.out.print("Even Number is: ");
    for(int i=1; i<num; i++){
      if(i%2==0){
       System.out.print(" "+i);
      }
    }
    System.out.println();
    }catch(Exception e){
     System.out.print("Something Went wrong. \n");
    }
    
   }
}
//////////::::::::::::::::: Inner Class ::::::::::::::::::::///////

package imranhosen;

/**
 *
 * @author MD IMRAN HOSEN
 */
//Create filename MyClass.java
public class MyClass {
    public class InnerClass{
        public void hosen(){
        System.out.print("Hello How are You? \n");
        }
     
   }
}
//Create File name Imran.java
public class Imran {
   public static void main(String arr[]){

    MyClass obj = new MyClass();
    MyClass.InnerClass inobj = obj.new InnerClass();
    
    inobj.hosen();
   }
}
//////////////:::::::::::::::::::::: Interface and Implements use ::::::::::::::::::////////////////
package imranhosen;

/**
 *
 * @author MD IMRAN HOSEN
 */
// Create filename hosen.java
interface hosen {
    public void newData();
    public void newDatat();
}

//Create File name MyClass.java
class MyClass implements hosen {
    
    public void newData(){
     System.out.print("Some Test Text Here.. \n");
    }
    public void newDatat(){
    System.out.print("Second Text Here \n");
    }
}

//Create File name Imran.java
public class Imran {
   public static void main(String arr[]){

    MyClass obj = new MyClass();
    obj.newData();
    obj.newDatat();
    
   }
}

