public class Device {

    String model;
    String company;
    String device;
    double price;
    String kod;

    public Device(String model, String company, String device, double price) {
        this(model, company, device);
        this.price = price;

    }

    public Device(String model, String company, String device) {
        this.model = model;
        this.company = company;
        this.device = device;
    }

    String getInfo(){
        this.kod =("Kod: " + this.model +", Producent: "+ this.company+", typ: " + this.device + ", cena: "+ this.price);
        return kod;
    }

}
