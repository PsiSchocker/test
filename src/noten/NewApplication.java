/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noten;

import java.util.ArrayList;
import java.util.stream.*;
import javax.swing.JFrame;

/**
 *
 * @author Jens
 */
public class NewApplication extends javax.swing.JFrame {

    /**
     * Creates new form NewApplication
     */
    public NewApplication() {
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

        mündlichTF = new javax.swing.JTextField();
        schriftlichL = new javax.swing.JLabel();
        mündlichL = new javax.swing.JLabel();
        schriftlichTF = new javax.swing.JTextField();
        sonstigesTF = new javax.swing.JTextField();
        sonstigesL = new javax.swing.JLabel();
        computeBT = new javax.swing.JButton();
        solutionTF = new javax.swing.JTextField();
        mündlichV = new javax.swing.JTextField();
        sonsigesV = new javax.swing.JTextField();
        schriftlichV = new javax.swing.JTextField();
        schnittSchriftlich = new javax.swing.JTextField();
        schnittMündlich = new javax.swing.JTextField();
        schnittSonsriges = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mündlichTF.setText("0,0,0");
        mündlichTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mündlichTFActionPerformed(evt);
            }
        });

        schriftlichL.setText("S:");

        mündlichL.setText("M:");

        schriftlichTF.setText("0,0,0");
        schriftlichTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schriftlichTFActionPerformed(evt);
            }
        });

        sonstigesTF.setText("0,0,0");
        sonstigesTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonstigesTFActionPerformed(evt);
            }
        });

        sonstigesL.setText("s:");

        computeBT.setText("Compute");
        computeBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeBTActionPerformed(evt);
            }
        });

        solutionTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solutionTFActionPerformed(evt);
            }
        });

        mündlichV.setText("0");
        mündlichV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mündlichVActionPerformed(evt);
            }
        });

        sonsigesV.setText("0");
        sonsigesV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonsigesVActionPerformed(evt);
            }
        });

        schriftlichV.setText("0");
        schriftlichV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schriftlichVActionPerformed(evt);
            }
        });

        schnittSchriftlich.setText("0");
        schnittSchriftlich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schnittSchriftlichActionPerformed(evt);
            }
        });

        schnittMündlich.setText("0");
        schnittMündlich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schnittMündlichActionPerformed(evt);
            }
        });

        schnittSonsriges.setText("0");

        jLabel1.setText("Schnitt:");

        jLabel2.setText("Gewichtung");

        jLabel3.setText("Schnitt");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sonstigesL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sonstigesTF, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mündlichL)
                                    .addComponent(schriftlichL))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(schriftlichTF)
                                    .addComponent(mündlichTF))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(schnittSchriftlich)
                                .addComponent(schnittMündlich)
                                .addComponent(schnittSonsriges, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(mündlichV, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(schriftlichV, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(sonsigesV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(computeBT)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(solutionTF, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(schnittSchriftlich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(schnittMündlich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(schnittSonsriges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(schriftlichL)
                            .addComponent(schriftlichTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mündlichL)
                            .addComponent(mündlichTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sonstigesL)
                            .addComponent(sonstigesTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(schriftlichV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mündlichV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sonsigesV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(computeBT)
                    .addComponent(solutionTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mündlichTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mündlichTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mündlichTFActionPerformed

    private void schriftlichTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schriftlichTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_schriftlichTFActionPerformed

    private void sonstigesTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonstigesTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sonstigesTFActionPerformed

    private void solutionTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solutionTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_solutionTFActionPerformed

    private void mündlichVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mündlichVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mündlichVActionPerformed

    private void sonsigesVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonsigesVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sonsigesVActionPerformed

    private void schriftlichVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schriftlichVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_schriftlichVActionPerformed

    private void computeBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeBTActionPerformed
        button();

    }//GEN-LAST:event_computeBTActionPerformed

    public void button() {
        ArrayList<Double> a = new ArrayList<>();
        ArrayList<Double> b = new ArrayList<>();
        ArrayList<Double> c = new ArrayList<>();
        try {
//              JAVA 8
//            Stream.of(schriftlichTF.getText().split(",")).forEach((d) -> a.add(Double.parseDouble(d)) );
//            Stream.of(mündlichTF.getText().split(",")).forEach((d) ->  b.add(Double.parseDouble(d)));
//            Stream.of(sonstigesTF.getText().split(",")).forEach((d) ->  c.add(Double.parseDouble(d)));
//
            for (String s : schriftlichTF.getText().split(",")) {
                a.add(Double.parseDouble(s));
            }
            for (String s : mündlichTF.getText().split(",")) {
                b.add(Double.parseDouble(s));
            }
            for (String s : sonstigesTF.getText().split(",")) {
                c.add(Double.parseDouble(s));
            }
            
            int d = Integer.parseInt(schriftlichV.getText());
            int e = Integer.parseInt(mündlichV.getText());
            int f = Integer.parseInt(sonsigesV.getText());
            
            double[] compute = compute(a, b, c, d, e, f);
            
            schnittSchriftlich.setText(String.valueOf(compute[0]));
            schnittMündlich.setText(String.valueOf(compute[1]));
            schnittSonsriges.setText(String.valueOf(compute[2]));
            solutionTF.setText(String.valueOf(compute[3]));
            
        } catch (Exception ex) {
            
            
            System.err.println("Something need fixing");
            solutionTF.setText("ERROR");
        }
    }

    private void schnittSchriftlichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schnittSchriftlichActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_schnittSchriftlichActionPerformed

    private void schnittMündlichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schnittMündlichActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_schnittMündlichActionPerformed

    public static double[] compute(ArrayList<Double> schriftlich, ArrayList<Double> mündlich,
            ArrayList<Double> sonstiges, int schriftlichGewichtung,
            int mündlichGewichtung, int sonstigesGewichtung) {
        double sum1 = 0;
        int it1 = 0;
        double sum2 = 0;
        int it2 = 0;
        double sum3 = 0;
        int it3 = 0;

        double schnittGes = 0;
        double schnittSch = 0;
        double schnittMue = 0;
        double schnittSo = 0;

        double[] schnittArr = new double[4];

        for (Double g : schriftlich) {
            sum1 = sum1 + g;
            it1++;
        }
        schnittSch = sum1 / it1;

        for (Double g : mündlich) {
            sum2 = sum2 + g;
            it2++;
        }
        schnittMue = sum2 / it2;

        for (Double g : sonstiges) {
            sum3 = sum3 + g;
            it3++;
        }
        schnittSo = sum3 / it3;

        schnittGes = (schnittSch * schriftlichGewichtung
                + schnittMue * mündlichGewichtung
                + schnittSo * sonstigesGewichtung)
                / (schriftlichGewichtung
                + mündlichGewichtung
                + sonstigesGewichtung);

        schnittArr[0] = schnittSch;
        schnittArr[1] = schnittMue;
        schnittArr[2] = schnittSo;
        schnittArr[3] = schnittGes;

        return schnittArr;
    }

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
            java.util.logging.Logger.getLogger(NewApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame a = new NewApplication();
                a.setVisible(true);
                a.setTitle("Noten");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton computeBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel mündlichL;
    private javax.swing.JTextField mündlichTF;
    private javax.swing.JTextField mündlichV;
    private javax.swing.JTextField schnittMündlich;
    private javax.swing.JTextField schnittSchriftlich;
    private javax.swing.JTextField schnittSonsriges;
    private javax.swing.JLabel schriftlichL;
    private javax.swing.JTextField schriftlichTF;
    private javax.swing.JTextField schriftlichV;
    private javax.swing.JTextField solutionTF;
    private javax.swing.JTextField sonsigesV;
    private javax.swing.JLabel sonstigesL;
    private javax.swing.JTextField sonstigesTF;
    // End of variables declaration//GEN-END:variables

}
