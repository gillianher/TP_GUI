import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.*;
public class Contact_etudiant extends JFrame{
    JPanel phaut=new JPanel();
    JPanel pbas=new JPanel();
    JPanel gauche=new JPanel();
    JPanel pdroite=new JPanel();
    JPanel g1=new JPanel();
    JPanel g2=new JPanel();
    JPanel g3=new JPanel();
    JPanel dhaut=new JPanel();
    JPanel dbas=new JPanel();
    JPanel d1=new JPanel();
    JPanel d2=new JPanel();
    JPanel d3=new JPanel();

    JLabel titre=new JLabel("Contact étudiant");
    JLabel nom=new JLabel("Nom:");
    JLabel prenom=new JLabel("Prenom");
    JLabel datenai=new JLabel("Date de naissance");
    JLabel lieunai=new JLabel("Lieu de naissance");
    JLabel nat=new JLabel("Nationalité");
    JLabel rue=new JLabel("Rue");
    JLabel CP= new JLabel("CP");
    JLabel Ville= new JLabel("Ville");
    JLabel tel=new JLabel("Téléphone");
    JLabel mail=new JLabel("Mail");
    JLabel sx=new JLabel("Sexe");
    JLabel loisirs=new JLabel("Loisirs");
    JLabel filiere=new JLabel("Filière");
    JLabel niv=new JLabel("Niveau");
    JLabel bac=new JLabel("BAC");
    JLabel aff=new JLabel("Affichage");
    JLabel icon=new JLabel(new ImageIcon("C:\\Users\\georg\\OneDrive\\Bureau\\etu.jpg"));

    JTextField name=new JTextField(20);
    JTextField pre=new JTextField(20);
    JTextField dnaiss=new JTextField(10);
    JTextField lnais=new JTextField(20);
    JTextField Nat=new JTextField(20);
    JTextField Rue=new JTextField(30);
    JTextField cp=new JTextField(20);
    JTextField ville=new JTextField(20);
    JTextField Tel=new JTextField(20);
    JTextField Mail=new JTextField(20);
    JTextField Aff=new JTextField(20);

    JCheckBox sports=new JCheckBox("Sports");
    JCheckBox musique=new JCheckBox("Musique");
    JCheckBox voyage=new JCheckBox("Voyages");
    JCheckBox lect=new JCheckBox("Lecture");

    JRadioButton H=new JRadioButton("Homme");
    JRadioButton F=new JRadioButton("Femme");

    String filir[]={"ELEC & COM","INFO ET RES"};
    String nivo[]={"Débutant","Intermédiaire","Difficile"};
    String baccalauréat[]={"GENERAL","TECHNOLOGIQUE","PRO"};
    JComboBox fili=new JComboBox(filir);
    JComboBox niveau=new JComboBox(nivo);
    JComboBox BAC=new JComboBox(baccalauréat);
    JButton valider=new JButton("Valider");
    JButton quit=new JButton("Quitter");
    JButton rst=new JButton("Reset");



    public Contact_etudiant(){
        JFrame f = new JFrame("Contact étudiant");
        this.setSize(2500,850);
        this.setLayout(new BorderLayout());
        titre.setHorizontalAlignment((int) CENTER_ALIGNMENT);
       this.add(titre,BorderLayout.NORTH);

        titre.setFont(new Font("Serif", Font.BOLD, 30));
        this.add(gauche,BorderLayout.WEST);
        gauche.setLayout(new MigLayout());
        gauche.add(g1,"wrap");
        gauche.add(g2,"wrap");
        gauche.add(g3,"wrap");

        this.add(pdroite,BorderLayout.EAST);
        pdroite.add(dhaut,BorderLayout.NORTH);
        pdroite.add(dbas,BorderLayout.SOUTH);
        dhaut.add(d1,BorderLayout.WEST);
        dhaut.add(d2,BorderLayout.EAST);
        dbas.add(d3,BorderLayout.SOUTH);

        this.add(pbas);


        g1.setLayout(new MigLayout());
        g2.setLayout(new MigLayout());
        g3.setLayout(new MigLayout());



        g1.add(nom);
        g1.add(name,"wrap");
        g1.add(prenom);
        g1.add(pre,"wrap");
        g1.add(datenai);
        g1.add(dnaiss,"wrap");
        g1.add(lieunai);
        g1.add(lnais,"wrap");
        g1.add(nat);
        g1.add(Nat,"wrap");

        //panel2
        g2.add(rue);
        g2.add(Rue);
        g2.add(CP);
        g2.add(cp,"wrap");
        g2.add(Ville);
        g2.add(ville);
        g2.setBackground(Color.LIGHT_GRAY);

        g3.add(tel);
        g3.add(Tel,"wrap,pushx,growx,pushy,growy");
        g3.add(mail);
        g3.add(Mail,"wrap");
        g3.add(sx);
        g3.add(H);
        g3.add(F,"wrap");
        g3.add(loisirs);
        g3.add(sports);
        g3.add(musique);
        g3.add(voyage);
        g3.add(lect);

        d1.setBackground(Color.CYAN);
        d1.setLayout(new MigLayout());
        d1.add(filiere);
        d1.add(fili,"wrap");
        d1.add(niv);
        d1.add(niveau,"wrap");
        d1.add(bac);
        d1.add(BAC,"wrap");

        d2.setLayout(new MigLayout());
        d2.add(icon,"wrap");

        d3.setLayout(new MigLayout());
        dhaut.setLayout(new MigLayout());

        dbas.add(aff,BorderLayout.SOUTH);
        dbas.add(Aff,"pushy,growy");
        dbas.add(d3);
        pbas.add(valider);
        pbas.add(quit);
        pbas.add(rst);

        this.add(pbas,BorderLayout.SOUTH);
    }
public static void main(String[]args){
        Contact_etudiant c1=new Contact_etudiant();
        c1.setVisible(true);
}
}
