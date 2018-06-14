/**
 * ResponseTypeDATAMessageBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package _212._147._46._10.stmr.websvc.ws.SOWNN00252.wsdl;

public class ResponseTypeDATAMessageBody  implements java.io.Serializable {
    private _212._147._46._10.stmr.websvc.ws.SOWNN00252.wsdl.ResponseTypeDATAMessageBodyStatusInfo[] statusInfo;

    public ResponseTypeDATAMessageBody() {
    }

    public ResponseTypeDATAMessageBody(
           _212._147._46._10.stmr.websvc.ws.SOWNN00252.wsdl.ResponseTypeDATAMessageBodyStatusInfo[] statusInfo) {
           this.statusInfo = statusInfo;
    }


    /**
     * Gets the statusInfo value for this ResponseTypeDATAMessageBody.
     * 
     * @return statusInfo
     */
    public _212._147._46._10.stmr.websvc.ws.SOWNN00252.wsdl.ResponseTypeDATAMessageBodyStatusInfo[] getStatusInfo() {
        return statusInfo;
    }


    /**
     * Sets the statusInfo value for this ResponseTypeDATAMessageBody.
     * 
     * @param statusInfo
     */
    public void setStatusInfo(_212._147._46._10.stmr.websvc.ws.SOWNN00252.wsdl.ResponseTypeDATAMessageBodyStatusInfo[] statusInfo) {
        this.statusInfo = statusInfo;
    }

    public _212._147._46._10.stmr.websvc.ws.SOWNN00252.wsdl.ResponseTypeDATAMessageBodyStatusInfo getStatusInfo(int i) {
        return this.statusInfo[i];
    }

    public void setStatusInfo(int i, _212._147._46._10.stmr.websvc.ws.SOWNN00252.wsdl.ResponseTypeDATAMessageBodyStatusInfo _value) {
        this.statusInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseTypeDATAMessageBody)) return false;
        ResponseTypeDATAMessageBody other = (ResponseTypeDATAMessageBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.statusInfo==null && other.getStatusInfo()==null) || 
             (this.statusInfo!=null &&
              java.util.Arrays.equals(this.statusInfo, other.getStatusInfo())));
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
        if (getStatusInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatusInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatusInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseTypeDATAMessageBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://10.46.147.212:3100/stmr/websvc/ws/SOWNN00252/wsdl", ">>>ResponseType>DATA>message>body"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://10.46.147.212:3100/stmr/websvc/ws/SOWNN00252/wsdl", ">>>>ResponseType>DATA>message>body>statusInfo"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
