 package Payment;

import java.util.UUID;

public class BankInterface
{
    private String m_cardNo;
    private String m_cvv;
    private String m_pin;

    public BankInterface(String cardNo, String cvv)
    {
        this.m_cardNo = cardNo;
        this.m_cvv = cvv;
        this.m_pin = "";
    }

    public BankInterface(String cardNo, String cvv, String pin)
    {
        this(cardNo, cvv);
        this.m_pin = pin;
    }

    // No actual physical Bank to use so all payment are successful
    public String generateRefNum()
    {
        String temp = m_cardNo + m_cvv + m_pin;
        return UUID.nameUUIDFromBytes(temp.getBytes()).toString();
    }
}
