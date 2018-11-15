import java.util.Date;

public class PricePoint {


    private Date date;
    private int price;

    public PricePoint(Date date,int price) {
        this.date = date;
        this.price = price;
    }

    public Date getDate() {
        return date;
    }


    public int getPrice() {
        return price;
    }


}
