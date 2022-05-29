import java.util.ArrayList;
import java.util.List;

public class Manager implements iAngajat {
    private String nume;
    private String idAngajat;
    private List<iAngajat> iAngajati= new ArrayList<iAngajat>();


    public Manager(String nume, String idAngajat) {
        this.nume = nume;
        this.idAngajat = idAngajat;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getIdAngajat() {
        return idAngajat;
    }

    public void setIdAngajat(String idAngajat) {
        this.idAngajat = idAngajat;
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Nume manager: "+nume+" id: "+idAngajat);
        for(iAngajat iAng: iAngajati){
            iAng.afisareDetalii();
        }
    }

    @Override
    public void adaugaSubordonat(iAngajat iAng) {
        if(!iAngajati.contains(iAng)){
            iAngajati.add(iAng);
        }

    }

    @Override
    public void stergeSubordonat(iAngajat iAng) {
        if(iAngajati.contains(iAng)){
            iAngajati.remove(iAng);
        }

    }
}
