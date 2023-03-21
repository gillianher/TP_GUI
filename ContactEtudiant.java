import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class ContactEtudiant extends JFrame implements ActionListener {
    private JButton validerButton;
    private JButton quitterButton;
    private JButton resetButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JRadioButton hommeRadioButton;
    private JRadioButton femmeRadioButton;
    private JCheckBox sportsCheckBox;
    private JCheckBox voyagesCheckBox;
    private JCheckBox musiqueCheckBox;
    private JCheckBox lectureCheckBox;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JTextArea textArea1;
    private JPanel principalPanel;


    public ContactEtudiant(){
        this.setSize(750,500);
        this.setContentPane(principalPanel);
        this.setVisible(true);
        textArea1.setEditable(false);
        validerButton.addActionListener(this);
        quitterButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj=e.getSource();
        String nom=textField1.getText();
        String prenom=textField2.getText();
        String dob=textField3.getText();
        String pob=textField4.getText();
        String Nat=textField5.getText();
        String tel=textField9.getText();
        String mail=textField10.getText();
        String rue=textField6.getText();
        String cp=textField7.getText();
        String ville=textField8.getText();



        if (obj.equals(validerButton)){
            try {
                Connection connection;
                String url="jdbc:mysql://localhost:3306/bddgraph";
                connection = DriverManager.getConnection(url,"root","");

                Statement stmt=(Statement) connection.createStatement();
                ResultSet result=stmt.executeQuery("INSERT INTO etudiant(nom,prenom,lieuNaiss,nationalite,rue,cp,ville,telephone,mail) VALUES ("+nom+","+prenom+","+pob+","+Nat+","+rue+","+cp+","+ville+","+tel+","+mail+");");
                System.out.println(result);
            }
            catch (SQLException a){
                throw new RuntimeException(a);
            }
        }else if (obj.equals(quitterButton)){
            this.setVisible(false);
        }
    }
}

    