public class TransferBancar implements OperatiuneBancara_command {

    private ServerOperatiuniBancare server;
  
    public TransferBancar(ServerOperatiuniBancare server) {
        this.server = server;
    }

    @Override
    public void efectuareOperatiune() {
        server.transferaDinCont();
    }
}