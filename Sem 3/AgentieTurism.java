import java.util.List;

//clasa SINGLETON
public class AgentieTurism {


    //param instanta privata a clasei pt a se instantia obiectul
    private static volatile AgentieTurism instance=null;

    private String locatie;//>=10 caract
    private int nrAng;//>1
    private String numeAgentie;//>5
    public List<Serviciu> servicii;//separata cu lista de serv

    //constructor privat

    private AgentieTurism(String locatie, int nrAng, String numeAgentie, List<Serviciu> servicii) {
        this.locatie = locatie;
        this.nrAng = nrAng;
        this.numeAgentie = numeAgentie;
        this.servicii = servicii;
    }

    //metode de acces pentru constructor si INSTANTIERE
    public static AgentieTurism getInstance(String locatie, int nrAng, String numeAgentie, List<Serviciu> servicii){

        //verif sa nu existe deja instanta
        if(instance==null){
            synchronized (AgentieTurism.class){
                if(instance==null){
                    instance=new AgentieTurism(locatie,nrAng,numeAgentie,servicii);
                }
            }
        }
        return instance;
    }


    //getter si setter

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public int getNrAng() {
        return nrAng;
    }

    public void setNrAng(int nrAng) {
        this.nrAng = nrAng;
    }

    public String getNumeAgentie() {
        return numeAgentie;
    }

    public void setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
    }

    public List<Serviciu> getServicii() {
        return servicii;
    }

    public void setServicii(List<Serviciu> servicii) {
        this.servicii = servicii;
    }


    ///metode de acces
    //constr (locatie,nrAng,den,Lista serv)
    //met adaugareServiciu
    //met adauga client

    //clasa SINGLETON=> constructor privat

}