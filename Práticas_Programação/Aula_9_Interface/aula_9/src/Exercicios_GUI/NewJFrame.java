
package Exercicios_GUI;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;


public class NewJFrame extends javax.swing.JFrame {
  
    Vector<String> nomes = new Vector();
    File arquivo = new File("arquivo.txt");
    
    public NewJFrame() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EscolhaProfissao = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextoNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextoIdade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BotaoFeminino = new javax.swing.JRadioButton();
        BotaoMasculino = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        TextoNacionalidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        EscolhaEmail = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PessoasCad = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DetalhePessoa = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EscolhaProfissao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Programador", "Analista", "Jogador de Futebol",
            "Bombeiro","Policial","Guarda","Empresário","Faxineiro","Estagiário","Outro" }));

jLabel1.setText("PROFISSÃO: ");

jLabel2.setText("NOME:");

jLabel3.setText("IDADE:");

jLabel4.setText("SEXO:");

BotaoFeminino.setText("Feminino");

BotaoMasculino.setText("Masculino");

jLabel5.setText("NACIONALIDADE:");

jLabel6.setText("RECEBER EMAIL?");

EscolhaEmail.setText("SIM");

jLabel7.setText("PESSOAS CADASTRADAS");

PessoasCad.setModel(new javax.swing.AbstractListModel<String>() {
    String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
    public int getSize() { return strings.length; }
    public String getElementAt(int i) { return strings[i]; }
    });
    jScrollPane1.setViewportView(PessoasCad);

    jLabel8.setText("DETALHE PESSOA");

    DetalhePessoa.setColumns(20);
    DetalhePessoa.setRows(5);
    jScrollPane2.setViewportView(DetalhePessoa);

    jButton1.setText("Salvar");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exercicios_GUI/1200x630bb.jpg"))); // NOI18N
    jLabel9.setText("jLabel9");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 113, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(BotaoFeminino)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(BotaoMasculino))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TextoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(EscolhaEmail))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TextoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(EscolhaProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TextoNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(143, 143, 143)
                            .addComponent(jButton1)
                            .addGap(86, 86, 86)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7)
                        .addComponent(jScrollPane1)
                        .addComponent(jLabel8)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))))
            .addGap(104, 104, 104))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jLabel7)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(BotaoFeminino)
                        .addComponent(BotaoMasculino))
                    .addGap(108, 108, 108)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(TextoNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(EscolhaEmail))
                    .addGap(38, 38, 38)
                    .addComponent(jButton1))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TextoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel1)
                        .addComponent(EscolhaProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        Pessoa p = new Pessoa();
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(BotaoFeminino);
        grupo.add(BotaoMasculino);
        
        p.setNome(TextoNome.getText());
        p.setIdade(Integer.parseInt(TextoIdade.getText()));
        
        
        if (BotaoFeminino.isSelected())
            p.setSexo('f');
        else
            p.setSexo('m');
        
       
        if (EscolhaEmail.isSelected()) 
            p.setEmail(true);
        else
            p.setEmail(false);
        
        p.setProfissao((String)EscolhaProfissao.getSelectedItem());
        p.setNacionalidade(TextoNacionalidade.getText());
        
        GerenciarPessoas.adicionarPessoas(p);
        nomes.add(p.retornarNome());
        PessoasCad.setListData(nomes);
        DetalhePessoa.append(p.toString()+"\n");
        
        try {
            FileWriter fw = new FileWriter(arquivo);
            
            fw.write(GerenciarPessoas.listarPessoas()+"\r\n");
            fw.flush();
        } catch (IOException ex) {
            System.out.println("Erro: "+ex);
        }
                
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(() -> {
            new NewJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BotaoFeminino;
    private javax.swing.JRadioButton BotaoMasculino;
    private javax.swing.JTextArea DetalhePessoa;
    private javax.swing.JCheckBox EscolhaEmail;
    private javax.swing.JComboBox<String> EscolhaProfissao;
    private javax.swing.JList<String> PessoasCad;
    private javax.swing.JTextField TextoIdade;
    private javax.swing.JTextField TextoNacionalidade;
    private javax.swing.JTextField TextoNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
