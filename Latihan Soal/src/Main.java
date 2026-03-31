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