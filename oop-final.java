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

///////////////:::::::::::END - 1: User input number to Overloadin ( Method, this keyword use ) ::::::::::://///\\\\\\\\\\\\
