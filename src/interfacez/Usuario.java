/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacez;

/**
 *
 * @author Jared
 */
public class Usuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form Usuario
     */
    public Usuario() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtuser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtapellidos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtconfirmpassword = new javax.swing.JPasswordField();
        Register = new javax.swing.JLabel();
        Complete = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Usuario");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logobook-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Frame 1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsGenerales/018-tick mark 1_1.png"))); // NOI18N
        jButton2.setToolTipText("");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, 90, 80));

        txtuser.setBackground(new java.awt.Color(196, 196, 196));
        txtuser.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtuser.setBorder(null);
        jPanel1.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 200, 50));

        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, -1, -1));

        jLabel5.setText("Apellidos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, -1, -1));

        txtnombre.setBackground(new java.awt.Color(196, 196, 196));
        txtnombre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtnombre.setBorder(null);
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 430, 50));

        jLabel6.setText("Tipo Usuario");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, -1, -1));

        txtapellidos.setBackground(new java.awt.Color(196, 196, 196));
        txtapellidos.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtapellidos.setBorder(null);
        jPanel1.add(txtapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 430, 50));

        jLabel7.setText("Contraseña");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, -1, -1));

        txtpassword.setBackground(new java.awt.Color(196, 196, 196));
        txtpassword.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtpassword.setBorder(null);
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 200, 50));

        jLabel8.setText("Confirmar Contraseña");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 390, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(196, 196, 196));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setBorder(null);
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, 200, 50));

        jLabel9.setText("Usuario");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, -1));

        txtconfirmpassword.setBackground(new java.awt.Color(196, 196, 196));
        txtconfirmpassword.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtconfirmpassword.setBorder(null);
        txtconfirmpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconfirmpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtconfirmpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 410, 200, 50));

        Register.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Register.setForeground(new java.awt.Color(0, 0, 0));
        Register.setText("¡Registre una cuenta individual!");
        jPanel1.add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, -1));

        Complete.setForeground(new java.awt.Color(134, 146, 166));
        Complete.setText("Complete la informacion de sus datos.");
        jPanel1.add(Complete, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        jButton1.setText("jButton1");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void txtconfirmpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconfirmpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconfirmpasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Complete;
    private javax.swing.JLabel Register;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JPasswordField txtconfirmpassword;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
