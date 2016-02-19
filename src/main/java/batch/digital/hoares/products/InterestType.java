
package batch.digital.hoares.products;

import java.math.BigDecimal;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://hoares.digital.batch/Products.xsd" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="InterestType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="credit" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:decimal" name="debit" minOccurs="0" maxOccurs="1"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class InterestType
{
    private BigDecimal credit;
    private BigDecimal debit;

    /** 
     * Get the 'credit' element value.
     * 
     * @return value
     */
    public BigDecimal getCredit() {
        return credit;
    }

    /** 
     * Set the 'credit' element value.
     * 
     * @param credit
     */
    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }

    /** 
     * Get the 'debit' element value.
     * 
     * @return value
     */
    public BigDecimal getDebit() {
        return debit;
    }

    /** 
     * Set the 'debit' element value.
     * 
     * @param debit
     */
    public void setDebit(BigDecimal debit) {
        this.debit = debit;
    }
}
