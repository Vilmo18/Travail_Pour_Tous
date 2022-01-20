/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package travail_pour_tous;

import javax.swing.JFrame;

public class StructureFen extends javax.swing.JFrame {

    /**
     * Creates new form StructureFen
     */
    protected String user;
    public StructureFen() {
        initComponents();
        this.setLocationRelativeTo(null);//centrer le formulaire sur l'ecran

    }
    
    public void setter(String user){
        this.user=user;
    }
    
    public void propriete(){
       StructureBD rbd =new StructureBD(this.user);
       rbd.recherche_propriete();
       nom.setText(rbd.nom);
       num_contri.setText(rbd.numero_contribuable);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_minimise = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JLabel_close = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();
        num_contri = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        modifier = new javax.swing.JButton();
        ajouter = new javax.swing.JButton();
        Deconnecter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel_minimise.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_minimise.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_minimise.setText(" -");
        jLabel_minimise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimiseMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DEPÔT D'OFFRE");

        JLabel_close.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JLabel_close.setForeground(new java.awt.Color(255, 255, 255));
        JLabel_close.setText("X");
        JLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabel_closeMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Numero de contribuable:");

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOM:");

        nom.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        nom.setForeground(new java.awt.Color(255, 255, 255));
        nom.setText("*");
        nom.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                nomPropertyChange(evt);
            }
        });

        num_contri.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        num_contri.setForeground(new java.awt.Color(255, 255, 255));
        num_contri.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(255, 255, 255)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(nom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 379, Short.MAX_VALUE)
                        .addComponent(jLabel_minimise)
                        .addGap(33, 33, 33)
                        .addComponent(JLabel_close)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(num_contri)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_minimise)
                    .addComponent(JLabel_close)
                    .addComponent(jLabel2))
                .addGap(465, 465, 465))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(num_contri))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        modifier.setBackground(new java.awt.Color(34, 167, 240));
        modifier.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        modifier.setForeground(new java.awt.Color(255, 255, 255));
        modifier.setText("Modifier");
        modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierActionPerformed(evt);
            }
        });

        ajouter.setBackground(new java.awt.Color(34, 167, 240));
        ajouter.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        ajouter.setForeground(new java.awt.Color(255, 255, 255));
        ajouter.setText("Ajouter");
        ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterActionPerformed(evt);
            }
        });

        Deconnecter.setBackground(new java.awt.Color(192, 57, 43));
        Deconnecter.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Deconnecter.setForeground(new java.awt.Color(255, 255, 255));
        Deconnecter.setText("Déconnecter");
        Deconnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeconnecterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219)
                        .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(Deconnecter)))
                .addContainerGap(279, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouter)
                    .addComponent(modifier))
                .addGap(81, 81, 81)
                .addComponent(Deconnecter)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_minimiseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimiseMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_minimiseMouseClicked

    private void JLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabel_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_JLabel_closeMouseClicked

    private void nomPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_nomPropertyChange
        // RechercheBD rbf =new RechercheBD();
    }//GEN-LAST:event_nomPropertyChange

    private void modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierActionPerformed
        StructureBD rbd =new StructureBD(this.user);
        rbd.recherche_infos();

        RegisterFormStructureFen rgf=new RegisterFormStructureFen();
        rgf.modifier(rbd.user,rbd.nom,rbd.numero_contribuable,rbd.localisation, rbd.email, rbd.boite_postale, rbd.date_de_creation, rbd.Domaine, rbd.password, rbd.password_1);
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_modifierActionPerformed

    private void ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterActionPerformed
            RegisterOffre log=new RegisterOffre();
            log.setVisible(true);
            log.pack();
            log.setLocationRelativeTo(null);
            log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //this.dispose();
    }//GEN-LAST:event_ajouterActionPerformed

    private void DeconnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeconnecterActionPerformed
        LoginFen log=new LoginFen();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

    }//GEN-LAST:event_DeconnecterActionPerformed

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
            java.util.logging.Logger.getLogger(StructureFen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StructureFen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StructureFen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StructureFen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StructureFen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deconnecter;
    private javax.swing.JLabel JLabel_close;
    private javax.swing.JButton ajouter;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_minimise;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton modifier;
    private javax.swing.JLabel nom;
    private javax.swing.JLabel num_contri;
    // End of variables declaration//GEN-END:variables
}
