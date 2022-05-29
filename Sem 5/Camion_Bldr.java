public class Camion_Bldr implements BuilderAutomobil{

    //
    //    private String sasiu;
    //    private String producator;
    //
    //    @Override
    //    public BuilderAutomobil buildSasiu() {
    //        this.sasiu="I235282764646";
    //        return this;
    //    }
    //
    //    @Override
    //    public BuilderAutomobil buildProducator() {
    //        this.producator="FORD";
    //        return this;
    //
    //    }
    //
    //    @Override
    //    public Automobil getAutomobil() {
    //        return new Automobil(sasiu,producator);
    //    }
    
    
        Automobil autoMare=new Automobil();
    
        @Override
        public BuilderAutomobil buildSasiu() {
            autoMare.setSasiu("I928347575");
            return this;
    
        }
    
        @Override
        public BuilderAutomobil buildProducator() {
            autoMare.setProducator("FORD");
            return this;
    
        }
    
        @Override
        public Automobil getAutomobil() {
            return autoMare;
        }
    
    }
    