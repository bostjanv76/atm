
import java.awt.Cursor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bostjanv
 */
public class Registracija extends javax.swing.JFrame {

    /**
     * Creates new form Registracija
     */
    public Registracija()throws IOException{
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        passwd1 = new javax.swing.JPasswordField();
        passwd2 = new javax.swing.JPasswordField();
        name = new javax.swing.JTextField();
        surname = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        ds = new javax.swing.JTextField();
        moski = new javax.swing.JRadioButton();
        zenska = new javax.swing.JRadioButton();
        registriraj = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 700));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(600, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 700));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Registracija");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/user_personalized_150_v2.png"))); // NOI18N

        jLabel3.setText("Uporabniško Ime:");

        jLabel4.setText("Geslo:");

        jLabel5.setText("Ponovi Geslo:");

        jLabel6.setText("Ime:");

        jLabel7.setText("Priimek:");

        jLabel8.setText("Telefon:");

        jLabel9.setText("E-mail:");

        jLabel10.setText("DŠ:");

        jLabel11.setText("Spol:");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telKeyTyped(evt);
            }
        });

        buttonGroup1.add(moski);
        moski.setSelected(true);
        moski.setText("Moški");
        moski.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                moskiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                moskiMouseExited(evt);
            }
        });

        buttonGroup1.add(zenska);
        zenska.setText("Ženska");
        zenska.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                zenskaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                zenskaMouseExited(evt);
            }
        });

        registriraj.setText("Registriraj");
        registriraj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registrirajMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrirajMouseExited(evt);
            }
        });
        registriraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrirajActionPerformed(evt);
            }
        });

        jButton2.setText("Nazaj");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(ds, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(surname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwd1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwd2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(moski)
                        .addGap(62, 62, 62)
                        .addComponent(zenska)
                        .addGap(0, 124, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registriraj)
                .addGap(94, 94, 94)
                .addComponent(jButton2)
                .addGap(149, 149, 149))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passwd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(passwd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(moski)
                        .addComponent(zenska)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(registriraj))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Login log=new Login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void registrirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrirajActionPerformed
        try{
                     
            BufferedWriter bw=null;
            BufferedReader br=new BufferedReader(new FileReader("racuni.txt"));
            Scanner sc=null;
            String uime=username.getText();
            String pass1=passwd1.getText();
            String pass2=passwd2.getText();
            String ime=name.getText();
            String priimek=surname.getText();
            String telefon=tel.getText();
            String email=mail.getText();
            //int davcna=Integer.parseInt(ds.getText());
            String davcna=ds.getText();
            String spol="";
            String pin="";
            boolean kontrola=true;  //kontrolna spremenjljivka
            int x;  //spremenljivka ki nam sluzi za generiranje nakljucnega zneska
            
            if(moski.isSelected())
                spol= "Moški";
            else
                spol= "Ženska";  
            
            if (uime.equals("")){    
                jOptionPane1.showMessageDialog(null,"Niste vnesli up. imena","Ni vnosa",jOptionPane1.ERROR_MESSAGE);
                kontrola=false;
            }
            else if(pass1.equals("") && pass2.equals("")){
                    jOptionPane1.showMessageDialog(null,"Niste vnesli gesla","Napačno geslo",jOptionPane1.ERROR_MESSAGE);
                    kontrola=false;
            }
            else if(pass1.equals(pass2)!=true){
                    jOptionPane1.showMessageDialog(null,"Gesli se ne ujemata","Napačno geslo",jOptionPane1.ERROR_MESSAGE);
                    kontrola=false;
            }
            else if (ime.equals("")){    
                jOptionPane1.showMessageDialog(null,"Niste vnesli imena","Ni vnosa",jOptionPane1.ERROR_MESSAGE);
                kontrola=false;
            }
            else if (priimek.equals("")){    
                jOptionPane1.showMessageDialog(null,"Niste vnesli priimka","Ni vnosa",jOptionPane1.ERROR_MESSAGE);
                kontrola=false;
            }
            else if (telefon.equals("")){    
                jOptionPane1.showMessageDialog(null,"Niste vnesli telefona","Ni vnosa",jOptionPane1.ERROR_MESSAGE);
                kontrola=false;
            }
            else if (email.equals("")){    
                jOptionPane1.showMessageDialog(null,"Niste vnesli emaila","Ni vnosa",jOptionPane1.ERROR_MESSAGE);
                kontrola=false;
            }
            else if (davcna.equals("")){    
                jOptionPane1.showMessageDialog(null,"Niste vnesli davčne številke","Ni vnosa",jOptionPane1.ERROR_MESSAGE);
                kontrola=false;
            }

            //jOptionPane1.showMessageDialog(null, "Test"+br.readLine(),"Test",jOptionPane1.INFORMATION_MESSAGE);
           String tmp;                     
           while(br.ready()){ //preverimo ali up. ime že obstaja
                   tmp=br.readLine();
                   if(tmp==null)
                       break;
                   sc= new Scanner(br.readLine());  //vhodni parameter Scannerja je prebrana vrstica iz datoteke
                   if(sc==null)
                       break;
                   if(sc.next().equals(uime)){   //s Scannerjem povlečemo prvo besedo iz vrstice in jo primerjamo z vnesenim up.imenom na obrazcu
                     jOptionPane1.showMessageDialog(null, "Uporabniško ime je že zasedeno: ","Napačno up. ime",jOptionPane1.INFORMATION_MESSAGE);
                   kontrola=false;
                   }
            }
            br.close();
            bw=new BufferedWriter(new FileWriter("racuni.txt",true));
            
            if (kontrola){  //če so vsa polja vnesena, potem lahko zgeneriramo kodo in vpišemo podatke v datoteko
            //najprej pogledamo, če up. ime že obstaja    

                x=(int)(Math.random()*401+100);  //generiranje nakljucnega zneska denarja
                for(int i=0;i<4;i++)    //genriranje naključne PIN kode
                    pin +=(int)(Math.random()*10);

                jOptionPane1.showMessageDialog(null, "Vaša PIN koda je: "+pin+"\nZnesek je: "+x,"Informacija",jOptionPane1.INFORMATION_MESSAGE);
                //znak za v novo vrstico(\n) uporabimo ker zelimo da je znesek zapisan v drugi vrstici
                
                //vpis v datoteko        
                bw.write(uime+" ");
                bw.write(pass1+" ");
                bw.write(pin+" ");
                bw.write(ime+" ");
                bw.write(priimek+" ");
                bw.write(telefon+" ");
                bw.write(email+" ");
                bw.write(davcna+" ");
                bw.write(spol+" ");
                bw.write(x+"");     //stevilo pretvorimo v niz ker bw ne omogoca vpisa stevil, alternativa bi bil printWriter
                bw.newLine();       //ko zapišemo vse podatke skočimo v novo vrstico
            
                //odpri obrazec za prijavo
                Login log=new Login();
                log.setVisible(true);
                dispose();    
            }
            
            bw.close();
                    
        }
        catch (Exception e) {
        jOptionPane1.showMessageDialog(null, "Error ","Informacija",jOptionPane1.INFORMATION_MESSAGE);
        e.printStackTrace();
    } 
    }//GEN-LAST:event_registrirajActionPerformed

    private void telKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telKeyTyped
          if(tel.getText().length()==9){
          evt.consume();  
        }
    }//GEN-LAST:event_telKeyTyped

    private void registrirajMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrirajMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_registrirajMouseEntered

    private void registrirajMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrirajMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_registrirajMouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jButton2MouseExited

    private void moskiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moskiMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_moskiMouseEntered

    private void moskiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moskiMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_moskiMouseExited

    private void zenskaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zenskaMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_zenskaMouseEntered

    private void zenskaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zenskaMouseExited
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_zenskaMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registracija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registracija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registracija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registracija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Registracija().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Registracija.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField ds;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mail;
    private javax.swing.JRadioButton moski;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField passwd1;
    private javax.swing.JPasswordField passwd2;
    private javax.swing.JButton registriraj;
    private javax.swing.JTextField surname;
    private javax.swing.JTextField tel;
    private javax.swing.JTextField username;
    private javax.swing.JRadioButton zenska;
    // End of variables declaration//GEN-END:variables
}
