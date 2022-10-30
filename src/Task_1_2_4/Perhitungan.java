package Task_1_2_4;

public class Perhitungan {
    private static Balok sisi;

    void perhitungan(){
        int panjang = sisi.getPanjang();
        int lebar = sisi.getLebar();
        int tinggi = sisi.getTinggi();
        //Before Refactoring luas = panjang * lebar * tinggi;
        luas(panjang, lebar, tinggi);

        int panjangV = sisi.getPanjang();
        int lebarV = sisi.getLebar();
        int tinggiV = sisi.getTinggi();
        //Before Refactoring volume = 4 * panjang * lebar * tinggi;
        volume(panjangV, lebarV, tinggiV);

    }

    //After Refactoring
    public int luas(int panjangV, int lebarV, int tinggiV) {
        int luas;
        return luas = 4 * panjangV * lebarV * tinggiV;
    }

    public int volume(int panjang, int lebar, int tinggi) {
        int volume;
        return volume = panjang * lebar * tinggi;

    }

}
