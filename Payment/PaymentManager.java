package Payment;

import Database.DatabaseManager;

public class PaymentManager
{
    private DatabaseManager dbm;

    private String m_patientName;
    private String m_date;
    private String m_amount;
    private String m_cardNo;
    private String m_cvv;
    private String m_pin;
    private String m_paymentType;
    private String m_referenceNum;
    private String m_addr;

    public PaymentManager()
    {
        dbm = new DatabaseManager();
        this.m_patientName = "";
        this.m_amount = "";
        this.m_date = "";
        this.m_cardNo = "";
        this.m_cvv = "";
        this.m_pin = "";
        this.m_paymentType = "";
        this.m_referenceNum = "";
        this.m_addr = "";
    }

    public PaymentManager(String patientName, String amnt, String date, String cardNo, String cvv, String pin, String paymentType, String addr)
    {
        dbm = new DatabaseManager();
        this.m_patientName = patientName;
        this.m_amount = amnt;
        this.m_date = date;
        this.m_cardNo = cardNo;
        this.m_cvv = cvv;
        this.m_pin = pin;
        this.m_paymentType = paymentType;
        this.m_addr = addr;
    }

    public String retreiveRefNum()
    {
        BankInterface bank = new BankInterface(m_cardNo, m_cvv, m_pin);
        m_referenceNum = bank.generateRefNum();

        return m_referenceNum;
    }

    public String getDate()
    {
        return m_date;
    }

    public void setDate(String m_date)
    {
        this.m_date = m_date;
    }

    public String getAmount()
    {
        return m_amount;
    }

    public void setAmount(String m_amount)
    {
        this.m_amount = m_amount;
    }

    public void setCardNo(String cardNo)
    {
        this.m_cardNo = cardNo;
    }

    public String getCardNo()
    {
        return m_cardNo;
    }

    public void setCVV(String cvv)
    {
        this.m_cvv = cvv;
    }

    public String getCVV()
    {
        return m_cvv;
    }

    public String getPaymentType()
    {
        return m_paymentType;
    }

    public void setPaymentType(String m_paymentType)
    {
        this.m_paymentType = m_paymentType;
    }

    public String getPatientName()
    {
        return m_patientName;
    }

    public void setPatientName(String m_patientName)
    {
        this.m_patientName = m_patientName;
    }

    public String getReferenceNum()
    {
        return m_referenceNum;
    }

    public void setReferenceNum(String m_referenceNum)
    {
        this.m_referenceNum = m_referenceNum;
    }

     
}
