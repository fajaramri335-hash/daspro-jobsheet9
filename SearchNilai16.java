import java.util.Scanner;

public class SearchNilai16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array nilai: ");
        int jumlah = input.nextInt();
        int[] nilai = new int[jumlah];

        System.out.println("Masukkan nilai untuk setiap elemen array:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Elemen ke-" + i + ": ");
            nilai[i] = input.nextInt();
        }

        System.out.print("Masukkan nilai (key) yang ingin dicari: ");
        int key = input.nextInt();

        boolean ditemukan = false;
        int indeksKetemu = -1;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                ditemukan = true;
                indeksKetemu = i;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + indeksKetemu);
        } else {
            System.out.println("Nilai yang dicari (" + key + ") tidak ditemukan di dalam array. Silakan periksa kembali data yang Anda masukkan.");
        }

        input.close();
    }
}