public class BlocareCont implements OperatiuneBancara_command {

    private ServerOperatiuniBancare server;

    //constructor
    public BlocareCont(ServerOperatiuniBancare server) {
        this.server = server;
    }

    @Override
    public void efectuareOperatiune() {
        server.blocheazaCont();
    }
}