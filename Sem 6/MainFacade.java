public class MainFacade {
    public static void main(String[] args) {

        DealerAuto dealer= new DealerAuto();

        String detaliiMC=dealer.getDetailsMasinaClasica();
        System.out.println(detaliiMC);
        String detaliiME=dealer.getDetailsMasinaElectrica();
        System.out.println(detaliiME);

    }
}
