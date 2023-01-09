package pl.javastart.task;

public class Monitor {
    String producer;
    String modelNumber;
    int screenSize;
    double price;

    public Monitor(String producer, String modelNumber, int screenSize, double price) {
        this.producer = producer;
        this.modelNumber = modelNumber;
        this.screenSize = screenSize;
        this.price = price;
    }

    void showInfo() {
        System.out.println("Monitor marki: " + producer + "\n"
                + "Model: " + modelNumber + "\n"
                + "Ekran: " + screenSize + "\"\n"
                + "Cena: " + price + "zł Brutto\n");

    }
}
