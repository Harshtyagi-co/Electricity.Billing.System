package electricity;

import javax.swing.*;
import java.awt.*;

public class Signup extends JFrame {
    Choice LoginAscho;
    TextField meterText;
    Signup(){
        super("Signup Page");

        JLabel createAs = new JLabel("Create Account As");
        createAs.setBounds(30,50,125,20);
        add(createAs);

        LoginAscho = new Choice();
        LoginAscho.add("Admin");
        LoginAscho.add("customer");
        LoginAscho.setBounds(170,50,120,20);
        add(LoginAscho);

        JLabel meterNo = new JLabel("Meter Number");
        meterNo.setBounds(30,100,125,20);
        add(meterNo);

        meterText = new TextField();
        meterText.setBounds(170,100,125,20);
        add(meterText);


        setSize(600,300);
        setLocation(500,200);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Signup();


    }
}
