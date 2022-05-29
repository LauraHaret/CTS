public class MasinaClasica implements InterfaceMasina {

    private boolean okmotor;

    //constructor
    public MasinaClasica(boolean okmotor) {
        this.okmotor = okmotor;
    }

    public boolean isOkmotor() {
        return okmotor;
    }

    public void setOkmotor(boolean okmotor) {
        this.okmotor = okmotor;
    }

    @Override
    public void pornesteMotor(boolean okMotor) {
        if(okMotor)
            System.out.println("Motor pornit");
        else
            System.out.println("Motor oprit");

    }
}
