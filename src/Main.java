abstract class Tombol {
    abstract void tekan();
}

class TombolLompat extends Tombol {
    @Override
    void tekan() {
        System.out.println("Lompat");
    }
}

public class Main {
    public static void main (String[] args) {
        Tombol a = new TombolLompat();
        a.tekan();
    }
}