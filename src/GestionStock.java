
import formulaire.Batiment.Batiment;
//import formulaire.Fournisseurs.Fournisseur;
import formulaire.Fournisseurs.Fournisseur2;
import formulaire.Immobilisation.NouveauAttente;
import formulaire.Sortie.Sortie;
import formulaire.Sortie.ValidationSorti;
import formulaire.article.Article;
import formulaire.bon.Bon;
import formulaire.bon.Reception;
import formulaire.bon.Validation;
import java.awt.Cursor;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OBAM
 */
public class GestionStock extends javax.swing.JInternalFrame {

    /**
     * Creates new form GestionStock
     */
    public GestionStock() {
        //this.setU setUndecorated(true);
        initComponents();
        getContentPane().setBackground(new java.awt.Color(51, 51, 51));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList();
        jScrollPane7 = new javax.swing.JScrollPane();
        jList7 = new javax.swing.JList();
        jScrollPane8 = new javax.swing.JScrollPane();
        jList8 = new javax.swing.JList();
        jButton20 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setBorder(null);
        setResizable(true);
        setMaximumSize(new java.awt.Dimension(765, 600));
        setMinimumSize(new java.awt.Dimension(765, 600));
        setPreferredSize(new java.awt.Dimension(765, 600));
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ST2.jpg"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(630, 370, 90, 50);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(375, 192, 631, 0);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled-2.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(915, 398, 91, 74);

        jButton3.setBackground(new java.awt.Color(0, 102, 204));
        jButton3.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/236840.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(180, 160, 60, 50);

        jLabel4.setBackground(new java.awt.Color(0, 153, 204));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 255));
        jLabel4.setText("Gestion des Entrées");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(330, 0, 180, 22);

        jLabel5.setBackground(new java.awt.Color(0, 102, 204));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Validation OS");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(540, 170, 110, 22);

        jLabel6.setBackground(new java.awt.Color(0, 153, 204));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 255));
        jLabel6.setText("Gestion des Demandes");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(570, 0, 180, 22);

        jButton11.setBackground(new java.awt.Color(204, 0, 0));
        jButton11.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/138839.png"))); // NOI18N
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton11MouseExited(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(670, 150, 60, 50);

        jButton12.setBackground(new java.awt.Color(0, 153, 0));
        jButton12.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/138259.png"))); // NOI18N
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton12MouseExited(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(450, 150, 61, 50);

        jButton16.setBackground(new java.awt.Color(0, 102, 204));
        jButton16.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/essai.png"))); // NOI18N
        jButton16.setBorder(null);
        jButton16.setBorderPainted(false);
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton16MouseExited(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16);
        jButton16.setBounds(680, 20, 60, 50);

        jButton17.setBackground(new java.awt.Color(255, 153, 0));
        jButton17.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/306455.png"))); // NOI18N
        jButton17.setBorder(null);
        jButton17.setBorderPainted(false);
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton17MouseExited(evt);
            }
        });
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17);
        jButton17.setBounds(180, 300, 60, 50);

        jButton18.setBackground(new java.awt.Color(204, 0, 0));
        jButton18.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/138839.png"))); // NOI18N
        jButton18.setBorder(null);
        jButton18.setBorderPainted(false);
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton18MouseExited(evt);
            }
        });
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18);
        jButton18.setBounds(450, 310, 60, 50);

        jLabel7.setBackground(new java.awt.Color(0, 102, 204));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("Fichiers de Base");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 0, 186, 22);

        jLabel8.setBackground(new java.awt.Color(0, 102, 204));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Articles");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 40, 110, 20);

        jLabel11.setBackground(new java.awt.Color(0, 102, 204));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ordre Entrée");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(290, 40, 110, 22);

        jLabel12.setBackground(new java.awt.Color(0, 102, 204));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Fournisseur");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 170, 100, 22);

        jLabel13.setBackground(new java.awt.Color(0, 102, 204));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Validation OE");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(290, 320, 120, 22);

        jLabel14.setBackground(new java.awt.Color(0, 102, 204));
        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Ordre de Sortie");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(560, 40, 120, 22);

        jLabel15.setBackground(new java.awt.Color(0, 102, 204));
        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Service/Bureau");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(10, 320, 140, 20);

        jButton19.setBackground(new java.awt.Color(255, 153, 0));
        jButton19.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/art2.png"))); // NOI18N
        jButton19.setBorder(null);
        jButton19.setBorderPainted(false);
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton19MouseExited(evt);
            }
        });
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19);
        jButton19.setBounds(170, 30, 70, 40);

        jLabel16.setBackground(new java.awt.Color(0, 102, 204));
        jLabel16.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Reception");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(290, 160, 90, 22);

        jButton21.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/138256.png"))); // NOI18N
        jButton21.setBorder(null);
        jButton21.setBorderPainted(false);
        jButton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton21MouseExited(evt);
            }
        });
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton21);
        jButton21.setBounds(440, 30, 60, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bar1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(520, 30, 10, 420);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 20, 740, 2);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bar1.png"))); // NOI18N
        jLabel2.setText("jLabel1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 30, 10, 420);

        jList1.setBackground(new java.awt.Color(51, 51, 51));
        jList1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 10)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "- Enregistrement,Modification des Services", "- Enregistrement,Modification Bureaux et services", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 370, 240, 60);

        jList2.setBackground(new java.awt.Color(51, 51, 51));
        jList2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 10)); // NOI18N
        jList2.setForeground(new java.awt.Color(255, 255, 255));
        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "- Les ordres de sortie en attentes ", "                de Validations", "- Validations des dites ordres de sorties", " ", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jList2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(530, 210, 200, 100);

        jList3.setBackground(new java.awt.Color(51, 51, 51));
        jList3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 10)); // NOI18N
        jList3.setForeground(new java.awt.Color(255, 255, 255));
        jList3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "-Liste de tous les Fournisseurs", "-Enregistrement de nouveaux Fournisseurs", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(jList3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 220, 230, 60);

        jList4.setBackground(new java.awt.Color(51, 51, 51));
        jList4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 10)); // NOI18N
        jList4.setForeground(new java.awt.Color(255, 255, 255));
        jList4.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "- Enregistrement, Modification  Articles", "-Editions de la liste des articles et Fiches de stock", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList4.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(jList4);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(10, 80, 230, 70);

        jList5.setBackground(new java.awt.Color(51, 51, 51));
        jList5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 10)); // NOI18N
        jList5.setForeground(new java.awt.Color(255, 255, 255));
        jList5.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "-Gestion des ordres d entrees", "-consultations des ordres d entrees saisies", "-Editions  des ordres d entrees" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList5.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(jList5);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(260, 80, 250, 60);

        jList6.setBackground(new java.awt.Color(51, 51, 51));
        jList6.setFont(new java.awt.Font("Tempus Sans ITC", 0, 10)); // NOI18N
        jList6.setForeground(new java.awt.Color(255, 255, 255));
        jList6.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "--Consultation des Bons de Commandes ", "                    non Receptionnés", "--Receptions des dits bon de commandes", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList6.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane6.setViewportView(jList6);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(260, 210, 250, 90);

        jList7.setBackground(new java.awt.Color(51, 51, 51));
        jList7.setFont(new java.awt.Font("Tempus Sans ITC", 0, 10)); // NOI18N
        jList7.setForeground(new java.awt.Color(255, 255, 255));
        jList7.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "- Les ordres d entree en attentes de Validations", "- Validations des dites ordres", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList7.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane7.setViewportView(jList7);

        getContentPane().add(jScrollPane7);
        jScrollPane7.setBounds(260, 370, 250, 60);

        jList8.setBackground(new java.awt.Color(51, 51, 51));
        jList8.setFont(new java.awt.Font("Tempus Sans ITC", 0, 10)); // NOI18N
        jList8.setForeground(new java.awt.Color(255, 255, 255));
        jList8.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "-Gestion des ordres de sortie", "-consultations des ordres de sorties saisies", "-Editions  des ordres de sortie" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList8.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane8.setViewportView(jList8);

        getContentPane().add(jScrollPane8);
        jScrollPane8.setBounds(530, 80, 210, 70);

        jButton20.setBackground(new java.awt.Color(0, 102, 102));
        jButton20.setText("Immatriculation");
        jButton20.setBorder(null);
        jButton20.setBorderPainted(false);
        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton20MouseExited(evt);
            }
        });
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton20);
        jButton20.setBounds(610, 320, 120, 50);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("Module stock");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(570, 420, 170, 29);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         //ValidationSorti s =new ValidationSorti(new JFrame(),true);
        // s.setVisible(true);
          Fournisseur2 f = new Fournisseur2(new JFrame(),true);
        f.setVisible(true);
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered

        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseEntered
        // TODO add your handling code here:
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton11MouseEntered

    private void jButton11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseExited
        // TODO add your handling code here:
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_jButton11MouseExited

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
         ValidationSorti s =new ValidationSorti(new JFrame(),true);
         s.setVisible(true);
       
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseEntered
        // TODO add your handling code here:
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton12MouseEntered

    private void jButton12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseExited
        // TODO add your handling code here:
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_jButton12MouseExited

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
          Reception r = new Reception();
           r.setVisible(true);
         //Bon b = new Bon();
          //b.setVisible(true);
          
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseEntered
        // TODO add your handling code here:
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton16MouseEntered

    private void jButton16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseExited
        // TODO add your handling code here:
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_jButton16MouseExited

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        Sortie s = new Sortie(new JFrame(),true);
        s.setVisible(true);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseEntered
        // TODO add your handling code here:
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton17MouseEntered

    private void jButton17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseExited
        // TODO add your handling code here:
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_jButton17MouseExited

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        Batiment bat=new Batiment(new JFrame(),true);
        bat.setVisible(true);
        
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseEntered
        // TODO add your handling code here:
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton18MouseEntered

    private void jButton18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseExited
        // TODO add your handling code here:
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_jButton18MouseExited

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
         Validation v = new Validation();
         v.setVisible(true);
        
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseEntered
setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19MouseEntered

    private void jButton19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseExited
        // TODO add your handling code here:
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_jButton19MouseExited

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
         Article a = new Article(new JFrame(),true);
        a.setVisible(true);// TODO add your handling code here:
        
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MouseEntered
        // TODO add your handling code here:
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton21MouseEntered

    private void jButton21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MouseExited
        // TODO add your handling code here:
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_jButton21MouseExited

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
         Bon b = new Bon(new JFrame(),true);
          b.setVisible(true);
       
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseEntered
        // TODO add your handling code here:
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton20MouseEntered

    private void jButton20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseExited
        // TODO add your handling code here:
        setCursor(Cursor.getDefaultCursor());
        this.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
    }//GEN-LAST:event_jButton20MouseExited

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
          NouveauAttente m= new NouveauAttente (new JFrame(),true);
        m.setVisible(true);
    }//GEN-LAST:event_jButton20ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JList jList4;
    private javax.swing.JList jList5;
    private javax.swing.JList jList6;
    private javax.swing.JList jList7;
    private javax.swing.JList jList8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
