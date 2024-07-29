public class Admin extends Client{
    public String adminName;

    public Admin(String ID1, String concertHall1, int eventCode1, Boolean isPromo1, char stadiumSector1, int price1) {
        super(ID1, concertHall1, eventCode1, isPromo1, stadiumSector1, price1);
    }

    public String getAdminName(){
        return adminName;
    }

    public void setAdminName(String adName){
        this.adminName=adName;
    }

    public Boolean checkTicket(Ticket ticket1, Ticket ticket2){
        return ticket1.equals(ticket2);
    }

}

