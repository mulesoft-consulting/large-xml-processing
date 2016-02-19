
package batch.digital.hoares.products;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://hoares.digital.batch/Products.xsd" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DealType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="deal" minOccurs="1" maxOccurs="unbounded">
 *       &lt;!-- Reference to inner class Deal -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DealType
{
    private List<Deal> dealList = new ArrayList<Deal>();

    /** 
     * Get the list of 'deal' element items.
     * 
     * @return list
     */
    public List<Deal> getDealList() {
        return dealList;
    }

    /** 
     * Set the list of 'deal' element items.
     * 
     * @param list
     */
    public void setDealList(List<Deal> list) {
        dealList = list;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://hoares.digital.batch/Products.xsd" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="deal" minOccurs="1" maxOccurs="unbounded">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="xs:string" name="refID"/>
     *       &lt;xs:element type="xs:int" name="seq"/>
     *       &lt;xs:element type="xs:decimal" name="amount"/>
     *       &lt;xs:element type="xs:date" name="dealDate"/>
     *       &lt;xs:element type="xs:date" name="maturityDate"/>
     *       &lt;xs:element type="xs:string" name="currencyCode"/>
     *       &lt;xs:element type="xs:decimal" name="interestRate"/>
     *       &lt;xs:element type="xs:decimal" name="interestGrossMaturity"/>
     *       &lt;xs:element type="xs:decimal" name="interestGrossPaid"/>
     *       &lt;xs:element type="xs:decimal" name="interestNetPaid"/>
     *       &lt;xs:element type="xs:decimal" name="interestNetAccrued"/>
     *       &lt;xs:element type="xs:string" name="status"/>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class Deal
    {
        private String refID;
        private Integer seq;
        private BigDecimal amount;
        private Date dealDate;
        private Date maturityDate;
        private String currencyCode;
        private BigDecimal interestRate;
        private BigDecimal interestGrossMaturity;
        private BigDecimal interestGrossPaid;
        private BigDecimal interestNetPaid;
        private BigDecimal interestNetAccrued;
        private String status;

        /** 
         * Get the 'refID' element value.
         * 
         * @return value
         */
        public String getRefID() {
            return refID;
        }

        /** 
         * Set the 'refID' element value.
         * 
         * @param refID
         */
        public void setRefID(String refID) {
            this.refID = refID;
        }

        /** 
         * Get the 'seq' element value.
         * 
         * @return value
         */
        public Integer getSeq() {
            return seq;
        }

        /** 
         * Set the 'seq' element value.
         * 
         * @param seq
         */
        public void setSeq(Integer seq) {
            this.seq = seq;
        }

        /** 
         * Get the 'amount' element value.
         * 
         * @return value
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /** 
         * Set the 'amount' element value.
         * 
         * @param amount
         */
        public void setAmount(BigDecimal amount) {
            this.amount = amount;
        }

        /** 
         * Get the 'dealDate' element value.
         * 
         * @return value
         */
        public Date getDealDate() {
            return dealDate;
        }

        /** 
         * Set the 'dealDate' element value.
         * 
         * @param dealDate
         */
        public void setDealDate(Date dealDate) {
            this.dealDate = dealDate;
        }

        /** 
         * Get the 'maturityDate' element value.
         * 
         * @return value
         */
        public Date getMaturityDate() {
            return maturityDate;
        }

        /** 
         * Set the 'maturityDate' element value.
         * 
         * @param maturityDate
         */
        public void setMaturityDate(Date maturityDate) {
            this.maturityDate = maturityDate;
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
         * Get the 'interestRate' element value.
         * 
         * @return value
         */
        public BigDecimal getInterestRate() {
            return interestRate;
        }

        /** 
         * Set the 'interestRate' element value.
         * 
         * @param interestRate
         */
        public void setInterestRate(BigDecimal interestRate) {
            this.interestRate = interestRate;
        }

        /** 
         * Get the 'interestGrossMaturity' element value.
         * 
         * @return value
         */
        public BigDecimal getInterestGrossMaturity() {
            return interestGrossMaturity;
        }

        /** 
         * Set the 'interestGrossMaturity' element value.
         * 
         * @param interestGrossMaturity
         */
        public void setInterestGrossMaturity(BigDecimal interestGrossMaturity) {
            this.interestGrossMaturity = interestGrossMaturity;
        }

        /** 
         * Get the 'interestGrossPaid' element value.
         * 
         * @return value
         */
        public BigDecimal getInterestGrossPaid() {
            return interestGrossPaid;
        }

        /** 
         * Set the 'interestGrossPaid' element value.
         * 
         * @param interestGrossPaid
         */
        public void setInterestGrossPaid(BigDecimal interestGrossPaid) {
            this.interestGrossPaid = interestGrossPaid;
        }

        /** 
         * Get the 'interestNetPaid' element value.
         * 
         * @return value
         */
        public BigDecimal getInterestNetPaid() {
            return interestNetPaid;
        }

        /** 
         * Set the 'interestNetPaid' element value.
         * 
         * @param interestNetPaid
         */
        public void setInterestNetPaid(BigDecimal interestNetPaid) {
            this.interestNetPaid = interestNetPaid;
        }

        /** 
         * Get the 'interestNetAccrued' element value.
         * 
         * @return value
         */
        public BigDecimal getInterestNetAccrued() {
            return interestNetAccrued;
        }

        /** 
         * Set the 'interestNetAccrued' element value.
         * 
         * @param interestNetAccrued
         */
        public void setInterestNetAccrued(BigDecimal interestNetAccrued) {
            this.interestNetAccrued = interestNetAccrued;
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
    }
}
