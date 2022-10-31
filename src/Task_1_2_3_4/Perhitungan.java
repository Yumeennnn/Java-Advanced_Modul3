package Task_1_2_3_4;

public class Perhitungan {
    Balok sisi = new Balok();

    void perhitungan(Balok Sisi){
        Luas(Sisi);
        Volume(Sisi);
    }

    public long Luas(Balok sisi) {
        long volume;
        return volume = 4 * sisi.getPanjang() * sisi.getLebar() * sisi.getTinggi();
    }

    static long Volume(Balok sisi) {
        long luas;
        return luas = sisi.getPanjang() * sisi.getLebar() * sisi.getTinggi();
    }

}
