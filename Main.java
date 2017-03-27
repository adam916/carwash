import java.util.Scanner;

public class Main{


    public static void main(String[] args){

        Customer customer1 = new Customer("bob");
        Customer customer2 = new Customer("john");
        
        WashCard washcard1 = new WashCard("bob");
        WashCard washcard2 = new WashCard("john");
     
        CarWash carwash1 = new CarWash();



        System.out.println("Welcome to the carwash");
        System.out.println("please enter username");
        String input = System.console().readLine();
        if(input.equalsIgnoreCase(customer1.getCustomerName())){
             System.out.println("welcome " + input); 
             while(washcard1.getAmount()<200){
                 washcard1.refillCard();    
                }
                carwash1.chooseWash(washcard1);
            }else{
                System.out.println("invalid input");
            }
                System.out.println("come again soon...");
                System.out.println("neeext");
                System.out.println("Welcome to the carwash");
                System.out.println("please enter username");
                String input2 = System.console().readLine();
                System.out.println("welcome " + input2); 
                while(washcard2.getAmount()<200){
                    washcard2.refillCard();    
                }
                carwash1.chooseWash(washcard2);
                System.out.println("come again soon...");
                System.out.println("...");
                System.out.println("Welcome to the carwash");
                System.out.println("please enter username");
                String input3 = System.console().readLine();
               
                if(input3.equalsIgnoreCase("owner")){
                    System.out.println("oh hello  mr " + input3); 
                    System.out.println("here is the wash stats of today: ");
                    carwash1.printWashes();
                }else{
                    System.out.println("im sorry, we are closed..");
                }
    }           
  
}
