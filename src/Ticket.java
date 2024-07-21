public class Ticket {
    public String ID;
    protected String concertHall;
    public int eventCode;
    public java.time.LocalDateTime time = java.time.LocalDateTime.now();
    public Boolean isPromo;
    public char stadiumSector;
    private double maxBackpackWeight;
    protected int price;

    public Ticket(String ID1, String concertHall1, int eventCode1, Boolean isPromo1,
                  char stadiumSector1, int price1){
        ID = ID1;
        concertHall = concertHall1;
        eventCode = eventCode1;
        time = java.time.LocalDateTime.now();
        isPromo1= isPromo;
        stadiumSector1 = stadiumSector;
        price1 = price;
    }
    public Ticket(String concertHall1, int eventCode1){
        concertHall = concertHall1;
        eventCode = eventCode1;
    }
}
