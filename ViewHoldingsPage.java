import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewHoldingsPage {

    ViewHoldingsPage(){

        JFrame frame = new JFrame("View Holdings");

        String[] columns = {"Stock Name","Quantity"};

        DefaultTableModel model = new DefaultTableModel(columns,0);

        for(String[] h : DataStore.holdings){
            model.addRow(h);
        }

        JTable table = new JTable(model);

        JScrollPane pane = new JScrollPane(table);

        frame.add(pane);

        frame.setSize(400,300);
        frame.setVisible(true);
    }
}