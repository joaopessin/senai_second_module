package pkg04_01_exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Cadastro extends javax.swing.JFrame {

    public Cadastro() {
        initComponents();
    }

public void PopularJTable(String sql) {
    try
    {
    Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3307/fashion_foot", "ff_lucas", "123456");
    PreparedStatement banco = (PreparedStatement)con.prepareStatement(sql);
    banco.execute();
 
    ResultSet resultado = banco.executeQuery(sql);
 
    DefaultTableModel model =(DefaultTableModel) Tabela.getModel();
    model.setNumRows(0);
 
    while(resultado.next())
    {
       model.addRow(new Object[] 
       { 
        resultado.getString("id"),
        resultado.getString("senha"),
        resultado.getString("nome_completo"),
        resultado.getString("data_nasc"),
        resultado.getString("telefone"),
        resultado.getString("cpf"),
        resultado.getString("email"),
        resultado.getString("estado"),
        resultado.getString("cidade"),
        resultado.getString("rua"),
        resultado.getString("number_casa"),
        resultado.getString("cep")
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
        Update = new javax.swing.JButton();
        Salvar = new javax.swing.JButton();
        bt_entrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        id_delete = new javax.swing.JTextPane();
        jLabel12 = new javax.swing.JLabel();
        Excluir = new javax.swing.JButton();
        id_user = new javax.swing.JTextField();
        senha_user = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                Select(evt);
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

        Update.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

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

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Senha", "Nome", "Data_nasc", "Telefone", "Cpf", "Email", "Estado", "Cidade", "Rua", "Nº", "Cep"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_Cliente(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela);

        jLabel15.setText("Excluir");

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane10.setViewportView(id_delete);

        jLabel12.setText("ID");

        Excluir.setBackground(new java.awt.Color(204, 255, 204));
        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Excluir))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Excluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        id_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_userActionPerformed(evt);
            }
        });

        senha_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senha_userActionPerformed(evt);
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
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel15)))
                .addGap(26, 26, 26))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(senha_user, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(adicionarFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(85, 85, 85))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(Update)
                .addGap(45, 45, 45)
                .addComponent(bt_entrar)
                .addGap(39, 39, 39)
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
                            .addComponent(jLabel13))
                        .addGap(142, 142, 142))
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Update)
                            .addComponent(bt_entrar)
                            .addComponent(Salvar))
                        .addGap(28, 28, 28)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
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

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        Connection conexao = null;
        PreparedStatement statement = null;

        String url = "jdbc:mysql://localhost:3307/fashion_foot";
        String usuario = "ff_lucas";
        String senha = "123456";
        
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            
        String sql = "UPDATE cliente SET senha = ? , nome_completo = ?, data_nasc = ?, telefone = ?, cpf = ?, email = ?, estado = ?, cidade = ?, rua = ?, number_casa = ?, cep = ? where id = ?";
        
        statement = conexao.prepareStatement(sql);
        
        statement.setString(1, senha_user.getText());
        statement.setString(2, name_user.getText());
        statement.setString(3, date_user.getText());
        statement.setString(4, telefone_user.getText());
        statement.setString(5, cpf_user.getText());
        statement.setString(6, email_user.getText());
        statement.setString(7, estado_user.getText());
        statement.setString(8, cidade_user.getText());
        statement.setString(9, rua_user.getText());
        statement.setString(10, num_user.getText());
        statement.setString(11, cep_user.getText());
        statement.setString(12, id_user.getText());
        
        int linhasAfetadas = statement.executeUpdate();
           
        if (linhasAfetadas > 0) {
            System.out.println("Dados atualizados com sucesso!");
            this.PopularJTable("SELECT * FROM cliente id");
            } else {
                System.out.println("Nenhum dado atualizado.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar dados: " + e.getMessage());
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
    }//GEN-LAST:event_UpdateActionPerformed

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
            
            statement.setInt(1, Integer.parseInt(senha_user.getText()));
            statement.setString(2, name_user.getText());
            statement.setInt(3, Integer.parseInt(date_user.getText()));
            statement.setInt(4, Integer.parseInt(telefone_user.getText()));
            statement.setInt(5, Integer.parseInt(cpf_user.getText()));
            statement.setString(6, email_user.getText());
            statement.setString(7, estado_user.getText());
            statement.setString(8, cidade_user.getText());
            statement.setString(9, rua_user.getText());
            statement.setInt(10, Integer.parseInt(num_user.getText()));
            statement.setInt(11, Integer.parseInt(cep_user.getText()));
            
            int linhasAfetadas = statement.executeUpdate();
           
            if (linhasAfetadas > 0) {
                System.out.println("Dados inseridos com sucesso!");
                this.PopularJTable("SELECT * FROM cliente id");
                 bt_entrar.setEnabled(true);
                
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
    }//GEN-LAST:event_SalvarActionPerformed

    private void Bot_Voltar_Para_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot_Voltar_Para_LoginActionPerformed
        Cadastro.this.dispose();
        Layson_Opcoes_de_Conta opcoesConta = new Layson_Opcoes_de_Conta();
        opcoesConta.setVisible(true);        
    }//GEN-LAST:event_Bot_Voltar_Para_LoginActionPerformed

    private void bt_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_entrarActionPerformed
         Cadastro.this.dispose();
         Listagem_Produto listagem = new Listagem_Produto();
         listagem.setVisible(true);
         
    }//GEN-LAST:event_bt_entrarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        Connection conexao = null;
        PreparedStatement statement = null;

        String url = "jdbc:mysql://localhost:3307/fashion_foot";
        String usuario = "ff_lucas";
        String senha = "123456";

        try {
            conexao = DriverManager.getConnection(url, usuario, senha);

            String sql = "DELETE from cliente where id = ?";

            statement = conexao.prepareStatement(sql);

            statement.setString(1, id_delete.getText());

            int linhasAfetadas = statement.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Dados excluidos com sucesso!");
                this.PopularJTable("SELECT * FROM cliente id");
            } else {
                System.out.println("Nenhum dado excluido.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao EXCLUIR dados: " + e.getMessage());
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
    }//GEN-LAST:event_ExcluirActionPerformed

    private void id_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_userActionPerformed

    private void senha_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senha_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senha_userActionPerformed

    private void tabela_Cliente(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_Cliente
        int linha = Tabela.getSelectedRow();
        id_user.setText(Tabela.getValueAt(linha, 0).toString());
        senha_user.setText(Tabela.getValueAt(linha, 1).toString());
        name_user.setText(Tabela.getValueAt(linha, 2).toString());
        date_user.setText(Tabela.getValueAt(linha, 3).toString());
        telefone_user.setText(Tabela.getValueAt(linha, 4).toString());
        cpf_user.setText(Tabela.getValueAt(linha, 5).toString());
        email_user.setText(Tabela.getValueAt(linha, 6).toString());
        estado_user.setText(Tabela.getValueAt(linha, 7).toString());
        cidade_user.setText(Tabela.getValueAt(linha, 8).toString());
        rua_user.setText(Tabela.getValueAt(linha, 9).toString());
        num_user.setText(Tabela.getValueAt(linha, 10).toString());
        cep_user.setText(Tabela.getValueAt(linha, 11).toString());
    }//GEN-LAST:event_tabela_Cliente

    private void Select(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Select
       bt_entrar.setEnabled(false);
        
        Connection conexao = null;
        PreparedStatement statement = null;

        String url = "jdbc:mysql://localhost:3307/fashion_foot";
        String usuario = "ff_lucas";
        String senha = "123456";
        
        try {
        conexao = DriverManager.getConnection(url, usuario, senha);
        this.PopularJTable("SELECT * FROM cliente id");
        } catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_Select

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bot_Voltar_Para_Login;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Salvar;
    private javax.swing.JTable Tabela;
    private javax.swing.JButton Update;
    private javax.swing.JButton adicionarFoto;
    private javax.swing.JButton bt_entrar;
    private javax.swing.JTextField cep_user;
    private javax.swing.JTextField cidade_user;
    private javax.swing.JTextField cpf_user;
    private javax.swing.JTextField date_user;
    private javax.swing.JTextField email_user;
    private javax.swing.JTextField estado_user;
    private javax.swing.JTextPane id_delete;
    private javax.swing.JTextField id_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JTextField name_user;
    private javax.swing.JTextField num_user;
    private javax.swing.JTextField rua_user;
    private javax.swing.JTextField senha_user;
    private javax.swing.JTextField telefone_user;
    // End of variables declaration//GEN-END:variables
}
