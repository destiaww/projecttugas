package tokoOnline;
import java.util.ArrayList;
public class karyawan implements  user{
    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>(); 
    private ArrayList<String> telp = new ArrayList<String>(); 
    private ArrayList<Integer> jabatan = new ArrayList<Integer>(); 
    
    public karyawan(){
        this.namaKaryawan.add("admin");
        this.alamat.add("surabaya");
        this.telp.add("0813455667");
        this.jabatan.add(0);
    }
    public void setjabatan(int jabatan){
        this.jabatan.add(jabatan);
    }
    public int get(int id){
        return this.jabatan.get(id);
    }
    public int getJumlahKaryawan(){
        return this.namaKaryawan.size();
    }
    @Override
    public void setnama(String namaKaryawan) {
        this.namaKaryawan.add(namaKaryawan);
       
    }
    @Override
    public void setalamat(String alamat) {
        this.namaKaryawan.add(alamat);
       
        
    }
    @Override
    public void settelepon(String telp) {
        this.namaKaryawan.add(telp);
       
        
    }
    @Override
    public String getnama(int idKaryawan) {
        return this.namaKaryawan.get(idKaryawan);
    }
    @Override
    public String getalamat(int idKaryawan) {
        return this.alamat.get(idKaryawan);
    }
    @Override
    public String gettelepon(int idKaryawan) {
        return this.telp.get(idKaryawan);
    }
    
}