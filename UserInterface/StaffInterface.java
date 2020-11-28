package UserInterface;

import Database.DatabaseManager;
import GUI.*;

/**
 *
 * @author Jared
 */
public class StaffInterface extends javax.swing.JFrame
{
    public StaffInterface(String id)
    {
        this.m_employeeId = id;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        newAppointment = new javax.swing.JButton();
        modAppointment = new javax.swing.JButton();
        payment = new javax.swing.JButton();
        patientInformation = new javax.swing.JButton();
        logOut = new javax.swing.JButton();
        viewPatient = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        viewPay = new javax.swing.JButton();
        cancelAppt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        newAppointment.setText("New Appointment");
        newAppointment.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                newAppointmentActionPerformed(evt);
            }
        });

        modAppointment.setText("Modify Appointment");
        modAppointment.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                modAppointmentActionPerformed(evt);
            }
        });

        payment.setText("Make Payment");
        payment.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                paymentActionPerformed(evt);
            }
        });

        patientInformation.setText("Add Patient Information");
        patientInformation.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                patientInformationActionPerformed(evt);
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

        viewPatient.setText("View Patient Info");
        viewPatient.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                viewPatientActionPerformed(evt);
            }
        });

        jLabel1.setText("Staff Interface");

        viewPay.setText("View Payment");
        viewPay.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                viewPayActionPerformed(evt);
            }
        });

        cancelAppt.setText("Cancel Appointment");
        cancelAppt.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cancelApptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(129, 129, 129)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(104, 104, 104)
                                                .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(113, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(modAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                        .addComponent(newAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cancelAppt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(viewPatient, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                        .addComponent(patientInformation, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                        .addComponent(payment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(viewPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(newAppointment)
                                        .addComponent(viewPatient))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(patientInformation)
                                                .addGap(18, 18, 18)
                                                .addComponent(payment))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(modAppointment)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(viewPay)
                                        .addComponent(cancelAppt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(logOut)
                                .addGap(22, 22, 22))
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
    }// </editor-fold>

    private void newAppointmentActionPerformed(java.awt.event.ActionEvent evt)
    {
        AppointmentInterface appt = new AppointmentInterface();
        appt.setVisible(true);
    }

    private void modAppointmentActionPerformed(java.awt.event.ActionEvent evt)
    {
        PatientSelect select = new PatientSelect("Appointment");
        select.setVisible(true);
    }

    private void paymentActionPerformed(java.awt.event.ActionEvent evt)
    {
        PaymentInterface pay = new PaymentInterface(false);
        pay.setVisible(true);
    }

    private void patientInformationActionPerformed(java.awt.event.ActionEvent evt)
    {
        PatientChartForm patient = new PatientChartForm(false);
        patient.setVisible(true);
    }

    private void logOutActionPerformed(java.awt.event.ActionEvent evt)
    {
        dbm = new DatabaseManager();
        dbm.removeCurrentLogIn(m_employeeId);
        dbm.closeDB();
        this.dispose();
    }

    private void viewPatientActionPerformed(java.awt.event.ActionEvent evt)
    {
        PatientSelect patientSelect = new PatientSelect("Patient");
        patientSelect.setVisible(true);
    }

    private void viewPayActionPerformed(java.awt.event.ActionEvent evt)
    {
        PatientSelect patientSelect = new PatientSelect("Pay");
        patientSelect.setVisible(true);
    }

    private void cancelApptActionPerformed(java.awt.event.ActionEvent evt)
    {
        PatientSelect patientSelect = new PatientSelect("Cancel");
        patientSelect.setVisible(true);
    }

    private javax.swing.JButton cancelAppt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logOut;
    private javax.swing.JButton modAppointment;
    private javax.swing.JButton newAppointment;
    private javax.swing.JButton patientInformation;
    private javax.swing.JButton payment;
    private javax.swing.JButton viewPatient;
    private javax.swing.JButton viewPay;

    private DatabaseManager dbm;

    private String m_employeeId;
}