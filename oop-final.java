///////////////:::::::::::1: User input number to Overloadin ( Method, this keyword use ) ::::::::::://///\\\\\\\\\\\\
import java.util.Scanner;
public class ImranCsit{
    
    Scanner inputn = new Scanner(System.in);
   int x = inputn.nextInt();
   int y = inputn.nextInt();

    public static void main(String arr[]){

        ImranCsit obj = new ImranCsit();
        
        System.out.print(obj.myFunction()+" \n");
    }

    public int myFunction(int a, int b) {
    int z = a*b;
    return z;
    }

    public int myFunction(){
        int a = this.x;
        int b = this.y;
        int z = a-b;
      return z;
    }

}

///////////////:::::::::::  2: User input number to Output Maximum and Minimum Number ::::::::::://///\\\\\\\\\\\\

import java.util.Scanner;
public class ImranCsit{

    public static void main(String arr[]){
        System.out.print("Enter intiger Number: ");
        Scanner inputn = new Scanner(System.in);
        int x = inputn.nextInt();
        int y = inputn.nextInt();

        ImranCsit obj = new ImranCsit();
        
        int mn = obj.myFunction(x,y);
        
        System.out.print("Maximum Number is "+obj.myFunction(x,y)+" \n"+
                "Minimum Number is "+obj.myFunctionMin(x,y)+" \n");
    }

    public int myFunction(int a, int b) {
        
        if(a>b) {
         return a;
        } else{
         return b;
        }
    }
    public int myFunctionMin(int a, int b){
      if(a>b){
       return b;
      } else{
       return a;
      }
    }
}

//////////////:::::::::::::::::: 3 : Inheritance with addtition subtraction multiplication division ::::::::::\\\\\\\\\\\\\\
package helloworld;

/**
 *
 * @author MD IMRAN HOSEN
 */
import java.util.Scanner;
public class HelloWorld {
        
    Scanner data = new Scanner(System.in);
    int x = data.nextInt();
    int y = data.nextInt();
    public int myFunctionAdd(){
     int add = x+y;
     return add;
     
    }
    public String myFunctionSub(){
        int t = x-y;
        String z = "Subtraction Number is "+t;
        return z;
    }
    public String myFunctionMul(){
        int t = x*y;
        String z = "Multiplication Number is "+t;
        return z;
    }
    public String myFunctionDiv(){
     float t = x/y;
     String z = "Division Number is "+t+" \n";
     return z;
    }
    
}
//// :: SubClass new file SubClass.java :::: \\\\\

package helloworld;
/**
 *
 * @author MD IMRAN HOSEN
 */
public class SubClass extends HelloWorld {
    
    public static void main(String[] args) {
        try {
        System.out.print("Two Integer Numbner input: \n");
        SubClass obj = new SubClass();
        System.out.print("Addition Number is: "+obj.myFunctionAdd()+" \n"+ obj.myFunctionSub()+" \n "+obj.myFunctionMul()+" \n "+obj.myFunctionDiv());
   
        } catch(Exception e){
         System.out.print("Something went worng. \n");
        }
        }
}
////////:::::::::::::::::::::::::: 4: Method Overriding ::::::::::::::::\\\\\\\\\\\\\\\\\\\

package helloworld;
/**
 *
 * @author MD IMRAN HOSEN
 */
import java.util.Scanner;
public class HelloWorld {
        
    Scanner data = new Scanner(System.in);
    int x = data.nextInt();
    int y = data.nextInt();
    
   public int myFunction(int x, int y){
    int z = x+y;
    return z;                                                                       
    }
    
     public static void main(String[] args) {
       System.out.print("Enter Two Integer Number: ");
       SubClass sobj = new SubClass();
       int a = sobj.x;
       int b = sobj.y;
       System.out.print("Result is "+sobj.myFunction(a,b)+ " \n");
    }    
}

////::: SubClass.java  ::::\\\\\\
package helloworld;
/**
 *
 * @author MD IMRAN HOSEN
 */
public class SubClass extends HelloWorld {
    
    public int myFunction(int f, int p){
     int z = f-p;
     return z;
    }
   
}


///////////////////////::::::::::::::::::::: End :::::::::::::::::::::::::::::::::\\\\\\\\\\\\\\\\\\\\\\
