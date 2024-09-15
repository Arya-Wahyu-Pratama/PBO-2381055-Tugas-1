import java.util.Scanner;

public class Soal_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        System.out.print("Masukan jumlah array : ");
        int jumlah = scanner.nextInt();
        int[] array = new int[jumlah];
        System.out.println("Masukan Element array : ");
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Array ke-" + i + ": ");
            array[i] = scanner.nextInt();
            total += array[i];
        }
        System.out.print("Total sum element array : " + total);
    }
}