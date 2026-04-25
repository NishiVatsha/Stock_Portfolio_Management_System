import javax.swing.*;
import java.awt.event.*;

public class LoginPage {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Stock Portfolio Login");

        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");

        JTextField userField = new JTextField();
        JPasswordField passField = new JPasswordField();

        JButton loginButton = new JButton("Login");

        userLabel.setBounds(50,50,100,30);
        passLabel.setBounds(50,100,100,30);

        userField.setBounds(150,50,150,30);
        passField.setBounds(150,100,150,30);

        loginButton.setBounds(120,160,100,30);

        frame.add(userLabel);
        frame.add(passLabel);
        frame.add(userField);
        frame.add(passField);
        frame.add(loginButton);

        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setVisible(true);

        // Login button action
        loginButton.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){

                String username = userField.getText();
                String password = new String(passField.getPassword());

                if(username.equals("admin") && password.equals("1234")){

                    JOptionPane.showMessageDialog(frame,"Login Successful");

                    frame.dispose(); // close login window
                    new MainMenu();

                }

                else{

                    JOptionPane.showMessageDialog(frame,"Invalid Login");

                }

            }

        });

    }
}