
package latihan.ukl.sem.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi {
    private ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> idClient = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    
    public void prosesTransaksi(Client client, Transaksi transaksi, JenisLaundry jenislaundry){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Silahkan Laundry");
        System.out.print("Masukkan ID Anda : ");
        int idClient = myObj.nextInt();
        System.out.println("Selamat datang "+ client.getNama(idClient));
    
        int i = 0;
        int temp = 0;
        do{
            System.out.print("Masukkan kode jenis laundry (masukkan kode 99 untuk berhenti) : ");
            temp = myObj.nextInt();
            if(temp != 99){
                idJenisLaundry.add(temp);
                System.out.print(jenislaundry.getNamaJenisLaundry(idJenisLaundry.get(i)) + " sebanyak(kg) : ");
                banyak.add(myObj.nextInt());
                i++;
            }
    }   while(temp != 99);
        System.out.println();
        System.out.println("Transaksi belanja " + client.getNama(idClient) + " sebagai berikut");
        System.out.println("Nama Barang \t \tBanyak(kg) \tHarga \tJumlah \t");
        
        int total = 0;
        int x = idJenisLaundry.size();
        for (int j=0; j < x; j++){
            int jumlah = banyak.get(j) * jenislaundry.getHarga(idJenisLaundry.get(j));
            total += jumlah;
            System.out.println(jenislaundry.getNamaJenisLaundry(idJenisLaundry.get(j)) + "\t"
                + banyak.get(j) + "\t" + "\t"
                + jenislaundry.getHarga(idJenisLaundry.get(j)) + "kg" + "\t"
                + jumlah);
            transaksi.setTransaksi(jenislaundry, idClient, idJenisLaundry.get(j),
                    banyak.get(j));
        }
        
        System.out.println("Total Laundry : " + total);
        if(total > client.getSaldo(idClient)){
            System.out.println("Maff Saldo anda tidak mencukupi");
            System.exit(0);
        }
        client.editSaldo(idClient, client.getSaldo(idClient) - total);
        System.out.println("Sisa Saldo " + client.getNama(idClient) + " = " + client.getSaldo(idClient));
    }   

    public void setTransaksi(JenisLaundry jenislaundry, int idClient, int idJenisLaundry, int banyaknya) {
        this.idClient.add(idClient);
        this.idJenisLaundry.add(idJenisLaundry);
        this.banyak.add(banyaknya);
        jenislaundry.editDurasi(idJenisLaundry, jenislaundry.getDurasi(idJenisLaundry));
    }
    
    public int getIdJenisLaundry(int id){
        return this.idJenisLaundry.get(id);
    }
    
    public int getBanyaknya(int id){
        return this.banyak.get(id);
    }
    
    public int getJmlTransaksi(){
        return this.idClient.size();
    }

}

