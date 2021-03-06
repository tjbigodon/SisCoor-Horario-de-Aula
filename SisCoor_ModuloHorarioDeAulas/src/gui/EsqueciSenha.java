/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.util.ArrayList;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import utilitarios.AreaAtuacao;
import utilitarios.AreaAtuacaoDAO;
import utilitarios.Criptografia;
import utilitarios.Perguntas;
import utilitarios.PerguntasDAO;
import utilitarios.Professor;
import utilitarios.ProfessorDAO;

/**
 *
 * @author Diego
 */
public class EsqueciSenha extends javax.swing.JFrame {

    /**
     * Creates new form EsqueciSenha
     */
    public EsqueciSenha() {
        initComponents();
        

    }
    public void addItem(String nomeItem) {
        comboPergunta.addItem(nomeItem);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboPergunta = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFresposta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        jLerro = new javax.swing.JLabel();
        jTnovaSenha = new javax.swing.JPasswordField();
        jTComfSenha = new javax.swing.JPasswordField();
        comboMes = new javax.swing.JComboBox();
        comboDia = new javax.swing.JComboBox();
        comboAno = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Esqueci minha senha");

        jLabel1.setText("Usuário:");

        jTUser.setToolTipText("Digite o nome de usuário cadastrado!");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Esqueci minha senha");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/lock-icon.png"))); // NOI18N

        comboPergunta.setToolTipText("Selecione a pergunta que você respondeu no cadastro!");

        jLabel3.setText("Pergunta:");

        jLabel5.setText("Data de Nascimento:");

        jLabel6.setText("Resposta:");

        jTFresposta.setToolTipText("Digite a mesma resposta do momento do cadastro!");

        jLabel7.setText("Nova Senha:");

        jLabel8.setText("Confirmar Senha:");

        btVoltar.setMnemonic('v');
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btSalvar.setMnemonic('s');
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        jLerro.setBackground(new java.awt.Color(255, 255, 255));
        jLerro.setForeground(new java.awt.Color(255, 0, 0));

        jTnovaSenha.setToolTipText("Essa será sua nova senha.");

        comboMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mês", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        comboMes.setToolTipText("Digite o seu mês de nascimento!");
        comboMes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboMesItemStateChanged(evt);
            }
        });

        comboDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dia" }));
        comboDia.setToolTipText("Digite seu dia de nascimento!");

        comboAno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ano" }));
        comboAno.setToolTipText("Digite seu ano de nascimento!");
        comboAno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboAnoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(159, 159, 159))))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLerro)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btVoltar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSalvar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTUser)
                                            .addComponent(comboPergunta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTFresposta)
                                            .addComponent(jTnovaSenha)
                                            .addComponent(jTComfSenha)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(comboAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFresposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTnovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTComfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLerro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btSalvar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        TelaLogin tl = new TelaLogin();
        tl.setDefaultCloseOperation(EXIT_ON_CLOSE);
        tl.setLocationRelativeTo(this);
        tl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    public void addItemAno(int ano){
        comboAno.addItem(ano);
    }
    
    public void addItemDia(int dia){
        comboDia.addItem(dia);
    }
    
    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        jLerro.setText("");
        jLerro.setForeground(Color.red);
        
        Professor professor = new Professor();
        ProfessorDAO professorDAO = new ProfessorDAO();
        PerguntasDAO perguntasDAO = new PerguntasDAO();
        
        int codPergunta=0, codProf=0, codPerguntaProf=0;
        String pergunta;
        boolean erro;
        
        professor.setUsername(jTUser.getText());
        professor.setData_de_nascimento(comboDia.getSelectedItem().toString()+"/"+comboMes.getSelectedItem().toString()+"/"+comboAno.getSelectedItem().toString());
        
        codProf=professorDAO.buscar(professor);
        
        if(jTUser.getText().isEmpty() || comboAno.getSelectedIndex()==0 || comboMes.getSelectedIndex()==0 || comboDia.getSelectedIndex()==0 || jTFresposta.getText().isEmpty() || jTnovaSenha.getPassword().toString().isEmpty() || jTComfSenha.getPassword().toString().isEmpty()){
            jLerro.setText("Preencha todos os campos!");
        }
        else{
            if(codProf>0)
            {
                professor.setCod(codProf);
                codPergunta=perguntasDAO.buscar(String.valueOf(comboPergunta.getSelectedItem()));
                codPerguntaProf=professorDAO.buscarCodPerg(professor);

                if(codPergunta==codPerguntaProf)
                {
                    pergunta=(Criptografia.criptografar(jTFresposta.getText()));

                    erro=professorDAO.buscarPerg(pergunta, codProf);

                    if(erro==true)
                    {

                        if(String.valueOf(jTnovaSenha.getPassword()).equals(String.valueOf(jTComfSenha.getPassword())))
                        {
                            professor.setSenha(Criptografia.criptografar(String.valueOf(jTnovaSenha.getPassword())));
                            professorDAO.EsqueciSenha(professor);
                            jLerro.setForeground(Color.BLUE);
                            jLerro.setText("Alteração feita com sucesso!");

                            jTUser.setText("");
                            comboDia.setSelectedIndex(0);
                            comboMes.setSelectedIndex(0);
                            comboAno.setSelectedIndex(0);
                            jTFresposta.setText("");
                            jTnovaSenha.setText("");
                            jTComfSenha.setText("");
                        }

                        else if(String.valueOf(jTnovaSenha.getPassword()).equals("") && String.valueOf(jTComfSenha.getPassword()).equals(""))
                        {
                            jLerro.setText("Por favor, Digite a senha corretamente");
                            jTnovaSenha.setText("");
                            jTComfSenha.setText("");
                        }

                        else
                        {
                            jLerro.setText("Por favor, Digite a senha corretamente");
                            jTnovaSenha.setText("");
                            jTComfSenha.setText("");
                        }
                    }
                    else
                    {
                        jLerro.setText("Resposta incorreta!");
                        jTFresposta.setText("");
                    }
                }
                else
                {
                    jLerro.setText("Pergunta incorreta!");
                }
            }

            else
            {
                jLerro.setText("Usuario ou data de nascimento não encontrado!");
                jTUser.setText("");
                comboDia.setSelectedIndex(0);
                comboAno.setSelectedIndex(0);
                comboMes.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void comboMesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboMesItemStateChanged
        comboDia.removeAllItems();
        comboDia.addItem("Dia");

        if(comboMes.getSelectedIndex()==2){

            if(comboAno.getSelectedIndex()!=0&&Integer.parseInt(comboAno.getSelectedItem().toString())%400==0){
                for(int i = 1;i<=29;i++)
                this.addItemDia(i);
            } else if((comboAno.getSelectedIndex()!=0&&Integer.parseInt(comboAno.getSelectedItem().toString())%4==0)&&(comboAno.getSelectedIndex()!=0&&Integer.parseInt(comboAno.getSelectedItem().toString())%100!=0)){
                for(int i = 1;i<=29;i++)
                this.addItemDia(i);
            } else{
                for(int i = 1;i<=28;i++)
                this.addItemDia(i);
            }
        }
        else if(comboMes.getSelectedIndex()%2==0&&comboMes.getSelectedIndex()<8&&comboMes.getSelectedIndex()!=0){
            for(int i = 1;i<=30;i++)
            this.addItemDia(i);
        }
        else if(comboMes.getSelectedIndex()%2==0&&comboMes.getSelectedIndex()>8&&comboMes.getSelectedIndex()!=0){
            for(int i = 1;i<=31;i++)
            this.addItemDia(i);
        }
        else if(comboMes.getSelectedIndex()%2!=0&&comboMes.getSelectedIndex()<8&&comboMes.getSelectedIndex()!=0){
            for(int i = 1;i<=31;i++)
            this.addItemDia(i);
        }
        else if(comboMes.getSelectedIndex()%2!=0&&comboMes.getSelectedIndex()>8&&comboMes.getSelectedIndex()!=0){
            for(int i = 1;i<=30;i++)
            this.addItemDia(i);
        }
    }//GEN-LAST:event_comboMesItemStateChanged

    private void comboAnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboAnoItemStateChanged
        comboDia.removeAllItems();
        comboDia.addItem("Dia");
        comboDia.setSelectedIndex(0);
        if(comboAno.getSelectedIndex()!=0){
            if(comboMes.getSelectedIndex()==2){
                if((Integer.parseInt(comboAno.getSelectedItem().toString())%400==0)||(Integer.parseInt(comboAno.getSelectedItem().toString())%4==0&&Integer.parseInt(comboAno.getSelectedItem().toString())%100!=0)){
                    for(int i = 1;i<=29;i++)
                        this.addItemDia(i);
                } else{
                    for(int i = 1;i<=28;i++)
                        this.addItemDia(i);
                }
            }
            else if(comboMes.getSelectedIndex()%2==0&&comboMes.getSelectedIndex()<8&&comboMes.getSelectedIndex()!=0){
            for(int i = 1;i<=30;i++)
                this.addItemDia(i);
            }
            else if(comboMes.getSelectedIndex()%2==0&&comboMes.getSelectedIndex()>8&&comboMes.getSelectedIndex()!=0){
                for(int i = 1;i<=31;i++)
                    this.addItemDia(i);
            }
            else if(comboMes.getSelectedIndex()%2!=0&&comboMes.getSelectedIndex()<8&&comboMes.getSelectedIndex()!=0){
                for(int i = 1;i<=31;i++)
                    this.addItemDia(i);
            }
            else if(comboMes.getSelectedIndex()%2!=0&&comboMes.getSelectedIndex()>8&&comboMes.getSelectedIndex()!=0){
                for(int i = 1;i<=30;i++)
                    this.addItemDia(i);
            }
        }
    }//GEN-LAST:event_comboAnoItemStateChanged

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
            java.util.logging.Logger.getLogger(EsqueciSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EsqueciSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EsqueciSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EsqueciSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new EsqueciSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox comboAno;
    private javax.swing.JComboBox comboDia;
    private javax.swing.JComboBox comboMes;
    private javax.swing.JComboBox comboPergunta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLerro;
    private javax.swing.JPasswordField jTComfSenha;
    private javax.swing.JTextField jTFresposta;
    private javax.swing.JTextField jTUser;
    private javax.swing.JPasswordField jTnovaSenha;
    // End of variables declaration//GEN-END:variables
}
