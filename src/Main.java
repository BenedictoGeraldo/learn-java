class Burung {
    String nama;
    String jenis;
}

class Hantu extends Burung{
    String warna;

    void deskripsi () {
        System.out.println("Nama " + nama + "\nJenis " + jenis + "\nWarna " + warna);
    }
}

public class Main {
    public static void main (String[] args) {
        Hantu a = new Hantu();
        a.nama = "Beneben";
        a.jenis = "burung hantu";
        a.warna = "hitam";

        a.deskripsi();
    }

}