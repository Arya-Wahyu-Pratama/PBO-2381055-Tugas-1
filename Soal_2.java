import java.util.Scanner;
public class Soal_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan jumlah Tangga :");
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}