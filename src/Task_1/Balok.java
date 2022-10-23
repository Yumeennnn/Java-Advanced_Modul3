package Task_1;

public class Balok{
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

    protected void Result(){
        Perhitungan ph = new Perhitungan();
        System.out.println("Hasil Luas Balok: " +ph.luas(this));
        System.out.println("Hasil Volume Balok: " +ph.volume(this));
    }

    public static void main(String[] args) {

    }
}
