public class Instrument {
    //variabel
    private String type;
    private double price;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //constructor default
    public Instrument() {
        type = "Kosong";
        price =  0.0;
    }

    //constructor parameter
    public Instrument(String t, double p) {
        type = t;
        price = p;
    }

    public void print() {
        System.out.println("Tipe Instrument : "+type);
        System.out.println("Harga Instrument : "+price);
    }

}
