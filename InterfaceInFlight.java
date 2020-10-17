package interfaceinflight;
interface Flight{
    void GetFlightInfo();
    void BookTicket();
}
class AirIndia implements Flight{
    @Override
    public void GetFlightInfo() {
        System.out.println("Get Airindia flight info");
    }
    @Override
    public void BookTicket() {
        System.out.println("Book AirIndia ticket");
    }   
}
class SpiceJet implements Flight{    
    @Override
    public void GetFlightInfo() {
        System.out.println("Get Spicejet flight info");
    }
    @Override
    public void BookTicket() {
        System.out.println("Book Spicejet ticket");
    }   
}
public class InterfaceInFlight {
    public static void main(String[] args) {
        Flight ob1=new AirIndia();
        ob1.GetFlightInfo();
        ob1.BookTicket();
        ob1=new SpiceJet();
        ob1.GetFlightInfo();
        ob1.BookTicket();
    }   
}
