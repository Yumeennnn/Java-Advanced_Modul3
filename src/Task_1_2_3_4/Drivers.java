package Task_1_2_3_4;

import java.util.Scanner;

public class Drivers {
    static int Panjang, Lebar, Tinggi;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Balok b = new Balok();
        Perhitungan p = new Perhitungan();

        System.out.print("Masukkan Panjang : ");
        Panjang = input.nextInt();
        b.setPanjang(Panjang);

        System.out.print("Masukkan Lebar   : ");
        Lebar = input.nextInt();
        b.setLebar(Lebar);

        System.out.print("Masukkan Tinggi  : ");
        Tinggi = input.nextInt();
        b.setTinggi(Tinggi);
        b.Hasil();
        System.out.println("Balok Is " +b.isCubes(p.Luas(b)));
    }
}
