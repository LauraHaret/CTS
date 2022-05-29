public class InCursDePreparare implements State {

    @Override
    public void updateState(ComandaMancare statusComanda) {
        System.out.println("Comanda este in curs de preparare");
        ComandaMancare.setState(this);
    }
}