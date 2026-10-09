class Hitung {
    int tambah(int a, int b) {
        return a + b;
    }

    int tambah (int a, int b, int c) {
        return a + b - c;
    }
}


public class Main {
    public static void main (String[] args) {
        Hitung a = new Hitung();
        System.out.println("Jumlahnya method 1 adalah " + a.tambah(10,4));
        System.out.println("Jumlahnya method 2 adalah " + a.tambah(10,2,11));
    }

}