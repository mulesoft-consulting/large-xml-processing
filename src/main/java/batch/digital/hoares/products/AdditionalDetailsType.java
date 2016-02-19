
package batch.digital.hoares.products;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://hoares.digital.batch/Products.xsd" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AdditionalDetailsType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="IBAN" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:string" name="sortCode" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:string" name="primaryIndicator" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="ns:InterestType" name="interests" minOccurs="0" maxOccurs="1"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AdditionalDetailsType
{
    private String IBAN;
    private String sortCode;
    private String primaryIndicator;
    private InterestType interests;

    /** 
     * Get the 'IBAN' element value.
     * 
     * @return value
     */
    public String getIBAN() {
        return IBAN;
    }

    /** 
     * Set the 'IBAN' element value.
     * 
     * @param IBAN
     */
    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    /** 
     * Get the 'sortCode' element value.
     * 
     * @return value
     */
    public String getSortCode() {
        return sortCode;
    }

    /** 
     * Set the 'sortCode' element value.
     * 
     * @param sortCode
     */
    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    /** 
     * Get the 'primaryIndicator' element value.
     * 
     * @return value
     */
    public String getPrimaryIndicator() {
        return primaryIndicator;
    }

    /** 
     * Set the 'primaryIndicator' element value.
     * 
     * @param primaryIndicator
     */
    public void setPrimaryIndicator(String primaryIndicator) {
        this.primaryIndicator = primaryIndicator;
    }

    /** 
     * Get the 'interests' element value.
     * 
     * @return value
     */
    public InterestType getInterests() {
        return interests;
    }

    /** 
     * Set the 'interests' element value.
     * 
     * @param interests
     */
    public void setInterests(InterestType interests) {
        this.interests = interests;
    }
}
