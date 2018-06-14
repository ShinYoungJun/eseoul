/**
 * RequestTypeDATAMessageBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package _212._147._46._10.stmr.websvc.ws.SOWNN00216.wsdl;

public class RequestTypeDATAMessageBody  implements java.io.Serializable {
    private java.lang.String mw_take_no;

    public RequestTypeDATAMessageBody() {
    }

    public RequestTypeDATAMessageBody(
           java.lang.String mw_take_no) {
           this.mw_take_no = mw_take_no;
    }


    /**
     * Gets the mw_take_no value for this RequestTypeDATAMessageBody.
     * 
     * @return mw_take_no
     */
    public java.lang.String getMw_take_no() {
        return mw_take_no;
    }


    /**
     * Sets the mw_take_no value for this RequestTypeDATAMessageBody.
     * 
     * @param mw_take_no
     */
    public void setMw_take_no(java.lang.String mw_take_no) {
        this.mw_take_no = mw_take_no;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestTypeDATAMessageBody)) return false;
        RequestTypeDATAMessageBody other = (RequestTypeDATAMessageBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mw_take_no==null && other.getMw_take_no()==null) || 
             (this.mw_take_no!=null &&
              this.mw_take_no.equals(other.getMw_take_no())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getMw_take_no() != null) {
            _hashCode += getMw_take_no().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestTypeDATAMessageBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://10.46.147.212.:3100/stmr/websvc/ws/SOWNN00216/wsdl", ">>>RequestType>DATA>message>body"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mw_take_no");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mw_take_no"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
