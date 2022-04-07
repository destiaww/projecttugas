package tokoOnline;
import java.util.ArrayList;
import java.util.*;

public class transaksi {
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>(); 
    private ArrayList<Integer> idmember = new ArrayList<Integer>();

    public transaksi(){
        this.idmember.add(0);
        this.idmember.add(0);
        this.banyak.add(2);

        this.idmember.add(0);
        this.idmember.add(1);
        this.banyak.add(3);

        this.idmember.add(1);
        this.idmember.add(0);
        this.banyak.add(1);

        this.idmember.add(1);
        this.idmember.add(2);
        this.banyak.add(2);
    }

    public void prosesTransaksi(member memb, transaksi trans, barang bar){
 Scanner myObj = new Scanner(System.in);
 System.out.println("Silahkan belanja");
 System.out.println("Masukkan ID Member");
 int idMember = myObj.nextInt();
 System.out.println("Selamat datang "+memb.getnama(idMember));
 ArrayList<Integer> idBarang = new ArrayList<Integer>();
 ArrayList<Integer> banyak = new ArrayList<Integer>();
 int i=0;
 int temp=0;
 do{
 System.out.println("Masukkan kode barang :");
 temp=myObj.nextInt();
 if (temp!=99){
 idBarang.add(temp);
 System.out.print(bar.getNamaBarang(idBarang.get(i))+ " sebanyak : ");
 banyak.add(myObj.nextInt());
 i++;
 }
 }while (temp!=99);

 System.out.println("Transaksi belanja "+memb.getnama(idMember)+"sebagai berikut");
 System.out.println("Nama Barang \tQty \tHarga \tJumlah \t");

 int total=0;
 int x = idBarang.size();
 for (int j = 0; j < x; j++){
 int jumlah=banyak.get(j) * bar.getharga(idBarang.get(j));
 total+=jumlah;
 System.out.println(bar.getNamaBarang(idBarang.get(j))+"\t"+
 idBarang.get(j)+"\t"+
bar.getharga(idBarang.get(j))+"\t"+jumlah);
 trans.setTransaksi(bar, idMember, idBarang.get(j),
banyak.get(j));
 }

 System.out.println("Total Belanja : "+total);
 memb.editsaldo(idMember, memb.getsaldo(idMember)-total);
 }
 public void setTransaksi(barang bar, int idmember, int idbarang, int banyaknya){
 this.idmember.add(idmember);
 this.idBarang.add(idbarang);
 this.banyak.add(banyaknya);
 bar.editstok(idbarang, bar.getStok(idbarang)-banyaknya);
 }
 public int getIdBarang(int id){
 return this.idBarang.get(id);
 }
 public int getBanyaknya(int id){
 return this.banyak.get(id);
 }
 public int getIdMember(int id){
 return this.idmember.get(id);
 }
 public int getJmlTransaksi(){
 return this.idmember.size();
 }
}

    

