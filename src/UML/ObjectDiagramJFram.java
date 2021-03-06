/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import javax.swing.JOptionPane;

/**
 *
 * @author Edward
 */
public class ObjectDiagramJFram extends javax.swing.JFrame {

    /**
     * Creates new form ObjectDiagramJFram
     */
    public ObjectDiagramJFram() {
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

        Box_Button = new javax.swing.JButton();
        Select_Arrow = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        Errase = new javax.swing.JButton();
        arrowLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        openArchive = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        copyMenu = new javax.swing.JMenuItem();
        pasteMenu = new javax.swing.JMenuItem();
        cutMenu = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        teamInfo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Object Diagram");

        Box_Button.setText("Create Box");
        Box_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box_ButtonActionPerformed(evt);
            }
        });

        Select_Arrow.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Association", "Inheritance", "Dependency", "Aggregation", "Composition" }));
        Select_Arrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_ArrowActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        Errase.setText("Errase");
        Errase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ErraseActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        openArchive.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openArchive.setText("Open...");
        openArchive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openArchiveActionPerformed(evt);
            }
        });
        jMenu1.add(openArchive);

        exitMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exitMenu.setText("Exit");
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        copyMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copyMenu.setText("Copy");
        copyMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuActionPerformed(evt);
            }
        });
        jMenu2.add(copyMenu);

        pasteMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        pasteMenu.setText("Paste");
        pasteMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteMenuActionPerformed(evt);
            }
        });
        jMenu2.add(pasteMenu);

        cutMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cutMenu.setText("Cut");
        cutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuActionPerformed(evt);
            }
        });
        jMenu2.add(cutMenu);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");

        teamInfo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        teamInfo.setText("Programmer information");
        teamInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamInfoActionPerformed(evt);
            }
        });
        jMenu3.add(teamInfo);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Select_Arrow, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Box_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Errase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(arrowLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Box_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Select_Arrow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arrowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Errase)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Box_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box_ButtonActionPerformed
        // TODO add your handling code here:
        System.out.println("I already creat a box on the panel");
    }//GEN-LAST:event_Box_ButtonActionPerformed

    private void Select_ArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select_ArrowActionPerformed
        // TODO add your handling code here:
        String valor = Select_Arrow.getSelectedItem().toString();

        if(valor.equals("Association")){
          //arrowLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            System.out.println("I am a association arrow");
        }
        if(valor.equals("Inheritance")){
          //arrowLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));    
          System.out.println("I am a Inheritance arrow");
        }
        if(valor.equals("Dependency")){
          //arrowLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
          System.out.println("I am a dependency arrow");
        }
        if(valor.equals("Aggregation")){
          //arrowLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
          System.out.println("I am a aggregation arrow");
        }
        if(valor.equals("Composition")){
          //arrowLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
          System.out.println("I am a Composition arrow");
        }
    }//GEN-LAST:event_Select_ArrowActionPerformed

    private void ErraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ErraseActionPerformed
        // TODO add your handling code here:
        System.out.println("I already clear the window");
    }//GEN-LAST:event_ErraseActionPerformed

    private void teamInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamInfoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Object Oriented Programming \n" +
                                            "Project\n" +
                                            "Luis Javier Nieto Sinecio A01701000\n" +
                                            "José Alberto Barrera Clemente A01700018\n" +
                                            "Edward Alan Gomez Vargas A01204727\n" +
                                            "Saul Axel Palacios Acosta A01208320"  );
    }//GEN-LAST:event_teamInfoActionPerformed

    private void openArchiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openArchiveActionPerformed
        // TODO add your handling code here:
        AbrirArchivo app = new AbrirArchivo();
        try{
            app.show();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_openArchiveActionPerformed

    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMenuActionPerformed

    private void pasteMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteMenuActionPerformed
        // TODO add your handling code here:
        System.out.println("I paste the box or arrow selected");
    }//GEN-LAST:event_pasteMenuActionPerformed

    private void copyMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuActionPerformed
        // TODO add your handling code here:
        System.out.println("I copy the box or arrow selected");
    }//GEN-LAST:event_copyMenuActionPerformed

    private void cutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuActionPerformed
        // TODO add your handling code here:
        System.out.println("I cut the box or arrow selected");
    }//GEN-LAST:event_cutMenuActionPerformed

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
            java.util.logging.Logger.getLogger(ObjectDiagramJFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ObjectDiagramJFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ObjectDiagramJFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ObjectDiagramJFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ObjectDiagramJFram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Box_Button;
    private javax.swing.JButton Errase;
    private javax.swing.JComboBox<String> Select_Arrow;
    private javax.swing.JLabel arrowLabel;
    private javax.swing.JMenuItem copyMenu;
    private javax.swing.JMenuItem cutMenu;
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem openArchive;
    private javax.swing.JMenuItem pasteMenu;
    private javax.swing.JMenuItem teamInfo;
    // End of variables declaration//GEN-END:variables
}
