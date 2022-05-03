public class App {
    public static void main(String[] args) throws Exception {
       
     
        Player p1= new Player("fabbio");
        Player p2= new Player("Meratti");
        Player p3= new Player("Lotti");
        Player p4= new Player("Pacini");

        p1.start();
        p2.start();
        p3.start();
        p4.start();

        System.out.println("GARA INIZIATA");
        p1.join();
        p2.join();
        p3.join();
        p4.join();
        System.out.println("GARA TERMINATA");
    }
}
