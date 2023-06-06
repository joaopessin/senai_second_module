package pkg04_01_exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Estoque extends javax.swing.JFrame {

    public Estoque() {
        initComponents();
    }

    public void PopularJTable(String sql) {
    try
  {
   Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3307/fashion_foot", "ff_lucas", "123456");
   PreparedStatement banco = (PreparedStatement)con.prepareStatement(sql);
   banco.execute(); 
 
   ResultSet resultado = banco.executeQuery(sql);
 
   DefaultTableModel model =(DefaultTableModel) Tabela_Estoque.getModel();
   model.setNumRows(0);
 
   while(resultado.next())
   {
       model.addRow(new Object[] 
       { 
          //retorna os dados da tabela do BD, cada campo e um coluna.
          //codigo,nome,condicao,tamanho,unidades,categoria,preco,valor_venda,peso,descricao
          resultado.getString("id"),
          resultado.getString("codigo"),
          resultado.getString("nome"),
          resultado.getString("unidade"),
          resultado.getString("valor_inicial"),
          resultado.getString("valor_frete"),
          resultado.getString("valor_total"),
          resultado.getString("total_vendas"),
          resultado.getString("cod_barra"),
          resultado.getString("tipo_produto"),
       }); 
  } 
   banco.close();
   con.close();
  }
 catch (SQLException ex)
 {
    System.out.println("o erro foi " +ex);
  }
 }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Bt_Voltar_Funcionario = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cod_produto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nome_produto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        unidades_estoque = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        val_inicial_estoque = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        total_vendas_estoque = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cod_barra_estoque = new javax.swing.JTextField();
        tipo_estoque = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_Estoque = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Bt_Atualizar = new javax.swing.JButton();
        txt_ID_Atualizar_CadastroDeProduto = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        txt_ID_Deletar_CadastroDeProduto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Bt_Deletar = new javax.swing.JButton();
        val_estoque_fret = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Bt_Inserir = new javax.swing.JButton();
        val_total = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                Select(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(17, 69, 139));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(229, 237, 248));
        jLabel1.setText("ESTOQUE");

        Bt_Voltar_Funcionario.setBackground(new java.awt.Color(17, 69, 139));
        Bt_Voltar_Funcionario.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Bt_Voltar_Funcionario.setForeground(new java.awt.Color(255, 255, 255));
        Bt_Voltar_Funcionario.setText("<");
        Bt_Voltar_Funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Voltar_FuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Bt_Voltar_Funcionario)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bt_Voltar_Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(229, 237, 248));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Código");

        cod_produto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cod_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod_produtoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Nome Produto");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setText("Unidade");

        unidades_estoque.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        unidades_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidades_estoqueActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setText("Val. Inicial");

        val_inicial_estoque.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        val_inicial_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                val_inicial_estoqueActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setText("Tot. Vendas");

        total_vendas_estoque.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        total_vendas_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_vendas_estoqueActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setText("Cód. Barra");

        cod_barra_estoque.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cod_barra_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod_barra_estoqueActionPerformed(evt);
            }
        });

        tipo_estoque.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tipo_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_estoqueActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setText("Tip. Produto");

        Tabela_Estoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Código", "Nome", "Unidade", "Val. Inicial", "Val. Frete", "Val. Total", "Tot. Vendas", "Cód. Barra", "Tip. Produto"
            }
        ));
        Tabela_Estoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela_Estoque(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela_Estoque);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setText("ID");

        Bt_Atualizar.setBackground(new java.awt.Color(17, 69, 139));
        Bt_Atualizar.setForeground(new java.awt.Color(255, 255, 255));
        Bt_Atualizar.setText("Atualizar");
        Bt_Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_AtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ID_Atualizar_CadastroDeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addComponent(Bt_Atualizar))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ID_Atualizar_CadastroDeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Bt_Atualizar)
                .addGap(4, 4, 4))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txt_ID_Deletar_CadastroDeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_Deletar_CadastroDeProdutoActionPerformed(evt);
            }
        });

        jLabel13.setText("ID");

        Bt_Deletar.setBackground(new java.awt.Color(204, 204, 204));
        Bt_Deletar.setText("Deletar");
        Bt_Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_DeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Bt_Deletar)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ID_Deletar_CadastroDeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ID_Deletar_CadastroDeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Bt_Deletar)
                .addContainerGap())
        );

        val_estoque_fret.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        val_estoque_fret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                val_estoque_fretActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setText("Val. Frete");

        Bt_Inserir.setBackground(new java.awt.Color(17, 69, 139));
        Bt_Inserir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Bt_Inserir.setForeground(new java.awt.Color(255, 255, 255));
        Bt_Inserir.setText("Inserir");
        Bt_Inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_InserirActionPerformed(evt);
            }
        });

        val_total.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        val_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                val_totalActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel14.setText("Val. Total");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(Bt_Inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(334, 334, 334))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 76, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cod_produto))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(nome_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unidades_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(val_inicial_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(val_estoque_fret, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(val_total, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(total_vendas_estoque))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(cod_barra_estoque))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(tipo_estoque))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cod_barra_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cod_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nome_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unidades_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(val_inicial_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total_vendas_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipo_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(val_estoque_fret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(val_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt_Inserir)
                        .addGap(50, 50, 50)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cod_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cod_produtoActionPerformed

    private void unidades_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidades_estoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidades_estoqueActionPerformed

    private void val_inicial_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_val_inicial_estoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_val_inicial_estoqueActionPerformed

    private void total_vendas_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_vendas_estoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_vendas_estoqueActionPerformed

    private void cod_barra_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod_barra_estoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cod_barra_estoqueActionPerformed

    private void tipo_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_estoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo_estoqueActionPerformed

    private void Bt_Voltar_FuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Voltar_FuncionarioActionPerformed
        
    }//GEN-LAST:event_Bt_Voltar_FuncionarioActionPerformed

    private void Bt_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_AtualizarActionPerformed
        PreparedStatement statement = null;
        Connection conexao = null;

        String url = "jdbc:mysql://localhost:3307/fashion_foot";
        String usuario =  "ff_lucas";
        String senha = "123456";

        try {

            conexao = DriverManager.getConnection(url, usuario, senha);

            String sql = "UPDATE estoque SET codigo = ? , nome = ? , unidade = ? , valor_inicial = ? , valor_frete = ? , valor_total   = ? , total_vendas = ?, cod_barra = ?, tipo_produto = ? where id = ?";

            statement = conexao.prepareStatement(sql);
            statement.setString(1, cod_produto.getText());
            statement.setString(2, nome_produto.getText());
            statement.setString(3, unidades_estoque.getText());
            statement.setString(4, val_inicial_estoque.getText());
            statement.setString(5, val_estoque_fret.getText());
            statement.setString(6, val_total.getText());
            statement.setString(7, total_vendas_estoque.getText());
            statement.setString(8, cod_barra_estoque.getText());
            statement.setString(9, tipo_estoque.getText());
            
            int linhasAfetadas = statement.executeUpdate();

            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(rootPane,"Dados atualizados com sucesso!");
                this.PopularJTable("SELECT * FROM estoque ORDER BY id");
            } else {
                JOptionPane.showMessageDialog(rootPane,"Nenhum dado atualizado.");
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar dados: " + ex.getMessage());
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

    }//GEN-LAST:event_Bt_AtualizarActionPerformed

    private void txt_ID_Deletar_CadastroDeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_Deletar_CadastroDeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_Deletar_CadastroDeProdutoActionPerformed

    private void Bt_DeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_DeletarActionPerformed
        PreparedStatement statement = null;
        Connection conexao = null;

        String url = "jdbc:mysql://localhost:3307/fashion_foot";
        String usuario =  "ff_lucas";
        String senha = "123456";

        try {

            conexao = DriverManager.getConnection(url, usuario, senha);

            String sql = "DELETE from estoque where id = ?";

            statement = conexao.prepareStatement(sql);
            statement.setString(1,txt_ID_Deletar_CadastroDeProduto.getText());

            int linhasAfetadas = statement.executeUpdate();

            if(linhasAfetadas > 0){
                JOptionPane.showMessageDialog(rootPane,"Dados excluidos com sucesso!");
                this.PopularJTable("SELECT * FROM estoque ORDER BY id");
            } else {
                JOptionPane.showMessageDialog(rootPane,"Nenhum dado excluido.");
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao EXCLUIR dados: " + ex.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException ex) {
                System.out.println("Erro ao fechar conexão: " + ex.getMessage());
            }
        }

    }//GEN-LAST:event_Bt_DeletarActionPerformed

    private void val_estoque_fretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_val_estoque_fretActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_val_estoque_fretActionPerformed

    private void Bt_InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_InserirActionPerformed
        Connection conexao = null;
        PreparedStatement statement = null;
       
        String url = "jdbc:mysql://localhost:3308/fashion_foot";
        String usuario = "ff_lucas";
        String senha = "123456";
        
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
           
            String sql = "INSERT INTO estoque (codigo, nome, unidade, valor_inicial, valor_frete, valor_total, total_vendas, cod_barra, tipo_produto) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
            statement = conexao.prepareStatement(sql);
            
            statement.setInt(1, Integer.parseInt(cod_produto.getText()));
            statement.setString(2, nome_produto.getText());
            statement.setInt(3, Integer.parseInt(unidades_estoque.getText()));
            statement.setDouble(4, Double.parseDouble(val_inicial_estoque.getText()));
            statement.setDouble(5, Double.parseDouble(val_estoque_fret.getText()));
            statement.setDouble(6, Double.parseDouble(val_total.getText()));
            statement.setInt(7, Integer.parseInt(total_vendas_estoque.getText()));
            statement.setInt(8, Integer.parseInt(cod_barra_estoque.getText()));
            statement.setString(9, tipo_estoque.getText());
            
            int linhasAfetadas = statement.executeUpdate();
           
            if (linhasAfetadas > 0) {
                System.out.println("Dados inseridos com sucesso!");
                this.PopularJTable("SELECT * FROM estoque id");
                
            } else {
                System.out.println("Nenhum dado inserido.");
                
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados: " + e.getMessage());
            
        } finally {
            try {
            if (statement != null) {
                statement.close();
                }
            if (conexao != null) {
                conexao.close();
            }
        } catch (SQLException e) {
        System.out.println("Erro ao fechar conexão: " + e.getMessage());
    }
}
    }//GEN-LAST:event_Bt_InserirActionPerformed

    private void val_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_val_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_val_totalActionPerformed

    private void Select(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Select
        Connection conexao = null;
        PreparedStatement statement = null;

        String url = "jdbc:mysql://localhost:3307/fashion_foot";
        String usuario = "ff_lucas";
        String senha = "123456";
        
        try {
        conexao = DriverManager.getConnection(url, usuario, senha);
        this.PopularJTable("SELECT * FROM estoque id");
        } catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_Select

    private void Tabela_Estoque(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela_Estoque
        int linha = Tabela_Estoque.getSelectedRow();
        txt_ID_Atualizar_CadastroDeProduto.setText(Tabela_Estoque.getValueAt(linha, 0).toString());
        cod_produto.setText(Tabela_Estoque.getValueAt(linha, 1).toString());
        nome_produto.setText(Tabela_Estoque.getValueAt(linha, 2).toString());
        unidades_estoque.setText(Tabela_Estoque.getValueAt(linha, 3).toString());
        val_inicial_estoque.setText(Tabela_Estoque.getValueAt(linha, 4).toString());
        val_estoque_fret.setText(Tabela_Estoque.getValueAt(linha, 5).toString());
        val_total.setText(Tabela_Estoque.getValueAt(linha, 6).toString());
        total_vendas_estoque.setText(Tabela_Estoque.getValueAt(linha, 7).toString());
        cod_barra_estoque.setText(Tabela_Estoque.getValueAt(linha, 8).toString());
        tipo_estoque.setText(Tabela_Estoque.getValueAt(linha, 9).toString());
    }//GEN-LAST:event_Tabela_Estoque

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
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Estoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Atualizar;
    private javax.swing.JButton Bt_Deletar;
    private javax.swing.JButton Bt_Inserir;
    private javax.swing.JButton Bt_Voltar_Funcionario;
    private javax.swing.JTable Tabela_Estoque;
    private javax.swing.JTextField cod_barra_estoque;
    private javax.swing.JTextField cod_produto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nome_produto;
    private javax.swing.JTextField tipo_estoque;
    private javax.swing.JTextField total_vendas_estoque;
    private javax.swing.JTextField txt_ID_Atualizar_CadastroDeProduto;
    private javax.swing.JTextField txt_ID_Deletar_CadastroDeProduto;
    private javax.swing.JTextField unidades_estoque;
    private javax.swing.JTextField val_estoque_fret;
    private javax.swing.JTextField val_inicial_estoque;
    private javax.swing.JTextField val_total;
    // End of variables declaration//GEN-END:variables
}
