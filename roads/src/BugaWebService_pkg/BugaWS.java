/**
 * BugaWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package BugaWebService_pkg;

public interface BugaWS extends java.rmi.Remote {
    public BugaWebService_pkg.Bu04UserInfoWSDTO getUserInfo(java.lang.String in0) throws java.rmi.RemoteException;
    public boolean isCheckBugaUpdate(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, java.lang.String in5) throws java.rmi.RemoteException;
    public java.lang.String getNewTaxNo(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3) throws java.rmi.RemoteException;
    public BugaWebService_pkg.Bu04SemokWSDTO getSemokInfo(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException;
    public BugaWebService_pkg.Bu04SemokWSDTO[] getListSemokInfo(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;
    public BugaWebService_pkg.StatusCodeWSDTO insertBugaRegist(BugaWebService_pkg.Bu04BugaWSDTO in0) throws java.rmi.RemoteException;
    public BugaWebService_pkg.StatusCodeWSDTO insertBugaRegistExt(BugaWebService_pkg.Bu04BugaExtWSDTO in0) throws java.rmi.RemoteException;
    public BugaWebService_pkg.StatusCodeWSDTO deleteBuga(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, java.lang.String in5, java.lang.String in6, java.lang.String in7) throws java.rmi.RemoteException;
    public BugaWebService_pkg.Bu04SimpleBugaWSDTO[] getListSimpleBuga(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException;
    public BugaWebService_pkg.Bu04SimpleBugaETCWSDTO getSimpleBuga(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, java.lang.String in5, java.lang.String in6) throws java.rmi.RemoteException;
    public BugaWebService_pkg.Bu04SemokWSRACSDTO getSemokInfoRACS(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException;
    public BugaWebService_pkg.Bu04GyuljeInfoDTO getGyuljeInfo(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, java.lang.String in5, java.lang.String in6) throws java.rmi.RemoteException;
    public BugaWebService_pkg.StatusCodeWSDTO biGwaSeRegistWS(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, java.lang.String in5, java.lang.String in6) throws java.rmi.RemoteException;
    public BugaWebService_pkg.StatusCodeWSDTO updateNapgiYmd(BugaWebService_pkg.Bu04BugaWSDTO in0) throws java.rmi.RemoteException;
}
