package project1;

import java.util.ArrayList;

/**
 *
 * @author Jared
 */
public class PaymentInterface extends javax.swing.JFrame
{
    public PaymentInterface(boolean loadChart)
    {
        initComponents();
        if (loadChart)
        {
            populateChart();
        }
        this.setLocationRelativeTo(null);
        this.m_cardNo = "";
        this.m_cvv = "";
        this.m_pin = "";
        this.m_city = "";
        this.m_state = "";
        this.m_street = "";
        this.m_zip = "";
    }

    @SuppressWarnings("unchecked")
    private void initComponents()
    {

        amountOwed = new javax.swing.JTextField();
        amountPaid = new javax.swing.JTextField();
        paymentOption = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        pay = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        cardNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        patientName = new javax.swing.JTextField();
        ssn = new javax.swing.JTextField();
        cvv = new javax.swing.JTextField();
        street = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        state = new javax.swing.JTextField();
        zipCode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        amountOwed.setText("Amount Owed");
        amountOwed.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                amountOwedMouseClicked(evt);
            }
        });

        amountPaid.setText("Amount Paid");
        amountPaid.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                amountPaidMouseClicked(evt);
            }
        });

        paymentOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Credit", "Debit", "Cash" }));
        paymentOption.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                paymentOptionActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("$");

        pay.setText("Pay");
        pay.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                payActionPerformed(evt);
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

        cardNo.setText("Card Number");
        cardNo.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                cardNoMouseClicked(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("$");

        patientName.setText("Patient Name");
        patientName.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                patientNameMouseClicked(evt);
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

        cvv.setText("CVV");
        cvv.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                cvvMouseClicked(evt);
            }
        });

        street.setText("Street");
        street.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                streetMouseClicked(evt);
            }
        });

        city.setText("City");
        city.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                cityMouseClicked(evt);
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

        jLabel3.setText("Billing Address");

        pin.setText("Pin");
        pin.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                pinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(73, 73, 73)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(pay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(patientName)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(paymentOption, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(ssn))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(amountOwed, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(amountPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(cardNo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(street, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                                                                .addComponent(state))
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(zipCode)
                                                                        .addComponent(city)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addGap(26, 26, 26)
                                                                                .addComponent(pin)))))))
                                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(patientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(amountOwed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(amountPaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(paymentOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cardNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(street, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addComponent(pay)
                                .addGap(18, 18, 18)
                                .addComponent(cancel)
                                .addGap(24, 24, 24))
        );

        pack();
        pin.setVisible(false);
    }// </editor-fold>

    private void populateChart()
    {
        ArrayList<String> chart = Helper.loadChartData(".patient_id.txt");

        try
        {
            patientName.setText(chart.get(1));
            amountOwed.setText(chart.get(3));
            amountPaid.setText(chart.get(3));
            paymentOption.setSelectedItem(chart.get(4));
        }
        catch (Exception e)
        {
            ErrorScreen error = new ErrorScreen("Failed to set chart data\n"+e.toString());
            error.setVisible(true);
            this.dispose();
        }
    }

    private void amountOwedMouseClicked(java.awt.event.MouseEvent evt)
    {
        amountOwed.setText("");
    }

    private void amountPaidMouseClicked(java.awt.event.MouseEvent evt)
    {
        amountPaid.setText("");
    }

    private void paymentOptionActionPerformed(java.awt.event.ActionEvent evt)
    {
        m_paymentType = paymentOption.getItemAt(paymentOption.getSelectedIndex());
        switch (m_paymentType)
        {
            case "Debit":
                pin.setVisible(true);
            case "Credit":
                city.setVisible(true);
                state.setVisible(true);
                zipCode.setVisible(true);
                cardNo.setVisible(true);
                cvv.setVisible(true);
                street.setVisible(true);
                break;
            case "Cash":
                pin.setVisible(false);
                city.setVisible(false);
                state.setVisible(false);
                zipCode.setVisible(false);
                cardNo.setVisible(false);
                cvv.setVisible(false);
                street.setVisible(false);
                jLabel3.setVisible(false);
                break;
            default:
                break;
        }
    }

    private void patientNameMouseClicked(java.awt.event.MouseEvent evt)
    {
        patientName.setText("");
    }

    private void ssnMouseClicked(java.awt.event.MouseEvent evt)
    {
        ssn.setText("");
    }

    private void payActionPerformed(java.awt.event.ActionEvent evt)
    {
        m_amount = amountPaid.getText();
        m_patientName = patientName.getText();
        m_paymentType = paymentOption.getItemAt(paymentOption.getSelectedIndex());

        switch (m_paymentType)
        {
            case "Debit":
                m_pin = pin.getText();
            case "Credit":
                m_cardNo = cardNo.getText();
                m_cvv = cvv.getText();
                m_state = state.getText();
                m_street = street.getText();
                m_city = city.getText();
                m_zip = zipCode.getText();
                break;
            default:
                break;
        }

        java.text.SimpleDateFormat frmt = new java.text.SimpleDateFormat("dd/MM/yyyy");
        java.util.Date date = new java.util.Date();
        m_date = frmt.format(date);

        String addr = m_street + " " + m_city + ", " + m_state + " " + m_zip;
        m_ssn = ssn.getText();

        PaymentManager mgr = new PaymentManager(m_patientName, m_ssn, m_amount, m_date, m_cardNo, m_cvv, m_pin, m_paymentType, addr);
        m_refNum = mgr.retreiveRefNum();
        System.out.println("ref: " + m_refNum);
        
        DatabaseManager DBM = new DatabaseManager();
        DBM.increaseDailyMoney(Double.parseDouble(m_amount));
        DBM.closeDB();

        this.dispose();
    }

    private void cancelActionPerformed(java.awt.event.ActionEvent evt)
    {
        this.dispose();
    }

    private void cardNoMouseClicked(java.awt.event.MouseEvent evt)
    {
        cardNo.setText("");
    }

    private void cvvMouseClicked(java.awt.event.MouseEvent evt)
    {
        cvv.setText("");
    }

    private void streetMouseClicked(java.awt.event.MouseEvent evt)
    {
        street.setText("");
    }

    private void cityMouseClicked(java.awt.event.MouseEvent evt)
    {
        city.setText("");
    }

    private void stateMouseClicked(java.awt.event.MouseEvent evt)
    {
        state.setText("");
    }

    private void zipCodeMouseClicked(java.awt.event.MouseEvent evt)
    {
        zipCode.setText("");
    }

    private void pinMouseClicked(java.awt.event.MouseEvent evt)
    {
        pin.setText("");
    }

    private javax.swing.JTextField amountOwed;
    private javax.swing.JTextField amountPaid;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField cardNo;
    private javax.swing.JTextField city;
    private javax.swing.JTextField cvv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField patientName;
    private javax.swing.JButton pay;
    private javax.swing.JComboBox<String> paymentOption;
    private javax.swing.JTextField pin;
    private javax.swing.JTextField ssn;
    private javax.swing.JTextField state;
    private javax.swing.JTextField street;
    private javax.swing.JTextField zipCode;

    private DatabaseManager dbm;

    private String m_date;
    private String m_refNum;
    private String m_amount;
    private String m_patientName;
    private String m_paymentType;
    private String m_ssn;

    private String m_cardNo;
    private String m_cvv;
    private String m_pin;
    private String m_street;
    private String m_city;
    private String m_zip;
    private String m_state;
}