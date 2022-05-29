public class Automobil {
    private String sasiu;
    private String producator;


    public Automobil() {}

    public Automobil(String sasiu, String producator) {
        this.sasiu = sasiu;
        this.producator = producator;

    }

    public String getSasiu() {
        return sasiu;
    }

    public void setSasiu(String sasiu) {
        this.sasiu = sasiu;
    }


    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "sasiu='" + sasiu + '\'' +
                ", producator='" + producator + '\'' +
                '}';
    }
}
