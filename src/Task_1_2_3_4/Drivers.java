package Task_1_2_3_4;

import java.util.Scanner;

public class Drivers {
    static int a, b, c;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Balok result = new Balok();
        Perhitungan p = new Perhitungan();

        System.out.print("Masukkan Panjang : "); a = input.nextInt();
        result.setPanjang(a);

        System.out.print("Masukkan Lebar   : "); b = input.nextInt();
        result.setLebar(b);

        System.out.print("Masukkan Tinggi  : "); c = input.nextInt();
        result.setTinggi(c);
        result.Hasil();
        System.out.println("Balok Is " +result.isCubes(p.Luas(result)));
    }
}
