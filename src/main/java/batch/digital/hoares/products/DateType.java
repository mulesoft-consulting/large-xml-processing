
package batch.digital.hoares.products;

import java.sql.Date;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://hoares.digital.batch/Products.xsd" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DateType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:date" name="open" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:date" name="close" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:date" name="lastStatement" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:date" name="minRepaymentDueDate" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:date" name="system" minOccurs="0" maxOccurs="1"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DateType
{
    private Date open;
    private Date close;
    private Date lastStatement;
    private Date minRepaymentDueDate;
    private Date system;

    /** 
     * Get the 'open' element value.
     * 
     * @return value
     */
    public Date getOpen() {
        return open;
    }

    /** 
     * Set the 'open' element value.
     * 
     * @param open
     */
    public void setOpen(Date open) {
        this.open = open;
    }

    /** 
     * Get the 'close' element value.
     * 
     * @return value
     */
    public Date getClose() {
        return close;
    }

    /** 
     * Set the 'close' element value.
     * 
     * @param close
     */
    public void setClose(Date close) {
        this.close = close;
    }

    /** 
     * Get the 'lastStatement' element value.
     * 
     * @return value
     */
    public Date getLastStatement() {
        return lastStatement;
    }

    /** 
     * Set the 'lastStatement' element value.
     * 
     * @param lastStatement
     */
    public void setLastStatement(Date lastStatement) {
        this.lastStatement = lastStatement;
    }

    /** 
     * Get the 'minRepaymentDueDate' element value.
     * 
     * @return value
     */
    public Date getMinRepaymentDueDate() {
        return minRepaymentDueDate;
    }

    /** 
     * Set the 'minRepaymentDueDate' element value.
     * 
     * @param minRepaymentDueDate
     */
    public void setMinRepaymentDueDate(Date minRepaymentDueDate) {
        this.minRepaymentDueDate = minRepaymentDueDate;
    }

    /** 
     * Get the 'system' element value.
     * 
     * @return value
     */
    public Date getSystem() {
        return system;
    }

    /** 
     * Set the 'system' element value.
     * 
     * @param system
     */
    public void setSystem(Date system) {
        this.system = system;
    }
}
