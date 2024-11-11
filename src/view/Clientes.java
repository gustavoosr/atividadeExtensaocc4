/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import com.mysql.cj.jdbc.Blob;
import com.mysql.cj.xdevapi.PreparableStatement;
import connection.ConnectionFactory;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Cliente;
import model.dao.ClienteDAO;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author gusta
 */
public class Clientes extends javax.swing.JFrame {
    private int tamanho;
    private boolean ftCarregada = false;
    private String fileName;
    private String locImg;
    private String tipoImg;
    private int tamImg;
    private FileInputStream fis;

    public Clientes() {
        initComponents();
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaObs = new javax.swing.JTextArea();
        lblFoto = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblFotoImagem = new javax.swing.JLabel();
        lblObservacao = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblTraco = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        lblCep = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblRua = new javax.swing.JLabel();
        lblComplemento = new javax.swing.JLabel();
        botaoAdicionar = new javax.swing.JButton();
        txtCPF = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        txtCEP = new javax.swing.JFormattedTextField();
        botaoExcluir = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Cliente");
        setLocation(new java.awt.Point(600, 100));
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Linux Biolinum G", 3, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitulo.setIcon(new javax.swing.ImageIcon("C:\\Users\\gusta\\Downloads\\clientes.png")); // NOI18N
        lblTitulo.setText("Clientes");
        lblTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        panelPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        panelPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lblID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblID.setText("ID");

        txtID.setBackground(new java.awt.Color(153, 153, 153));
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtID.setToolTipText("ID Cadastro");
        txtID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtID.setEnabled(false);
        txtID.setOpaque(true);
        txtID.setRequestFocusEnabled(false);
        txtID.setVerifyInputWhenFocusTarget(false);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtNome.setBackground(new java.awt.Color(153, 153, 153));
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNome.setToolTipText("Nome");
        txtNome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtNome.setVerifyInputWhenFocusTarget(false);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeKeyTyped(evt);
            }
        });

        txtEmail.setBackground(new java.awt.Color(153, 153, 153));
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.setToolTipText("Email");
        txtEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtEmail.setVerifyInputWhenFocusTarget(false);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtAreaObs.setBackground(new java.awt.Color(153, 153, 153));
        txtAreaObs.setColumns(20);
        txtAreaObs.setForeground(new java.awt.Color(255, 255, 255));
        txtAreaObs.setRows(5);
        txtAreaObs.setToolTipText("Observação");
        txtAreaObs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtAreaObs.setSelectionColor(new java.awt.Color(153, 153, 153));
        txtAreaObs.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(txtAreaObs);

        lblFoto.setBackground(new java.awt.Color(153, 153, 153));
        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto.setIcon(new javax.swing.ImageIcon("C:\\Users\\gusta\\Downloads\\imagem.png")); // NOI18N
        lblFoto.setToolTipText("Imagem");
        lblFoto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lblFoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblFoto.setOpaque(true);

        lblNome.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblNome.setText("Nome");

        lblCPF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblCPF.setText("CPF");

        lblEmail.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblEmail.setText("E-mail");

        lblTelefone.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblTelefone.setText("Celular");

        lblFotoImagem.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblFotoImagem.setText("Foto/Imagem");

        lblObservacao.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblObservacao.setText("Observação");

        lblEndereco.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lblEndereco.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEndereco.setText("Endereço");

        lblTraco.setText("────────────────────────────────────────────────────────────────────────────────────────────────");

        txtNumero.setBackground(new java.awt.Color(153, 153, 153));
        txtNumero.setForeground(new java.awt.Color(255, 255, 255));
        txtNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumero.setToolTipText("Número");
        txtNumero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtNumero.setVerifyInputWhenFocusTarget(false);
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });

        txtRua.setBackground(new java.awt.Color(153, 153, 153));
        txtRua.setForeground(new java.awt.Color(255, 255, 255));
        txtRua.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRua.setToolTipText("Rua");
        txtRua.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtRua.setVerifyInputWhenFocusTarget(false);

        txtComplemento.setBackground(new java.awt.Color(153, 153, 153));
        txtComplemento.setForeground(new java.awt.Color(255, 255, 255));
        txtComplemento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtComplemento.setToolTipText("Complemento");
        txtComplemento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtComplemento.setVerifyInputWhenFocusTarget(false);

        lblCep.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblCep.setText("CEP");

        lblNumero.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblNumero.setText("Número");

        lblRua.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblRua.setText("Rua");

        lblComplemento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblComplemento.setText("Complemento");

        botaoAdicionar.setBackground(new java.awt.Color(153, 153, 153));
        botaoAdicionar.setText("Adicionar Foto");
        botaoAdicionar.setToolTipText("Adicionar Foto");
        botaoAdicionar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        botaoAdicionar.setFocusPainted(false);
        botaoAdicionar.setVerifyInputWhenFocusTarget(false);
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });

        txtCPF.setBackground(new java.awt.Color(153, 153, 153));
        txtCPF.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtCPF.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCPF.setToolTipText("CPF");
        txtCPF.setVerifyInputWhenFocusTarget(false);

        txtCelular.setBackground(new java.awt.Color(153, 153, 153));
        txtCelular.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtCelular.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCelular.setToolTipText("Celular");

        txtCEP.setBackground(new java.awt.Color(153, 153, 153));
        txtCEP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtCEP.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCEP.setToolTipText("CEP");
        txtCEP.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCPF)
                .addGap(250, 250, 250)
                .addComponent(lblEmail)
                .addGap(139, 139, 139))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(lblTraco, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoAdicionar))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblObservacao)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(lblTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblFotoImagem)
                                .addGap(116, 116, 116))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(52, 52, 52))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEndereco)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRua))
                        .addGap(147, 147, 147)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblComplemento)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblID))
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCEP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCep, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(155, 155, 155)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumero)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(lblID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefone)
                            .addComponent(lblFotoImagem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(lblCPF)
                            .addComponent(lblEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)))
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelPrincipalLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblObservacao)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoAdicionar)
                .addGap(2, 2, 2)
                .addComponent(lblEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTraco, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCep)
                    .addComponent(lblNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRua)
                    .addComponent(lblComplemento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
        );

        botaoExcluir.setIcon(new javax.swing.ImageIcon("C:\\Users\\gusta\\Downloads\\excluir.png")); // NOI18N
        botaoExcluir.setRequestFocusEnabled(false);
        botaoExcluir.setRolloverEnabled(false);
        botaoExcluir.setVerifyInputWhenFocusTarget(false);

        botaoSalvar.setIcon(new javax.swing.ImageIcon("C:\\Users\\gusta\\Downloads\\disquete-de-nuvem.png")); // NOI18N
        botaoSalvar.setToolTipText("Salvar");
        botaoSalvar.setFocusPainted(false);
        botaoSalvar.setRequestFocusEnabled(false);
        botaoSalvar.setRolloverEnabled(false);
        botaoSalvar.setVerifyInputWhenFocusTarget(false);
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\gusta\\Downloads\\editar (3).png")); // NOI18N
        botaoEditar.setToolTipText("Editar");
        botaoEditar.setRequestFocusEnabled(false);
        botaoEditar.setRolloverEnabled(false);
        botaoEditar.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarActionPerformed

        carregarIMG();
    }//GEN-LAST:event_botaoAdicionarActionPerformed

    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
        int limite = 75;
        if (txtNome.getText().length() > limite) {
            evt.consume();
        }    }//GEN-LAST:event_txtNomeKeyTyped

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
         int limite = 10;
        if (txtNome.getText().length() > limite) {
            evt.consume();
        }       }//GEN-LAST:event_txtNumeroKeyTyped

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed

        Cliente c = new Cliente();
        ClienteDAO dao = new ClienteDAO();
       c.setNome(txtNome.getText());
       c.setCpf(txtCPF.getText());
       c.setEmail(txtEmail.getText());
       c.setTelefone(txtCelular.getText());
       c.setObservacao(txtAreaObs.getText());
       c.setCep(txtCEP.getText());
       c.setRua(txtRua.getText());
       c.setNumero(txtNumero.getText());
       c.setComplemento(txtComplemento.getText());
       salvarImg();
       dao.create(c);
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void carregarIMG(){
    JFileChooser jfc = new JFileChooser();
        jfc.setDialogTitle("Abrir Arquivo");
        jfc.setFileFilter(new FileNameExtensionFilter("Arquivo de Imagem (*.PNG,*.JPG,*.JPEG)", "png", "jpg", "jpeg"));
        int result = jfc.showOpenDialog(this);
        if(result == JFileChooser.APPROVE_OPTION){
          try{
              File selectedFile = jfc.getSelectedFile();
              fis = new FileInputStream(jfc.getSelectedFile());
              tamanho =  (int) jfc.getSelectedFile().length();
              Image foto = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH);
              lblFoto.setIcon(new ImageIcon(foto));
              lblFoto.updateUI();
              fileName = selectedFile.getName();
              tamImg = (int) selectedFile.length();
              locImg = selectedFile.getPath();
              tipoImg = fileName.substring(fileName.lastIndexOf(".") + 1);
              fis = new FileInputStream(selectedFile);
              
          }catch(Exception e){
               JOptionPane.showMessageDialog(null, "Erro ao subir o arquivo, tente novamente!!");

          }
        }
    }
    private void salvarImg(){
         if (fis == null) {
            botaoSalvar.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Selecione uma imagem primeiro!!");
            return; // Sai do método se fis for nulo
        }
        String insert = "insert into iup_picture (imagem) values (?,)";
        try {

            Connection con = ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement(insert);
            pst.setBlob(1, fis, tamanho);
            int confirma = pst.executeUpdate();
            if (confirma == 1) {
                JOptionPane.showMessageDialog(null, "Imagem Salva no banco de dados!!");
                //resetar();
            } else {
                JOptionPane.showMessageDialog(null, "Erro! Não foi possível salvar a imagem.");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblFotoImagem;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblObservacao;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTraco;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextArea txtAreaObs;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables
}
