package polymorphism;

public class staff extends pegawai {
    private static final int gajistaf=50000;
    private static final int bonusstaf=10000;
 
    @Override
public int gaji(){
    return gajistaf;
}
public int Bonus(){
    return bonusstaf;
    }
}
