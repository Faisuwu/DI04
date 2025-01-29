//LoginPanel.java - Antoni Maqueda Bestard

package Interfaz;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class LoginPanel extends javax.swing.JPanel {

    public LoginPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel3.setText("Error");

        setBackground(new java.awt.Color(229, 255, 255));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Log In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("     ");

        jLabel2.setFont(new java.awt.Font("PT Sans Narrow", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Identifica't");
        jLabel2.setToolTipText("");

        jLabel4.setText("Usuari");

        jLabel5.setText("Contrasenya");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1))
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String usernameInput = jTextField1.getText();
        String passwordInput = new String(jPasswordField1.getPassword());

        // Primer hem de validar que els camps no estiguin buids
        if (usernameInput.trim().isEmpty() || passwordInput.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Per favor, completi tots els camps.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Utilitzam inputstream per accedir al json
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("conection/baseSimulada.json")) {
            if (inputStream == null) {
                JOptionPane.showMessageDialog(this, "No se ha pogu trobar l'arxiu.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Gson gson = new Gson();

            // Utilitzarem TypeToken per especificar el tipus de dades que manejam
            Type type = new TypeToken<Map<String, List<Map<String, String>>>>(){}.getType();
            Map<String, List<Map<String, String>>> usuarisData = gson.fromJson(new InputStreamReader(inputStream), type);

            //Cercam cualque coincidencia d'usuari a l'arxiu JSON per saber si les dades introduides son correctes
            boolean loginCorrecte = usuarisData.get("usuaris").stream()
                .anyMatch(usuari -> usernameInput.equals(usuari.get("username")) 
                        && passwordInput.equals(usuari.get("password")));

            //Si el login es correcte, donam pas a l'aplicació
            if (loginCorrecte) {
                JOptionPane.showMessageDialog(this, "Login correcte. ¡Benvingut " + usernameInput + "!");
                java.awt.Window window = SwingUtilities.getWindowAncestor(this);

                if (window instanceof JFrame) {
                    JFrame frame = (JFrame) window;
                    frame.dispose();
                }

                Menu menuFrame = new Menu();
                menuFrame.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Usuari o contrasenya incorrectes", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (IOException | JsonSyntaxException e) {
            JOptionPane.showMessageDialog(this, "Error al llegir o analitzar el JSON.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}