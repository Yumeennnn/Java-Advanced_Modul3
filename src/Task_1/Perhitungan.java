package Task_1;

public class Perhitungan {
    private static Balok sisi;

    void perhitungan(){
        int panjang = sisi.getPanjang();
        int lebar = sisi.getLebar();
        int tinggi = sisi.getTinggi();
        luas(panjang, lebar, tinggi);

        int panjangV = sisi.getPanjang();
        int lebarV = sisi.getLebar();
        int tinggiV = sisi.getTinggi();
        volume(panjangV, lebarV, tinggiV);
    }

    public int luas(int panjang, int lebar, int tinggi) {
        int luas;
        return luas = panjang * lebar * tinggi;
    }

    public int volume(int panjangV, int lebarV, int tinggiV) {
        int volume;
        return volume = 4 * panjangV * lebarV * tinggiV;
    }

}
