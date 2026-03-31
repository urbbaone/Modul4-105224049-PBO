// Soal 1: Definisi Class dan Atribut
class MesinKopi {
    int bijiKopiGram;
    int airMl;
    int susuMl;

    // Soal 2: Method untuk isi ulang bahan
    void isiUlangBahan(int kopi, int air, int susu) {
        this.bijiKopiGram += kopi;
        this.airMl += air;
        this.susuMl += susu;
        System.out.println("Bahan baku berhasil diisi ulang.");
    }

    // Soal 3: Method cek ketersediaan (Resep: 15, 50, 100)
    boolean cekKetersediaanCappuccino() {
        return (bijiKopiGram >= 15 && airMl >= 50 && susuMl >= 100);
    }

    // Soal 4: Constructor default (set bahan ke 0)
    public MesinKopi() {
        this.bijiKopiGram = 0;
        this.airMl = 0;
        this.susuMl = 0;
    }
}

// SOAL 5: Membuat Class Main dan Objek Nyata
public class Main {
    public static void main(String[] args) {
        
        // 1. Membuat objek nyata bernama mesinLobby (Sesuai instruksi Soal 1 & 5)
        MesinKopi mesinLobby = new MesinKopi();

        // 2. Cek kondisi awal (Pasti false karena efek Soal 4)
        System.out.println("Apakah mesinLobby siap? " + mesinLobby.cekKetersediaanCappuccino());

        // 3. Mengisi bahan (Memanggil method dari Soal 2)
        mesinLobby.isiUlangBahan(100, 500, 300);

        // 4. Cek lagi (Sekarang harusnya true sesuai logika Soal 3)
        if (mesinLobby.cekKetersediaanCappuccino()) {
            System.out.println("Status: Mesin di ruang tunggu siap digunakan!");
        } else {
            System.out.println("Status: Bahan masih kurang.");
        }
    }
}