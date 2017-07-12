package by.antiquo.safetosell.entity;

public class Ticket extends Offer {
    private int ticketId;
    private String ticketName;
    private int ticketPrice;
    private String ticketDesc;
    private String ticketPic;


    public Ticket() {
    }

    public Ticket(int ticketId, String ticketName, int ticketPrice, String ticketDesc, String ticketPic) {
        this.ticketId = ticketId;
        this.ticketName = ticketName;
        this.ticketPrice = ticketPrice;
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

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
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
        if (ticketPrice != ticket.ticketPrice) return false;
        if (ticketName != null ? !ticketName.equals(ticket.ticketName) : ticket.ticketName != null) return false;
        if (ticketDesc != null ? !ticketDesc.equals(ticket.ticketDesc) : ticket.ticketDesc != null) return false;
        return ticketPic != null ? ticketPic.equals(ticket.ticketPic) : ticket.ticketPic == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + ticketId;
        result = 31 * result + (ticketName != null ? ticketName.hashCode() : 0);
        result = 31 * result + ticketPrice;
        result = 31 * result + (ticketDesc != null ? ticketDesc.hashCode() : 0);
        result = 31 * result + (ticketPic != null ? ticketPic.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Ticket{ " +
                "ticketId=" + ticketId +
                ", ticketName='" + ticketName +
                ", ticketPrice='" + ticketPrice +
                ", ticketDesc='" + ticketDesc +
                ", ticketPic='" + ticketPic +
                " }";
    }
}
