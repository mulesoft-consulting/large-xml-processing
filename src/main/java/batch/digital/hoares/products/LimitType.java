
package batch.digital.hoares.products;

import java.math.BigDecimal;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://hoares.digital.batch/Products.xsd" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LimitType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="overdraft" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:decimal" name="arrange" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:decimal" name="credit" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:decimal" name="repaymentAmount" minOccurs="0" maxOccurs="1"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class LimitType
{
    private BigDecimal overdraft;
    private BigDecimal arrange;
    private BigDecimal credit;
    private BigDecimal repaymentAmount;

    /** 
     * Get the 'overdraft' element value.
     * 
     * @return value
     */
    public BigDecimal getOverdraft() {
        return overdraft;
    }

    /** 
     * Set the 'overdraft' element value.
     * 
     * @param overdraft
     */
    public void setOverdraft(BigDecimal overdraft) {
        this.overdraft = overdraft;
    }

    /** 
     * Get the 'arrange' element value.
     * 
     * @return value
     */
    public BigDecimal getArrange() {
        return arrange;
    }

    /** 
     * Set the 'arrange' element value.
     * 
     * @param arrange
     */
    public void setArrange(BigDecimal arrange) {
        this.arrange = arrange;
    }

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
     * Get the 'repaymentAmount' element value.
     * 
     * @return value
     */
    public BigDecimal getRepaymentAmount() {
        return repaymentAmount;
    }

    /** 
     * Set the 'repaymentAmount' element value.
     * 
     * @param repaymentAmount
     */
    public void setRepaymentAmount(BigDecimal repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }
}
