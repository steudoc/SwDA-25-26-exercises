package solid.dip.compliant;

public class Printer implements IPrinterService {

    @Override
    public void print(String text) {
        // simulate sending text to printer
        System.out.println(text);
    }

}
