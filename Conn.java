import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Conn extends JFrame implements ActionListener {
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    JLabel lbltitre = new JLabel("Formulaire de connexion");
    JLabel icon = new JLabel(new ImageIcon("C:\\Users\\georg\\IdeaProjects\\TP_GUI_BDD\\out\\production\\TP_GUI_BDD\\cadenas.png"));  //lien vers une image de votre choix
    JLabel nom = new JLabel("Username");
    JLabel pre = new JLabel("Password");


    JTextField n = new JTextField(20);
    JTextField pr = new JTextField(20);
    JButton add = new JButton("Se connecter");
    JButton del = new JButton("Annuler");

    public Conn() {


        JFrame f = new JFrame("Test");
        this.setSize(500, 250);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        icon.setSize(75, 10);
        lbltitre.setFont(new Font("Serif", Font.BOLD, 30));
        lbltitre.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        lbltitre.setBackground(Color.YELLOW);

        this.setLayout(new BorderLayout());
        this.add(p2, BorderLayout.NORTH);
        this.add(p3, BorderLayout.WEST);
        p1.setLayout(new MigLayout());
        this.add(p1);
        this.add(p4, BorderLayout.SOUTH);

        p1.add(nom, "pushy,growy");
        p1.add(n, "wrap");

        p1.add(pre, "pushy,growy");
        p1.add(pr);

        p2.add(lbltitre);

        p3.add(icon);

        p4.add(add);
        p4.add(del);

        add.addActionListener(this);
        del.addActionListener(this);
}@Override
    public void actionPerformed(ActionEvent e) {
        Object obj= e.getSource();
        String pseudo= n.getText();
        String pass=pr.getText();
        if (obj.equals(add)){
        try {
            Connection connection;
            String url="jdbc:mysql://localhost:3306/bddgraph";
            connection = DriverManager.getConnection(url,"root","");

            Statement stmt=(Statement) connection.createStatement();
            ResultSet result=stmt.executeQuery("SELECT * FROM utilisateur");//("INSERT INTO table Values"+v1+",")
            System.out.println(result);
            int vrai=0;
            while (result.next()){
                if (pseudo.equals(result.getString("login"))&&pass.equals(result.getString("password"))){
                    vrai++;
                }
            }
            if (vrai!=0){
                pr.setText("");
                n.setText("");
                JOptionPane.showMessageDialog(this,"Connecté à la BDD!","Connecté",JOptionPane.INFORMATION_MESSAGE);
                ContactEtudiant c1=new ContactEtudiant();

                this.setVisible(false);
                 c1.setVisible(true);
            }else {
                JOptionPane.showMessageDialog(this,"Erreur de connection à la BDD","Erreur",JOptionPane.ERROR_MESSAGE);
                n.setText("");
                pr.setText("");
            }
        } catch (SQLException ez) {
            throw new RuntimeException(ez);
        }
    } else if (obj.equals(del)) {
            this.setVisible(false);
        }
    }

    int variable=3;
    String test="Ceci est un test avec une "+variable+" qui affichera 3";
}
