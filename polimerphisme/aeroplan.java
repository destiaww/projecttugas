package polimerphisme;

public class aeroplan extends vehicle{

    public void walk(){
        System.out.println("Aeroplan Flying");
        }
        public static void main(String[] args) {
        aeroplan garuda = new aeroplan();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
}
