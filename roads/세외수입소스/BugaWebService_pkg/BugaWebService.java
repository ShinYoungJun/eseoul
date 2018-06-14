/**
 * BugaWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package BugaWebService_pkg;

public interface BugaWebService extends javax.xml.rpc.Service {
    public java.lang.String getBugaWSPortAddress();

    public BugaWebService_pkg.BugaWS getBugaWSPort() throws javax.xml.rpc.ServiceException;

    public BugaWebService_pkg.BugaWS getBugaWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
