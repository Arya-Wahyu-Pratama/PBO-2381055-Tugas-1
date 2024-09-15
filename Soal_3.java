import java.util.Scanner;
public class Soal_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan teks: ");
        String teks = input.nextLine();
        int jumlahkata = countWords(teks);
        System.out.println("Jumlah kata :" + jumlahkata);
    }
    public static int countWords(String teks){
        int jumlahkata = 1;
        for(int i = 0; i < teks.length(); i++){
            if(Character.isUpperCase(teks.charAt(i)) || Character.isSpaceChar(teks.charAt(i)))
                jumlahkata++;
        }
        return jumlahkata;
    }
}