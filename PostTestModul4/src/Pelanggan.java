public class Pelanggan {
    
}
import java.util.Scanner;

// Class Pelanggan sebagai core engine-nya
class Pelanggan {
    String namaLengkap;
    String nomorPonsel;
    double saldo;

    // Constructor: Sesuai aturan, pelanggan baru saldonya wajib nol mutlak
    public Pelanggan(String nama, String hp) {
        this.namaLengkap = nama;
        this.nomorPonsel = hp;
        this.saldo = 0; 
        System.out.println("\n--- Akun DuitKu Berhasil Dibuat ---");
        System.out.println("Nama: " + namaLengkap);
        System.out.println("HP  : " + nomorPonsel);
        System.out.println("Saldo Awal: Rp " + saldo);
    }

    // Aktivitas 1: Pengisian Dana (Top Up)
    public void setorUang(double jumlah) {
        if (jumlah < 10000) {
            System.out.println("[PERINGATAN KERAS] Setoran minimal Rp 10.000! Transaksi diblokir.");
        } else {
            this.saldo += jumlah;
            System.out.println("--- RESI SETORAN ---");
            System.out.println("Berhasil menambah saldo sebesar: Rp " + jumlah);
            System.out.println("Total saldo sekarang: Rp " + saldo);
        }
    }

    // Aktivitas 2: Pelunasan Tagihan
    public void bayarTagihan(String namaTagihan, double nominal) {
        System.out.println("\n--- Mencoba membayar " + namaTagihan + " sebesar Rp " + nominal + " ---");
        if (this.saldo >= nominal) {
            this.saldo -= nominal;
            System.out.println("[BERHASIL] Pembayaran " + namaTagihan + " sukses. Saldo terpotong.");
        } else {
            System.out.println("[GAGAL MUTLAK] Dana tidak mencukupi! Saldo Anda: Rp " + saldo);
        }
    }

    // Buat ngecek sisa saldo terakhir
    public void tampilkanSisaSaldo() {
        System.out.println("\n--- INFO SALDO AKHIR ---");
        System.out.println("Sisa uang " + namaLengkap + " di sistem: Rp " + saldo);
    }
}