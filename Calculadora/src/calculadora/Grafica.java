package calculadora;

public class Grafica extends javax.swing.JFrame {
    
    Calculador Numero=new Calculador();

    public Grafica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonSumar = new javax.swing.JButton();
        BotonRestar = new javax.swing.JButton();
        BotonMultiplicar = new javax.swing.JButton();
        BotonDividir = new javax.swing.JButton();
        TextoValor1 = new javax.swing.JTextField();
        TextoValor2 = new javax.swing.JTextField();
        Resultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonSumar.setText("+");
        BotonSumar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonSumarMouseClicked(evt);
            }
        });

        BotonRestar.setText("-");
        BotonRestar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRestarMouseClicked(evt);
            }
        });

        BotonMultiplicar.setText("x");
        BotonMultiplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonMultiplicarMouseClicked(evt);
            }
        });

        BotonDividir.setText("/");
        BotonDividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonDividirMouseClicked(evt);
            }
        });

        TextoValor1.setFont(new java.awt.Font("L M Mono Caps10", 0, 36)); // NOI18N
        TextoValor1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextoValor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextoValor1MouseClicked(evt);
            }
        });

        TextoValor2.setFont(new java.awt.Font("L M Mono Caps10", 0, 36)); // NOI18N
        TextoValor2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Resultado.setFont(new java.awt.Font("L M Mono Caps10", 0, 36)); // NOI18N
        Resultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonSumar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonRestar, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(BotonMultiplicar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(BotonDividir, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextoValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TextoValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Resultado)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextoValor1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(TextoValor2)
                    .addComponent(Resultado))
                .addGap(18, 18, 18)
                .addComponent(BotonSumar)
                .addGap(18, 18, 18)
                .addComponent(BotonRestar)
                .addGap(18, 18, 18)
                .addComponent(BotonMultiplicar)
                .addGap(18, 18, 18)
                .addComponent(BotonDividir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoValor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoValor1MouseClicked
     
    }//GEN-LAST:event_TextoValor1MouseClicked

    private void BotonSumarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSumarMouseClicked
        
        Numero.Valor1=Float.parseFloat(TextoValor1.getText());
        Numero.Valor2=Float.parseFloat(TextoValor2.getText());
        this.Resultado.setText(String.valueOf(Numero.Sumar()));
        
    }//GEN-LAST:event_BotonSumarMouseClicked

    private void BotonRestarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRestarMouseClicked
       
        Numero.Valor1=Float.parseFloat(TextoValor1.getText());
        Numero.Valor2=Float.parseFloat(TextoValor2.getText());
        this.Resultado.setText(String.valueOf(Numero.Restar()));
        
    }//GEN-LAST:event_BotonRestarMouseClicked

    private void BotonMultiplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMultiplicarMouseClicked
        
        Numero.Valor1=Float.parseFloat(TextoValor1.getText());
        Numero.Valor2=Float.parseFloat(TextoValor2.getText());
        this.Resultado.setText(String.valueOf(Numero.Multiplicar()));
        
    }//GEN-LAST:event_BotonMultiplicarMouseClicked

    private void BotonDividirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonDividirMouseClicked
        
        Numero.Valor1=Float.parseFloat(TextoValor1.getText());
        Numero.Valor2=Float.parseFloat(TextoValor2.getText());
        this.Resultado.setText(String.valueOf(Numero.Dividir()));
        
    }//GEN-LAST:event_BotonDividirMouseClicked

    
    
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
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonDividir;
    private javax.swing.JButton BotonMultiplicar;
    private javax.swing.JButton BotonRestar;
    private javax.swing.JButton BotonSumar;
    private javax.swing.JTextField Resultado;
    private javax.swing.JTextField TextoValor1;
    private javax.swing.JTextField TextoValor2;
    // End of variables declaration//GEN-END:variables
}
