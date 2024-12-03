public class Experiment5_244107060159 {
    public static void show(String title, int... numbers) {
        System.out.println(title);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        show("Numbers List:", 10, 20, 30, 40);
    }
}
