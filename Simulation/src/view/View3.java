/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import model.Espacio;
import model.MetodoLumenes;
import model.TipoAmbiente;
import model.TipoSistemaIluminacion;
import model.TiposEspacios;
import model.TiposLamparas;

/**
 *
 * @author felipe
 */
public class View3 extends javax.swing.JFrame {

    /**
     * Creates new form View3
     */
    
    
    public int floors;
    
    
    public View3() 
    {
        setResizable(false);
        setLocationRelativeTo(null);
        initComponents();
    }
    
    
    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox<>();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        campo5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campo6 = new javax.swing.JTextField();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLabel12 = new javax.swing.JLabel();
        campo3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        campo4 = new javax.swing.JTextField();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jLabel14 = new javax.swing.JLabel();
        campo1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        campo2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        combo3 = new javax.swing.JComboBox<>();
        combo5 = new javax.swing.JComboBox<>();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(108, 131, 132));

        jLabel2.setFont(new java.awt.Font("Fira Code", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 249, 255));
        jLabel2.setText("Please, type the number of floors");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 238, 235)));

        jButton3.setBackground(new java.awt.Color(0, 255, 249));
        jButton3.setFont(new java.awt.Font("Fira Code", 1, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(108, 131, 132));
        jButton3.setText("Next Floor");
        jButton3.setBorderPainted(false);
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 255, 249));
        jButton4.setFont(new java.awt.Font("Fira Code", 1, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(108, 131, 132));
        jButton4.setText("Add");
        jButton4.setBorderPainted(false);
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Fira Code", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 249, 255));
        jLabel9.setText("Area type");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 238, 235)));

        combo1.setFont(new java.awt.Font("Fira Code", 0, 12)); // NOI18N
        combo1.setForeground(new java.awt.Color(108, 131, 132));
        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SALA_DESCANSO", "PASILLO", "RECEPCION", "SALA_CONFERENCIAS", "SALA_ESPERA", "HALL", "SALONES" }));
        combo1.setToolTipText("");
        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 246)));
        jLayeredPane1.setForeground(new java.awt.Color(0, 255, 246));

        jLabel1.setFont(new java.awt.Font("Fira Code", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 249, 255));
        jLabel1.setText("Heigth");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 238, 235)));

        campo5.setBackground(new java.awt.Color(254, 254, 254));
        campo5.setFont(new java.awt.Font("Fira Code", 1, 16)); // NOI18N
        campo5.setForeground(new java.awt.Color(108, 131, 132));
        campo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo5ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Fira Code", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 249, 255));
        jLabel7.setText("Light displacement");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 238, 235)));

        campo6.setBackground(new java.awt.Color(254, 254, 254));
        campo6.setFont(new java.awt.Font("Fira Code", 1, 16)); // NOI18N
        campo6.setForeground(new java.awt.Color(108, 131, 132));
        campo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo6ActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(campo5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(campo6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo6, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo5, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap())))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(campo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel7)
                .addGap(33, 33, 33)
                .addComponent(campo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 246)));
        jLayeredPane3.setForeground(new java.awt.Color(0, 255, 246));

        jLabel12.setFont(new java.awt.Font("Fira Code", 1, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 249, 255));
        jLabel12.setText("Lenght");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 238, 235)));

        campo3.setBackground(new java.awt.Color(254, 254, 254));
        campo3.setFont(new java.awt.Font("Fira Code", 1, 16)); // NOI18N
        campo3.setForeground(new java.awt.Color(108, 131, 132));
        campo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo3ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Fira Code", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 249, 255));
        jLabel13.setText("Light sources");
        jLabel13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 238, 235)));

        campo4.setBackground(new java.awt.Color(254, 254, 254));
        campo4.setFont(new java.awt.Font("Fira Code", 1, 16)); // NOI18N
        campo4.setForeground(new java.awt.Color(108, 131, 132));
        campo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo4ActionPerformed(evt);
            }
        });

        jLayeredPane3.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(campo3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(campo4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo4, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(50, 50, 50))))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel12)
                .addGap(31, 31, 31)
                .addComponent(campo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel13)
                .addGap(30, 30, 30)
                .addComponent(campo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 246)));
        jLayeredPane4.setForeground(new java.awt.Color(0, 255, 246));

        jLabel14.setFont(new java.awt.Font("Fira Code", 1, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 249, 255));
        jLabel14.setText("Width");
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 238, 235)));

        campo1.setBackground(new java.awt.Color(254, 254, 254));
        campo1.setFont(new java.awt.Font("Fira Code", 1, 16)); // NOI18N
        campo1.setForeground(new java.awt.Color(108, 131, 132));
        campo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Fira Code", 1, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 249, 255));
        jLabel15.setText("Working Area");
        jLabel15.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 238, 235)));

        campo2.setBackground(new java.awt.Color(254, 254, 254));
        campo2.setFont(new java.awt.Font("Fira Code", 1, 16)); // NOI18N
        campo2.setForeground(new java.awt.Color(108, 131, 132));
        campo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo2ActionPerformed(evt);
            }
        });

        jLayeredPane4.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(campo1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(campo2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel14))
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel14)
                .addGap(31, 31, 31)
                .addComponent(campo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel15)
                .addGap(33, 33, 33)
                .addComponent(campo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Fira Code", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 249, 255));
        jLabel10.setText("Ilumination System");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 238, 235)));

        jLabel11.setFont(new java.awt.Font("Fira Code", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 249, 255));
        jLabel11.setText("Ambient type");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 238, 235)));

        combo3.setFont(new java.awt.Font("Fira Code", 0, 12)); // NOI18N
        combo3.setForeground(new java.awt.Color(108, 131, 132));
        combo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AMBIENTE_LIMPIO", "AMBIENTE_SUCIO" }));

        combo5.setFont(new java.awt.Font("Fira Code", 0, 12)); // NOI18N
        combo5.setForeground(new java.awt.Color(108, 131, 132));
        combo5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ILUMINACION_DIRECTA", "ILUMINACION_INDIRECTA" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(283, 283, 283)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(264, 264, 264)
                                .addComponent(combo3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 79, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(combo5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(53, 53, 53))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(127, 127, 127)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(combo5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo5ActionPerformed

    private void campo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if (evt.getSource() == jButton3) 
        {
            if (campo1.getText().equals("") || campo2.getText().equals("") || campo3.getText().equals("") || campo4.getText().equals("") || campo5.getText().equals("") || campo6.getText().equals("")) 
            {
                JOptionPane.showMessageDialog(null, "Por favor llena los campos pertinentes", "Error!", JOptionPane.ERROR_MESSAGE);
            }
            
            else
            {
                if (campo1.getText().matches("[+-]?\\d*(\\.\\d+)?") &&
                    campo2.getText().matches("[+-]?\\d*(\\.\\d+)?") && 
                    campo3.getText().matches("[+-]?\\d*(\\.\\d+)?") &&
                    campo4.getText().matches("[+-]?\\d*(\\.\\d+)?") &&
                    campo5.getText().matches("[+-]?\\d*(\\.\\d+)?") &&
                    campo6.getText().matches("[+-]?\\d*(\\.\\d+)?")
                   ) 
                    {
                        
                        
                        //Obtención de pisos
                        int aux = this.getFloors();
                        
                        //Obtención de parámetros
                        float ANCHO = Float.parseFloat(campo1.getText());
                        float LARGO = Float.parseFloat(campo3.getText());
                        float ALTO = Float.parseFloat(campo5.getText());
                        float ALTURA_TRABAJO = Float.parseFloat(campo2.getText());
                        
                        int CANTIDAD_LAMPARAS = Integer.parseInt(campo4.getText());
                        
                        float DESPLAZAMIENTO_LAMPARAS = Float.parseFloat(campo6.getText());
                        
                        //Obtención de espacios, ambiente e iluminación
                        String aux_str = (String) combo1.getSelectedItem();
                        String aux_str2 = (String) combo3.getSelectedItem();
                        String aux_str3 = (String) combo5.getSelectedItem();
                        
                        
                        //Constructores vacíos creados para instancias
                        TiposEspacios aux_espacio = new TiposEspacios();
                        TipoAmbiente aux_ambiente = new TipoAmbiente();
                        TipoSistemaIluminacion aux_iluminacion = new TipoSistemaIluminacion();
                        
                        switch(aux_str)
                        {
                            case "SALA_DESCANSO":
                                aux_espacio = Espacio.SALA_DESCANSO;
                                
                                break;
                                
                            case "SALA_CONFERENCIAS":
                                aux_espacio = Espacio.SALA_CONFERENCIAS;
                                break;
                                
                            case "SALONES":
                                aux_espacio = Espacio.SALONES;
                                break;
                                
                            case "HALL":
                                aux_espacio = Espacio.HALL;
                                break;
                                
                            case "RECEPCION":
                                aux_espacio = Espacio.RECEPCION;
                                break;
                                
                            case "PASILLO":
                                aux_espacio = Espacio.PASILLO;
                                break;
                                
                            case "SALA_ESPERA":
                                aux_espacio = Espacio.SALA_ESPERA;
                                break;
                        }
                        switch(aux_str2)
                        {
                            case "AMBIENTE_SUCIO":
                                aux_ambiente = Espacio.AMBIENTE_SUCIO;
                                break;
                            case "AMBIENTE_LIMPIO":
                                aux_ambiente = Espacio.AMBIENTE_LIMPIO;
                                break;
                        }
                        switch(aux_str3)
                        {
                            case "ILUMINACION_DIRECTA":
                                aux_iluminacion = Espacio.ILUMINACION_DIRECTA;
                                break;
                            case "ILUMINACION_INDIRECTA":
                                aux_iluminacion = Espacio.ILUMINACION_INDIRECTA;
                                break;
                        }
                        
                        
                        Espacio espacio = new Espacio(ANCHO, LARGO, ALTO, aux_espacio, ALTURA_TRABAJO, CANTIDAD_LAMPARAS, DESPLAZAMIENTO_LAMPARAS, aux_ambiente, aux_iluminacion);
                        MetodoLumenes algoritmo = new MetodoLumenes();
                        algoritmo.setEspacio(espacio);
        
                        espacio.setHabitabilidad(algoritmo.procesarEspacio()); 
        
                        //System.out.println("Espacio:" + espacio);
                        
                        String output = "Espacio:" + espacio;
                        
                        
//                      for (int i = 0; i < aux; i++) 
//                      {
//                        JOptionPane.showMessageDialog(null, "Piso agregado");
//                      }

                        View4 view = new View4();
                        view.establecerTexto(output);
                        
                        
                        view.setVisible(true);
                        this.setVisible(false);
                    }
                    
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Error", "Error!", JOptionPane.ERROR_MESSAGE);
                        
                    }
                
            }
            
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void campo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo3ActionPerformed

    private void campo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo1ActionPerformed

    private void campo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo2ActionPerformed

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo1ActionPerformed

    private void campo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo4ActionPerformed

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
            java.util.logging.Logger.getLogger(View3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campo1;
    private javax.swing.JTextField campo2;
    private javax.swing.JTextField campo3;
    private javax.swing.JTextField campo4;
    private javax.swing.JTextField campo5;
    private javax.swing.JTextField campo6;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JComboBox<String> combo3;
    private javax.swing.JComboBox<String> combo5;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
