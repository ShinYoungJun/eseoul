/**
 * Bu04SemokWSDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package BugaWebService_pkg;

public class Bu04SemokWSDTO  implements java.io.Serializable {
    private double gasanRate;

    private java.lang.String gasanRateGubun;

    private java.lang.String ocrBuseoCd;

    private java.lang.String ocrSiguCd;

    private java.lang.String rowStatus;

    private java.lang.String semokCd;

    private java.lang.String semokNm;

    private java.lang.String suBuseoCd;

    private java.lang.String vatYn;

    public Bu04SemokWSDTO() {
    }

    public Bu04SemokWSDTO(
           double gasanRate,
           java.lang.String gasanRateGubun,
           java.lang.String ocrBuseoCd,
           java.lang.String ocrSiguCd,
           java.lang.String rowStatus,
           java.lang.String semokCd,
           java.lang.String semokNm,
           java.lang.String suBuseoCd,
           java.lang.String vatYn) {
           this.gasanRate = gasanRate;
           this.gasanRateGubun = gasanRateGubun;
           this.ocrBuseoCd = ocrBuseoCd;
           this.ocrSiguCd = ocrSiguCd;
           this.rowStatus = rowStatus;
           this.semokCd = semokCd;
           this.semokNm = semokNm;
           this.suBuseoCd = suBuseoCd;
           this.vatYn = vatYn;
    }


    /**
     * Gets the gasanRate value for this Bu04SemokWSDTO.
     * 
     * @return gasanRate
     */
    public double getGasanRate() {
        return gasanRate;
    }


    /**
     * Sets the gasanRate value for this Bu04SemokWSDTO.
     * 
     * @param gasanRate
     */
    public void setGasanRate(double gasanRate) {
        this.gasanRate = gasanRate;
    }


    /**
     * Gets the gasanRateGubun value for this Bu04SemokWSDTO.
     * 
     * @return gasanRateGubun
     */
    public java.lang.String getGasanRateGubun() {
        return gasanRateGubun;
    }


    /**
     * Sets the gasanRateGubun value for this Bu04SemokWSDTO.
     * 
     * @param gasanRateGubun
     */
    public void setGasanRateGubun(java.lang.String gasanRateGubun) {
        this.gasanRateGubun = gasanRateGubun;
    }


    /**
     * Gets the ocrBuseoCd value for this Bu04SemokWSDTO.
     * 
     * @return ocrBuseoCd
     */
    public java.lang.String getOcrBuseoCd() {
        return ocrBuseoCd;
    }


    /**
     * Sets the ocrBuseoCd value for this Bu04SemokWSDTO.
     * 
     * @param ocrBuseoCd
     */
    public void setOcrBuseoCd(java.lang.String ocrBuseoCd) {
        this.ocrBuseoCd = ocrBuseoCd;
    }


    /**
     * Gets the ocrSiguCd value for this Bu04SemokWSDTO.
     * 
     * @return ocrSiguCd
     */
    public java.lang.String getOcrSiguCd() {
        return ocrSiguCd;
    }


    /**
     * Sets the ocrSiguCd value for this Bu04SemokWSDTO.
     * 
     * @param ocrSiguCd
     */
    public void setOcrSiguCd(java.lang.String ocrSiguCd) {
        this.ocrSiguCd = ocrSiguCd;
    }


    /**
     * Gets the rowStatus value for this Bu04SemokWSDTO.
     * 
     * @return rowStatus
     */
    public java.lang.String getRowStatus() {
        return rowStatus;
    }


    /**
     * Sets the rowStatus value for this Bu04SemokWSDTO.
     * 
     * @param rowStatus
     */
    public void setRowStatus(java.lang.String rowStatus) {
        this.rowStatus = rowStatus;
    }


    /**
     * Gets the semokCd value for this Bu04SemokWSDTO.
     * 
     * @return semokCd
     */
    public java.lang.String getSemokCd() {
        return semokCd;
    }


    /**
     * Sets the semokCd value for this Bu04SemokWSDTO.
     * 
     * @param semokCd
     */
    public void setSemokCd(java.lang.String semokCd) {
        this.semokCd = semokCd;
    }


    /**
     * Gets the semokNm value for this Bu04SemokWSDTO.
     * 
     * @return semokNm
     */
    public java.lang.String getSemokNm() {
        return semokNm;
    }


    /**
     * Sets the semokNm value for this Bu04SemokWSDTO.
     * 
     * @param semokNm
     */
    public void setSemokNm(java.lang.String semokNm) {
        this.semokNm = semokNm;
    }


    /**
     * Gets the suBuseoCd value for this Bu04SemokWSDTO.
     * 
     * @return suBuseoCd
     */
    public java.lang.String getSuBuseoCd() {
        return suBuseoCd;
    }


    /**
     * Sets the suBuseoCd value for this Bu04SemokWSDTO.
     * 
     * @param suBuseoCd
     */
    public void setSuBuseoCd(java.lang.String suBuseoCd) {
        this.suBuseoCd = suBuseoCd;
    }


    /**
     * Gets the vatYn value for this Bu04SemokWSDTO.
     * 
     * @return vatYn
     */
    public java.lang.String getVatYn() {
        return vatYn;
    }


    /**
     * Sets the vatYn value for this Bu04SemokWSDTO.
     * 
     * @param vatYn
     */
    public void setVatYn(java.lang.String vatYn) {
        this.vatYn = vatYn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Bu04SemokWSDTO)) return false;
        Bu04SemokWSDTO other = (Bu04SemokWSDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.gasanRate == other.getGasanRate() &&
            ((this.gasanRateGubun==null && other.getGasanRateGubun()==null) || 
             (this.gasanRateGubun!=null &&
              this.gasanRateGubun.equals(other.getGasanRateGubun()))) &&
            ((this.ocrBuseoCd==null && other.getOcrBuseoCd()==null) || 
             (this.ocrBuseoCd!=null &&
              this.ocrBuseoCd.equals(other.getOcrBuseoCd()))) &&
            ((this.ocrSiguCd==null && other.getOcrSiguCd()==null) || 
             (this.ocrSiguCd!=null &&
              this.ocrSiguCd.equals(other.getOcrSiguCd()))) &&
            ((this.rowStatus==null && other.getRowStatus()==null) || 
             (this.rowStatus!=null &&
              this.rowStatus.equals(other.getRowStatus()))) &&
            ((this.semokCd==null && other.getSemokCd()==null) || 
             (this.semokCd!=null &&
              this.semokCd.equals(other.getSemokCd()))) &&
            ((this.semokNm==null && other.getSemokNm()==null) || 
             (this.semokNm!=null &&
              this.semokNm.equals(other.getSemokNm()))) &&
            ((this.suBuseoCd==null && other.getSuBuseoCd()==null) || 
             (this.suBuseoCd!=null &&
              this.suBuseoCd.equals(other.getSuBuseoCd()))) &&
            ((this.vatYn==null && other.getVatYn()==null) || 
             (this.vatYn!=null &&
              this.vatYn.equals(other.getVatYn())));
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
        _hashCode += new Double(getGasanRate()).hashCode();
        if (getGasanRateGubun() != null) {
            _hashCode += getGasanRateGubun().hashCode();
        }
        if (getOcrBuseoCd() != null) {
            _hashCode += getOcrBuseoCd().hashCode();
        }
        if (getOcrSiguCd() != null) {
            _hashCode += getOcrSiguCd().hashCode();
        }
        if (getRowStatus() != null) {
            _hashCode += getRowStatus().hashCode();
        }
        if (getSemokCd() != null) {
            _hashCode += getSemokCd().hashCode();
        }
        if (getSemokNm() != null) {
            _hashCode += getSemokNm().hashCode();
        }
        if (getSuBuseoCd() != null) {
            _hashCode += getSuBuseoCd().hashCode();
        }
        if (getVatYn() != null) {
            _hashCode += getVatYn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Bu04SemokWSDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:BugaWebService", "Bu04SemokWSDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gasanRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "gasanRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gasanRateGubun");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "gasanRateGubun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ocrBuseoCd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "ocrBuseoCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ocrSiguCd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "ocrSiguCd"));
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
        elemField.setFieldName("semokCd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "semokCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("semokNm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "semokNm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suBuseoCd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "suBuseoCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vatYn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "vatYn"));
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
