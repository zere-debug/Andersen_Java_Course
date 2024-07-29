public class Client extends Ticket{
    private String name;
    private String surName;

    public Client(String ID1, String concertHall1, int eventCode1, Boolean isPromo1, char stadiumSector1, int price1) {
        super(ID1, concertHall1, eventCode1, isPromo1, stadiumSector1, price1);
    }

    public void setName(String name1){
        this.name=name1;
    }

    public String getName(){
        return name;
    }

    public String getTicket(){
       String clientTicket = "Your ticket's is ID is " + ID + ", date of concert is "+ time +
                           ", event code is " + eventCode + ", stadium sector is " + stadiumSector;
       return clientTicket;
    }



}

