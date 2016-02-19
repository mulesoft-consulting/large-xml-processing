
package batch.digital.hoares.products;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://hoares.digital.batch/Products.xsd" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="HoldingType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="holding" minOccurs="1" maxOccurs="unbounded">
 *       &lt;!-- Reference to inner class Holding -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class HoldingType
{
    private List<Holding> holdingList = new ArrayList<Holding>();

    /** 
     * Get the list of 'holding' element items.
     * 
     * @return list
     */
    public List<Holding> getHoldingList() {
        return holdingList;
    }

    /** 
     * Set the list of 'holding' element items.
     * 
     * @param list
     */
    public void setHoldingList(List<Holding> list) {
        holdingList = list;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://hoares.digital.batch/Products.xsd" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="holding" minOccurs="1" maxOccurs="unbounded">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="xs:string" name="name"/>
     *       &lt;xs:element type="xs:string" name="type"/>
     *       &lt;xs:element type="xs:string" name="code"/>
     *       &lt;xs:element type="xs:string" name="currency"/>
     *       &lt;xs:element type="xs:decimal" name="quantity"/>
     *       &lt;xs:element type="xs:decimal" name="amount"/>
     *       &lt;xs:element type="xs:decimal" name="price"/>
     *       &lt;xs:element type="xs:date" name="valueDate"/>
     *       &lt;xs:element type="xs:string" name="status" minOccurs="0" maxOccurs="1"/>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class Holding
    {
        private String name;
        private String type;
        private String code;
        private String currency;
        private BigDecimal quantity;
        private BigDecimal amount;
        private BigDecimal price;
        private Date valueDate;
        private String status;

        /** 
         * Get the 'name' element value.
         * 
         * @return value
         */
        public String getName() {
            return name;
        }

        /** 
         * Set the 'name' element value.
         * 
         * @param name
         */
        public void setName(String name) {
            this.name = name;
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
         * Get the 'currency' element value.
         * 
         * @return value
         */
        public String getCurrency() {
            return currency;
        }

        /** 
         * Set the 'currency' element value.
         * 
         * @param currency
         */
        public void setCurrency(String currency) {
            this.currency = currency;
        }

        /** 
         * Get the 'quantity' element value.
         * 
         * @return value
         */
        public BigDecimal getQuantity() {
            return quantity;
        }

        /** 
         * Set the 'quantity' element value.
         * 
         * @param quantity
         */
        public void setQuantity(BigDecimal quantity) {
            this.quantity = quantity;
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
         * Get the 'price' element value.
         * 
         * @return value
         */
        public BigDecimal getPrice() {
            return price;
        }

        /** 
         * Set the 'price' element value.
         * 
         * @param price
         */
        public void setPrice(BigDecimal price) {
            this.price = price;
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
