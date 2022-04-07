package tokoOnline;

public interface user {
    public abstract void setnama(String nama);
    public abstract void setalamat(String alamat);
    public abstract void settelepon(String telepon);

    public abstract String getnama(int id);
    public abstract String getalamat(int id);
    public abstract String gettelepon(int id);
}
