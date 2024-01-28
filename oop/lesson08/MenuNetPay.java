/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
 * Lesson08
*/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuNetPay extends Frame {

    Frame theFrame;
    MenuBar menu1;
    Menu area;
    Label a;

    MenuNetPay(String s) {
        super(s);
        theFrame = new Frame();
        setLayout(new BorderLayout());
        setSize(500, 500);
        menu1 = new MenuBar();
        setMenuBar(menu1);
        area = new Menu("PAYROLL SYSTEM");
        menu1.add(area);
        area.add("Records");
        area.add("Compute");
        area.add("Exit");
        show();
    }

    class LoginDialog extends Dialog {
        Frame frameRef;

        LoginDialog(Frame fr, String title, boolean modal) {
            super(fr, title, modal);
            frameRef = fr;
        }
    }
    
    public boolean action(Event e, Object o) {
        if ("Records".equals(e.arg)) {
            new MenuNetPay.Records();
        } else if ("Compute".equals(e.arg)) {
            new MenuNetPay.Compute();
        } else if ("Exit".equals(e.arg)) {
            System.exit(0);
        }

        return super.action(e, e.target);
    }

    class Records extends Frame implements ActionListener {
        Button q1, q2, q3;
        Label s1, s2;
        TextField t1, t2;
        Dialog loginDialog;
        
        Records() {
            loginDialog = new MenuNetPay.LoginDialog(theFrame, "Employees Records", true);
            loginDialog.setLayout(new GridLayout(3, 1));
            Panel p = new Panel();
            p.setLayout(new FlowLayout());
            Label p1 = new Label("Enter Last Name: ");
            Label p2 = new Label("Enter First Name: ");
            t1 = new TextField(10);
            t2 = new TextField(11);
            p.add(p1); p.add(t1);
            p.add(p2); p.add(t2);
            Panel q = new Panel();
            q.setLayout(new FlowLayout());
            q1 = new Button("Display");
            q1.addActionListener(this);
            q2 = new Button("Clear");
            q2.addActionListener(this);
            q3 = new Button("Exit");
            q3.addActionListener(this);
            q.add(q1); q.add(q2); q.add(q3);
            s1 = new Label(" ");
            s2 = new Label(" ");
            loginDialog.add(p);
            loginDialog.add(q);
            loginDialog.add(s1);
            loginDialog.add(s2);
            loginDialog.setLocation(100, 100);
            loginDialog.setSize(600, 500);
            loginDialog.show();
        }
        
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == q1) {
                String i = t1.getText();
                String j = t2.getText();
                s1.setAlignment(1);
                s2.setAlignment(1);
                s1.setFont(new Font("Arial", Font.BOLD, 14));
                s1.setText("First Name is: " + i);
                s2.setFont(new Font("Arial", Font.BOLD, 14));
                s2.setText("Last Name is: " + j);
            } else if (event.getSource() == q2) {
                s1.setText("");
                t1.setText("");
                t2.setText("");
            } else {
                loginDialog.dispose();
            }
        }

        public boolean handleEvent(Event e) {
            if (e.id == Event.WINDOW_DESTROY) {
                hide();
                System.exit(0);
            }
            return super.handleEvent(e);
        }

    } 
    
    // TODO
    class Compute extends Frame implements ActionListener {
        
        Panel computeMainPanel, hoursPanel, ratePanel, computeButtonPanel;
        TextField hoursField, rateField;
        Label grossPayLabel, taxLabel, sssLabel, phealthLabel, netPayLabel;
        Button calculateButton, clearButton, exitButton;
        
        Compute() {
            // instantiate
            super("Compute Menu");
            computeMainPanel = new Panel();
            computeMainPanel.setLayout(new GridLayout(0, 1));
            hoursPanel = new Panel();
            ratePanel = new Panel();
            computeButtonPanel = new Panel();
            hoursField = new TextField("", 10);
            rateField = new TextField("", 10);
            grossPayLabel = new Label("Gross Pay: 0");
            taxLabel = new Label("Tax: 0");
            sssLabel = new Label("SSS Contribution: 0");
            phealthLabel = new Label("PhilHealth Contribution: 0");
            netPayLabel = new Label("Net Pay: 0");
            calculateButton = new Button("Calculate");
            clearButton = new Button("Clear");
            exitButton = new Button("Exit");
            
            // add panels to main panel
            add(computeMainPanel);
            computeMainPanel.add(hoursPanel);
            computeMainPanel.add(ratePanel);
            computeMainPanel.add(computeButtonPanel);
            
            // action listeners
            calculateButton.addActionListener(this);
            clearButton.addActionListener(this);
            exitButton.addActionListener(this);
            
            // hoursPanel
            hoursPanel.add(new Label("Number of working hours: "));
            hoursPanel.add(hoursField);
            
            // ratePanel
            ratePanel.add(new Label("Rate per working hour: "));
            ratePanel.add(rateField);
            
            // computeButtonPanel
            computeButtonPanel.add(calculateButton);
            computeButtonPanel.add(clearButton);
            computeButtonPanel.add(exitButton);
            
            // outputs
            computeMainPanel.add(grossPayLabel);
            computeMainPanel.add(taxLabel);
            computeMainPanel.add(sssLabel);
            computeMainPanel.add(phealthLabel);
            computeMainPanel.add(netPayLabel);
            
            // showFrame
            pack();
            show();
            
        }
        
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == exitButton) {
                dispose();
            } else if (event.getSource() == clearButton) {
                hoursField.setText("");
                rateField.setText("");
                grossPayLabel.setText("Gross Pay: 0");
                taxLabel.setText("Tax: 0");
                sssLabel.setText("SSS Contribution: 0");
                phealthLabel.setText("PhilHealth Contribution: 0");
                netPayLabel.setText("Net Pay: 0");
            } else if (event.getSource() == calculateButton) {
                int hours = Integer.valueOf(hoursField.getText());
                int rate = Integer.valueOf(rateField.getText());
                Double grossPay = 1.0 * hours * rate;
                Double tax = grossPay * 0.10;
                Double contribution = grossPay * 0.05;
                Double sssContribution = contribution;
                Double phealthContribution = contribution;
                Double netPay = grossPay - tax - sssContribution - phealthContribution;
                
                grossPayLabel.setText("Gross Pay: " + grossPay);
                taxLabel.setText("Tax: " + tax);
                sssLabel.setText("SSS Contribution: " + sssContribution);
                phealthLabel.setText("PhilHealth Contribution: " + phealthContribution);
                netPayLabel.setText("Net Pay: " + netPay);
                
            }
        }
    }


    public static void main(String[] args) {
        new MenuNetPay("MenuNetPay");
    }
    
}
