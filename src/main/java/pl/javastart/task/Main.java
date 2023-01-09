package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Monitor monitor1 = new Monitor();
        monitor1.producer = "HP";
        monitor1.modelNumber = "ADI-5646";
        monitor1.screenSize = 20;
        monitor1.price = 699.99;

        Monitor monitor2 = new Monitor();
        monitor2.producer = "DELL";
        monitor2.modelNumber = "YRE-87965";
        monitor2.screenSize = 23;
        monitor2.price = 854.99;

        monitor1.showInfo();
        monitor2.showInfo();
    }
}
