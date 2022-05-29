public class ComandaMancare {
    private static State stare;
    public ComandaMancare() {
        stare = null;
    }

    public static void setState(State state) {
        stare = state;
    }

    public static void nextState() {
        if(stare == null) {
            stare = new ComandaPlasata();
            System.out.println("comanda plasata");
        }
        else if (stare instanceof ComandaPlasata)
        {
            stare = new InCursDePreparare();
            System.out.println("comanda in curs de preparare");
        }
    }

    public State getState() {
        return stare;
    }
}