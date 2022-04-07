package tokoOnline;
import java.util.ArrayList;
public class barang {
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>(); 
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    public barang(){
        this.namaBarang.add("Cokelat Enak");
        this.stok.add(15);
        this.harga.add(10000);

        this.namaBarang.add("sabun berry");
        this.stok.add(30);
        this.harga.add(5000);

        this.namaBarang.add("odol siwak");
        this.stok.add(20);
        this.harga.add(15000);
        
    }
    public int getJumlahBarang(){
        return this.namaBarang.size();
    }
    public void setNamaBarang(String namaBarang){
        this.namaBarang.add(namaBarang);
    }
    public String getNamaBarang(int idbarang){
        return this.namaBarang.get(idbarang);
    }
    public void setStok(int stok){
        this.stok.add(stok);
    }
    public int getStok(int idbarang){
        return this.stok.get(idbarang);
    }
    public void editstok(int idbarang, int stok){
        this.stok.set(idbarang, stok);
    }
    public void setharga(int harga){
        this.harga.add(harga);
    }
    public int getharga(int idbarang){
        return this.harga.get(idbarang);
    }
}
