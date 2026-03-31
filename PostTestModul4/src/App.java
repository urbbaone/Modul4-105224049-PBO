public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Simulasi pendaftaran Anton (Soal: Nama & Nomor HP)
        Pelanggan user1 = new Pelanggan("Anton", "081234567");

        // 1. Anton setor Rp 50.000
        System.out.print("\nMasukkan jumlah setoran pertama: ");
        double setoran1 = input.nextDouble();
        user1.setorUang(setoran1);

        // 2. Anton coba bayar listrik Rp 60.000 (Pasti gagal)
        System.out.print("\nMasukkan nominal tagihan listrik: ");
        double tagihan = input.nextDouble();
        user1.bayarTagihan("Listrik", tagihan);

        // 3. Karena ditolak, Anton setor lagi Rp 20.000
        System.out.print("\nMasukkan jumlah setoran kedua: ");
        double setoran2 = input.nextDouble();
        user1.setorUang(setoran2);

        // 4. Coba bayar lagi tagihan yang sama
        user1.bayarTagihan("Listrik", tagihan);

        // 5. Tampilkan sisa uang
        user1.tampilkanSisaSaldo();

        input.close();
    }
}