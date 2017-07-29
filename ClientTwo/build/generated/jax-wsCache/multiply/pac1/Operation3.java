
package pac1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operation3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operation3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parameter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="parameter1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operation3", propOrder = {
    "parameter",
    "parameter1"
})
public class Operation3 {

    protected int parameter;
    protected int parameter1;

    /**
     * Gets the value of the parameter property.
     * 
     */
    public int getParameter() {
        return parameter;
    }

    /**
     * Sets the value of the parameter property.
     * 
     */
    public void setParameter(int value) {
        this.parameter = value;
    }

    /**
     * Gets the value of the parameter1 property.
     * 
     */
    public int getParameter1() {
        return parameter1;
    }

    /**
     * Sets the value of the parameter1 property.
     * 
     */
    public void setParameter1(int value) {
        this.parameter1 = value;
    }

}
