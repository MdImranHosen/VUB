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
///////////////////////::::::::::::::::::::: End :::::::::::::::::::::::::::::::::\\\\\\\\\\\\\\\\\\\\\\
