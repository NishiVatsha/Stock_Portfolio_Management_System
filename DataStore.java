import java.util.ArrayList;

public class DataStore {

    public static ArrayList<String[]> stocks = new ArrayList<>();
    public static ArrayList<String[]> holdings = new ArrayList<>();
    static ArrayList<String> transactions = new ArrayList<>();
     static {

        stocks.add(new String[]{"TCS","TCS","3500"});
        stocks.add(new String[]{"INFY","INFY","1400"});
        stocks.add(new String[]{"HDFC","HDFC","1600"});
        stocks.add(new String[]{"RELIANCE","RELIANCE","2500"});
        stocks.add(new String[]{"ICICI","ICICI","900"});

    }

}