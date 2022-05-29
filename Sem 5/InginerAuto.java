public class InginerAuto {

    BuilderAutomobil builderAuto;

    public InginerAuto(String builderType) {
        if(builderType.equalsIgnoreCase("MasinaFamilie")){
           this.builderAuto=new MasinaFamilie_Blder();
        }
        else if (builderType.equalsIgnoreCase("Camion")){
            this.builderAuto=new Camion_Bldr();
        }
    }

    public void buildVehicul(){
        builderAuto.buildProducator();
        builderAuto.buildSasiu();
        //builderAuto.buildProducator().buildSasiu()=apel in cascada
    }

    public Automobil getAutomobil(){
        return builderAuto.getAutomobil();
    }

}
