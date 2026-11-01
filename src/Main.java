//Learn encapsulation

class Pesawat {
    private int kecepatan = 0;

    public void gas () {
        this.kecepatan += 10;
    }

    public int getKecepatan() {
        return this.kecepatan;
    }
}

public class Main {
    public static void main (String[] args) {
        Pesawat pesawat = new Pesawat();
        pesawat.gas();

        System.out.println("Kecepatan Pesawat ini: " + pesawat.getKecepatan());
    }
}