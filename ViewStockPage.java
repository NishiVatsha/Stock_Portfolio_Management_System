import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewStockPage {

    ViewStockPage(){

        JFrame frame = new JFrame("View Stocks");

        String[] columns = {"Name","Symbol","Price"};

        DefaultTableModel model = new DefaultTableModel(columns,0);

        for(String[] stock : DataStore.stocks){
            model.addRow(stock);
        }

        JTable table = new JTable(model);

        JScrollPane pane = new JScrollPane(table);

        frame.add(pane);

        frame.setSize(400,300);
        frame.setVisible(true);

    }

}
