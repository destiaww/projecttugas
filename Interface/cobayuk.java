package Interface;

public class cobayuk {
    public static void main(String[] args) {
         line coba = new line(2.5,3,4,5);
         line pertama = new line(3,4,5,6);
         coba.getLength();
         coba.isGreater(coba, pertama);
         System.out.println(coba.isGreater(coba, pertama));
         }
}
