package tokoOnline;

public class laporan {
    public void laporan(barang bar){
        int x=bar.getJumlahBarang();
       
        System.out.println();
        System.out.println("Tabel Barang");
        System.out.println();
        System.out.println("Nama Barang \tStok \tHarga");
        for (int i = 0; i < x; i++) {
        System.out.println(bar.getNamaBarang(i)+"\t"+
        bar.getStok(i)+"\t"+bar.getharga(i));
        }
    }   
        public void laporan(member memb){
            int x=memb.getJumlahMember();
           
            System.out.println();
            System.out.println("Tabel Member");
            System.out.println();
            System.out.println("Nama \tAlamat \t\tTelepon \tSaldo");
            for (int i = 0; i < x; i++) {
            System.out.println(memb.getnama(i)+"\t"+
            memb.getalamat(i)+"\t"+memb.gettelepon(i)+"\t"+
            memb.getsaldo(i));
            }
            }
            public void laporan(transaksi trans, barang bar){
                int x=trans.getJmlTransaksi();
               
                System.out.println();
                System.out.println("Laporan Transaksi");
                System.out.println();
                System.out.println("Nama Barang\tQty \tHarga \tJumlah");
               
                int total=0;
                for (int i = 0; i < x; i++) {
                int jumlah=trans.getBanyaknya(i)*bar.getharga(trans.getIdBarang(i));
                total+=jumlah;
                System.out.println(bar.getNamaBarang(trans.getIdBarang(i))+"\t"+trans.getBanyaknya(i)+"\t"+bar.getharga(trans.getIdBarang(i))+"\t"+jumlah);
                }
                System.out.println("Total Omset ="+total);
                }


}

