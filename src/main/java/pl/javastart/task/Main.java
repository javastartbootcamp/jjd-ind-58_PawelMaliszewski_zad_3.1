package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Monitor monitor1 = new Monitor("HP", "ADI-5646", 20, 699.99);
        Monitor monitor2 = new Monitor("DELL", "YRE-87965", 23, 854.99);

        monitor1.showInfo();
        monitor2.showInfo();
    }
}
