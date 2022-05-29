public class Angajat implements iAngajat {
    private String nume;
    private String codAngajat;

    public Angajat(String nume, String codAngajat) {
        this.nume = nume;
        this.codAngajat = codAngajat;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCodAngajat() {
        return codAngajat;
    }

    public void setCodAngajat(String codAngajat) {
        this.codAngajat = codAngajat;
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Nume angajat: "+nume+" id: "+codAngajat);

    }

    @Override
    public void adaugaSubordonat(iAngajat iAng) {
        throw new UnsupportedOperationException();

    }

    @Override
    public void stergeSubordonat(iAngajat iAng) {
        throw new UnsupportedOperationException();

    }
}

