public class Main {
    public static void cekUmur (int umur) {
        if (umur < 17) {
            throw new ArithmeticException("Umur belum mencukupi");
        } else {
            System.out.println("Umur mencukupi");
        }
    }

    public static void main (String[] args) {
        try {
            cekUmur(90);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        }
    }
}