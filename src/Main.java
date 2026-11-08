// LEARN PALINDROME (KATA YG KALAU DIBALIK ATAU TIDAK DIBALIK DIBACANYA TETAP SAMA SEPERTI KATAK, MALAM, LEVEL,DLL)

public class Main {
    public static void main (String[] args) {
        String text = "Katak";

        String reversed = new StringBuilder(text).reverse().toString();

        if (text.toLowerCase().equals(reversed.toLowerCase())) {
            System.out.println("Polindrom detected");
        } else {
            System.out.println("Not Polindrom");
        }
    }
}

/*
* Note:
*   1. StringBuilder merupakan class bawaan Java yang digunakan untuk memanipulasi atau memodifikasi urutan karakter dalam sebuah string.
*       kita tidak langsung menggunakan String karena dia bersifat Immutable yakni tidak dapat diubah
*   2. reverse() adalah method milik class StringBuilder. disini kita tidak perlu mendefinisikan parameter karena parameter sudah ada di Class nya StringBuilder yakni si text
*       fungsi dari reverse() ini adalah untuk membalik karakter yang ada di dalam objek StringBuilder
*   3. toString digunakan sebab output reverse oleh reverse() dan StringBuilder itu berupa objek dari StringBuilder(text).
*       jadi kita harus ubah dulu dia ke String seperti yang diharapkan oleh variabel String reversed
*   4. Pada blok if else kita dua kali mendeklarasikan toLoweCase() ini adalah karena di kita sekarang ada 2 variabel yakni variabel text dan variabel reversed
*       function toLowerCase adalah bawaan String yang berguna untuk mengecilkan semua huruf yang ada.
*
* */