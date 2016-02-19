
package batch.digital.hoares.products;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://hoares.digital.batch/Products.xsd" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SubProductType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="subProduct" minOccurs="1" maxOccurs="unbounded">
 *       &lt;!-- Reference to inner class SubProduct -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SubProductType
{
    private List<SubProduct> subProductList = new ArrayList<SubProduct>();

    /** 
     * Get the list of 'subProduct' element items.
     * 
     * @return list
     */
    public List<SubProduct> getSubProductList() {
        return subProductList;
    }

    /** 
     * Set the list of 'subProduct' element items.
     * 
     * @param list
     */
    public void setSubProductList(List<SubProduct> list) {
        subProductList = list;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://hoares.digital.batch/Products.xsd" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="subProduct" minOccurs="1" maxOccurs="unbounded">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="ns:ProductDetailsType" name="productDetails"/>
     *       &lt;xs:element type="ns:TransactionType" name="transactions" minOccurs="0" maxOccurs="1"/>
     *       &lt;xs:element type="ns:DealType" name="deals" minOccurs="0" maxOccurs="1"/>
     *       &lt;xs:element type="ns:HoldingType" name="holdings" minOccurs="0" maxOccurs="1"/>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class SubProduct
    {
        private ProductDetailsType productDetails;
        private TransactionType transactions;
        private DealType deals;
        private HoldingType holdings;

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
    }
}
