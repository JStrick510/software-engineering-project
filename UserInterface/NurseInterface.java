package UserInterface;

import Database.DatabaseManager;
import GUI.PatientSelect;
import GUI.PatientTreatmentForm;

/**
 *
 * @author Jared
 */
public class NurseInterface extends javax.swing.JFrame
{

    public NurseInterface(String id)
    {
        this.m_employeeId = id;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents()
    {

        editPatient = new javax.swing.JButton();
        viewPatient = new javax.swing.JButton();
        logOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        editPatient.setText("Edit Patient Chart");
        editPatient.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                editPatientActionPerformed(evt);
            }
        });

        viewPatient.setText("View Patient Chart");
        viewPatient.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                viewPatientActionPerformed(evt);
            }
        });

        logOut.setText("Log Out");
        logOut.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                logOutActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nurse Interface");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(viewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(editPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(editPatient)
                                .addGap(18, 18, 18)
                                .addComponent(viewPatient)
                                .addGap(18, 18, 18)
                                .addComponent(logOut)
                                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void editPatientActionPerformed(java.awt.event.ActionEvent evt)
    {
        PatientTreatmentForm treatmentForm = new PatientTreatmentForm("Nurse", false);
        treatmentForm.setVisible(true);
    }

    private void viewPatientActionPerformed(java.awt.event.ActionEvent evt)
    {
        PatientSelect select = new PatientSelect("Patient");
        select.setVisible(true);
    }

    private void logOutActionPerformed(java.awt.event.ActionEvent evt)
    {
        dbm = new DatabaseManager();
        dbm.removeCurrentLogIn(m_employeeId);
        dbm.closeDB();
        System.exit(0);
    }

    private javax.swing.JButton editPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logOut;
    private javax.swing.JButton viewPatient;

    private DatabaseManager dbm;

    private String m_employeeId;
}
