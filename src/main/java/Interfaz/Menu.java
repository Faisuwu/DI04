//Menu.java - Antoni Maqueda

package Interfaz;

import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.Timer;
import model.Usuari;
import java.util.Stack;

/**
 * Finestra principal que es mostra després del login.
 * Permet gestionar usuaris, entrenaments, exercicis, i altres funcionalitats relacionades amb l'aplicació.
 * @author Antoni Maqueda
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Usuari instructor connectat actualment.
     */
    public static Usuari Instructor;
    
    /**
     * Historial de panells mostrats dins del JFrame.
     */
    private Stack<JPanel> historialPanels = new Stack<>();

    /**
     * Crea una nova instància del menú principal per a l'usuari connectat.
     *
     * @param instructor L'usuari que ha iniciat sessió i actua com a instructor.
     */
    public Menu(Usuari instructor) {
        this.Instructor=instructor;
        initComponents();
        initComponentsPersonalitzat();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aplicació del Gimnàs Pau ");

        jButton1.setText("Usuaris");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Exercicis");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Entrenaments");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setText("Log Out");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("                Hola de nou!");

        jLabel3.setText("                Per anar a la secció corresponent, clica al botó que calgui");

        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/faisu/Desktop/DAM/Desenvolupament Interficies/Entrega 4/DI04-AntoniMaqueda/images/exercici.png")); // NOI18N
        jLabel4.setText("   ");

        jLabel5.setIcon(new javax.swing.ImageIcon("/Users/faisu/Desktop/DAM/Desenvolupament Interficies/Entrega 4/DI04-AntoniMaqueda/images/entrenament.png")); // NOI18N
        jLabel5.setText("   ");

        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/faisu/Desktop/DAM/Desenvolupament Interficies/Entrega 4/DI04-AntoniMaqueda/images/logout.png")); // NOI18N
        jLabel6.setText("   ");

        jLabel7.setIcon(new javax.swing.ImageIcon("/Users/faisu/Desktop/DAM/Desenvolupament Interficies/Entrega 4/DI04-AntoniMaqueda/images/usuari.png")); // NOI18N
        jLabel7.setText("   ");

        jMenu1.setText("Inici");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Usuaris");
        jMenu2.setMaximumSize(new java.awt.Dimension(60, 23));
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu4.setText("Entrenaments");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu3.setText("Exercicis");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu5.setText("Altres");

        jMenuItem3.setText("Feedback");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuItem4.setText("Calendari");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuBar1.add(jMenu5);

        jMenu7.setText("                           ");
        jMenuBar1.add(jMenu7);

        jMenu6.setBackground(new java.awt.Color(255, 204, 204));
        jMenu6.setForeground(new java.awt.Color(255, 0, 0));
        jMenu6.setText("Log Out");
        jMenu6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Inicialitza components personalitzats del menú: escalat d’imatges,
     * configuració dels menús i redimensionament dels panells actius.
     */
    private void initComponentsPersonalitzat(){
        
        //Escalam les imatges disponibles
        escalarImatge(jLabel4);
        escalarImatge(jLabel5);
        escalarImatge(jLabel6);
        escalarImatge(jLabel7);
        
        //Un Menú de per si no té l'actionListener de clicar-hi. Ho he volgut afegir jo de forma manual
        addMenuListener(jMenu2, () -> jMenu2ActionPerformed(new java.awt.event.ActionEvent(jMenu2, ActionEvent.ACTION_PERFORMED, "menu2Selected")));
        addMenuListener(jMenu3, () -> jMenu3ActionPerformed(new java.awt.event.ActionEvent(jMenu3, ActionEvent.ACTION_PERFORMED, "menu3Selected")));
        addMenuListener(jMenu1, () -> jMenu1ActionPerformed(new java.awt.event.ActionEvent(jMenu1, ActionEvent.ACTION_PERFORMED, "menu1Selected")));
        addMenuListener(jMenu4, () -> jMenu4ActionPerformed(new java.awt.event.ActionEvent(jMenu4, ActionEvent.ACTION_PERFORMED, "menu4Selected")));
        addMenuListener(jMenu6, () -> jMenu6ActionPerformed(new java.awt.event.ActionEvent(jMenu6, ActionEvent.ACTION_PERFORMED, "menu6Selected")));
        
        //Void per redimensionar la pantalla en tots els JPanels actius a aquest JFrame (es de login) 
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                Component[] componentes = getContentPane().getComponents();

                for (Component c : componentes) {
                    if (c instanceof JPanel && c.isVisible()) { // Detecta el JPanel actiu
                        c.setSize(getWidth(), getHeight()); // Ajusta el tamany al del JFrame
                        c.revalidate();
                        c.repaint();
                        break; // Si per casualitat hagués més actius, no continua
                    }
                }
            }
        });
    
    }
    
    /**
     * Escala la imatge d'un JLabel a la mida actual del mateix.
     *
     * @param label JLabel que conté la imatge a escalar.
     */
    private void escalarImatge(JLabel label) {
        int ample = label.getWidth();
        int alt = label.getHeight();
        ImageIcon iconoOriginal = (ImageIcon) label.getIcon();

        if (iconoOriginal != null) {
            Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(ample, alt, Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(imagenEscalada));
        }
    }
    
    /**
     * Afegeix un listener personalitzat a un JMenu perquè executi una acció en fer clic.
     *
     * @param menu JMenu al qual afegir el listener.
     * @param action Acció a executar quan es selecciona el menú.
     */
    private void addMenuListener(JMenu menu, Runnable action) {
    menu.addMenuListener(new javax.swing.event.MenuListener() {
        @Override
        public void menuSelected(javax.swing.event.MenuEvent e) {
            action.run();
        }

        @Override
        public void menuDeselected(javax.swing.event.MenuEvent e) { }

        @Override
        public void menuCanceled(javax.swing.event.MenuEvent e) { }
    });
}
    
    /**
     * Acció del botó per obrir el panell de gestió d'usuaris.
     *
     * @param evt Esdeveniment del botó.
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        transitionToPanel(new UserPanel(Instructor,this));
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Acció del botó per obrir el panell d’exercicis.
     * 
     * @param evt Esdeveniment del botó.
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        transitionToPanel(new ExercisePanel(null,this,Instructor));
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Acció del botó per accedir al panell d'entrenaments.
     * 
     * @param evt Esdeveniment del botó.
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        transitionToPanel(new WorkoutPanel(Instructor,this));
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * Acció del botó per tancar sessió i tornar al login.
     * 
     * @param evt Esdeveniment del botó.
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        obrirNouJFrame( new MainJFrame());
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * Acció del botó per tornar al Menú.
     * 
     * @param evt Esdeveniment del botó.
     */
    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        obrirNouJFrame( new Menu(Instructor));
    }//GEN-LAST:event_jMenu1ActionPerformed

    /**
     * Acció del botó per anar al panell d'usuaris.
     * 
     * @param evt Esdeveniment del botó.
     */
    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        transitionToPanel(new UserPanel(Instructor,this));
    }//GEN-LAST:event_jMenu2ActionPerformed

    /**
     * Acció del botó per anar al panell de exercicis.
     * 
     * @param evt Esdeveniment del botó.
     */
    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        transitionToPanel(new ExercisePanel(null,this,Instructor));
    }//GEN-LAST:event_jMenu3ActionPerformed

    /**
     * Acció del botó per anar al panell de Entrenaments.
     * 
     * @param evt Esdeveniment del botó.
     */
    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        transitionToPanel(new WorkoutPanel(Instructor,this));
    }//GEN-LAST:event_jMenu4ActionPerformed

    /**
     * Acció del botó per tancar sesió.
     * 
     * @param evt Esdeveniment del botó.
     */
    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        obrirNouJFrame( new MainJFrame());
    }//GEN-LAST:event_jMenu6ActionPerformed

    /**
     * Acció del botó per anar al formulari de feedback
     * 
     * @param evt Esdeveniment del botó.
     */
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        transitionToPanel(new FeedBackPanel());
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * Acció del botó per anar al horari
     * 
     * @param evt Esdeveniment del botó.
     */
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        transitionToPanel(new HorariPanel());
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * Mostra un nou panell dins del JFrame amb una animació de transició lateral.
     *
     * @param newPanel El nou JPanel que es vol mostrar.
     */
    public void transitionToPanel(JPanel newPanel) {
        newPanel.setBounds(getWidth(), 0, getWidth(), getHeight());
        getContentPane().add(newPanel);

        Timer timer = new Timer(5, new ActionListener() {
            int xPos = getWidth();

            @Override
            public void actionPerformed(ActionEvent e) {
                xPos -= 10;
                newPanel.setBounds(xPos, 0, getWidth(), getHeight());
                repaint();

                if (xPos <= 0) {
                    ((Timer) e.getSource()).stop();
                    getContentPane().removeAll();
                    getContentPane().add(newPanel);
                    revalidate();
                }
            }
        });
        timer.start();
    }
    
    /**
     * Reinicia l'aplicació obrint un nou JFrame i tancant l'actual.
     * S'utilitza per fer log out o tornar a la pantalla inicial.
     *
     * @param nouFrame Nou JFrame a mostrar.
     */
    private void obrirNouJFrame(JFrame nouFrame) {
        dispose();
        nouFrame.setLocationRelativeTo(null);
        nouFrame.setVisible(true);
    }

    /**
     * Punt d’entrada principal per a executar l’aplicació.
     *
     * @param args Arguments de línia de comandes.
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu(Instructor).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables
}