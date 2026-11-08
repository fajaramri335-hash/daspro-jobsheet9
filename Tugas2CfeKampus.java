import java.util.Scanner;

public class Tugas2CfeKampus {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
 
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
 
        // Tampilkan daftar menu
        System.out.println("===== DAFTAR MENU KAFE KAMPUS =====");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }
 
        System.out.print("\nJumlah jenis menu yang ingin dipesan: ");
        int jumlah = input.nextInt();
        input.nextLine();
 
        String[] pesanan = new String[jumlah];   
        int[] hargaSatuan = new int[jumlah];
        int[] banyak = new int[jumlah];
        int total = 0;
 
        for (int k = 0; k < jumlah; k++) {
            int posisi = -1;
            while (posisi == -1) {
                System.out.print("\nMenu ke-" + (k + 1) + " (nama menu): ");
                String cari = input.nextLine().trim();
 
                // Linear search
                for (int i = 0; i < menu.length; i++) {
                    if (menu[i].equalsIgnoreCase(cari)) {
                        posisi = i;
                        break;
                    }
                }
 
                if (posisi == -1) {
                    System.out.println("Maaf, menu \"" + cari + "\" tidak tersedia. Coba lagi.");
                }
            }
            System.out.println(menu[posisi] + " tersedia, harga Rp " + harga[posisi]);
 
            System.out.print("Berapa banyak yang dibeli: ");
            banyak [k] = input.nextInt();
            input.nextLine();
 
            pesanan[k] = menu[posisi];
            hargaSatuan[k] = harga[posisi];
            total += harga[posisi] * banyak[k];
        }
 
        System.out.println();
        System.out.println("========== DAFTAR PESANAN ==========");
        for (int i = 0; i < jumlah; i++) {
            int subtotal = hargaSatuan[i] * banyak[i];
            System.out.println((i + 1) + ". " + pesanan[i] + " | " + banyak[i] + " x Rp " + hargaSatuan[i] + " = Rp " + subtotal);
        }
        System.out.println("------------------------------------");
        System.out.println("TOTAL BIAYA: Rp " + total);
 
        input.close();
    
}
    
}
