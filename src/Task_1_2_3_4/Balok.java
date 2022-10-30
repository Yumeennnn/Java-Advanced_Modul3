package Task_1_2_3_4;

public class Balok {
    private int panjang;
    private int lebar;
    private int tinggi;
    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    protected long Hasil(){
        Perhitungan ph = new Perhitungan();
        System.out.println("\nHasil luas balok   : " + ph.Luas(this) + " cm");
        System.out.println("Hasil volume balok : " + ph.Volume(this) + " cm3");
        return 0;
    }

    static boolean isCubes (long input){
        long cubes = Math.round(Math.cbrt(input)) * Math.round(Math.cbrt(input)) * Math.round(Math.cbrt(input));
        return input != 0;
    }

//    static boolean isCube (long input){
//        return Math.round(Math.cbrt(input)) * Math.round(Math.cbrt(input)) * Math.round(Math.cbrt(input)) == input ;
//    }
}
