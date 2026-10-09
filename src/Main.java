class Buah {
    private int harga;

    public int getHarga() {
        return harga;
    }

    public void setHarga (int newHarga) {
        harga = newHarga;
    }
}

public class Main {
    public static void main (String[] args) {
        Buah a = new Buah();
        a.harga = 10;

        System.out.println(a.harga);
    }
}