class Keluarga {
    String ayah;
    String ibu;
    String anak;

    void bersama() {
        System.out.println("Ini adalah silsilah keluarga saya yang terdiri dari " + ayah + ibu + anak);
    }
}

public class Main {
    public static void main (String[] args){
        Keluarga keluarga = new Keluarga();
        keluarga.ayah = "John, ";
        keluarga.ibu = "Marie, ";
        keluarga.anak = "Edward";

        keluarga.bersama();
    }
}