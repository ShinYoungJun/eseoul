/**
 * Bu04UserInfoWSDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package BugaWebService_pkg;

public class Bu04UserInfoWSDTO  implements java.io.Serializable {
    private java.lang.String buseoCd;

    private java.lang.String rowStatus;

    private java.lang.String siguCd;

    public Bu04UserInfoWSDTO() {
    }

    public Bu04UserInfoWSDTO(
           java.lang.String buseoCd,
           java.lang.String rowStatus,
           java.lang.String siguCd) {
           this.buseoCd = buseoCd;
           this.rowStatus = rowStatus;
           this.siguCd = siguCd;
    }


    /**
     * Gets the buseoCd value for this Bu04UserInfoWSDTO.
     * 
     * @return buseoCd
     */
    public java.lang.String getBuseoCd() {
        return buseoCd;
    }


    /**
     * Sets the buseoCd value for this Bu04UserInfoWSDTO.
     * 
     * @param buseoCd
     */
    public void setBuseoCd(java.lang.String buseoCd) {
        this.buseoCd = buseoCd;
    }


    /**
     * Gets the rowStatus value for this Bu04UserInfoWSDTO.
     * 
     * @return rowStatus
     */
    public java.lang.String getRowStatus() {
        return rowStatus;
    }


    /**
     * Sets the rowStatus value for this Bu04UserInfoWSDTO.
     * 
     * @param rowStatus
     */
    public void setRowStatus(java.lang.String rowStatus) {
        this.rowStatus = rowStatus;
    }


    /**
     * Gets the siguCd value for this Bu04UserInfoWSDTO.
     * 
     * @return siguCd
     */
    public java.lang.String getSiguCd() {
        return siguCd;
    }


    /**
     * Sets the siguCd value for this Bu04UserInfoWSDTO.
     * 
     * @param siguCd
     */
    public void setSiguCd(java.lang.String siguCd) {
        this.siguCd = siguCd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Bu04UserInfoWSDTO)) return false;
        Bu04UserInfoWSDTO other = (Bu04UserInfoWSDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.buseoCd==null && other.getBuseoCd()==null) || 
             (this.buseoCd!=null &&
              this.buseoCd.equals(other.getBuseoCd()))) &&
            ((this.rowStatus==null && other.getRowStatus()==null) || 
             (this.rowStatus!=null &&
              this.rowStatus.equals(other.getRowStatus()))) &&
            ((this.siguCd==null && other.getSiguCd()==null) || 
             (this.siguCd!=null &&
              this.siguCd.equals(other.getSiguCd())));
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
        if (getBuseoCd() != null) {
            _hashCode += getBuseoCd().hashCode();
        }
        if (getRowStatus() != null) {
            _hashCode += getRowStatus().hashCode();
        }
        if (getSiguCd() != null) {
            _hashCode += getSiguCd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Bu04UserInfoWSDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:BugaWebService", "Bu04UserInfoWSDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buseoCd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "buseoCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "rowStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siguCd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "siguCd"));
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
