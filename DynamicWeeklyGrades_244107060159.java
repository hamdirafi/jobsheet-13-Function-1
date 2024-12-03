import java.util.Scanner;

public class DynamicWeeklyGrades_244107060159 { // Ganti 'YourStudentIDNumber' dengan nomor siswa Anda
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah siswa dan minggu
        System.out.print("Enter number of students: ");
        int students = scanner.nextInt();
        System.out.print("Enter number of weeks: ");
        int weeks = scanner.nextInt();

        int[][] grades = new int[students][weeks];

        // Menginput data nilai
        for (int i = 0; i < students; i++) {
            System.out.println("Enter grades for student " + (i + 1) + ":");
            for (int j = 0; j < weeks; j++) {
                System.out.print("Week " + (j + 1) + ": ");
                grades[i][j] = scanner.nextInt();
            }
        }

        // Menampilkan semua nilai
        System.out.println("Weekly Grades:");
        for (int i = 0; i < students; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < weeks; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }

        // Menemukan minggu dengan nilai tertinggi
        int highestWeek = 0;
        int maxGrade = 0;
        for (int j = 0; j < weeks; j++) {
            int weekSum = 0;
            for (int i = 0; i < students; i++) {
                weekSum += grades[i][j];
            }
            if (weekSum > maxGrade) {
                maxGrade = weekSum;
                highestWeek = j;
            }
        }
        System.out.println("Week with highest grades: Week " + (highestWeek + 1));

        // Menemukan siswa dengan nilai tertinggi
        int topStudent = 0;
        maxGrade = 0;
        for (int i = 0; i < students; i++) {
            int totalGrade = 0;
            for (int j = 0; j < weeks; j++) {
                totalGrade += grades[i][j];
            }
            if (totalGrade > maxGrade) {
                maxGrade = totalGrade;
                topStudent = i;
            }
        }
        System.out.println("Top student: Student " + (topStudent + 1));
    }
}
