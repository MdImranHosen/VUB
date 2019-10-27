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
