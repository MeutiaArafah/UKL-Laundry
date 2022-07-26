
package latihan.ukl.sem.pkg2;

public class Laporan {
   
    public void laporan(Petugas petugas){
        System.out.println();
        System.out.println("Nama Petugas : " + petugas.getNama(0));
        System.out.println("Telp : " + petugas.getTelepon(0));
        String jabatan = (petugas.getJabatan(0) == 0)? "Owner" : "Pegawai";
        System.out.println("Status : " + jabatan);
        System.out.println();
    }
        
    public void laporan(JenisLaundry jenislaundry){
        int x = jenislaundry.getJmlJenisLaundry();
    
        System.out.println();
        System.out.println("Tabel Jenis Laundry");
        System.out.println();
        System.out.println("ID \tNama Jenis Laundry \tDUrasi(hr) \tHarga/kg");
            for(int i=0; i < x; i++){
                System.out.println(i +"\t"+ jenislaundry.getNamaJenisLaundry(i)+ "\t"+
                            jenislaundry.getDurasi(i)+ "hr" + "\t" + "\t" + jenislaundry.getHarga(i) + "kg");
            }
            System.out.println();
    }
    
public void laporan(Client client){
    int x = client.getJmlClient();
    
    System.out.println();
    System.out.println("Table Client");
    System.out.println();
    System.out.println("ID \tNama \tAlamat \t\tTelepon \tSaldo");
    
    for(int i = 0; i < x; i++){
        System.out.println(i + "\t" + client.getNama(i)+ "\t"+
                client.getAlamat(i)+ "\t" + client.getTelepon(i)+ "\t"+
                        client.getSaldo(i));
    }
    System.out.println();
}

public void laporan(Transaksi transaksi, JenisLaundry jenislaundry){
    int x = transaksi.getJmlTransaksi();
    
    System.out.println();
    System.out.println("Laporan Transaksi");
    System.out.println();
    System.out.println("Id \tNama Jenis Laundry \tJumlah(kg) \tHarga/kg \tJumlah");
    
    int total=0;
    for(int i =0; i < x; i++){
        int jumlah = transaksi.getBanyaknya(i) * jenislaundry.getHarga(transaksi.getIdJenisLaundry(i));
        total += jumlah;
        
        System.out.println((i+1) + "\t" + jenislaundry.getNamaJenisLaundry(transaksi.getIdJenisLaundry(i))+ "\t" +
            transaksi.getBanyaknya(i)+ "kg" + "\t" + "\t" + jenislaundry.getHarga(transaksi.getIdJenisLaundry(i))+ "/kg" + "\t" + "\t"
            + jumlah);
    }
        System.out.println("Total Omset = " + total);

}
    

}
