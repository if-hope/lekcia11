import java.util.ArrayList;
import java.util.List;

public class TicketShop {

    private List<Event> events = new ArrayList<>(){{
        add(new Event("First", 300));
        add(new Event("Second", 400));
        add(new Event("Third", 500));
    }};
    private int soldAmount;

    public void process(String name, int price){
        for(Event event: events){
            if(name.equals(event.getName())){
                if(price>=event.getPrice()){
                    soldAmount++;
                } else {
                    throw new WrongPriceException("Not enough money");
                }

            } else{
                throw new WrongNameException(String.format("There is no event with name [%s] in EventList", name));
            }
        }
    }



}
