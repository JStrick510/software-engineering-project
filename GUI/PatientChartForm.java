package GUI;

import Database.DatabaseManager;
import HCSUtility.Helper;

import java.util.ArrayList;

public class PatientChartForm extends javax.swing.JFrame
{
    public PatientChartForm(boolean loadChart)
    {
        initComponents();
        if (loadChart)
        {
            populatePatientChart();
        }
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        fName = new javax.swing.JTextField();
        streetAddress = new javax.swing.JTextField();
        lName = new javax.swing.JTextField();
        middleInitial = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        ssn = new javax.swing.JTextField();
        insurance = new javax.swing.JTextField();
        state = new javax.swing.JTextField();
        zipCode = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        phoneNum = new javax.swing.JTextField();
        healthCondition = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fName.setText("First Name");
        fName.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                fNameMousePressed(evt);
            }
        });

        streetAddress.setText("Street Address");
        streetAddress.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                streetAddressMouseClicked(evt);
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

        middleInitial.setText("M.I.");
        middleInitial.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                middleInitialMouseClicked(evt);
            }
        });

        email.setText("Email");
        email.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                emailMouseClicked(evt);
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

        insurance.setText("Insurance");
        insurance.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                insuranceMouseClicked(evt);
            }
        });

        state.setText("State");
        state.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                stateMouseClicked(evt);
            }
        });

        zipCode.setText("Zip Code");
        zipCode.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                zipCodeMouseClicked(evt);
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

        phoneNum.setText("Phone Number");
        phoneNum.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                phoneNumMouseClicked(evt);
            }
        });

        healthCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Excellent", "Good", "Fair", "Poor", "Bad" }));
        healthCondition.setToolTipText("");
        healthCondition.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                healthConditionActionPerformed(evt);
            }
        });

        jLabel1.setText("Health Condition:");

        city.setText("City");
        city.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                cityMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(email, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(fName, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                                                        .addComponent(streetAddress))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(middleInitial, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(phoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(insurance))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(129, 129, 129)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(ssn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(healthCondition, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(middleInitial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(streetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(phoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(insurance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(healthCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(submit)
                                .addGap(18, 18, 18)
                                .addComponent(cancel)
                                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>

    private void fNameMousePressed(java.awt.event.MouseEvent evt)
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

    private void streetAddressMouseClicked(java.awt.event.MouseEvent evt)
    {
        streetAddress.setText("");
    }

    private void stateMouseClicked(java.awt.event.MouseEvent evt)
    {
        state.setText("");
    }

    private void zipCodeMouseClicked(java.awt.event.MouseEvent evt)
    {
        zipCode.setText("");
    }

    private void emailMouseClicked(java.awt.event.MouseEvent evt)
    {
        email.setText("");
    }

    private void ssnMouseClicked(java.awt.event.MouseEvent evt)
    {
        ssn.setText("");
    }

    private void insuranceMouseClicked(java.awt.event.MouseEvent evt)
    {
        insurance.setText("");
    }

    private void cancelActionPerformed(java.awt.event.ActionEvent evt)
    {
        this.dispose();
    }

    private void healthConditionActionPerformed(java.awt.event.ActionEvent evt)
    {
        m_condition = healthCondition.getItemAt(healthCondition.getSelectedIndex());
    }

    private void cityMouseClicked(java.awt.event.MouseEvent evt)
    {
        city.setText("");
    }

    private void phoneNumMouseClicked(java.awt.event.MouseEvent evt)
    {
        phoneNum.setText("");
    }

    private void submitActionPerformed(java.awt.event.ActionEvent evt)
    {
        // GEt all the text values
        m_email = email.getText();
        m_firstName = fName.getText();
        m_lastName = lName.getText();
        m_middleInitial = middleInitial.getText();
        m_streetAddress = streetAddress.getText();
        m_insurance = insurance.getText();
        m_ssn = ssn.getText();
        m_zipCode = zipCode.getText();
        m_state = state.getText();
        m_city = city.getText();
        m_phoneNum = phoneNum.getText();

        // Initalize DBM
        dbm = new DatabaseManager();

        // Format the name and address into a single string
        String fullName = m_firstName + " " + m_middleInitial + " " + m_firstName;
        String fullAddress = m_streetAddress + " " + m_city + ", " + m_state + " " + m_zipCode;

        // Create unique id's based on the patients ssn and the current time in seconds
        String patientId = Helper.generateId(m_ssn);
        long currTime = System.currentTimeMillis() / 1000;
        String time = Long.toString(currTime);
        String chartId = Helper.generateId(time);

        System.out.println("Patient: " + patientId + " chart: " + chartId);

        // Add to DB
        dbm.addPaitentChart(m_ssn,  patientId, m_email, m_phoneNum,
                            m_condition, fullName.toLowerCase(), fullAddress, m_insurance, chartId);
        dbm.closeDB();
        this.dispose();
    }

    private void populatePatientChart()
    {
        ArrayList<String> chart = Helper.loadChartData(".patient_id.txt");
        try
        {
            // PatientChart: SSN, PatientID, Email, PhoneNumber, HealthCondition, Name, Address, InsuranceName, ChartID
            ssn.setText(chart.get(0));
            email.setText(chart.get(2));
            phoneNum.setText(chart.get(3));
            healthCondition.setSelectedItem(chart.get(4));

            String name = chart.get(5);
            String[] fullName = name.split("\\s+");
            fName.setText(fullName[0]);
            middleInitial.setText(fullName[1]);
            lName.setText(fullName[2]);

            String address = chart.get(6);
            String[] streetAddr = address.split("\\s+");
            streetAddress.setText(streetAddr[0]);
            city.setText(streetAddr[1]);

            address = chart.get(7);
            String[] stateAddr = address.split("\\s+");
            state.setText(stateAddr[0]);
            zipCode.setText(stateAddr[1]);

            insurance.setText(chart.get(8));
        }
        catch (Exception ex)
        {
            ErrorScreen error = new ErrorScreen("Failed to populate chart\n"+ex.toString());
            error.setVisible(true);
            this.dispose();
        }
    }


    private javax.swing.JButton cancel;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fName;
    private javax.swing.JTextField insurance;
    private javax.swing.JTextField lName;
    private javax.swing.JTextField middleInitial;
    private javax.swing.JTextField ssn;
    private javax.swing.JTextField state;
    private javax.swing.JTextField streetAddress;
    private javax.swing.JButton submit;
    private javax.swing.JTextField zipCode;
    private javax.swing.JTextField city;
    private javax.swing.JComboBox<String> healthCondition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField phoneNum;

    // Strings
    private String m_email;
    private String m_firstName;
    private String m_insurance;
    private String m_lastName;
    private String m_middleInitial;
    private String m_ssn;
    private String m_state;
    private String m_streetAddress;
    private String m_zipCode;
    private String m_city;
    private String m_phoneNum;
    private String m_condition;

    //DBM
    private DatabaseManager dbm;
}
