public class TestClass {
    public static void main(String[] args) {
        Atm VtbAtm = new VTBBank(true);
        Atm SBAtm = new SchedroBank(true);

        VtbAtm.startProcessing();
        SBAtm.startProcessing();
    }
}
