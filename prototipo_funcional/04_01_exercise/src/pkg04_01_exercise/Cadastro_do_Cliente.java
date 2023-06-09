package pkg04_01_exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Cadastro_do_Cliente extends javax.swing.JFrame {

    public Cadastro_do_Cliente() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Bot_Voltar_Para_Login = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
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
        name_user = new javax.swing.JTextField();
        date_user = new javax.swing.JTextField();
        telefone_user = new javax.swing.JTextField();
        cpf_user = new javax.swing.JTextField();
        email_user = new javax.swing.JTextField();
        cep_user = new javax.swing.JTextField();
        num_user = new javax.swing.JTextField();
        rua_user = new javax.swing.JTextField();
        cidade_user = new javax.swing.JTextField();
        estado_user = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        adicionarFoto = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Salvar = new javax.swing.JButton();
        bt_entrar = new javax.swing.JButton();
        id_user = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        senha_user = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                Open(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(17, 69, 139));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(229, 237, 248));
        jLabel1.setText("CADASTRO DO CLIENTE");

        Bot_Voltar_Para_Login.setBackground(new java.awt.Color(17, 69, 139));
        Bot_Voltar_Para_Login.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Bot_Voltar_Para_Login.setForeground(new java.awt.Color(255, 255, 255));
        Bot_Voltar_Para_Login.setText("<");
        Bot_Voltar_Para_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot_Voltar_Para_LoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Bot_Voltar_Para_Login)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(584, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(Bot_Voltar_Para_Login))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(229, 237, 248));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nome Completo");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Estado");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Cidade");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Rua");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("N°");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("CEP");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Data de Nascimento");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Telefone");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("CPF");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("E-mail");

        name_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_userActionPerformed(evt);
            }
        });

        date_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_userActionPerformed(evt);
            }
        });

        telefone_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefone_userActionPerformed(evt);
            }
        });

        cpf_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpf_userActionPerformed(evt);
            }
        });

        email_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_userActionPerformed(evt);
            }
        });

        cep_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cep_userActionPerformed(evt);
            }
        });

        num_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_userActionPerformed(evt);
            }
        });

        rua_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rua_userActionPerformed(evt);
            }
        });

        cidade_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidade_userActionPerformed(evt);
            }
        });

        estado_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado_userActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(17, 69, 139));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 182, Short.MAX_VALUE)
        );

        adicionarFoto.setText("+");
        adicionarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarFotoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Uploud uma foto");

        Salvar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        bt_entrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bt_entrar.setText("Entrar");
        bt_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_entrarActionPerformed(evt);
            }
        });

        id_user.setEnabled(false);
        id_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_userActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("ID");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("Senha");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(name_user, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date_user, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefone_user, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email_user, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cep_user, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(num_user, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rua_user, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cidade_user, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(estado_user, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(id_user, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(senha_user))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(adicionarFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(85, 85, 85))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(bt_entrar)
                .addGap(127, 127, 127)
                .addComponent(Salvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adicionarFoto)
                            .addComponent(jLabel13)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(senha_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estado_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(date_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cidade_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefone_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rua_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpf_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cep_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_entrar)
                            .addComponent(Salvar))))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void name_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_userActionPerformed

    private void date_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date_userActionPerformed

    private void telefone_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefone_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefone_userActionPerformed

    private void cpf_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpf_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpf_userActionPerformed

    private void email_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_userActionPerformed

    private void cep_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cep_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cep_userActionPerformed

    private void num_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_userActionPerformed

    private void rua_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rua_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rua_userActionPerformed

    private void cidade_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidade_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidade_userActionPerformed

    private void estado_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estado_userActionPerformed

    private void adicionarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarFotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adicionarFotoActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        Connection conexao = null;
        PreparedStatement statement = null;
       
        String url = "jdbc:mysql://localhost:3307/fashion_foot";
        String usuario = "ff_lucas";
        String senha = "123456";
        
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
           
            String sql = "INSERT INTO cliente (senha, nome_completo, data_nasc, telefone, cpf, email, estado, cidade, rua, number_casa, cep) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
            statement = conexao.prepareStatement(sql);
            
            statement.setString(1, new String (senha_user.getPassword()));
            statement.setString(2, name_user.getText());
            statement.setString(3, date_user.getText());
            statement.setString(4, telefone_user.getText());
            statement.setString(5, cpf_user.getText());
            statement.setString(6, email_user.getText());
            statement.setString(7, estado_user.getText());
            statement.setString(8, cidade_user.getText());
            statement.setString(9, rua_user.getText());
            statement.setInt(10, Integer.parseInt(num_user.getText()));
            statement.setInt(11, Integer.parseInt(cep_user.getText()));
            
            int linhasAfetadas = statement.executeUpdate();
           
            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(rootPane,"Dados inseridos com sucesso!");
                bt_entrar.setEnabled(true);
                
            } else {
               JOptionPane.showMessageDialog(rootPane,"Nenhum dado inserido.");
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao inserir dados: " + e.getMessage());
            
        } finally {
            try {
            if (statement != null) {
                statement.close();
                }
            if (conexao != null) {
                conexao.close();
            }
        } catch (SQLException e) {
       JOptionPane.showMessageDialog(rootPane,"Erro ao fechar conexão: " + e.getMessage());
    }
}
    }//GEN-LAST:event_SalvarActionPerformed

    private void Bot_Voltar_Para_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot_Voltar_Para_LoginActionPerformed
        Cadastro_do_Cliente.this.dispose();
        Opcoes_de_Conta opcoesConta = new Opcoes_de_Conta();
        opcoesConta.setVisible(true);        
    }//GEN-LAST:event_Bot_Voltar_Para_LoginActionPerformed

    private void bt_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_entrarActionPerformed
         Cadastro_do_Cliente.this.dispose();
         Listagem_Produto listagem = new Listagem_Produto();
         listagem.setVisible(true);
         
    }//GEN-LAST:event_bt_entrarActionPerformed

    private void id_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_userActionPerformed

    private void Open(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Open
        // TODO add your handling code here:
        bt_entrar.setEnabled(false);
    }//GEN-LAST:event_Open

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
            java.util.logging.Logger.getLogger(Cadastro_do_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_do_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_do_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_do_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_do_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bot_Voltar_Para_Login;
    private javax.swing.JButton Salvar;
    private javax.swing.JButton adicionarFoto;
    private javax.swing.JButton bt_entrar;
    private javax.swing.JTextField cep_user;
    private javax.swing.JTextField cidade_user;
    private javax.swing.JTextField cpf_user;
    private javax.swing.JTextField date_user;
    private javax.swing.JTextField email_user;
    private javax.swing.JTextField estado_user;
    private javax.swing.JTextField id_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField name_user;
    private javax.swing.JTextField num_user;
    private javax.swing.JTextField rua_user;
    private javax.swing.JPasswordField senha_user;
    private javax.swing.JTextField telefone_user;
    // End of variables declaration//GEN-END:variables
}
