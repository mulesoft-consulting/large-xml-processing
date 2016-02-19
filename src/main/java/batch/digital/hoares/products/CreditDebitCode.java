
package batch.digital.hoares.products;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://hoares.digital.batch/Products.xsd" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CreditDebitCode">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="CRDT"/>
 *     &lt;xs:enumeration value="DBIT"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum CreditDebitCode {
    CRDT, DBIT
}
