public class MainComposite {

    public static void main(String[] args) {
        iAngajat iAng1= new Manager("Popescu Ion","10");
        iAngajat iAng2= new Manager("Costache Maria","11");
        iAngajat iAng3= new Manager("Stroe Alin","12");

        iAng1.adaugaSubordonat(new Angajat("Angajat 1","100"));
        iAng1.adaugaSubordonat(new Angajat("Angajat 2","101"));
        iAng1.adaugaSubordonat(new Angajat("Angajat 3","102"));
        iAng2.adaugaSubordonat(new Angajat("Angajat 4","103"));
        iAng2.adaugaSubordonat(new Angajat("Angajat 5","104"));
        iAng3.adaugaSubordonat(new Angajat("Angajat 6","105"));
        iAng3.adaugaSubordonat(new Angajat("Angajat 7","106"));


    }
}
