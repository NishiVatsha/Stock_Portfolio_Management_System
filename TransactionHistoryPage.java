import javax.swing.*;

public class TransactionHistoryPage {

    TransactionHistoryPage(){

        JFrame frame = new JFrame("Transaction History");

        DefaultListModel<String> model = new DefaultListModel<>();

        for(String t : DataStore.transactions){
            model.addElement(t);
        }

        JList<String> list = new JList<>(model);
        JScrollPane scrollPane = new JScrollPane(list);

        frame.add(scrollPane);

        frame.setSize(400,300);
        frame.setVisible(true);
    }
}
