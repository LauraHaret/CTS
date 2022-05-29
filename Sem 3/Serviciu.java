public class Serviciu {
    private float pret;
    private String detalii;

    public Serviciu(float pret, String detalii) {
        this.pret = pret;
        this.detalii = detalii;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public String getDetalii() {
        return detalii;
    }

    public void setDetalii(String detalii) {
        this.detalii = detalii;
    }
}
