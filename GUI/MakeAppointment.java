package GUI;

import Appointment.AppointmentManager;
import Database.DatabaseManager;
import HCSUtility.Helper;

import java.util.ArrayList;

/**
 *
 * @author Jared
 */
public class MakeAppointment extends javax.swing.JFrame
{
    public MakeAppointment(String doctorName)
    {
        m_loadChart = false;
        m_cancelAppt = false;
        m_doctorName = doctorName;
        initComponents();
        if (!m_doctorName.isEmpty())
        {
            populateEmployeeID();
        }
        this.setLocationRelativeTo(null);
    }

    public MakeAppointment(String doctorName, String ssn, boolean cancel)
    {
        m_ssn = ssn;
        m_loadChart = false;
        m_cancelAppt = cancel;
        m_doctorName = doctorName;
        initComponents();
        if (!m_doctorName.isEmpty())
        {
            populateEmployeeID();
        }
        if (m_loadChart)
        {
            removeAppt();
        }
        this.setLocationRelativeTo(null);
        this.dispose();
    }

    public MakeAppointment(String doctorName, boolean loadChart, String ssn)
    {
        m_cancelAppt = false;
        m_loadChart = loadChart;
        m_doctorName = doctorName;
        m_ssn = ssn;
        initComponents();
        if (!m_doctorName.isEmpty())
        {
            populateEmployeeID();
        }

        if (loadChart)
        {
            populateChart();
        }
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents()
    {

        fName = new javax.swing.JTextField();
        middleInitial = new javax.swing.JTextField();
        lName = new javax.swing.JTextField();
        ssn = new javax.swing.JTextField();
        time = new javax.swing.JComboBox<>();
        doctorName = new javax.swing.JTextField();
        employeeId = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fName.setText("First Name");
        fName.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                fNameMouseClicked(evt);
            }
        });

        middleInitial.setText("M.I.");
        middleInitial.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                middleInitialMouseClicked(evt);
            }
        });

        lName.setText("Last Name");
        lName.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lNameMouseClicked(evt);
            }
        });

        ssn.setText("SSN");
        ssn.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                ssnMouseClicked(evt);
            }
        });

        time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9am-9:30am", "9:30am-10am", "10am-10:30am", "10:30am-11am", "11am-11:30am", "12pm-12:30pm", "12:30pm-1pm", "1pm-1:30pm", "1:30pm-2pm", "2pm-2:30pm", "2:30pm-3pm", "3pm-3:30pm", "3:30pm-4pm", "4pm-4:30pm", "4:30pm-5pm" }));
        time.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                timeActionPerformed(evt);
            }
        });

        doctorName.setText("Doctor Name");
        doctorName.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                doctorNameMouseClicked(evt);
            }
        });

        employeeId.setText("Employee ID");

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

        // Employee ID will be populated from the database. No one will actually remember everyone else's employee ID
        employeeId.setEditable(false);
        doctorName.setText(m_doctorName);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(doctorName, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                        .addComponent(ssn)
                                        .addComponent(fName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(middleInitial, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(employeeId)
                                        .addComponent(lName)
                                        .addComponent(time, 0, 130, Short.MAX_VALUE))
                                .addContainerGap(19, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(submit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                                .addGap(151, 151, 151))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(middleInitial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(doctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(employeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(submit)
                                .addGap(18, 18, 18)
                                .addComponent(cancel)
                                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        m_time = time.getItemAt(time.getSelectedIndex());
    }// </editor-fold>

    private void fNameMouseClicked(java.awt.event.MouseEvent evt)
    {
        fName.setText("");
    }

    private void middleInitialMouseClicked(java.awt.event.MouseEvent evt)
    {
        middleInitial.setText("");
    }

    private void lNameMouseClicked(java.awt.event.MouseEvent evt)
    {
        lName.setText("");
    }

    private void ssnMouseClicked(java.awt.event.MouseEvent evt)
    {
        ssn.setText("");
    }

    private void timeActionPerformed(java.awt.event.ActionEvent evt)
    {
        m_time = time.getItemAt(time.getSelectedIndex());
    }

    private void doctorNameMouseClicked(java.awt.event.MouseEvent evt)
    {
        doctorName.setText("");
    }

    private void submitActionPerformed(java.awt.event.ActionEvent evt)
    {
        mgr = new AppointmentManager();
        m_name = fName.getText() + " " + middleInitial.getText() + " " + lName.getText();
        m_ssn = ssn.getText();

        String tempDoc = doctorName.getText();
        if (tempDoc != m_doctorName)
        {
            populateEmployeeID();
            m_doctorName = tempDoc;
        }

        String patientId = Helper.generateId(m_ssn);
        int index = m_time.indexOf("-");
        String avail = m_time.substring(0, index);
        if (m_loadChart)
        {
            mgr.markAppointment(patientId, avail, m_id, m_name);
        }
        else
        {
            mgr.modifyAppopintment(patientId, avail, m_id, m_name);
        }
        this.dispose();
    }

    private void cancelActionPerformed(java.awt.event.ActionEvent evt)
    {
        this.dispose();
    }

    private void populateChart()
    {
        ArrayList<String> chart = Helper.loadChartData(".patient_id.txt");

        try
        {
            m_id = chart.get(2);
            dbm = new DatabaseManager();
            m_doctorName = dbm.getLogInInfoData(m_id, 1);
            doctorName.setText(m_doctorName);
            employeeId.setText(m_id);
            ssn.setText(m_ssn);

            String name = dbm.getPatientChartData(m_ssn, 5);
            if (!name.equals("ERROR"))
            {
                String entireName = chart.get(3);
                String[] fullName = entireName.split("\\s+");
                switch (fullName.length)
                {
                    case 3:
                        lName.setText(fullName[2]);
                        middleInitial.setText(fullName[1]);
                        fName.setText(fullName[0]);
                        break;
                    case 2:
                        lName.setText(fullName[1]);
                    case 1:
                        fName.setText(fullName[0]);
                        break;
                    default:
                        ErrorScreen error = new ErrorScreen("No patient name");
                        error.setVisible(true);
                        return;

                }
                time.setSelectedItem(chart.get(1));
                dbm.closeDB();
            }
            else
            {
                ErrorScreen error = new ErrorScreen("Failed to find patient");
                error.setVisible(true);
                dbm.closeDB();
                return;
            }
        }
        catch (Exception e)
        {
            ErrorScreen error = new ErrorScreen("Failed to populate chart\n"+e.toString());
            error.setVisible(true);
            this.dispose();
        }
    }

    private void populateEmployeeID()
    {
        dbm = new DatabaseManager();
        System.out.println("Sending this name: " + m_doctorName.toLowerCase());
        m_id = dbm.getEmployeeID(m_doctorName.toLowerCase());
        employeeId.setText(m_id);
        dbm.closeDB();
    }

    private void removeAppt()
    {
        mgr.clearAppointment(Helper.generateId(m_ssn));
    }

    private javax.swing.JButton cancelAppt;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField doctorName;
    private javax.swing.JTextField employeeId;
    private javax.swing.JTextField fName;
    private javax.swing.JTextField lName;
    private javax.swing.JTextField middleInitial;
    private javax.swing.JTextField ssn;
    private javax.swing.JButton submit;
    private javax.swing.JComboBox<String> time;

    private String m_doctorName;
    private String m_time;
    private String m_name;
    private String m_ssn;
    private String m_id;
    private boolean m_loadChart;
    private boolean m_cancelAppt;

    private AppointmentManager mgr;
    private DatabaseManager dbm;
}
