import java.util.Scanner;
public class IT24102054lab5Q2
{
   public static void main(String[] args)
   {

      int cost;
      Scanner scanner = new Scanner(System.in);
    
       
      System.out .print("enter the number of new members : ");
      cost = scanner.nextInt();  
     
      if(cost < 0) {
         System.out.println("invalid number : ");
      } else {
         
         String prize;
         switch (cost) {
          
            case 0 : 
                  prize =  "NO price";
                  break;
                                   
            case 1 :
                  prize = "Pen";
                  break;
                    
            
            case 2 : 
                  prize = "Umbrella";
                  break;
                     
             
            case 3 : 
                  prize = "Bag";
                  break;
                       
          
            case 4 : 
                  prize = "Travelling Chair";
                  break;
                       

            default : 
                  prize = "headphone";
                  break;
          
         }
      
         System.out.println("prise is a : " + prize);
     
          

        
       } 
      
               
      
   }
}