
package latihan.ukl.sem.pkg2;

public class main {
    static JenisLaundry daftarJenisLaundry = new JenisLaundry();
    static Client daftarClient = new Client();
    static Petugas penjagaToko = new Petugas();
    static Transaksi transaksiLaundry = new Transaksi();
    static Laporan laporanLaundry = new Laporan();

public static void main(String[] args) {
    laporanLaundry.laporan(daftarClient);
    System.out.println();
    laporanLaundry.laporan(daftarJenisLaundry);
    System.out.println();
    transaksiLaundry.prosesTransaksi(daftarClient, transaksiLaundry, daftarJenisLaundry);
    System.out.println();
    laporanLaundry.laporan(penjagaToko);
    laporanLaundry.laporan(transaksiLaundry, daftarJenisLaundry);
}
}
    
    





    

