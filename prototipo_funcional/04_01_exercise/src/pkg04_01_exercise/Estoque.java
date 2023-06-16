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
   Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3307/fashion_foot", "ff_layson", "123456");
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
          resultado.getString("condicao"),
          resultado.getString("tamanho"),
          resultado.getString("unidades"),
          resultado.getString("categoria"),
          resultado.getString("preco"),
          resultado.getString("valor_venda"),
          resultado.getString("peso"),
          resultado.getString("descricao")
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
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descricao_estoque = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        peso_estoque = new javax.swing.JTextField();
        tamanho_produto = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nome_produto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        preco_estoque = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        valor_total_estoque = new javax.swing.JTextField();
        condicao_estoque = new javax.swing.JComboBox<>();
        categoria_estoque = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        unidade_estoque = new javax.swing.JTextField();

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

        Tabela_Estoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Código", "Nome", "Condição", "Tamanho", "Unidades", "Categoria", "Preço", "Valor Venda", "Peso", "Descrição"
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

        txt_ID_Atualizar_CadastroDeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_Atualizar_CadastroDeProdutoActionPerformed(evt);
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

        jLabel15.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel15.setText("Descricão do produto");

        descricao_estoque.setColumns(20);
        descricao_estoque.setRows(5);
        descricao_estoque.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(descricao_estoque);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setText("Peso");

        peso_estoque.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        peso_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peso_estoqueActionPerformed(evt);
            }
        });

        tamanho_produto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tamanho_produto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não especificado", "Pequeno", "Médio", "Grande" }));
        tamanho_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanho_produtoActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel16.setText("Tamanho");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setText("Nome Produto");

        nome_produto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nome_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_produtoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setText("Preço");

        preco_estoque.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        preco_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preco_estoqueActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setText("Val. Venda");

        valor_total_estoque.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        valor_total_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor_total_estoqueActionPerformed(evt);
            }
        });

        condicao_estoque.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        condicao_estoque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não especificado", "Novo", "Usado", "Danificado" }));
        condicao_estoque.setSelectedItem(condicao_estoque);

        categoria_estoque.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        categoria_estoque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não especificado", "Esportivo", "Casual", "Social" }));
        categoria_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoria_estoqueActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Condição");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setText("Categoria");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setText("Unidade");

        unidade_estoque.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        unidade_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidade_estoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(219, 219, 219)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(317, 317, 317)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(peso_estoque)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addComponent(cod_produto)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addComponent(unidade_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(preco_estoque, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                            .addComponent(nome_produto)
                                            .addComponent(valor_total_estoque)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(28, 28, 28))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(65, 65, 65)))))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(94, 94, 94)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tamanho_produto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(20, 20, 20)
                                                    .addComponent(jLabel16)))
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(categoria_estoque, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(29, 29, 29)
                                                    .addComponent(jLabel3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel4))
                                                .addComponent(condicao_estoque, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addGap(60, 60, 60))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel10)
                                .addGap(76, 293, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(137, 137, 137))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cod_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nome_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(condicao_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel4)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(peso_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(preco_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(categoria_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(valor_total_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(unidade_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addGap(10, 10, 10)
                        .addComponent(tamanho_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void Bt_Voltar_FuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Voltar_FuncionarioActionPerformed
        Estoque.this.dispose();
        Menu_funcionario menuFuncionario = new Menu_funcionario();
        menuFuncionario.setVisible(true);
    }//GEN-LAST:event_Bt_Voltar_FuncionarioActionPerformed

    private void Bt_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_AtualizarActionPerformed
        PreparedStatement statement = null;
        Connection conexao = null;

        String url = "jdbc:mysql://localhost:3307/fashion_foot";
        String usuario =  "ff_lucas";
        String senha = "123456";

       try {

            conexao = DriverManager.getConnection(url, usuario, senha);

            String sql = "UPDATE cadastro_produto SET codigo = ? , nome = ? , condicao = ? , tamanho = ? , unidades = ? , categoria = ? , preco = ? , valor_venda = ? , peso = ? , descricao = ?  where id = ?";

            statement = conexao.prepareStatement(sql);
            statement.setString(1, cod_produto.getText());
            statement.setString(2, nome_produto.getText());
            statement.setString(3, condicao_estoque.getSelectedItem().toString());
            statement.setString(4, tamanho_produto.getSelectedItem().toString());
            statement.setString(5, unidade_estoque.getText());
            statement.setString(6, categoria_estoque.getSelectedItem().toString());
            statement.setString(7, preco_estoque.getText());
            statement.setString(8, valor_total_estoque.getText());
            statement.setString(9, peso_estoque.getText());
            statement.setString(10, descricao_estoque.getText());
            statement.setString(11, txt_ID_Atualizar_CadastroDeProduto.getText());

            int linhasAfetadas = statement.executeUpdate();

            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(rootPane,"Dados atualizados com sucesso!");
                this.PopularJTable("SELECT * FROM cadastro_produto ORDER BY id");
            } else {
                JOptionPane.showMessageDialog(rootPane,"Nenhum dado atualizado.");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_De_Produto.class.getName()).log(Level.SEVERE, null, ex);
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

            String sql = "DELETE from cadastro_produto where id = ?";

            statement = conexao.prepareStatement(sql);
            statement.setString(1,txt_ID_Deletar_CadastroDeProduto.getText());

            int linhasAfetadas = statement.executeUpdate();

            if(linhasAfetadas > 0){
                JOptionPane.showMessageDialog(rootPane,"Dados excluidos com sucesso!");
                this.PopularJTable("SELECT * FROM cadastro_produtos");
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

    private void Select(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Select
        Connection conexao = null;
        PreparedStatement statement = null;

        String url = "jdbc:mysql://localhost:3307/fashion_foot";
        String usuario = "ff_lucas";
        String senha = "123456";
        
        try {
        conexao = DriverManager.getConnection(url, usuario, senha);
        this.PopularJTable("SELECT * FROM cadastro_produto id");
        } catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_Select

    private void Tabela_Estoque(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela_Estoque
        int linha = Tabela_Estoque.getSelectedRow();
        txt_ID_Atualizar_CadastroDeProduto.setText(Tabela_Estoque.getValueAt(linha,0).toString());
        cod_produto.setText(Tabela_Estoque.getValueAt(linha,1).toString());
        nome_produto.setText(Tabela_Estoque.getValueAt(linha,2).toString());
        unidade_estoque.setText(Tabela_Estoque.getValueAt(linha,5).toString());
        preco_estoque.setText(Tabela_Estoque.getValueAt(linha,7).toString());
        valor_total_estoque.setText(Tabela_Estoque.getValueAt(linha,8).toString());
        peso_estoque.setText(Tabela_Estoque.getValueAt(linha,9).toString());
        descricao_estoque.setText(Tabela_Estoque.getValueAt(linha, 10).toString());
    }//GEN-LAST:event_Tabela_Estoque

    private void peso_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peso_estoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_peso_estoqueActionPerformed

    private void cod_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cod_produtoActionPerformed

    private void tamanho_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanho_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tamanho_produtoActionPerformed

    private void nome_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_produtoActionPerformed

    private void preco_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preco_estoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preco_estoqueActionPerformed

    private void valor_total_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor_total_estoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor_total_estoqueActionPerformed

    private void categoria_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoria_estoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoria_estoqueActionPerformed

    private void unidade_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidade_estoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidade_estoqueActionPerformed

    private void txt_ID_Atualizar_CadastroDeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_Atualizar_CadastroDeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_Atualizar_CadastroDeProdutoActionPerformed

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
    private javax.swing.JButton Bt_Voltar_Funcionario;
    private javax.swing.JTable Tabela_Estoque;
    private javax.swing.JComboBox<String> categoria_estoque;
    private javax.swing.JTextField cod_produto;
    private javax.swing.JComboBox<String> condicao_estoque;
    private javax.swing.JTextArea descricao_estoque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nome_produto;
    private javax.swing.JTextField peso_estoque;
    private javax.swing.JTextField preco_estoque;
    private javax.swing.JComboBox<String> tamanho_produto;
    private javax.swing.JTextField txt_ID_Atualizar_CadastroDeProduto;
    private javax.swing.JTextField txt_ID_Deletar_CadastroDeProduto;
    private javax.swing.JTextField unidade_estoque;
    private javax.swing.JTextField valor_total_estoque;
    // End of variables declaration//GEN-END:variables
}
