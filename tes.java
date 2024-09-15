import java.util.Scanner;

public class tes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan teks: ");
        String teks = input.nextLine();

        // Memecah teks menjadi kata-kata
        String[] kataKata = teks.split("\\s+");
        int jumlahKata = kataKata.length;

        System.out.println("Jumlah kata dalam teks: " + jumlahKata);
    }
}