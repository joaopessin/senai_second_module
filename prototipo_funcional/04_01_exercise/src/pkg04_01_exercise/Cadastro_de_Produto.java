/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04_01_exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pkg04_01_exercise.Menu_funcionario;
import pkg04_01_exercise.Menu_funcionario;

/**
 *
 * @author aluno
 */
public class Cadastro_de_Produto extends javax.swing.JFrame {

    private PreparedStatement statement;

    /**
     * Creates new form Layson_Tela_CadastroProduto
     */
    public Cadastro_de_Produto() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Bot_voltar_cadastroProd = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_cod_produto = new javax.swing.JTextField();
        txt_nome_produto = new javax.swing.JTextField();
        condicao_produto = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        unidades_produto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tamanho_produto = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        categoria_produto = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        preco_produto = new javax.swing.JTextField();
        peso_produto = new javax.swing.JTextField();
        valor_produto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricao_produto = new javax.swing.JTextArea();
        Bt_Inserir_CadastroDeProduto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                Select(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(229, 237, 248));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 562));

        jPanel1.setBackground(new java.awt.Color(17, 69, 139));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CADASTRO DE PRODUTO");

        Bot_voltar_cadastroProd.setBackground(new java.awt.Color(17, 69, 139));
        Bot_voltar_cadastroProd.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Bot_voltar_cadastroProd.setForeground(new java.awt.Color(255, 255, 255));
        Bot_voltar_cadastroProd.setText("<");
        Bot_voltar_cadastroProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot_voltar_cadastroProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Bot_voltar_cadastroProd)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Bot_voltar_cadastroProd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(17, 69, 139));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setText("Adicionar foto");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jButton1)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Código");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Nome");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Condição");

        txt_cod_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cod_produtoActionPerformed(evt);
            }
        });

        txt_nome_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nome_produtoActionPerformed(evt);
            }
        });

        condicao_produto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        condicao_produto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não especificado", "Novo", "Usado", "Danificado" }));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Tamanho");

        unidades_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidades_produtoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Unidades");

        tamanho_produto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tamanho_produto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não especificado", "Pequeno", "Médio", "Grande" }));
        tamanho_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanho_produtoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Categoria");

        categoria_produto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        categoria_produto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não especificado", "Esportivo", "Casual", "Social" }));
        categoria_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoria_produtoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Preço");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Valor de venda");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Peso");

        preco_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preco_produtoActionPerformed(evt);
            }
        });

        peso_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peso_produtoActionPerformed(evt);
            }
        });

        valor_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor_produtoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(204, 204, 204)
                .addComponent(jLabel4)
                .addGap(169, 169, 169))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_cod_produto)
                            .addComponent(tamanho_produto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(preco_produto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nome_produto, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(unidades_produto)
                            .addComponent(valor_produto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(condicao_produto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(categoria_produto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(peso_produto))
                        .addGap(130, 130, 130))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(184, 184, 184)
                        .addComponent(jLabel10)
                        .addGap(185, 185, 185))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(191, 191, 191)
                        .addComponent(jLabel7)
                        .addGap(168, 168, 168))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cod_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nome_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(condicao_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tamanho_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unidades_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoria_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(preco_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(peso_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel11.setText("Descricão do produto");

        descricao_produto.setColumns(20);
        descricao_produto.setRows(5);
        descricao_produto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(descricao_produto);

        Bt_Inserir_CadastroDeProduto.setBackground(new java.awt.Color(17, 69, 139));
        Bt_Inserir_CadastroDeProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Bt_Inserir_CadastroDeProduto.setForeground(new java.awt.Color(255, 255, 255));
        Bt_Inserir_CadastroDeProduto.setText("Inserir");
        Bt_Inserir_CadastroDeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Inserir_CadastroDeProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(462, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Bt_Inserir_CadastroDeProduto)
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bt_Inserir_CadastroDeProduto)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valor_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor_produtoActionPerformed

    private void peso_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peso_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_peso_produtoActionPerformed

    private void preco_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preco_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preco_produtoActionPerformed

    private void tamanho_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanho_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tamanho_produtoActionPerformed

    private void unidades_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidades_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidades_produtoActionPerformed

    private void txt_nome_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nome_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nome_produtoActionPerformed

    private void txt_cod_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cod_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cod_produtoActionPerformed

    private void Bot_voltar_cadastroProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot_voltar_cadastroProdActionPerformed
        // TODO add your handling code here:
        Cadastro_de_Produto.this.dispose();
        Menu_funcionario menuFuncionario = new Menu_funcionario();
        menuFuncionario.setVisible(true);
    }//GEN-LAST:event_Bot_voltar_cadastroProdActionPerformed

    private void Bt_Inserir_CadastroDeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Inserir_CadastroDeProdutoActionPerformed
        
        Connection conexao = null;
           
            
            String url = "jdbc:mysql://localhost:3307/fashion_foot";
            String usuario =  "ff_lucas";
            String senha = "123456";
        
        try {
            
            conexao = DriverManager.getConnection(url, usuario, senha);
            
            String sql = "insert into cadastro_produto (codigo,nome,condicao,tamanho,unidades,categoria,preco,valor_venda,peso,descricao) values (?,?,?,?,?,?,?,?,?,?)";
        
            statement = conexao.prepareStatement(sql);
            statement.setString(1, txt_cod_produto.getText());
            statement.setString(2, txt_nome_produto.getText());
            statement.setString(3, condicao_produto.getSelectedItem().toString());
            statement.setString(4, tamanho_produto.getSelectedItem().toString());
            statement.setString(5, unidades_produto.getText());
            statement.setString(6, categoria_produto.getSelectedItem().toString());
            statement.setString(7, preco_produto.getText());
            statement.setString(8, valor_produto.getText());
            statement.setString(9, peso_produto.getText());
            statement.setString(10, descricao_produto.getText());
            
            int linhasAfetadas = statement.executeUpdate();
            
            if (linhasAfetadas > 0) {
                 JOptionPane.showMessageDialog(rootPane,"Dados inseridos com sucesso!");
            } else {
                 JOptionPane.showMessageDialog(rootPane,"Nenhum dado inserido.");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_de_Produto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
             try {
                if (statement != null) {
                    statement.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
                } catch (SQLException e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao fechar conexão: " + e.getMessage());
            }
        }

            
        
    }//GEN-LAST:event_Bt_Inserir_CadastroDeProdutoActionPerformed

    private void Select(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Select
        // TODO add your handling code here:
        Connection conexao = null;
        PreparedStatement statement = null;
       
        String url = "jdbc:mysql://localhost:3307/fashion_foot";
        String usuario = "ff_lucas";
        String senha = "123456";
        
      
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {
            
           // Logger.getLogger(Tela_Inicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Select

    private void categoria_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoria_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoria_produtoActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro_de_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_de_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_de_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_de_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Cadastro_de_Produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bot_voltar_cadastroProd;
    private javax.swing.JButton Bt_Inserir_CadastroDeProduto;
    private javax.swing.JComboBox<String> categoria_produto;
    private javax.swing.JComboBox<String> condicao_produto;
    private javax.swing.JTextArea descricao_produto;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField peso_produto;
    private javax.swing.JTextField preco_produto;
    private javax.swing.JComboBox<String> tamanho_produto;
    private javax.swing.JTextField txt_cod_produto;
    private javax.swing.JTextField txt_nome_produto;
    private javax.swing.JTextField unidades_produto;
    private javax.swing.JTextField valor_produto;
    // End of variables declaration//GEN-END:variables
}
