//ExercisePanel.java - Antoni Maqueda

package Interfaz;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Exercici;
import model.Usuari;
import model.Workout;
import service.ExerciseService;

/**
 * Panell que mostra els exercicis d’un entrenament seleccionat.
 * <p>
 * Permet consultar la llista d’exercicis d’un workout i accedir a l’edició/eliminació de cada exercici
 * clicant sobre les files de la taula. També permet crear un nou exercici si l'entrenament existeix.
 * @author Antoni Maqueda
 */
public class ExercisePanel extends javax.swing.JPanel {

    private Workout workout; 
    private Menu parentMenu;
    private Usuari usuari;
    private ArrayList<Exercici> exercicisActuals = new ArrayList<>();

    /**
     * Constructor del panell ExercisePanel.
     *
     * @param workout     Entrenament seleccionat del qual es mostren els exercicis.
     * @param parentMenu  Menú principal per facilitar la navegació.
     * @param usuari      Usuari que ha iniciat sessió.
     */
    public ExercisePanel(Workout workout,  Menu parentMenu, Usuari usuari) {
        this.workout = workout;
        this.parentMenu = parentMenu;
        this.usuari = usuari;
        initComponents();
        
        //Si té workout, carregam els exercicis. Sino, avisam de que no hi ha workout seleccionat.
        if (workout!=null){
            carregarExercicisDeWorkout(workout);
        }else{
            DefaultTableModel modelTaula = new DefaultTableModel();
            modelTaula.addColumn("Exercici");
            modelTaula.addRow(new Object[]{ "Cap exercici. Has d'accedir desde Entrenaments (Tornar)"});
             jTable1.setModel(modelTaula);
        }
         // Acció per editar l’exercici quan es clica una fila
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int fila = jTable1.rowAtPoint(evt.getPoint());
                if (fila >= 0 && fila < exercicisActuals.size()) {
                    Exercici exerciciSeleccionat = exercicisActuals.get(fila);
                    ExercisePanelOptions panel = new ExercisePanelOptions(exerciciSeleccionat,workout,parentMenu,usuari);
                    parentMenu.transitionToPanel(panel);
                }
            }
        });
    }
    
    /**
     * Carrega els exercicis associats a un workout i els mostra a la taula.
     *
     * @param workout Entrenament del qual es volen visualitzar els exercicis.
     */
    private void carregarExercicisDeWorkout(Workout workout) {
        DefaultTableModel modelTaula = new DefaultTableModel();
        modelTaula.addColumn("Workout");
        modelTaula.addColumn("Exercici");

        exercicisActuals = ExerciseService.getExercicisPerWorkout(workout);
        
        if (exercicisActuals.isEmpty()) {
            modelTaula.addRow(new Object[]{ workout.getId(), "(cap exercici)" });
        } else {
            for (Exercici exercici : exercicisActuals) {
                modelTaula.addRow(new Object[]{ workout.getId(), exercici.getNomExercici() });
            }
        }
        jTable1.setModel(modelTaula);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(229, 255, 255));

        jLabel2.setFont(new java.awt.Font("PT Sans Narrow", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Exercicis");
        jLabel2.setToolTipText("");

        jLabel1.setText("A continuació, la llista de exercicis:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Basquet", "Esport", "No", "10/01/2025"},
                {"Futbol", "Esport", "No", "13/01/2025"},
                {"Abdominals", "Activitat", "Si", "17/01/2025"},
                {"Flexions", "Activitat", "Si", "29/01/2025"}
            },
            new String [] {
                "Nom", "Tipus", "Dificil", "Data"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(51, 204, 0));
        jButton1.setText("NOU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setText("Tornar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Acció del botó "Afegir exercici".
     * <p>
     * Obre el panell de creació d’un nou exercici si hi ha un workout actiu.
     * Sense workout no es pot crear cap exercici.
     * 
     * @param evt Esdeveniment de clic del botó.
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (workout == null) {
            javax.swing.JOptionPane.showMessageDialog(
                this,
                "No pots crear un exercici si no tens cap workout seleccionat.",
                "Error",
                javax.swing.JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        Exercici nouExercici = null;
        ExercisePanelOptions optionsPanel = new ExercisePanelOptions(nouExercici,workout,parentMenu,usuari);
        parentMenu.transitionToPanel(optionsPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Acció del botó "Tornar".
     * <p>
     * Torna al panell principal d’entrenaments.
     *
     * @param evt Esdeveniment de clic del botó.
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        WorkoutPanel workoutPanel = new WorkoutPanel(usuari,parentMenu);
        parentMenu.transitionToPanel(workoutPanel);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}