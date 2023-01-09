package pl.javastart.task;

public class Monitor {
    String producer;
    String modelNumber;
    int screenSize;
    double price;

    void showInfo() {
        System.out.println("Monitor marki: " + producer + "\n"
                + "Model: " + modelNumber + "\n"
                + "Ekran: " + screenSize + "\"\n"
                + "Cena: " + price + "zł Brutto\n");

    }
}
