/**
 * BugaWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package BugaWebService_pkg;

public class BugaWebServiceLocator extends org.apache.axis.client.Service implements BugaWebService_pkg.BugaWebService {

    public BugaWebServiceLocator() {
    }


    public BugaWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BugaWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BugaWSPort
    private java.lang.String BugaWSPort_address = "http://98.33.4.82:8082/BugaWebService/BugaWebService";

    public java.lang.String getBugaWSPortAddress() {
        return BugaWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BugaWSPortWSDDServiceName = "BugaWSPort";

    public java.lang.String getBugaWSPortWSDDServiceName() {
        return BugaWSPortWSDDServiceName;
    }

    public void setBugaWSPortWSDDServiceName(java.lang.String name) {
        BugaWSPortWSDDServiceName = name;
    }

    public BugaWebService_pkg.BugaWS getBugaWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BugaWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBugaWSPort(endpoint);
    }

    public BugaWebService_pkg.BugaWS getBugaWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            BugaWebService_pkg.BugaWSSoapBindingStub _stub = new BugaWebService_pkg.BugaWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getBugaWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBugaWSPortEndpointAddress(java.lang.String address) {
        BugaWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (BugaWebService_pkg.BugaWS.class.isAssignableFrom(serviceEndpointInterface)) {
                BugaWebService_pkg.BugaWSSoapBindingStub _stub = new BugaWebService_pkg.BugaWSSoapBindingStub(new java.net.URL(BugaWSPort_address), this);
                _stub.setPortName(getBugaWSPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BugaWSPort".equals(inputPortName)) {
            return getBugaWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:BugaWebService", "BugaWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:BugaWebService", "BugaWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BugaWSPort".equals(portName)) {
            setBugaWSPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
