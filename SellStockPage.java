import javax.swing.*;

public class SellStockPage {

    SellStockPage(){

        JFrame frame = new JFrame("Sell Stock");

        JLabel stockLabel = new JLabel("Stock Name:");
        JTextField stockField = new JTextField();

        JLabel quantityLabel = new JLabel("Quantity:");
        JTextField quantityField = new JTextField();

        JButton sellButton = new JButton("Sell Stock");

        stockLabel.setBounds(50,50,100,30);
        stockField.setBounds(150,50,150,30);

        quantityLabel.setBounds(50,100,100,30);
        quantityField.setBounds(150,100,150,30);

        sellButton.setBounds(120,160,120,30);

        frame.add(stockLabel);
        frame.add(stockField);
        frame.add(quantityLabel);
        frame.add(quantityField);
        frame.add(sellButton);

        sellButton.addActionListener(e -> {

            String stock = stockField.getText();
            String qty = quantityField.getText();

            // Record transaction
            DataStore.transactions.add("Sold " + qty + " shares of " + stock);

            JOptionPane.showMessageDialog(frame,"Stock Sold Successfully");

        });

        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}