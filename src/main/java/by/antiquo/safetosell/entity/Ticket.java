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

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public String getTicketDesc() {
        return ticketDesc;
    }

    public void setTicketDesc(String ticketDesc) {
        this.ticketDesc = ticketDesc;
    }

    public String getTicketPic() {
        return ticketPic;
    }

    public void setTicketPic(String ticketPic) {
        this.ticketPic = ticketPic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Ticket ticket = (Ticket) o;

        if (ticketId != ticket.ticketId) return false;
        if (!ticketName.equals(ticket.ticketName)) return false;
        if (!ticketDesc.equals(ticket.ticketDesc)) return false;
        return ticketPic.equals(ticket.ticketPic);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + ticketId;
        result = 31 * result + ticketName.hashCode();
        result = 31 * result + ticketDesc.hashCode();
        result = 31 * result + ticketPic.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Ticket{ " +
                "ticketId=" + ticketId +
                ", ticketName='" + ticketName +
                ", ticketDesc='" + ticketDesc +
                ", ticketPic='" + ticketPic +
                " }";
    }
}
