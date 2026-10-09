interface Tombol {
    void tekan();
}

class TombolLompat implements Tombol {
    @Override
    public void tekan() {
        System.out.println("Lompat");
    }
}

public class Main {
    public static void main (String[] args) {
        Tombol a = new TombolLompat();
        a.tekan();
    }
}