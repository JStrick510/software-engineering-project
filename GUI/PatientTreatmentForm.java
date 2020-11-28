package GUI;

import Database.DatabaseManager;
import HCSUtility.Helper;

import java.util.ArrayList;

/**
 *
 * @author Jared
 */
public class PatientTreatmentForm extends javax.swing.JFrame
{

    public PatientTreatmentForm(String employee, String ssn)
    {
        this.m_ssn = ssn;
        this.m_employeeType = employee;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public PatientTreatmentForm(String employee, boolean loadChart, String ssn)
    {
        this.m_ssn = ssn;
        this.m_employeeType = employee;
        initComponents();
        if (loadChart)
        {
            populateChart();
        }
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents()
    {
        month = new javax.swing.JTextField();
        weight = new javax.swing.JTextField();
        day = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        bloodPressure = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        reason = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        treatment = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        perscription = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        feet = new javax.swing.JTextField();
        inches = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        month.setText("MM");
        month.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                monthMouseClicked(evt);
            }
        });

        weight.setText("Weight");
        weight.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                weightMouseClicked(evt);
            }
        });

        day.setText("DD");
        day.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                dayMouseClicked(evt);
            }
        });

        year.setText("YY");
        year.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                yearMouseClicked(evt);
            }
        });

        bloodPressure.setText("BP");
        bloodPressure.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                bloodPressureMouseClicked(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        reason.setColumns(20);
        reason.setRows(5);
        reason.setText("Reason of Visit");
        reason.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                reasonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(reason);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        treatment.setColumns(20);
        treatment.setRows(5);
        treatment.setText("Treatment");
        treatment.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                treatmentMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(treatment);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        perscription.setColumns(20);
        perscription.setRows(5);
        perscription.setText("Perscription");
        perscription.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                perscriptionMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(perscription);

        jLabel1.setText("lbs");

        feet.setText("Ft");
        feet.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                feetMouseClicked(evt);
            }
        });

        inches.setText("In");
        inches.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                inchesMouseClicked(evt);
            }
        });

        jLabel2.setText("mmHg");

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

        jLabel3.setText("Ft");

        jLabel4.setText("In");

        setPermissions();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(year, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(feet, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(inches, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel4))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(bloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(52, 52, 52))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(feet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(inches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4))
                                                .addGap(21, 21, 21)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(bloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2)))
                                        .addComponent(jScrollPane2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(submit)
                                        .addComponent(cancel))
                                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void setPermissions()
    {
        if (m_employeeType.equals("Nurse"))
        {
            System.out.println("Nurse provided");
            treatment.setEditable(false);
            perscription.setEditable(false);
        }
    }

    private void dayMouseClicked(java.awt.event.MouseEvent evt)
    {
        day.setText("");
    }

    private void yearMouseClicked(java.awt.event.MouseEvent evt)
    {
        year.setText("");
    }

    private void monthMouseClicked(java.awt.event.MouseEvent evt)
    {
        month.setText("");
    }

    private void weightMouseClicked(java.awt.event.MouseEvent evt)
    {
        weight.setText("");
    }

    private void bloodPressureMouseClicked(java.awt.event.MouseEvent evt)
    {
        bloodPressure.setText("");
    }

    private void reasonMouseClicked(java.awt.event.MouseEvent evt)
    {
        if (!m_employeeType.equals("Nurse"))
        {
            reason.setText("");
        }
    }

    private void treatmentMouseClicked(java.awt.event.MouseEvent evt)
    {
        if (!m_employeeType.equals("Nurse"))
        {
            treatment.setText("");
        }
    }

    private void feetMouseClicked(java.awt.event.MouseEvent evt)
    {
        feet.setText("");
    }

    private void inchesMouseClicked(java.awt.event.MouseEvent evt)
    {
        inches.setText("");
    }

    private void perscriptionMouseClicked(java.awt.event.MouseEvent evt)
    {
        if (!m_employeeType.equals("Nurse"))
        {
            perscription.setText("");
        }
    }

    private void submitActionPerformed(java.awt.event.ActionEvent evt)
    {
        dbm = new DatabaseManager();
        dbm.deleteTreatmentChart(Helper.generateId(m_ssn));
        String height = feet.getText() + "' " + inches.getText() + "\"";

        dbm.addTreatmentChart(Helper.generateId(m_ssn), height, weight.getText(), bloodPressure.getText(), reason.getText(),
                                treatment.getText(), perscription.getText(), Helper.generateId(m_ssn));
        dbm.closeDB();
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
            String height = chart.get(1);
            String[] fullHeight = height.split("\\s+");
            switch (fullHeight.length)
            {
                case 2:
                    inches.setText(fullHeight[1]);
                case 1:
                    feet.setText(fullHeight[0]);
                    break;
                default:
                    ErrorScreen error = new ErrorScreen("No height provided\n");
                    error.setVisible(true);
                    return;
            }

            weight.setText(chart.get(2));
            bloodPressure.setText(chart.get(3));
            reason.setText(chart.get(4));
            treatment.setText(chart.get(5));
            perscription.setText(chart.get(6));

        }
        catch (Exception e)
        {
            ErrorScreen error = new ErrorScreen("Failed to populate chart\n"+e.toString());
            error.setVisible(true);
            this.dispose();
        }
    }

    private javax.swing.JTextField bloodPressure;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField day;
    private javax.swing.JTextField feet;
    private javax.swing.JTextField inches;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField month;
    private javax.swing.JTextArea perscription;
    private javax.swing.JTextArea reason;
    private javax.swing.JButton submit;
    private javax.swing.JTextArea treatment;
    private javax.swing.JTextField weight;
    private javax.swing.JTextField year;

    private DatabaseManager dbm;

    private String m_month;
    private String m_day;
    private String m_year;
    private String m_feet;
    private String m_inches;
    private String m_perscription;
    private String m_reason;
    private String m_weight;
    private String m_bp;
    private String m_employeeType;
    private String m_ssn;
}
