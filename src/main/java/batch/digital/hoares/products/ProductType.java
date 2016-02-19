
package batch.digital.hoares.products;

/** 
 * 
 Schema will have product details, transactions, deals, holdings etc. 

 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://hoares.digital.batch/Products.xsd" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProductType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:ProductDetailsType" name="productDetails"/>
 *     &lt;xs:element type="ns:TransactionType" name="transactions" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="ns:DealType" name="deals" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="ns:HoldingType" name="holdings" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="ns:SubProductType" name="subProducts" minOccurs="0" maxOccurs="1"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProductType
{
    private ProductDetailsType productDetails;
    private TransactionType transactions;
    private DealType deals;
    private HoldingType holdings;
    private SubProductType subProducts;

    /** 
     * Get the 'productDetails' element value.
     * 
     * @return value
     */
    public ProductDetailsType getProductDetails() {
        return productDetails;
    }

    /** 
     * Set the 'productDetails' element value.
     * 
     * @param productDetails
     */
    public void setProductDetails(ProductDetailsType productDetails) {
        this.productDetails = productDetails;
    }

    /** 
     * Get the 'transactions' element value.
     * 
     * @return value
     */
    public TransactionType getTransactions() {
        return transactions;
    }

    /** 
     * Set the 'transactions' element value.
     * 
     * @param transactions
     */
    public void setTransactions(TransactionType transactions) {
        this.transactions = transactions;
    }

    /** 
     * Get the 'deals' element value.
     * 
     * @return value
     */
    public DealType getDeals() {
        return deals;
    }

    /** 
     * Set the 'deals' element value.
     * 
     * @param deals
     */
    public void setDeals(DealType deals) {
        this.deals = deals;
    }

    /** 
     * Get the 'holdings' element value.
     * 
     * @return value
     */
    public HoldingType getHoldings() {
        return holdings;
    }

    /** 
     * Set the 'holdings' element value.
     * 
     * @param holdings
     */
    public void setHoldings(HoldingType holdings) {
        this.holdings = holdings;
    }

    /** 
     * Get the 'subProducts' element value.
     * 
     * @return value
     */
    public SubProductType getSubProducts() {
        return subProducts;
    }

    /** 
     * Set the 'subProducts' element value.
     * 
     * @param subProducts
     */
    public void setSubProducts(SubProductType subProducts) {
        this.subProducts = subProducts;
    }
}
