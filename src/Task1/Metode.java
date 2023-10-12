package Task1;

public class Metode{

   public String metodeA(String input){
        if(input.equals("ja")){
            System.out.println("j");
            System.out.println("a");
            metodeB();
            return input;
        }
       return input;

   }
   public void metodeB(){
       if(metodeA("").length()<1) {
           System.out.println("v");
           System.out.println("a");
           metodeC();
       }

    }
   public void metodeC(){
        System.out.println("e");
       System.out.println("r");
       metodeD();
    }
  public void metodeD(){

       System.out.println("s");
      System.out.println("j");
      System.out.println("o");
      System.out.println("v");
      System.out.println("t");
    }
}
