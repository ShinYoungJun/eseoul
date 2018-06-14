/**
 * ResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package _212._147._46._10.stmr.websvc.ws.SOWNN00253.wsdl;

public class ResponseType  implements java.io.Serializable {
    private java.lang.String IFID;
    private java.lang.String ORGCD;
    private java.lang.String RESULTCODE;
    private java.lang.String MSGKEY;
    private _212._147._46._10.stmr.websvc.ws.SOWNN00253.wsdl.ResponseTypeDATA DATA;

    public ResponseType() {
    }

    public ResponseType(
           java.lang.String IFID,
           java.lang.String ORGCD,
           java.lang.String RESULTCODE,
           java.lang.String MSGKEY,
           _212._147._46._10.stmr.websvc.ws.SOWNN00253.wsdl.ResponseTypeDATA DATA) {
           this.IFID = IFID;
           this.ORGCD = ORGCD;
           this.RESULTCODE = RESULTCODE;
           this.MSGKEY = MSGKEY;
           this.DATA = DATA;
    }


    /**
     * Gets the IFID value for this ResponseType.
     * 
     * @return IFID
     */
    public java.lang.String getIFID() {
        return IFID;
    }


    /**
     * Sets the IFID value for this ResponseType.
     * 
     * @param IFID
     */
    public void setIFID(java.lang.String IFID) {
        this.IFID = IFID;
    }


    /**
     * Gets the ORGCD value for this ResponseType.
     * 
     * @return ORGCD
     */
    public java.lang.String getORGCD() {
        return ORGCD;
    }


    /**
     * Sets the ORGCD value for this ResponseType.
     * 
     * @param ORGCD
     */
    public void setORGCD(java.lang.String ORGCD) {
        this.ORGCD = ORGCD;
    }


    /**
     * Gets the RESULTCODE value for this ResponseType.
     * 
     * @return RESULTCODE
     */
    public java.lang.String getRESULTCODE() {
        return RESULTCODE;
    }


    /**
     * Sets the RESULTCODE value for this ResponseType.
     * 
     * @param RESULTCODE
     */
    public void setRESULTCODE(java.lang.String RESULTCODE) {
        this.RESULTCODE = RESULTCODE;
    }


    /**
     * Gets the MSGKEY value for this ResponseType.
     * 
     * @return MSGKEY
     */
    public java.lang.String getMSGKEY() {
        return MSGKEY;
    }


    /**
     * Sets the MSGKEY value for this ResponseType.
     * 
     * @param MSGKEY
     */
    public void setMSGKEY(java.lang.String MSGKEY) {
        this.MSGKEY = MSGKEY;
    }


    /**
     * Gets the DATA value for this ResponseType.
     * 
     * @return DATA
     */
    public _212._147._46._10.stmr.websvc.ws.SOWNN00253.wsdl.ResponseTypeDATA getDATA() {
        return DATA;
    }


    /**
     * Sets the DATA value for this ResponseType.
     * 
     * @param DATA
     */
    public void setDATA(_212._147._46._10.stmr.websvc.ws.SOWNN00253.wsdl.ResponseTypeDATA DATA) {
        this.DATA = DATA;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseType)) return false;
        ResponseType other = (ResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IFID==null && other.getIFID()==null) || 
             (this.IFID!=null &&
              this.IFID.equals(other.getIFID()))) &&
            ((this.ORGCD==null && other.getORGCD()==null) || 
             (this.ORGCD!=null &&
              this.ORGCD.equals(other.getORGCD()))) &&
            ((this.RESULTCODE==null && other.getRESULTCODE()==null) || 
             (this.RESULTCODE!=null &&
              this.RESULTCODE.equals(other.getRESULTCODE()))) &&
            ((this.MSGKEY==null && other.getMSGKEY()==null) || 
             (this.MSGKEY!=null &&
              this.MSGKEY.equals(other.getMSGKEY()))) &&
            ((this.DATA==null && other.getDATA()==null) || 
             (this.DATA!=null &&
              this.DATA.equals(other.getDATA())));
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
        if (getIFID() != null) {
            _hashCode += getIFID().hashCode();
        }
        if (getORGCD() != null) {
            _hashCode += getORGCD().hashCode();
        }
        if (getRESULTCODE() != null) {
            _hashCode += getRESULTCODE().hashCode();
        }
        if (getMSGKEY() != null) {
            _hashCode += getMSGKEY().hashCode();
        }
        if (getDATA() != null) {
            _hashCode += getDATA().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://10.46.147.212:3100/stmr/websvc/ws/SOWNN00253/wsdl", "ResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IFID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IFID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ORGCD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ORGCD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RESULTCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RESULTCODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSGKEY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MSGKEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://10.46.147.212:3100/stmr/websvc/ws/SOWNN00253/wsdl", ">ResponseType>DATA"));
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
