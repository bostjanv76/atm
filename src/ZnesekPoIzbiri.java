
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bostjanv
 */
public class ZnesekPoIzbiri extends javax.swing.JFrame {
        BufferedReader br=null;
        PrintWriter pw=null;
    /**
     * Creates new form ZnesekPoIzbiri
     */
    public ZnesekPoIzbiri() {
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

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        poljubenZnesek = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        vredu = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Znesek:");

        poljubenZnesek.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                poljubenZnesekKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Vnesite poljuben znesek");

        vredu.setText("Vredu");
        vredu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vreduMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vreduMouseExited(evt);
            }
        });
        vredu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vreduActionPerformed(evt);
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
                .addGap(199, 199, 199)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(vredu)
                        .addGap(49, 49, 49)
                        .addComponent(jButton2))
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(poljubenZnesek, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(poljubenZnesek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vredu)
                    .addComponent(jButton2))
                .addGap(92, 92, 92))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Bankomat bm=new Bankomat();
       bm.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void vreduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vreduActionPerformed
         try{
           br=new BufferedReader(new FileReader("racuni.txt"));
           pw=new PrintWriter(new FileWriter("racuni_temp.txt"));
            int tmp;
            int pz=Integer.parseInt(poljubenZnesek.getText());      //prenos vrednosti iz polja na obrazcu v spremenljivko
            tmp=(int)(Login.znesek);     //prenos zneska iz login forme
            String vrstica="";
            String tab[]=null;
       
       
       if(tmp-pz<0){
           jOptionPane1.showMessageDialog(null, "Na računu nimate dovolj denarja","Napaka",jOptionPane1.ERROR_MESSAGE);
       }else{
            tmp=tmp-pz;
            jOptionPane1.showMessageDialog(null, "Na računu imate še "+tmp+"€","Obvestilo",jOptionPane1.INFORMATION_MESSAGE);
           
            while(br.ready()){
            vrstica=br.readLine();
            tab=vrstica.split(" ");       //iz niza nam vsebino prenese v tabelo
            if(Login.oseba.equals(tab[0])){
                Login.znesek=tmp;         //nujnuo moramo spremeniti znesek tudi na login formi ker se ta znesek ob kliku na gumb vedno prenese iz login forme
                pw.println(tab[0]+" "+tab[1]+" "+tab[2]+" "+tab[3]+" "+tab[4]+" "+tab[5]+" "+tab[6]+" "+tab[7]+" "+tab[8]+" "+(tmp));                                       //zapiši vse +nov znesek 
            }
          else{
             pw.println(vrstica); //zapiši vrstica
          }
       }
       br.close();
       pw.close();
       
       File original=new File("racuni.txt");
       original.delete();
       new File("racuni_temp.txt").renameTo(original);
       
           Bankomat bm=new Bankomat();
           bm.setVisible(true);
           dispose();
       }
      }catch(Exception e){
          
      }
    }//GEN-LAST:event_vreduActionPerformed

    private void poljubenZnesekKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_poljubenZnesekKeyTyped
        char c=evt.getKeyChar();        //ob pritisku na tipko dobimo kodo znaka    
        //uporabniku dovolimo samo vnos števk(0-9)
        //sestavimo resnični pogoj ki ga negiramo(! pred pogojem)
        //če je prebrani znak števka od 0 do 9 ali backspace ali delete, dovolimo vnos v, nasprotnem primeru pa "zamrznemo" vnos
        if(!((c>='0')&&(c<='9')||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){           
            evt.consume();
        }
    }//GEN-LAST:event_poljubenZnesekKeyTyped

    private void vreduMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vreduMouseEntered
       setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_vreduMouseEntered

    private void vreduMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vreduMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_vreduMouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
       setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jButton2MouseExited

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
            java.util.logging.Logger.getLogger(ZnesekPoIzbiri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ZnesekPoIzbiri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ZnesekPoIzbiri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ZnesekPoIzbiri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZnesekPoIzbiri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField poljubenZnesek;
    private javax.swing.JButton vredu;
    // End of variables declaration//GEN-END:variables
}
