
package batch.digital.hoares.products;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://hoares.digital.batch/Products.xsd" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TransactionType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="transaction" minOccurs="1" maxOccurs="unbounded">
 *       &lt;!-- Reference to inner class Transaction -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TransactionType
{
    private List<Transaction> transactionList = new ArrayList<Transaction>();

    /** 
     * Get the list of 'transaction' element items.
     * 
     * @return list
     */
    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    /** 
     * Set the list of 'transaction' element items.
     * 
     * @param list
     */
    public void setTransactionList(List<Transaction> list) {
        transactionList = list;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://hoares.digital.batch/Products.xsd" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="transaction" minOccurs="1" maxOccurs="unbounded">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="xs:string" name="refID"/>
     *       &lt;xs:element type="xs:string" name="code"/>
     *       &lt;xs:element type="ns:CreditDebitCode" name="type"/>
     *       &lt;xs:element type="xs:decimal" name="amount"/>
     *       &lt;xs:element type="xs:string" name="currencyCode"/>
     *       &lt;xs:element type="xs:date" name="postingDate"/>
     *       &lt;xs:element type="xs:date" name="valueDate"/>
     *       &lt;xs:element type="xs:string" name="narrative"/>
     *       &lt;xs:element type="xs:string" name="additionalRef1" minOccurs="0" maxOccurs="1"/>
     *       &lt;xs:element type="xs:string" name="additionalRef2" minOccurs="0" maxOccurs="1"/>
     *       &lt;xs:element type="xs:string" name="additionalRef3" minOccurs="0" maxOccurs="1"/>
     *       &lt;xs:element type="xs:string" name="additionalRef4" minOccurs="0" maxOccurs="1"/>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class Transaction
    {
        private String refID;
        private String code;
        private CreditDebitCode type;
        private BigDecimal amount;
        private String currencyCode;
        private Date postingDate;
        private Date valueDate;
        private String narrative;
        private String additionalRef1;
        private String additionalRef2;
        private String additionalRef3;
        private String additionalRef4;

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
         * Get the 'code' element value.
         * 
         * @return value
         */
        public String getCode() {
            return code;
        }

        /** 
         * Set the 'code' element value.
         * 
         * @param code
         */
        public void setCode(String code) {
            this.code = code;
        }

        /** 
         * Get the 'type' element value.
         * 
         * @return value
         */
        public CreditDebitCode getType() {
            return type;
        }

        /** 
         * Set the 'type' element value.
         * 
         * @param type
         */
        public void setType(CreditDebitCode type) {
            this.type = type;
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
         * Get the 'postingDate' element value.
         * 
         * @return value
         */
        public Date getPostingDate() {
            return postingDate;
        }

        /** 
         * Set the 'postingDate' element value.
         * 
         * @param postingDate
         */
        public void setPostingDate(Date postingDate) {
            this.postingDate = postingDate;
        }

        /** 
         * Get the 'valueDate' element value.
         * 
         * @return value
         */
        public Date getValueDate() {
            return valueDate;
        }

        /** 
         * Set the 'valueDate' element value.
         * 
         * @param valueDate
         */
        public void setValueDate(Date valueDate) {
            this.valueDate = valueDate;
        }

        /** 
         * Get the 'narrative' element value.
         * 
         * @return value
         */
        public String getNarrative() {
            return narrative;
        }

        /** 
         * Set the 'narrative' element value.
         * 
         * @param narrative
         */
        public void setNarrative(String narrative) {
            this.narrative = narrative;
        }

        /** 
         * Get the 'additionalRef1' element value.
         * 
         * @return value
         */
        public String getAdditionalRef1() {
            return additionalRef1;
        }

        /** 
         * Set the 'additionalRef1' element value.
         * 
         * @param additionalRef1
         */
        public void setAdditionalRef1(String additionalRef1) {
            this.additionalRef1 = additionalRef1;
        }

        /** 
         * Get the 'additionalRef2' element value.
         * 
         * @return value
         */
        public String getAdditionalRef2() {
            return additionalRef2;
        }

        /** 
         * Set the 'additionalRef2' element value.
         * 
         * @param additionalRef2
         */
        public void setAdditionalRef2(String additionalRef2) {
            this.additionalRef2 = additionalRef2;
        }

        /** 
         * Get the 'additionalRef3' element value.
         * 
         * @return value
         */
        public String getAdditionalRef3() {
            return additionalRef3;
        }

        /** 
         * Set the 'additionalRef3' element value.
         * 
         * @param additionalRef3
         */
        public void setAdditionalRef3(String additionalRef3) {
            this.additionalRef3 = additionalRef3;
        }

        /** 
         * Get the 'additionalRef4' element value.
         * 
         * @return value
         */
        public String getAdditionalRef4() {
            return additionalRef4;
        }

        /** 
         * Set the 'additionalRef4' element value.
         * 
         * @param additionalRef4
         */
        public void setAdditionalRef4(String additionalRef4) {
            this.additionalRef4 = additionalRef4;
        }
    }
}
