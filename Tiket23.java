import java.util.Scanner;

public class Tiket23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int HARGA_TIKET = 50000, totalTiketTerjual = 0;
        double totalPendapatan = 0;
        boolean lanjutTransaksi = true;
        
        System.out.println("Program Penjualan Tiket Bioskop");
        System.out.println("==============================");
        
        while (lanjutTransaksi) {
            int jumlahTiket;
            
            while (true) {
                System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk selesai): ");
                jumlahTiket = input.nextInt();
                
                if (jumlahTiket == 0) {
                    lanjutTransaksi = false;
                    break;
                } else if (jumlahTiket < 0) {
                    System.out.println("Jumlah tiket tidak valid. Silakan coba lagi.");
                    continue;
                }
                
                double hargaTotal = jumlahTiket * HARGA_TIKET;
                double diskon = 0;
                
                if (jumlahTiket > 10) {
                    diskon = 0.15; 
                } else if (jumlahTiket > 4) {
                    diskon = 0.10; 
                }
                
                double hargaSetelahDiskon = hargaTotal * (1 - diskon);
                
                System.out.println("Harga total: Rp " + hargaTotal);
                if (diskon > 0) {
                    System.out.println("Diskon: " + (diskon * 100) + "%");
                    System.out.println("Harga setelah diskon: Rp " + hargaSetelahDiskon);
                }
                
                totalTiketTerjual += jumlahTiket;
                totalPendapatan += hargaSetelahDiskon;
                break;
            }
        }
        
        System.out.println("\nLaporan Penjualan Hari Ini");
        System.out.println("==========================");
        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total pendapatan: Rp " + totalPendapatan);
    }
}