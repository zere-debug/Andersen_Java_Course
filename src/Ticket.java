public class Ticket {
    protected String ID;
    protected String concertHall;
    protected int eventCode;
    public java.time.LocalDateTime time = java.time.LocalDateTime.now();
    protected Boolean isPromo;
    public char stadiumSector;
    private double maxBackpackWeight;
    protected int price;
    protected String shareWith;

    public String getID(){ return this.ID;}
    public String getConcertHall() { return this.concertHall;}
    public int getEventCode() { return this.eventCode;}
    public Boolean getIsPromo() { return this.isPromo;}
    public double getMaxBackpackWeight() { return maxBackpackWeight; }
    public int gerPrice() { return this.price;}
    public String getShareWith() { return this.shareWith;}


    public Ticket(String ID1, String concertHall1, int eventCode1, Boolean isPromo1,
                  char stadiumSector1, int price1){
        ID = ID1;
        concertHall = concertHall1;
        eventCode = eventCode1;
        time = java.time.LocalDateTime.now();
        isPromo = isPromo1;
        stadiumSector = stadiumSector1;
        price = price1;
    }
    public Ticket(String concertHall1, int eventCode1){
        concertHall = concertHall1;
        eventCode = eventCode1;
    }

    public void printShareWith(){
        System.out.println("You have not shared the ticket yet...");
    }

    public void printShareWith(String device){
        System.out.println("You shared your ticket with "+ device + ".");
    }

    public void printTicket(){
        System.out.println( "Your ticket's is ID is " + ID +
                ", event code is " + eventCode + ", stadium sector is " + stadiumSector +
                ", price is " + price + ".");
    }
}
