package Task_1_2_3_4;

import java.util.Scanner;

public class Drivers {
    static int Panjang, Lebar, Tinggi;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Balok result = new Balok();
        Perhitungan p = new Perhitungan();

        System.out.print("Masukkan Panjang : ");
        Panjang = input.nextInt();
        result.setPanjang(Panjang);

        System.out.print("Masukkan Lebar   : ");
        Lebar = input.nextInt();
        result.setLebar(Lebar);

        System.out.print("Masukkan Tinggi  : ");
        Tinggi = input.nextInt();
        result.setTinggi(Tinggi);
        result.Hasil();
        System.out.println("Balok Is " +result.isCubes(p.Luas(result)));
    }
}
