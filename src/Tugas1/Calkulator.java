package Tugas1;
public class Calkulator extends javax.swing.JFrame {
    String angka;
    double jumlah, bil1, bil2;
    int pilih;

    public Calkulator() {
        initComponents();
        angka = "";
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tampilHasil = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnBagi = new javax.swing.JButton();
        angka7 = new javax.swing.JButton();
        angka8 = new javax.swing.JButton();
        angka9 = new javax.swing.JButton();
        btnKali = new javax.swing.JButton();
        angka4 = new javax.swing.JButton();
        angka5 = new javax.swing.JButton();
        angka6 = new javax.swing.JButton();
        btnKurang = new javax.swing.JButton();
        angka1 = new javax.swing.JButton();
        angka2 = new javax.swing.JButton();
        angka3 = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        angka0 = new javax.swing.JButton();
        btnTitik = new javax.swing.JButton();
        btnSamadengan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        tampilHasil.setEditable(false);
        tampilHasil.setBackground(new java.awt.Color(0, 0, 0));
        tampilHasil.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tampilHasil.setForeground(new java.awt.Color(255, 255, 255));
        tampilHasil.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnReset.setBackground(new java.awt.Color(0, 0, 0));
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 102, 0));
        btnReset.setText("C");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnMod.setBackground(new java.awt.Color(0, 0, 0));
        btnMod.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMod.setForeground(new java.awt.Color(255, 102, 0));
        btnMod.setText("%");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        btnBagi.setBackground(new java.awt.Color(0, 0, 0));
        btnBagi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBagi.setForeground(new java.awt.Color(255, 102, 0));
        btnBagi.setText("/");
        btnBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBagiActionPerformed(evt);
            }
        });

        angka7.setBackground(new java.awt.Color(0, 0, 0));
        angka7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        angka7.setForeground(new java.awt.Color(255, 255, 255));
        angka7.setText("7");
        angka7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka7ActionPerformed(evt);
            }
        });

        angka8.setBackground(new java.awt.Color(0, 0, 0));
        angka8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        angka8.setForeground(new java.awt.Color(255, 255, 255));
        angka8.setText("8");
        angka8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka8ActionPerformed(evt);
            }
        });

        angka9.setBackground(new java.awt.Color(0, 0, 0));
        angka9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        angka9.setForeground(new java.awt.Color(255, 255, 255));
        angka9.setText("9");
        angka9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka9ActionPerformed(evt);
            }
        });

        btnKali.setBackground(new java.awt.Color(0, 0, 0));
        btnKali.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnKali.setForeground(new java.awt.Color(255, 102, 0));
        btnKali.setText("x");
        btnKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaliActionPerformed(evt);
            }
        });

        angka4.setBackground(new java.awt.Color(0, 0, 0));
        angka4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        angka4.setForeground(new java.awt.Color(255, 255, 255));
        angka4.setText("4");
        angka4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka4ActionPerformed(evt);
            }
        });

        angka5.setBackground(new java.awt.Color(0, 0, 0));
        angka5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        angka5.setForeground(new java.awt.Color(255, 255, 255));
        angka5.setText("5");
        angka5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka5ActionPerformed(evt);
            }
        });

        angka6.setBackground(new java.awt.Color(0, 0, 0));
        angka6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        angka6.setForeground(new java.awt.Color(255, 255, 255));
        angka6.setText("6");
        angka6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka6ActionPerformed(evt);
            }
        });

        btnKurang.setBackground(new java.awt.Color(0, 0, 0));
        btnKurang.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnKurang.setForeground(new java.awt.Color(255, 102, 0));
        btnKurang.setText("-");
        btnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurangActionPerformed(evt);
            }
        });

        angka1.setBackground(new java.awt.Color(0, 0, 0));
        angka1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        angka1.setForeground(new java.awt.Color(255, 255, 255));
        angka1.setText("1");
        angka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka1ActionPerformed(evt);
            }
        });

        angka2.setBackground(new java.awt.Color(0, 0, 0));
        angka2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        angka2.setForeground(new java.awt.Color(255, 255, 255));
        angka2.setText("2");
        angka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka2ActionPerformed(evt);
            }
        });

        angka3.setBackground(new java.awt.Color(0, 0, 0));
        angka3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        angka3.setForeground(new java.awt.Color(255, 255, 255));
        angka3.setText("3");
        angka3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka3ActionPerformed(evt);
            }
        });

        btnTambah.setBackground(new java.awt.Color(0, 0, 0));
        btnTambah.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 102, 0));
        btnTambah.setText("+");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        angka0.setBackground(new java.awt.Color(0, 0, 0));
        angka0.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        angka0.setForeground(new java.awt.Color(255, 255, 255));
        angka0.setText("0");
        angka0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka0ActionPerformed(evt);
            }
        });

        btnTitik.setBackground(new java.awt.Color(0, 0, 0));
        btnTitik.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTitik.setForeground(new java.awt.Color(255, 255, 255));
        btnTitik.setText(".");
        btnTitik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTitikActionPerformed(evt);
            }
        });

        btnSamadengan.setBackground(new java.awt.Color(255, 102, 0));
        btnSamadengan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSamadengan.setForeground(new java.awt.Color(255, 255, 255));
        btnSamadengan.setText("=");
        btnSamadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSamadenganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(angka0, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTitik, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSamadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tampilHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(angka7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(angka8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(angka9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKali, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(angka4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(angka5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(angka6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(angka3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tampilHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKali, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTitik, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSamadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
      bil1= Double.parseDouble(angka);
      tampilHasil.setText("+");
      angka = "";
      pilih = 1;
    }//GEN-LAST:event_btnTambahActionPerformed

    private void angka0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka0ActionPerformed
      angka += "0";
      tampilHasil.setText(angka);
    }//GEN-LAST:event_angka0ActionPerformed

    private void angka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka1ActionPerformed
      angka += "1";
      tampilHasil.setText(angka);  
    }//GEN-LAST:event_angka1ActionPerformed

    private void angka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka2ActionPerformed
      angka += "2";
      tampilHasil.setText(angka);
    }//GEN-LAST:event_angka2ActionPerformed

    private void angka3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka3ActionPerformed
      angka += "3";
      tampilHasil.setText(angka);
    }//GEN-LAST:event_angka3ActionPerformed

    private void angka4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka4ActionPerformed
      angka += "4";
      tampilHasil.setText(angka);
    }//GEN-LAST:event_angka4ActionPerformed

    private void angka5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka5ActionPerformed
      angka += "5";
      tampilHasil.setText(angka); 
    }//GEN-LAST:event_angka5ActionPerformed

    private void angka6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka6ActionPerformed
      angka += "6";
      tampilHasil.setText(angka); 
    }//GEN-LAST:event_angka6ActionPerformed

    private void angka7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka7ActionPerformed
      angka += "7";
      tampilHasil.setText(angka); 
    }//GEN-LAST:event_angka7ActionPerformed

    private void angka8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka8ActionPerformed
      angka += "8";
      tampilHasil.setText(angka); 
    }//GEN-LAST:event_angka8ActionPerformed

    private void angka9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka9ActionPerformed
      angka += "9";
      tampilHasil.setText(angka); 
    }//GEN-LAST:event_angka9ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
      tampilHasil.setText(angka);
      bil1 = 0.0;
      bil2 = 0.0;
      jumlah = 0.0;
      angka =" ";     
      
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSamadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSamadenganActionPerformed
      switch(pilih){
          case 1:
              bil2 = Double.parseDouble(angka);
              jumlah = bil1+bil2;
              angka = Double.toString(jumlah);
              tampilHasil.setText(angka);
              break;
              
          case 2:
              bil2 = Double.parseDouble(angka);
              jumlah = bil1-bil2;
              angka = Double.toString(jumlah);
              tampilHasil.setText(angka);
              break;
              
          case 3:
              bil2 = Double.parseDouble(angka);
              jumlah = bil1*bil2;
              angka = Double.toString(jumlah);
              tampilHasil.setText(angka);
              break;
              
           case 4:
              bil2 = Double.parseDouble(angka);
              jumlah = bil1/bil2;
              angka = Double.toString(jumlah);
              tampilHasil.setText(angka);
              break;
              
           case 5:
              bil2 = Double.parseDouble(angka);
              jumlah = bil1%bil2;
              angka = Double.toString(jumlah);
              tampilHasil.setText(angka);
              break;
              
           default:
              break;
      }
         
        
    }//GEN-LAST:event_btnSamadenganActionPerformed

    private void btnTitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTitikActionPerformed
      angka += ".";
      tampilHasil.setText(angka);
    }//GEN-LAST:event_btnTitikActionPerformed

    private void btnKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurangActionPerformed
      bil1= Double.parseDouble(angka);
      tampilHasil.setText("-");
      angka = "";
      pilih = 2; 
    }//GEN-LAST:event_btnKurangActionPerformed

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
       bil1= Double.parseDouble(angka);
      tampilHasil.setText("%");
      angka = "";
      pilih = 5; 
    }//GEN-LAST:event_btnModActionPerformed

    private void btnBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBagiActionPerformed
        bil1= Double.parseDouble(angka);
      tampilHasil.setText("/");
      angka = "";
      pilih = 4; 
    }//GEN-LAST:event_btnBagiActionPerformed

    private void btnKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaliActionPerformed
       bil1= Double.parseDouble(angka);
      tampilHasil.setText("x");
      angka = "";
      pilih = 3; 
    }//GEN-LAST:event_btnKaliActionPerformed

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
            java.util.logging.Logger.getLogger(Calkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton angka0;
    private javax.swing.JButton angka1;
    private javax.swing.JButton angka2;
    private javax.swing.JButton angka3;
    private javax.swing.JButton angka4;
    private javax.swing.JButton angka5;
    private javax.swing.JButton angka6;
    private javax.swing.JButton angka7;
    private javax.swing.JButton angka8;
    private javax.swing.JButton angka9;
    private javax.swing.JButton btnBagi;
    private javax.swing.JButton btnKali;
    private javax.swing.JButton btnKurang;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSamadengan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTitik;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tampilHasil;
    // End of variables declaration//GEN-END:variables
}
