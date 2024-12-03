import java.util.Scanner;

public class Cube_244107060159 { // Ganti 'YourStudentIDNumber' dengan nomor siswa Anda
    // Fungsi untuk menghitung luas permukaan kubus
    public static double calculateSurfaceArea(double side) {
        return 6 * Math.pow(side, 2);
    }

    // Fungsi untuk menghitung volume kubus
    public static double calculateVolume(double side) {
        return Math.pow(side, 3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side of the cube: ");
        double side = scanner.nextDouble();

        System.out.println("Surface Area of Cube: " + calculateSurfaceArea(side));
        System.out.println("Volume of Cube: " + calculateVolume(side));
    }
}
