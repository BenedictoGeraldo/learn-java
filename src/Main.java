class Mahasiswa {
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama (String newNama) {
        nama = newNama;
    }
}

public class Main {
    public static void main (String[] args) {
        Mahasiswa a = new Mahasiswa();
        a.setNama("Benedicto");

        System.out.println(a.getNama());
    }
}