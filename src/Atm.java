public abstract class Atm {
    protected boolean enable;

    public Atm() {
        enable = true;
    }

    public void startProcessing() {
        if(enable) {
            invitation();
            System.out.println("Please insert your credit card to start working....");
        }

    }

    public abstract void invitation();
}
