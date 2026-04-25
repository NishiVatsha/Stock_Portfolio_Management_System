import javax.swing.*;

public class AddStockPage {

    AddStockPage(){

        JFrame frame = new JFrame("Add Stock");

        JLabel nameLabel = new JLabel("Stock Name:");
        JTextField nameField = new JTextField();

        JLabel symbolLabel = new JLabel("Symbol:");
        JTextField symbolField = new JTextField();

        JLabel priceLabel = new JLabel("Price:");
        JTextField priceField = new JTextField();

        JButton addButton = new JButton("Add Stock");

        nameLabel.setBounds(50,50,100,30);
        nameField.setBounds(150,50,150,30);

        symbolLabel.setBounds(50,100,100,30);
        symbolField.setBounds(150,100,150,30);

        priceLabel.setBounds(50,150,100,30);
        priceField.setBounds(150,150,150,30);

        addButton.setBounds(120,200,120,30);

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(symbolLabel);
        frame.add(symbolField);
        frame.add(priceLabel);
        frame.add(priceField);
        frame.add(addButton);

        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Button action
        addButton.addActionListener(e -> {

            String name = nameField.getText();
            String symbol = symbolField.getText();
            String price = priceField.getText();

            String[] stock = {name, symbol, price};

            DataStore.stocks.add(stock);

            JOptionPane.showMessageDialog(frame,"Stock Added Successfully");

            nameField.setText("");
            symbolField.setText("");
            priceField.setText("");

        });

    }
}