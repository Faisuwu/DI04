//WorkoutPanel.java - Antoni Maqueda

package Interfaz;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import service.WorkoutService;
import model.Workout;
import model.Usuari;
import service.ExerciseService;

/**
 * Panell que mostra els entrenaments (workouts) associats a un usuari.
 * @author Antoni Maqueda
 */
public class WorkoutPanel extends javax.swing.JPanel {

    Usuari Instructor;
    private Menu parentMenu;
    
    /**
     * Crea el panell d'entrenaments per a l'instructor especificat.
     *
     * @param instructor Usuari instructor.
     * @param parentMenu Referència al menú principal.
     */
    public WorkoutPanel(Usuari instructor, Menu parentMenu) {
        this.Instructor = instructor;
        this.parentMenu = parentMenu;
        initComponents();
        carregarWorkouts();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenuBar7 = new javax.swing.JMenuBar();
        jMenu14 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenuBar8 = new javax.swing.JMenuBar();
        jMenu16 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jMenuBar9 = new javax.swing.JMenuBar();
        jMenu18 = new javax.swing.JMenu();
        jMenu19 = new javax.swing.JMenu();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("jMenu3");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        jMenu8.setText("File");
        jMenuBar4.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar4.add(jMenu9);

        jMenu10.setText("File");
        jMenuBar5.add(jMenu10);

        jMenu11.setText("Edit");
        jMenuBar5.add(jMenu11);

        jMenu12.setText("File");
        jMenuBar6.add(jMenu12);

        jMenu13.setText("Edit");
        jMenuBar6.add(jMenu13);

        jMenu14.setText("File");
        jMenuBar7.add(jMenu14);

        jMenu15.setText("Edit");
        jMenuBar7.add(jMenu15);

        jMenu16.setText("File");
        jMenuBar8.add(jMenu16);

        jMenu17.setText("Edit");
        jMenuBar8.add(jMenu17);

        jMenu18.setText("File");
        jMenuBar9.add(jMenu18);

        jMenu19.setText("Edit");
        jMenuBar9.add(jMenu19);

        setBackground(new java.awt.Color(229, 255, 255));

        jLabel2.setFont(new java.awt.Font("PT Sans Narrow", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Entrenaments");
        jLabel2.setToolTipText("");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"08/01/2025", "1234", "23", null},
                {"12/01/2025", "1235", "45", null},
                {"04/02/2025", "1236", "23", null},
                {"06/02/2025", "1237", "67", null}
            },
            new String [] {
                "Data", "Id", "UsuariId", "Detalls"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("A continuació, la llista de entrenaments programats:");

        jButton1.setBackground(new java.awt.Color(51, 204, 0));
        jButton1.setText("NOU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Acció del botó per afegir un nou entrenament.
     *
     * @param evt Esdeveniment del botó.
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AddWorkoutPanel addWorkoutPanel = new AddWorkoutPanel(parentMenu,Instructor);
        parentMenu.transitionToPanel(addWorkoutPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Carrega i mostra els entrenaments de la base de dades.
     * Afegeix funcionalitat per obrir el panell d’exercicis corresponent a cada entrenament.
     * Si L'usuari no té Workouts o has entrat com a instructor, t'ho diu
     */
    private void carregarWorkouts() {
        WorkoutService wservice = new WorkoutService();

        List<Workout> workouts = wservice.getWorkoutsByUserId(Instructor);

        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Id del Workout");

        for (Workout w : workouts) {
            tableModel.addRow(new Object[]{ w.getId()});
        }
        if (tableModel.getRowCount()==0){
             tableModel.addRow(new Object[]{"Cap Workout" });
             tableModel.addRow(new Object[]{"Si ets un instructor, aixó es normal" });
             tableModel.addRow(new Object[]{"També potser que l'usuari seleccionat no en tengui" });
        }

        jTable1.setModel(tableModel);

        //Afegim la funcionalitat de clic, si fas clic al workout se obrin els exercicis a "ExercisePanel".
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() == 1) {
                    int filaSeleccionada = jTable1.getSelectedRow();

                    if (filaSeleccionada != -1) {
                        Object value = jTable1.getValueAt(filaSeleccionada, 0);
                        if (value == null) return;

                        String selectedValue = value.toString().trim();

                        if (!selectedValue.matches("\\d+")) {   
                            return;
                        }

                        int numeroId = Integer.parseInt(selectedValue);

                        ExerciseService Eservice = new ExerciseService();           
                        WorkoutService workService = new WorkoutService();
                        Workout finalWorkout = workService.getWorkoutsById(numeroId);

                        parentMenu.transitionToPanel(new ExercisePanel(finalWorkout, parentMenu, Instructor));
                    }
                }
            }
        });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuBar jMenuBar6;
    private javax.swing.JMenuBar jMenuBar7;
    private javax.swing.JMenuBar jMenuBar8;
    private javax.swing.JMenuBar jMenuBar9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}