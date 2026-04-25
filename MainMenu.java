import javax.swing.*;

public class MainMenu {

    MainMenu(){

        JFrame frame = new JFrame("Stock Portfolio System");

        JButton addStock = new JButton("Add Stock");
        JButton viewStock = new JButton("View Stocks");
        JButton buyStock = new JButton("Buy Stock");
        JButton viewHolding = new JButton("View Holdings");
        JButton sellStockButton = new JButton("Sell Stock");
        JButton transactionButton = new JButton("Transaction History");
           JButton logoutButton = new JButton("Logout");

        addStock.addActionListener(e -> new AddStockPage());
        viewStock.addActionListener(e -> new ViewStockPage());
        buyStock.addActionListener(e -> new BuyStockPage());
        viewHolding.addActionListener(e -> new ViewHoldingsPage());
        sellStockButton.addActionListener(e -> new SellStockPage());
        transactionButton.addActionListener(e -> new TransactionHistoryPage());
         logoutButton.addActionListener(e -> {frame.dispose();      
        new LoginPage(); });

        addStock.setBounds(100,40,200,30);
        viewStock.setBounds(100,80,200,30);
        buyStock.setBounds(100,120,200,30);
        viewHolding.setBounds(100,160,200,30);
        sellStockButton.setBounds(100,200,200,30);
        transactionButton.setBounds(100,240,200,30);
        logoutButton.setBounds(100,280,200,30);

        frame.add(addStock);
        frame.add(viewStock);
        frame.add(buyStock);
        frame.add(viewHolding);
        frame.add(sellStockButton);
        frame.add(transactionButton);
         frame.add(logoutButton);

        frame.setSize(400,350);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}