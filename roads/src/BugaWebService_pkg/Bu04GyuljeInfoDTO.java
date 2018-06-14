/**
 * Bu04GyuljeInfoDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package BugaWebService_pkg;

public class Bu04GyuljeInfoDTO  implements java.io.Serializable {
    private java.lang.String gyuleNo;

    private java.lang.String gyuleYmd;

    private java.lang.String gyuljaeGubun;

    private java.lang.String gyuljaeYmd;

    public Bu04GyuljeInfoDTO() {
    }

    public Bu04GyuljeInfoDTO(
           java.lang.String gyuleNo,
           java.lang.String gyuleYmd,
           java.lang.String gyuljaeGubun,
           java.lang.String gyuljaeYmd) {
           this.gyuleNo = gyuleNo;
           this.gyuleYmd = gyuleYmd;
           this.gyuljaeGubun = gyuljaeGubun;
           this.gyuljaeYmd = gyuljaeYmd;
    }


    /**
     * Gets the gyuleNo value for this Bu04GyuljeInfoDTO.
     * 
     * @return gyuleNo
     */
    public java.lang.String getGyuleNo() {
        return gyuleNo;
    }


    /**
     * Sets the gyuleNo value for this Bu04GyuljeInfoDTO.
     * 
     * @param gyuleNo
     */
    public void setGyuleNo(java.lang.String gyuleNo) {
        this.gyuleNo = gyuleNo;
    }


    /**
     * Gets the gyuleYmd value for this Bu04GyuljeInfoDTO.
     * 
     * @return gyuleYmd
     */
    public java.lang.String getGyuleYmd() {
        return gyuleYmd;
    }


    /**
     * Sets the gyuleYmd value for this Bu04GyuljeInfoDTO.
     * 
     * @param gyuleYmd
     */
    public void setGyuleYmd(java.lang.String gyuleYmd) {
        this.gyuleYmd = gyuleYmd;
    }


    /**
     * Gets the gyuljaeGubun value for this Bu04GyuljeInfoDTO.
     * 
     * @return gyuljaeGubun
     */
    public java.lang.String getGyuljaeGubun() {
        return gyuljaeGubun;
    }


    /**
     * Sets the gyuljaeGubun value for this Bu04GyuljeInfoDTO.
     * 
     * @param gyuljaeGubun
     */
    public void setGyuljaeGubun(java.lang.String gyuljaeGubun) {
        this.gyuljaeGubun = gyuljaeGubun;
    }


    /**
     * Gets the gyuljaeYmd value for this Bu04GyuljeInfoDTO.
     * 
     * @return gyuljaeYmd
     */
    public java.lang.String getGyuljaeYmd() {
        return gyuljaeYmd;
    }


    /**
     * Sets the gyuljaeYmd value for this Bu04GyuljeInfoDTO.
     * 
     * @param gyuljaeYmd
     */
    public void setGyuljaeYmd(java.lang.String gyuljaeYmd) {
        this.gyuljaeYmd = gyuljaeYmd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Bu04GyuljeInfoDTO)) return false;
        Bu04GyuljeInfoDTO other = (Bu04GyuljeInfoDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gyuleNo==null && other.getGyuleNo()==null) || 
             (this.gyuleNo!=null &&
              this.gyuleNo.equals(other.getGyuleNo()))) &&
            ((this.gyuleYmd==null && other.getGyuleYmd()==null) || 
             (this.gyuleYmd!=null &&
              this.gyuleYmd.equals(other.getGyuleYmd()))) &&
            ((this.gyuljaeGubun==null && other.getGyuljaeGubun()==null) || 
             (this.gyuljaeGubun!=null &&
              this.gyuljaeGubun.equals(other.getGyuljaeGubun()))) &&
            ((this.gyuljaeYmd==null && other.getGyuljaeYmd()==null) || 
             (this.gyuljaeYmd!=null &&
              this.gyuljaeYmd.equals(other.getGyuljaeYmd())));
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
        if (getGyuleNo() != null) {
            _hashCode += getGyuleNo().hashCode();
        }
        if (getGyuleYmd() != null) {
            _hashCode += getGyuleYmd().hashCode();
        }
        if (getGyuljaeGubun() != null) {
            _hashCode += getGyuljaeGubun().hashCode();
        }
        if (getGyuljaeYmd() != null) {
            _hashCode += getGyuljaeYmd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Bu04GyuljeInfoDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:BugaWebService", "Bu04GyuljeInfoDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gyuleNo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "gyuleNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gyuleYmd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "gyuleYmd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gyuljaeGubun");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "gyuljaeGubun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gyuljaeYmd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "gyuljaeYmd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
