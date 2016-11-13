/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JOptionPane;
import utilitarios.Modelo_jTable;
import utilitarios.ProfessorDAO;
import utilitarios.RestricaoDAO;


/**
 *
 * @author Diego
 */
public class Editar_Restricao extends javax.swing.JFrame {

    /**
     * Creates new form Editar_Restricao
     */
    public Editar_Restricao() {
        initComponents();
        
        ProfessorDAO prof = new ProfessorDAO();
        jTable1.setModel(new Modelo_jTable("SELECT cod, dia, turno FROM restricao WHERE codProf="+prof.buscar_Ativo()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("siscoor?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        restricaoQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT r FROM Restricao r");
        restricaoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : restricaoQuery.getResultList();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        rbSegunda = new javax.swing.JRadioButton();
        rbTerca = new javax.swing.JRadioButton();
        rbQuarta = new javax.swing.JRadioButton();
        rbQuinta = new javax.swing.JRadioButton();
        rbSexta = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        rbMatutino = new javax.swing.JRadioButton();
        rbVespertino = new javax.swing.JRadioButton();
        rbNoturno = new javax.swing.JRadioButton();
        btVoltar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Restrição");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione a Restrição"));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, restricaoList, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cod}"));
        columnBinding.setColumnName("Cod");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dia}"));
        columnBinding.setColumnName("Dia");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${turno}"));
        columnBinding.setColumnName("Turno");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dia"));

        buttonGroup1.add(rbSegunda);
        rbSegunda.setText("Segunda-feira");

        buttonGroup1.add(rbTerca);
        rbTerca.setText("Terça-feira");

        buttonGroup1.add(rbQuarta);
        rbQuarta.setText("Quarta-feira");

        buttonGroup1.add(rbQuinta);
        rbQuinta.setText("Quinta-feira");

        buttonGroup1.add(rbSexta);
        rbSexta.setText("Sexta-feira");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbSegunda)
                .addGap(18, 18, 18)
                .addComponent(rbTerca)
                .addGap(18, 18, 18)
                .addComponent(rbQuarta)
                .addGap(18, 18, 18)
                .addComponent(rbQuinta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(rbSexta)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSegunda)
                    .addComponent(rbTerca)
                    .addComponent(rbQuarta)
                    .addComponent(rbQuinta)
                    .addComponent(rbSexta))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Turno"));

        rbMatutino.setText("Matutino");

        rbVespertino.setText("Vespertino");

        rbNoturno.setText("Noturno");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbMatutino)
                    .addComponent(rbVespertino)
                    .addComponent(rbNoturno))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbMatutino)
                .addGap(4, 4, 4)
                .addComponent(rbVespertino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE)
                .addComponent(rbNoturno)
                .addGap(7, 7, 7))
        );

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar Restrição");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btSalvar)
                                .addGap(66, 66, 66))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btVoltar)
                                .addGap(91, 91, 91)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btVoltar)
                        .addGap(27, 27, 27)
                        .addComponent(btSalvar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        RestricaoDAO restriDAO = new RestricaoDAO();
        ProfessorDAO professorDAO = new ProfessorDAO();
        utilitarios.Restricao restricao = new utilitarios.Restricao();
        
        boolean dia=false, turno=false;
        int linha, cod;
        String confirm;
        
        linha=jTable1.getSelectedRow();
        
        cod=(int) jTable1.getValueAt(linha, 0);
        
        if(rbSegunda.isSelected())
        {
            restricao.setDia("Segunda-feira");
            dia=true;
        }
        
        if(rbTerca.isSelected())
        {
            restricao.setDia("Terça-feira");
            dia=true;
        }
        
        if(rbQuarta.isSelected())
        {
            restricao.setDia("Quarta-feira");
            dia=true;
        }
        
        if(rbQuinta.isSelected())
        {
            restricao.setDia("Quinta-feira");
            dia=true;
        }
        
        if(rbSexta.isSelected())
        {
            restricao.setDia("Sexta-feira");
            dia=true;
        }
        
        if(rbMatutino.isSelected())
        {
            restricao.setTurno("Matutino");
            turno=true;
        }
        
        if(rbVespertino.isSelected())
        {
            restricao.setTurno("Vespertino");
            turno=true;
        }
        
        if(rbNoturno.isSelected())
        {
            restricao.setTurno("Noturno");
            turno=true;
        }
        
        restricao.setCodProf(professorDAO.buscar_Ativo());
        
        if(dia==false || turno==false)
        {
            JOptionPane.showMessageDialog(rootPane, "Selecione o Dia e o Turno na Restrição que Deseja Modificar", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
        if(dia==true && turno==true)
        {
            if((restriDAO.buscar_Repeticao(restricao.getDia(), restricao.getTurno(), restricao.getCodProf()))==true)
            {
                JOptionPane.showMessageDialog(rootPane, "Restrição ja Existente", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                confirm=JOptionPane.showInputDialog("Digite \"Sim\" Para Confirmar ");

                if(confirm.equalsIgnoreCase("Sim"))
                {
                    dia=false;
                    turno=false;

                    restriDAO.atualizar(restricao.getDia(), restricao.getTurno(), cod);

                    JOptionPane.showMessageDialog(rootPane, "Restrição Alterada com Sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

                    ProfessorDAO professor = new ProfessorDAO();
                    jTable1.setModel(new Modelo_jTable("SELECT cod, dia, turno FROM restricao WHERE codProf="+professor.buscar_Ativo()));
                }      
            }   
        }
    }//GEN-LAST:event_btSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(Editar_Restricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar_Restricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar_Restricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar_Restricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar_Restricao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbMatutino;
    private javax.swing.JRadioButton rbNoturno;
    private javax.swing.JRadioButton rbQuarta;
    private javax.swing.JRadioButton rbQuinta;
    private javax.swing.JRadioButton rbSegunda;
    private javax.swing.JRadioButton rbSexta;
    private javax.swing.JRadioButton rbTerca;
    private javax.swing.JRadioButton rbVespertino;
    private java.util.List<gui.Restricao> restricaoList;
    private javax.persistence.Query restricaoQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
