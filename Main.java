import java.util.List;
import java.util.Scanner;

public class Main {
    public String[] cryptoSymbols;

    public static void main(String[] args) {
        API api = new API();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter crypto symbol:");
        String symbol = scanner.nextLine();

        List<String> symbols = api.getCryptoSymbols();
        if (symbols.contains(symbol) == true) {
            api.lookupSymbol(symbol);
        } else {
            System.out.println(symbol + " is not available.");
        }
    }
}