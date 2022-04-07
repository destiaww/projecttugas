package tokoOnline;

import java.util.ArrayList;

public class member implements user {
    private ArrayList<String> namaMember = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>(); 
    private ArrayList<String> telp = new ArrayList<String>(); 
    private ArrayList<Integer> saldo = new ArrayList<Integer>(); 

    public member(){
    this.namaMember.add("destia");
    this.alamat.add("malang");
    this.telp.add("085804795297");
    this.saldo.add(100000);

    this.namaMember.add("leonardo");
    this.alamat.add("blitar");
    this.telp.add("08758660927");
    this.saldo.add(500000);

    this.namaMember.add("arumi");
    this.alamat.add("london");
    this.telp.add("0875441321");
    this.saldo.add(300000);
    }
        public void setsaldo(int saldo){
            this.saldo.add(saldo);
        }
        public int getsaldo(int idMember){
            return this.saldo.get(idMember);
        }
        public void editsaldo(int idMember,int saldo){
            this.saldo.set(idMember,saldo);
        }
        public int getJumlahMember(){
            return this.saldo.size();
        }

        @Override
        public void setnama(String namaMember){
            this.namaMember.add(namaMember);
        }
        @Override
        public void setalamat(String alamat) {
           this.alamat.add(alamat);
            
        }
        @Override
        public void settelepon(String telp) {
            this.telp.add(telp);
            
        }
        @Override
        public String getnama(int idMember) {
            return this.namaMember.get(idMember);
        }
        @Override
        public String getalamat(int idMember) {
            return this.alamat.get(idMember);
        }
        @Override
        public String gettelepon(int idMember) {
            return this.telp.get(idMember);
        }
        

}