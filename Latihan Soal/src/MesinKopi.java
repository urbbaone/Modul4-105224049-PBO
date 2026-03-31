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