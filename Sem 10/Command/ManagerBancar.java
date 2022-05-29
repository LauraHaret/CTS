import java.util.ArrayList;
import java.util.List;

public class ManagerBancar {

    private List<OperatiuneBancara_command> listaOperatiuneBanc=new ArrayList<>();

    public void inserareOperatiune(OperatiuneBancara_command operatiune){
        listaOperatiuneBanc.add(operatiune);
    }

    public void stergereOperatiune(OperatiuneBancara_command operatiuneDeSters){
        listaOperatiuneBanc.remove((operatiuneDeSters));
    }

    public void trimitereOperatiune(){
        for(OperatiuneBancara_command op:listaOperatiuneBanc)
        {
            op.efectuareOperatiune();
            stergereOperatiune(op);
        }
    }
}