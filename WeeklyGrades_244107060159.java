import java.util.Scanner;

public class WeeklyGrades_244107060159 { // Ganti 'YourStudentIDNumber' dengan nomor siswa Anda
    static final int STUDENTS = 5;
    static final int WEEKS = 7;
    static int[][] grades = new int[STUDENTS][WEEKS];

    // Fungsi untuk menginput data nilai
    public static void inputGrades() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < STUDENTS; i++) {
            System.out.println("Enter grades for student " + (i + 1) + ":");
            for (int j = 0; j < WEEKS; j++) {
                System.out.print("Week " + (j + 1) + ": ");
                grades[i][j] = scanner.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan semua nilai
    public static void displayGrades() {
        System.out.println("Weekly Grades:");
        for (int i = 0; i < STUDENTS; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < WEEKS; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk menemukan minggu dengan nilai tertinggi
    public static void findHighestWeek() {
        int highestWeek = 0;
        int maxGrade = 0;
        for (int j = 0; j < WEEKS; j++) {
            int weekSum = 0;
            for (int i = 0; i < STUDENTS; i++) {
                weekSum += grades[i][j];
            }
            if (weekSum > maxGrade) {
                maxGrade = weekSum;
                highestWeek = j;
            }
        }
        System.out.println("Week with highest grades: Week " + (highestWeek + 1));
    }

    // Fungsi untuk menemukan siswa dengan nilai tertinggi
    public static void findTopStudent() {
        int topStudent = 0;
        int maxGrade = 0;
        for (int i = 0; i < STUDENTS; i++) {
            int totalGrade = 0;
            for (int j = 0; j < WEEKS; j++) {
                totalGrade += grades[i][j];
            }
            if (totalGrade > maxGrade) {
                maxGrade = totalGrade;
                topStudent = i;
            }
        }
        System.out.println("Top student: Student " + (topStudent + 1));
        System.out.print("Grades: ");
        for (int j = 0; j < WEEKS; j++) {
            System.out.print(grades[topStudent][j] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        inputGrades();
        displayGrades();
        findHighestWeek();
        findTopStudent();
    }
}
