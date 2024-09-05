//Driver Class
public class PlayInstrumentTester {
    public static void main(String[] args) {
        Instrument guitar =  new Instrument("Guitar", 501.5);
        Instrument piano = new Instrument("Piano", 200.0);
        Instrument violin = new Instrument("Violin", 250.9);

        // guitar.setType("Guitar");
        // guitar.setPrice(101.5);
        // piano.setType("Piano");
        // piano.setPrice(200.0);
        // violin.setType("Violin");
        // violin.setPrice(150.9);
        guitar.print();
        piano.print();
        violin.print();

        if (guitar.getPrice() > piano.getPrice() && guitar.getPrice() > violin.getPrice()) {
            System.out.println("guitar memiliki harga paling mahal");
        }else if (piano.getPrice() > guitar.getPrice() && piano.getPrice() > violin.getPrice()) {
            System.out.println("piano memiliki harga paling mahal");
        }else {
            System.out.println("violin memiliki harga paling mahal");
        }

        if (guitar.getPrice() < piano.getPrice() && guitar.getPrice() < violin.getPrice()) {
            System.out.println("guitar memiliki harga paling murah");
        }else if (piano.getPrice() < guitar.getPrice() && piano.getPrice() < violin.getPrice()) {
            System.out.println("piano memiliki harga paling murah");
        }else{
            System.out.println("violin memiliki harga paling murah");
        }
    }
}
