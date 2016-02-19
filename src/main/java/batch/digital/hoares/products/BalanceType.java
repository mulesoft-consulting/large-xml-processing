
package batch.digital.hoares.products;

import java.math.BigDecimal;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://hoares.digital.batch/Products.xsd" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BalanceType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="EODFlag" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:decimal" name="ledger" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:decimal" name="available" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:decimal" name="average" minOccurs="0" maxOccurs="1"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class BalanceType
{
    private String EODFlag;
    private BigDecimal ledger;
    private BigDecimal available;
    private BigDecimal average;

    /** 
     * Get the 'EODFlag' element value.
     * 
     * @return value
     */
    public String getEODFlag() {
        return EODFlag;
    }

    /** 
     * Set the 'EODFlag' element value.
     * 
     * @param EODFlag
     */
    public void setEODFlag(String EODFlag) {
        this.EODFlag = EODFlag;
    }

    /** 
     * Get the 'ledger' element value.
     * 
     * @return value
     */
    public BigDecimal getLedger() {
        return ledger;
    }

    /** 
     * Set the 'ledger' element value.
     * 
     * @param ledger
     */
    public void setLedger(BigDecimal ledger) {
        this.ledger = ledger;
    }

    /** 
     * Get the 'available' element value.
     * 
     * @return value
     */
    public BigDecimal getAvailable() {
        return available;
    }

    /** 
     * Set the 'available' element value.
     * 
     * @param available
     */
    public void setAvailable(BigDecimal available) {
        this.available = available;
    }

    /** 
     * Get the 'average' element value.
     * 
     * @return value
     */
    public BigDecimal getAverage() {
        return average;
    }

    /** 
     * Set the 'average' element value.
     * 
     * @param average
     */
    public void setAverage(BigDecimal average) {
        this.average = average;
    }
}
