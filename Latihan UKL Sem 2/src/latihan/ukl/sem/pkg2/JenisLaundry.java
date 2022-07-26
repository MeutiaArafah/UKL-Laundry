
package latihan.ukl.sem.pkg2;

import java.util.ArrayList;

public class JenisLaundry {
    private ArrayList<String> namaJenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();
   
    public JenisLaundry(){
        this.namaJenisLaundry.add("Cuci Kering Reguler");
        this.harga.add(5500);
        this.durasi.add(4);
        
        this.namaJenisLaundry.add("Cuci Kering Kilat");
        this.harga.add(6500);
        this.durasi.add(2);
        
        this.namaJenisLaundry.add("Cuci Kering Express");
        this.harga.add(8900);
        this.durasi.add(1);
    }
    
    public int getJmlJenisLaundry(){
        return this.namaJenisLaundry.size();
    }
    
    public void setNamaJenisLaundry(String namaJenisLaundry){
        this.namaJenisLaundry.add(namaJenisLaundry);
    }
    
    public String getNamaJenisLaundry(int idJenisLaundry){
        return this.namaJenisLaundry.get(idJenisLaundry);
    }
    
    public void setDurasi(int Durasi){
        this.durasi.add(Durasi);
    }
    
    public int getDurasi(int idJenisLaundry){
        return this.durasi.get(idJenisLaundry);
    }
    
    public void editDurasi(int idJenisLaundry, int durasi){
        this.durasi.add(idJenisLaundry, durasi);
    }
    
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    
    public int getHarga(int idJenisLaundry){
        return this.harga.get(idJenisLaundry);
    }
   
}
