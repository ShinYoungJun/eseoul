/**
 * StatusCodeWSDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package BugaWebService_pkg;

public class StatusCodeWSDTO  implements java.io.Serializable {
    private java.lang.String errorCode;

    private java.lang.String errorMsg;

    private java.lang.String insertAk;

    private java.lang.String insertKey;

    private java.lang.String resultCnt;

    public StatusCodeWSDTO() {
    }

    public StatusCodeWSDTO(
           java.lang.String errorCode,
           java.lang.String errorMsg,
           java.lang.String insertAk,
           java.lang.String insertKey,
           java.lang.String resultCnt) {
           this.errorCode = errorCode;
           this.errorMsg = errorMsg;
           this.insertAk = insertAk;
           this.insertKey = insertKey;
           this.resultCnt = resultCnt;
    }


    /**
     * Gets the errorCode value for this StatusCodeWSDTO.
     * 
     * @return errorCode
     */
    public java.lang.String getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this StatusCodeWSDTO.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.String errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorMsg value for this StatusCodeWSDTO.
     * 
     * @return errorMsg
     */
    public java.lang.String getErrorMsg() {
        return errorMsg;
    }


    /**
     * Sets the errorMsg value for this StatusCodeWSDTO.
     * 
     * @param errorMsg
     */
    public void setErrorMsg(java.lang.String errorMsg) {
        this.errorMsg = errorMsg;
    }


    /**
     * Gets the insertAk value for this StatusCodeWSDTO.
     * 
     * @return insertAk
     */
    public java.lang.String getInsertAk() {
        return insertAk;
    }


    /**
     * Sets the insertAk value for this StatusCodeWSDTO.
     * 
     * @param insertAk
     */
    public void setInsertAk(java.lang.String insertAk) {
        this.insertAk = insertAk;
    }


    /**
     * Gets the insertKey value for this StatusCodeWSDTO.
     * 
     * @return insertKey
     */
    public java.lang.String getInsertKey() {
        return insertKey;
    }


    /**
     * Sets the insertKey value for this StatusCodeWSDTO.
     * 
     * @param insertKey
     */
    public void setInsertKey(java.lang.String insertKey) {
        this.insertKey = insertKey;
    }


    /**
     * Gets the resultCnt value for this StatusCodeWSDTO.
     * 
     * @return resultCnt
     */
    public java.lang.String getResultCnt() {
        return resultCnt;
    }


    /**
     * Sets the resultCnt value for this StatusCodeWSDTO.
     * 
     * @param resultCnt
     */
    public void setResultCnt(java.lang.String resultCnt) {
        this.resultCnt = resultCnt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusCodeWSDTO)) return false;
        StatusCodeWSDTO other = (StatusCodeWSDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.errorMsg==null && other.getErrorMsg()==null) || 
             (this.errorMsg!=null &&
              this.errorMsg.equals(other.getErrorMsg()))) &&
            ((this.insertAk==null && other.getInsertAk()==null) || 
             (this.insertAk!=null &&
              this.insertAk.equals(other.getInsertAk()))) &&
            ((this.insertKey==null && other.getInsertKey()==null) || 
             (this.insertKey!=null &&
              this.insertKey.equals(other.getInsertKey()))) &&
            ((this.resultCnt==null && other.getResultCnt()==null) || 
             (this.resultCnt!=null &&
              this.resultCnt.equals(other.getResultCnt())));
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
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getErrorMsg() != null) {
            _hashCode += getErrorMsg().hashCode();
        }
        if (getInsertAk() != null) {
            _hashCode += getInsertAk().hashCode();
        }
        if (getInsertKey() != null) {
            _hashCode += getInsertKey().hashCode();
        }
        if (getResultCnt() != null) {
            _hashCode += getResultCnt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusCodeWSDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:BugaWebService", "StatusCodeWSDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "errorMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertAk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "insertAk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "insertKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCnt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "resultCnt"));
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
