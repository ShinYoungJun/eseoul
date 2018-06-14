package BugaWebService;

import java.rmi.RemoteException;

import sun.tools.jar.Main;
import BugaWebService_pkg.*;

public class BugaWSProxy implements BugaWS {
  private String _endpoint = null;
  private BugaWS bugaWS = null;
  
  public BugaWSProxy() {
    _initBugaWSProxy();
  }
  
  private void _initBugaWSProxy() {
    try {
      bugaWS = (new BugaWebServiceLocator()).getBugaWSPort();
      if (bugaWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bugaWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bugaWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bugaWS != null)
      ((javax.xml.rpc.Stub)bugaWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public BugaWebService_pkg.BugaWS getBugaWS() {
    if (bugaWS == null)
      _initBugaWSProxy();
    return bugaWS;
  }

	public StatusCodeWSDTO biGwaSeRegistWS(String in0, String in1, String in2, String in3, String in4, String in5, String in6) throws RemoteException {
	  if(bugaWS == null)
		  _initBugaWSProxy();
	  
	  return bugaWS.biGwaSeRegistWS(in0, in1, in2, in3, in4, in5, in6);
	}
	
	public StatusCodeWSDTO deleteBuga(String in0, String in1, String in2, String in3, String in4, String in5, String in6, String in7) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Bu04GyuljeInfoDTO getGyuljeInfo(String in0, String in1, String in2, String in3, String in4, String in5, String in6) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Bu04SemokWSDTO[] getListSemokInfo(String in0, String in1) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Bu04SimpleBugaWSDTO[] getListSimpleBuga(String in0, String in1, String in2) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getNewTaxNo(String in0, String in1, String in2, String in3) throws RemoteException {
	  if(bugaWS == null)
		  _initBugaWSProxy();
	  
	  return bugaWS.getNewTaxNo(in0, in1, in2, in3);
	}
	
	public Bu04SemokWSDTO getSemokInfo(String in0, String in1, String in2) throws RemoteException {
	  if(bugaWS == null)
		  _initBugaWSProxy();
	  
	  return bugaWS.getSemokInfo(in0, in1, in2);
	}
	
	public Bu04SemokWSRACSDTO getSemokInfoRACS(String in0, String in1, String in2) throws RemoteException {
	  if(bugaWS == null)
		  _initBugaWSProxy();
	  
	  return bugaWS.getSemokInfoRACS(in0, in1, in2);
	}
	
	public Bu04SimpleBugaETCWSDTO getSimpleBuga(String in0, String in1, String in2, String in3, String in4, String in5, String in6) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Bu04UserInfoWSDTO getUserInfo(String in0) throws RemoteException {
	  if(bugaWS == null)
		  _initBugaWSProxy();
	  
	  return bugaWS.getUserInfo(in0);
	}
	
	public StatusCodeWSDTO insertBugaRegist(Bu04BugaWSDTO in0) throws RemoteException {
		if(bugaWS == null)
		  _initBugaWSProxy();
	 
	 	return bugaWS.insertBugaRegist(in0);
	}
	
	public StatusCodeWSDTO insertBugaRegistExt(Bu04BugaExtWSDTO in0) throws RemoteException {
		if(bugaWS == null)
			  _initBugaWSProxy();
		  
		  return bugaWS.insertBugaRegistExt(in0);
	}
	
	public boolean isCheckBugaUpdate(String in0, String in1, String in2, String in3, String in4, String in5) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	
	public StatusCodeWSDTO updateNapgiYmd(Bu04BugaWSDTO in0) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	
}