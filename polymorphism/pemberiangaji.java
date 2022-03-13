package polymorphism;

public class pemberiangaji {
    public int hitungGaji(pegawai peg){
        int uang = peg.gaji();
        if (peg  instanceof directur)
        uang+=((directur)peg).tunjangan();
         
         if (peg instanceof staff)
         uang+=((staff)peg).Bonus();
         
         return  uang;
         }
    public  static void main(String[]   args)  {
        pemberiangaji pg = new pemberiangaji();
        staff ali = new staff();
        directur Tony = new directur();
        System.out.println("gaji staff =  " + pg.hitungGaji(ali));
        System.out.println("gaji directur   =  " + pg.hitungGaji(Tony));
    }
}
