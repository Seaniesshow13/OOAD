public class Instrument {
    private String serialNumber;
    private double price;

    private static InstrumentSpec spec;

    public Instrument(String serialNumber, double price, InstrumentSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static InstrumentSpec getSpec() {
        return spec;
    }


}
