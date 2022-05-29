public class ComandaPlasata implements State{
    @Override
    public void updateState(ComandaMancare statusComanda) {
        System.out.println("Comanda a fost plasata");
        ComandaMancare.setState(this);
    }
}