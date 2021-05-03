package haseebproject3;

public class Invoice18arid2974 {

    String number, description;
    int quantity;
    double price;

    public Invoice18arid2974() {
        this.number = "";
        this.description = "";
        this.quantity = 0;
        this.price = 0;
    }

    public Invoice18arid2974(String number, String description, int quantity, double price) {
        this.number = number;
        this.description = description;
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
        if (price >= 0.0) {
            this.price = price;
        } else {
            this.price = 0;
        }
    }

    public double getInvoiceAmount() {
        int quantity_int = (int) (double) quantity;
        return quantity_int * price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0.0) {
            this.price = price;
        } else {
            this.price = 0;
        }
    }

    void number(String abcdfd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
