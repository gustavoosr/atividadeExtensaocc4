/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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
        lblLogo = new javax.swing.JLabel();
        lblLegenda = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        botaoAcessar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acessar Sistema");
        setLocation(new java.awt.Point(600, 300));
        setResizable(false);

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\gusta\\Downloads\\login-da-conta.png")); // NOI18N

        lblLegenda.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lblLegenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLegenda.setText("Acessar Sistema");

        lblSenha.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblSenha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSenha.setText("Senha:");
        lblSenha.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtUsuario.setBackground(new java.awt.Color(204, 204, 204));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setToolTipText("Digite o Usuário");
        txtUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtUsuario.setVerifyInputWhenFocusTarget(false);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsuario.setText("Usuário:");
        lblUsuario.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtSenha.setBackground(new java.awt.Color(204, 204, 204));
        txtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSenha.setToolTipText("Digite a senha");
        txtSenha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtSenha.setVerifyInputWhenFocusTarget(false);

        botaoAcessar.setBackground(new java.awt.Color(204, 204, 204));
        botaoAcessar.setText("Acessar");
        botaoAcessar.setToolTipText("Acessar");
        botaoAcessar.setFocusPainted(false);
        botaoAcessar.setVerifyInputWhenFocusTarget(false);
        botaoAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAcessarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLegenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUsuario)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSenha)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(botaoAcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo)
                .addGap(32, 32, 32)
                .addComponent(lblLegenda)
                .addGap(42, 42, 42)
                .addComponent(lblUsuario)
                .addGap(12, 12, 12)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(botaoAcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void botaoAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAcessarActionPerformed

        // TODO add your handling code here:
        if (txtUsuario.getText().equals("Admsistema")&& txtSenha.getText().equals("Adm@1234")) {
            Clientes clientes = new Clientes();
            clientes.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou Senha inválida! Tente novamente.");
            txtSenha.setText("");
            txtUsuario.setText("");
        }
    }//GEN-LAST:event_botaoAcessarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAcessar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLegenda;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
