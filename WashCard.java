import java.util.Scanner;
public class WashCard{
    private String ownerofcard;
    private int amount;
    private int newamount;
    

    public WashCard(String ownerofcard){
        this.ownerofcard=ownerofcard;
        this.amount=amount;    

    }

    public WashCard(){

    }


    public void refillCard(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("you have insufficient funds for any wash.. would you like to refill your washcard? y/n");
        String input = System.console().readLine();
        if(input.equalsIgnoreCase("y")){
            System.out.println("please insert your creditcard and enter your desired refill amount");
            int refillamount = scanner.nextInt();            
            //---------------------------------------
           while(this.amount+refillamount>1000){
                int maxamount = 1000-this.amount;
                System.out.println("sorry, your maximum refillamount you can insert is " + maxamount + " please try again");
                this.amount-=refillamount=newamount;
           }
           
            int newamount = refillamount+this.amount;
            System.out.println("you now have " + newamount + " on your washcard");
            this.amount=newamount;
         }else{
            System.out.println("have a nice day");   
            System.exit(0); 
         }
        }
    

    public void chargeGoldwash(){
       if(600<this.amount){
            int result = this.amount -= 600;
            System.out.println("you now have " + this.amount + " left on your card"); 
            System.out.println("would you like a reciept? (y/n)"); 
            String input = System.console().readLine();
            if(input.equalsIgnoreCase("y")){ 
                printReceipt("goldwash", 600);
            }else if(input.equalsIgnoreCase("n")){
                System.out.println("ok, have a nice day");
            }else{
                System.out.println("wrong input");    
            }
       }else if(600>=this.amount){
            refillCard();
       }
    }


   public void chargeSilverwash(){
       if(400<this.amount){
            this.amount -= 400;
            System.out.println("you now have " + this.amount + " left on your card");   
            System.out.println("would you like a reciept?  (y/n)"); 
            String input = System.console().readLine(); 
            if(input.equalsIgnoreCase("y")){
                printReceipt("silverwash", 400);
            }else if(input.equalsIgnoreCase("n")){
                System.out.println("ok have a nice day");
            }else{
                System.out.println("wrong input");    
            }
       }else if(400>=this.amount){
            refillCard();
       }
    }


  public void chargeBasicwash()
  {
       if(200<this.amount){
             this.amount -= 200;
            System.out.println("you now have " + this.amount + " left on your card");   ;
            System.out.println("would you like a reciept? (y/n)");
            String input = System.console().readLine(); 
            if(input.equalsIgnoreCase("y")){
                printReceipt("basicwash", 200);
            }else if(input.equalsIgnoreCase("n")){
                System.out.println("cheers");
            }else{
                System.out.println("wrong input");    
            }
       }else if(200>=this.amount){
            refillCard();
       }
  }

  public int getAmount(){
    this.amount=amount;
    return amount;    
  }





  public void printReceipt(String washtype, int washprice){
    System.out.println("washcard repciept: - cardholder: " + ownerofcard + " washtype: " + washtype + " for the price of " + washprice + "$ " + "there are " + this.amount + "$ left on the washcard");      
    
  }




}