public class Main {
    String merk;
    String warna;
    int harga;

    void brumbrum() {
        System.out.println("Merk " + merk + "\nWarna " + warna + "\nHarga " + harga);
    }

    public static void main (String[] args){
        Main a = new Main();
        a.merk = "honda";
        a.warna = "biru";
        a.harga = 2000000000;

        a.brumbrum();
    }
}