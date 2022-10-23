package Task_1;

public class Perhitungan {
    private static Balok sisi;
    public static final int Panjang = sisi.getPanjang();

    void perhitungan(Balok sisi){
        int i = 5;
        int panjang = Panjang;
        int lebar = sisi.getLebar();
        int tinggi = sisi.getTinggi();
        int luas = i;
        luas = panjang * lebar * tinggi;

        int l = 10;
        int panjangV = sisi.getPanjang();
        int lebarV = sisi.getLebar();
        int tinggiV = sisi.getTinggi();
        int volume = l;
        volume = 4 * panjangV *lebarV *tinggiV;
    }
}
