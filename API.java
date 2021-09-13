import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.*;
import java.net.*;

public class API {
    List<String> cryptoSymbols = new ArrayList<>(Arrays.asList("BTC","ETH","SOL","ADA","DOT","HEX"));
    public API() { }
    public List<String> getCryptoSymbols() {
        return cryptoSymbols;
    }
    public void lookupSymbol(String symbol) {
        if (symbol == "" || symbol == null) {
            return;
        }

        try {
            String url = "https://api.coinbase.com/v2/prices/" + symbol + "-USD/buy";
            URL yahoo = new URL(url);
            URLConnection yc = yahoo.openConnection();
            BufferedReader in = new BufferedReader(
                                    new InputStreamReader(
                                    yc.getInputStream()));
            String inputLine;
    
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}