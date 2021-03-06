package mybnb;

public class CommissionCharged extends AbstractEvent {

    private Long id;
    private Long payId;
    private Long price;
    private Float charge;
    private String status;
    private Long roomId;
    private Long bookId;

    public CommissionCharged(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getPayId() {
        return payId;
    }

    public void setPayId(Long payId) {
        this.payId = payId;
    }
    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
    public Float getCharge() {
        return charge;
    }

    public void setCharge(Float charge) {
        this.charge = charge;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }
}
