/**
 * RequestTypeDATAMessageBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package _212._147._46._10.stmr.websvc.ws.SOWNN00221.wsdl;

public class RequestTypeDATAMessageBody  implements java.io.Serializable {
    private java.lang.String in_confirm_se;

    private java.lang.String mw_take_no;

    private java.lang.String take_stf_id;

    private java.lang.String dpp_id;

    private java.lang.String deal_dutyp_id;

    public RequestTypeDATAMessageBody() {
    }

    public RequestTypeDATAMessageBody(
           java.lang.String in_confirm_se,
           java.lang.String mw_take_no,
           java.lang.String take_stf_id,
           java.lang.String dpp_id,
           java.lang.String deal_dutyp_id) {
           this.in_confirm_se = in_confirm_se;
           this.mw_take_no = mw_take_no;
           this.take_stf_id = take_stf_id;
           this.dpp_id = dpp_id;
           this.deal_dutyp_id = deal_dutyp_id;
    }


    /**
     * Gets the in_confirm_se value for this RequestTypeDATAMessageBody.
     * 
     * @return in_confirm_se
     */
    public java.lang.String getIn_confirm_se() {
        return in_confirm_se;
    }


    /**
     * Sets the in_confirm_se value for this RequestTypeDATAMessageBody.
     * 
     * @param in_confirm_se
     */
    public void setIn_confirm_se(java.lang.String in_confirm_se) {
        this.in_confirm_se = in_confirm_se;
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


    /**
     * Gets the take_stf_id value for this RequestTypeDATAMessageBody.
     * 
     * @return take_stf_id
     */
    public java.lang.String getTake_stf_id() {
        return take_stf_id;
    }


    /**
     * Sets the take_stf_id value for this RequestTypeDATAMessageBody.
     * 
     * @param take_stf_id
     */
    public void setTake_stf_id(java.lang.String take_stf_id) {
        this.take_stf_id = take_stf_id;
    }


    /**
     * Gets the dpp_id value for this RequestTypeDATAMessageBody.
     * 
     * @return dpp_id
     */
    public java.lang.String getDpp_id() {
        return dpp_id;
    }


    /**
     * Sets the dpp_id value for this RequestTypeDATAMessageBody.
     * 
     * @param dpp_id
     */
    public void setDpp_id(java.lang.String dpp_id) {
        this.dpp_id = dpp_id;
    }


    /**
     * Gets the deal_dutyp_id value for this RequestTypeDATAMessageBody.
     * 
     * @return deal_dutyp_id
     */
    public java.lang.String getDeal_dutyp_id() {
        return deal_dutyp_id;
    }


    /**
     * Sets the deal_dutyp_id value for this RequestTypeDATAMessageBody.
     * 
     * @param deal_dutyp_id
     */
    public void setDeal_dutyp_id(java.lang.String deal_dutyp_id) {
        this.deal_dutyp_id = deal_dutyp_id;
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
            ((this.in_confirm_se==null && other.getIn_confirm_se()==null) || 
             (this.in_confirm_se!=null &&
              this.in_confirm_se.equals(other.getIn_confirm_se()))) &&
            ((this.mw_take_no==null && other.getMw_take_no()==null) || 
             (this.mw_take_no!=null &&
              this.mw_take_no.equals(other.getMw_take_no()))) &&
            ((this.take_stf_id==null && other.getTake_stf_id()==null) || 
             (this.take_stf_id!=null &&
              this.take_stf_id.equals(other.getTake_stf_id()))) &&
            ((this.dpp_id==null && other.getDpp_id()==null) || 
             (this.dpp_id!=null &&
              this.dpp_id.equals(other.getDpp_id()))) &&
            ((this.deal_dutyp_id==null && other.getDeal_dutyp_id()==null) || 
             (this.deal_dutyp_id!=null &&
              this.deal_dutyp_id.equals(other.getDeal_dutyp_id())));
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
        if (getIn_confirm_se() != null) {
            _hashCode += getIn_confirm_se().hashCode();
        }
        if (getMw_take_no() != null) {
            _hashCode += getMw_take_no().hashCode();
        }
        if (getTake_stf_id() != null) {
            _hashCode += getTake_stf_id().hashCode();
        }
        if (getDpp_id() != null) {
            _hashCode += getDpp_id().hashCode();
        }
        if (getDeal_dutyp_id() != null) {
            _hashCode += getDeal_dutyp_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestTypeDATAMessageBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://10.46.147.212.:3100/stmr/websvc/ws/SOWNN00221/wsdl", ">>>RequestType>DATA>message>body"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("in_confirm_se");
        elemField.setXmlName(new javax.xml.namespace.QName("", "in_confirm_se"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mw_take_no");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mw_take_no"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("take_stf_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "take_stf_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dpp_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dpp_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deal_dutyp_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deal_dutyp_id"));
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
