public class DecoratorMasina implements InterfaceMasina{

    private boolean okincalzire;

    public DecoratorMasina(boolean okincalzire) {
        this.okincalzire = okincalzire;
    }

    public boolean isOkincalzire() {
        return okincalzire;
    }

 
    public void setOkincalzire(boolean okincalzire) {
        this.okincalzire = okincalzire;
    }

    @Override
    public void pornesteMotor(boolean okMotor) {
        if(okMotor)
            System.out.println("Motor pornit");
        else
            System.out.println("Motor oprit");
        incalzireScaune(false);
    }

    private void incalzireScaune(boolean okincalzire)
    {
        if(okincalzire)
            System.out.println("Scaune incalzite");
        else
            System.out.println("Scaune neincalzite");

    }

}
