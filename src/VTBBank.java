public class VTBBank extends Atm {


    public VTBBank(boolean enable) {
        this.enable = enable;
    }

    @Override
    public void invitation() {
        System.out.println("Welcome to VTB Bank!!!");
    }
}
