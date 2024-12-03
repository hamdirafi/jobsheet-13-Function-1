import java.util.Scanner;

public class Experiment6_244107060159 { 
    // Fungsi untuk menghitung luas lingkaran
    static int calculateArea (int l, int w) {
        int area = l*w;
        return area;
}

    // Fungsi untuk menghitung volume
    static int calculateVolume (int l, int w, int h) {
        return l * w * h;
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, volume;

        // Input nilai panjang, lebar dan tinggi lingkaran
        System.out.print("Input length = ");
        p = input.nextInt();
        System.out.print("Input width = ");
        l = input.nextInt();
        System.out.print("Input height = ");
        t = input.nextInt();

        // Menampilkan hasil perhitungan luas dan volume
        L = p*l;
        System.out.println("Area of rectangle = " + L);
        volume = p*l*t;
        System.out.println("Volume of the rectangle = " + volume);
    }
}