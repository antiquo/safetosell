package by.antiquo.safetosell.entity;

public class Ticket extends Offer {
    private int ticketId;
    private String ticketName;
    private String ticketDesc;
    private String ticketPic;

    public Ticket(){}

    public Ticket(int ticketId, String ticketName, String ticketDesc, String ticketPic){
        this.ticketId = ticketId;
        this.ticketName = ticketName;
        this.ticketDesc = ticketDesc;
        this.ticketPic = ticketPic;
    }
}
