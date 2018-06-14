/**
 * SOWNN00222ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package _212._147._46._10.stmr.websvc.ws.SOWNN00222.wsdl;

public class SOWNN00222ServiceLocator extends org.apache.axis.client.Service implements _212._147._46._10.stmr.websvc.ws.SOWNN00222.wsdl.SOWNN00222Service {

    public SOWNN00222ServiceLocator() {
    }


    public SOWNN00222ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SOWNN00222ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SOWNN00222Port
    private java.lang.String SOWNN00222Port_address = "http://10.46.147.212.:3100/stmr/websvc/ws";

    public java.lang.String getSOWNN00222PortAddress() {
        return SOWNN00222Port_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SOWNN00222PortWSDDServiceName = "SOWNN00222Port";

    public java.lang.String getSOWNN00222PortWSDDServiceName() {
        return SOWNN00222PortWSDDServiceName;
    }

    public void setSOWNN00222PortWSDDServiceName(java.lang.String name) {
        SOWNN00222PortWSDDServiceName = name;
    }

    public _212._147._46._10.stmr.websvc.ws.SOWNN00222.wsdl.SOWNN00222PortType getSOWNN00222Port() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SOWNN00222Port_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSOWNN00222Port(endpoint);
    }

    public _212._147._46._10.stmr.websvc.ws.SOWNN00222.wsdl.SOWNN00222PortType getSOWNN00222Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            _212._147._46._10.stmr.websvc.ws.SOWNN00222.wsdl.SOWNN00222BindingStub _stub = new _212._147._46._10.stmr.websvc.ws.SOWNN00222.wsdl.SOWNN00222BindingStub(portAddress, this);
            _stub.setPortName(getSOWNN00222PortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSOWNN00222PortEndpointAddress(java.lang.String address) {
        SOWNN00222Port_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (_212._147._46._10.stmr.websvc.ws.SOWNN00222.wsdl.SOWNN00222PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                _212._147._46._10.stmr.websvc.ws.SOWNN00222.wsdl.SOWNN00222BindingStub _stub = new _212._147._46._10.stmr.websvc.ws.SOWNN00222.wsdl.SOWNN00222BindingStub(new java.net.URL(SOWNN00222Port_address), this);
                _stub.setPortName(getSOWNN00222PortWSDDServiceName());
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
        if ("SOWNN00222Port".equals(inputPortName)) {
            return getSOWNN00222Port();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://10.46.147.212.:3100/stmr/websvc/ws/SOWNN00222/wsdl", "SOWNN00222Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://10.46.147.212.:3100/stmr/websvc/ws/SOWNN00222/wsdl", "SOWNN00222Port"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SOWNN00222Port".equals(portName)) {
            setSOWNN00222PortEndpointAddress(address);
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
