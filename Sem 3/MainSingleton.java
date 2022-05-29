import java.util.ArrayList;
import java.util.List;

public class MainSingleton {
    //testare clasa Singletone
    List<Serviciu> servicii= new ArrayList<>();
    Serviciu serv1= new Serviciu(30,"Gratar in aer liber");
    Serviciu serv2= new Serviciu(55,"Parcare gratis");
    // servicii.add(serv1);

    AgentieTurism ag = AgentieTurism.getInstance("Franta",50,"TravelAir",servicii);
//   ag.getLocatie();




}
