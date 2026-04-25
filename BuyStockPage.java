import javax.swing.*;

public class BuyStockPage {

    BuyStockPage(){

        JFrame frame = new JFrame("Buy Stock");

        JLabel stockLabel = new JLabel("Stock Name:");
        JTextField stockField = new JTextField();

        JLabel quantityLabel = new JLabel("Quantity:");
        JTextField quantityField = new JTextField();

        JButton buyButton = new JButton("Buy Stock");

        stockLabel.setBounds(50,50,100,30);
        stockField.setBounds(150,50,150,30);

        quantityLabel.setBounds(50,100,100,30);
        quantityField.setBounds(150,100,150,30);

        buyButton.setBounds(120,160,120,30);

        frame.add(stockLabel);
        frame.add(stockField);
        frame.add(quantityLabel);
        frame.add(quantityField);
        frame.add(buyButton);

        buyButton.addActionListener(e -> {

            String stock = stockField.getText();
            String qty = quantityField.getText();

            // Add to holdings
            DataStore.holdings.add(new String[]{stock, String.valueOf(qty)});
            // Record transaction
            DataStore.transactions.add("Bought " + qty + " shares of " + stock);

            JOptionPane.showMessageDialog(frame,"Stock Bought Successfully");

        });

        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}