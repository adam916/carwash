public class CarWash{
    private int amountofgoldwashes;
    private int amountofsilverwashes;
    private int amountofbasicwashes;

    public void chooseWash(WashCard washcard){
        System.out.println("choose your wash type: 'goldwash' - price:600$, 'silverwash' - price:400$ or 'basicwash' - price:200$");
        String input = System.console().readLine();
       
        if(input.equalsIgnoreCase("goldwash")){
            System.out.println("you've pick the wash type: " + input + " .. your car will be washed soon");
            washcard.chargeGoldwash();
            addToWashCount(input);

        }else if(input.equalsIgnoreCase("silverwash")){
            System.out.println("you've pick the wash type: " + input + " .. your car will be washed soon");
            washcard.chargeSilverwash();
            addToWashCount(input);

        }else if(input.equalsIgnoreCase("basicwash")){
            System.out.println("you've picked the wash type: " + input + " .. your car will be washed soon");
            washcard.chargeBasicwash();
            addToWashCount(input);
        }
        else{
         System.out.println("invalid input");   
        }
    }

public void addToWashCount(String type){
    if(type.equalsIgnoreCase("goldwash")){
        this.amountofgoldwashes+=1;
    }else if(type.equalsIgnoreCase("silverwash")){
        this.amountofsilverwashes+=1;        
    }else if(type.equalsIgnoreCase("basicwash")){
        this.amountofbasicwashes+=1;
    }
  }


 public void printWashes(){
      System.out.println("we have washed " + amountofgoldwashes + " Goldwashes");
      System.out.println("we have washed " + amountofsilverwashes + " Silverwashes");
      System.out.println("we have washed " + amountofbasicwashes + " Basicwashes");
  }

}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------
