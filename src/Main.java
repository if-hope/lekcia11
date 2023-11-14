import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException {

       TicketShop shop = new TicketShop();
       try {
           shop.process("Second", 300);
       }catch (WrongNameException exception){
           System.out.println("Wrong Name, no such name");
       }
       catch (WrongPriceException exception){
           System.out.println("Event is more expensive");
       }
       finally {
           System.out.println("Ok");
       }


    }

}
