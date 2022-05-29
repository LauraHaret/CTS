public class MasinaFamilie_Bldr implements BuilderAutomobil {

    private String sasiu;
    private String producator;

    @Override
    public BuilderAutomobil buildSasiu() {
        this.sasiu="I2352";
        return this;
    }

    @Override
    public BuilderAutomobil buildProducator() {
        this.producator="Logan";
        return this;

    }

    @Override
    public Automobil getAutomobil() {
        return new Automobil(sasiu,producator);
    }
}
