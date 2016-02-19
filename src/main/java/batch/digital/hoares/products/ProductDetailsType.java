
package batch.digital.hoares.products;

/** 
 * 
 All the core details of the product will be held in this schema.

 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://hoares.digital.batch/Products.xsd" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProductDetailsType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="productNo"/>
 *     &lt;xs:element type="xs:string" name="type"/>
 *     &lt;xs:element type="xs:string" name="fullName"/>
 *     &lt;xs:element type="xs:string" name="shortName" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:string" name="currencyCode"/>
 *     &lt;xs:element type="xs:string" name="status"/>
 *     &lt;xs:element type="ns:AdditionalDetailsType" name="additionalDetails"/>
 *     &lt;xs:element type="ns:DateType" name="dates"/>
 *     &lt;xs:element type="ns:LimitType" name="limits"/>
 *     &lt;xs:element type="ns:BalanceType" name="balances"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProductDetailsType
{
    private String productNo;
    private String type;
    private String fullName;
    private String shortName;
    private String currencyCode;
    private String status;
    private AdditionalDetailsType additionalDetails;
    private DateType dates;
    private LimitType limits;
    private BalanceType balances;

    /** 
     * Get the 'productNo' element value.
     * 
     * @return value
     */
    public String getProductNo() {
        return productNo;
    }

    /** 
     * Set the 'productNo' element value.
     * 
     * @param productNo
     */
    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    /** 
     * Get the 'type' element value.
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'fullName' element value.
     * 
     * @return value
     */
    public String getFullName() {
        return fullName;
    }

    /** 
     * Set the 'fullName' element value.
     * 
     * @param fullName
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /** 
     * Get the 'shortName' element value.
     * 
     * @return value
     */
    public String getShortName() {
        return shortName;
    }

    /** 
     * Set the 'shortName' element value.
     * 
     * @param shortName
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /** 
     * Get the 'currencyCode' element value.
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'currencyCode' element value.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'status' element value.
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'status' element value.
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'additionalDetails' element value.
     * 
     * @return value
     */
    public AdditionalDetailsType getAdditionalDetails() {
        return additionalDetails;
    }

    /** 
     * Set the 'additionalDetails' element value.
     * 
     * @param additionalDetails
     */
    public void setAdditionalDetails(AdditionalDetailsType additionalDetails) {
        this.additionalDetails = additionalDetails;
    }

    /** 
     * Get the 'dates' element value.
     * 
     * @return value
     */
    public DateType getDates() {
        return dates;
    }

    /** 
     * Set the 'dates' element value.
     * 
     * @param dates
     */
    public void setDates(DateType dates) {
        this.dates = dates;
    }

    /** 
     * Get the 'limits' element value.
     * 
     * @return value
     */
    public LimitType getLimits() {
        return limits;
    }

    /** 
     * Set the 'limits' element value.
     * 
     * @param limits
     */
    public void setLimits(LimitType limits) {
        this.limits = limits;
    }

    /** 
     * Get the 'balances' element value.
     * 
     * @return value
     */
    public BalanceType getBalances() {
        return balances;
    }

    /** 
     * Set the 'balances' element value.
     * 
     * @param balances
     */
    public void setBalances(BalanceType balances) {
        this.balances = balances;
    }
}
