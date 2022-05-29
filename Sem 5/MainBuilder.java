public class MainBuilder {
    public static void main(String[] args) {

        InginerAuto inginer= new InginerAuto("camion");
        inginer.buildVehicul();
        Automobil auto=inginer.getAutomobil();
        System.out.println(auto);

    }
}
