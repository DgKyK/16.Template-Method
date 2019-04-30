public class SchedroBank extends Atm {


    public SchedroBank(boolean enable) {
        this.enable = enable;
    }

    @Override
    public void invitation() {
        System.out.println("Hello it`s Schedro bank!!!");
    }
}
