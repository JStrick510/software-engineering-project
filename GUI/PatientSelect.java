package GUI;

import Database.DatabaseManager;
import HCSUtility.Helper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Jared
 */
public class PatientSelect extends javax.swing.JFrame
{
    public PatientSelect(String selectFor)
    {
        m_selectFor = selectFor;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        ssn = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter Patient SSN");

        ssn.setText("SSN");
        ssn.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                ssnMouseClicked(evt);
            }
        });
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                submitActionPerformed(evt);
            }
        });

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ssn)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(submit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancel)
                                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void ssnMouseClicked(java.awt.event.MouseEvent evt)
    {
        ssn.setText("");
    }

    private void cancelActionPerformed(java.awt.event.ActionEvent evt)
    {
        this.dispose();
    }

    private void submitActionPerformed(java.awt.event.ActionEvent evt)
    {
        m_ssn = ssn.getText();
        dbm = new DatabaseManager();


        switch (m_selectFor)
        {
            case "Patient":
                m_chart = dbm.getPatientChartLine(m_ssn);
                break;
            case "Pay":
                m_chart = dbm.getPaymentInfoLine(m_ssn);
                break;
            case "Appointment":
                m_chart = dbm.getDoctorScheduleLine(Helper.generateId(m_ssn));
                break;
            case "Chart":
                m_chart = dbm.getTreatmentChartLine(m_ssn);
                break;
            default:
                break;
        }
        dbm.closeDB();

        if (m_chart == null)
        {
            ErrorScreen error = new ErrorScreen("Patient with ssn: " + m_ssn + " does not exist\n");
            error.setVisible(true);
            return;
        }

        returnID();

        this.dispose();
    }

    private void returnID()
    {
        try
        {
            File file = new File(".patient_id.txt");
            if (file.createNewFile())
            {
                FileWriter patientId = new FileWriter(file);
                for (String line : m_chart)
                {
                    patientId.write(line.trim()+"\n");
                }
                patientId.close();
            }
        }
        catch (IOException e)
        {
            System.out.println("Could not create file");
            ErrorScreen err = new ErrorScreen(e.toString());
            err.setVisible(true);
            return;
        }
        catch (Exception ex)
        {
            ErrorScreen error = new ErrorScreen(ex.toString());
            error.setVisible(true);
            return;
        }
        switch (m_selectFor)
        {
            case "Patient":
                PatientChartForm form = new PatientChartForm(true);
                form.setVisible(true);
                break;
            case "Pay":
                PaymentInterface pay = new PaymentInterface(true);
                pay.setVisible(true);
                break;
            case "Appointment":
                MakeAppointment appt = new MakeAppointment("", true, m_ssn);
                appt.setVisible(true);
                break;
            case "Cancel":
                MakeAppointment appt2 = new MakeAppointment("", m_ssn, true);
                appt2.setVisible(true);
                break;
            case "Chart":
                PatientTreatmentForm treatmentForm = new PatientTreatmentForm("Doctor", true);
                treatmentForm.setVisible(true);
                break;
            default:
                break;
        }
        this.dispose();
    }

    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField ssn;
    private javax.swing.JButton submit;

    private DatabaseManager dbm;

    private String m_ssn;
    private String[] m_chart;

    private String m_selectFor;
}