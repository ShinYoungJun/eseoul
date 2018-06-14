package _212._147._46._10.stmr.websvc.ws.SOWNN00247.wsdl;

public class SOWNN00247PortTypeProxy implements _212._147._46._10.stmr.websvc.ws.SOWNN00247.wsdl.SOWNN00247PortType {
  private String _endpoint = null;
  private _212._147._46._10.stmr.websvc.ws.SOWNN00247.wsdl.SOWNN00247PortType sOWNN00247PortType = null;
  private String serviceURL = null;
  
  public SOWNN00247PortTypeProxy(String serviceURL) {
	  this.serviceURL = serviceURL;  
    _initSOWNN00247PortTypeProxy();
  }
  
  private String getServiceURL(){
	  return this.serviceURL;
  }
  
  private void _initSOWNN00247PortTypeProxy() {
    try {
      sOWNN00247PortType = (new _212._147._46._10.stmr.websvc.ws.SOWNN00247.wsdl.SOWNN00247ServiceLocator(getServiceURL())).getSOWNN00247Port();
      if (sOWNN00247PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sOWNN00247PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sOWNN00247PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sOWNN00247PortType != null)
      ((javax.xml.rpc.Stub)sOWNN00247PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public _212._147._46._10.stmr.websvc.ws.SOWNN00247.wsdl.SOWNN00247PortType getSOWNN00247PortType() {
    if (sOWNN00247PortType == null)
      _initSOWNN00247PortTypeProxy();
    return sOWNN00247PortType;
  }
  
  public _212._147._46._10.stmr.websvc.ws.SOWNN00247.wsdl.ResponseType SOWNN00216(_212._147._46._10.stmr.websvc.ws.SOWNN00247.wsdl.RequestType DOCUMENT) throws java.rmi.RemoteException{
    if (sOWNN00247PortType == null)
      _initSOWNN00247PortTypeProxy();
    return sOWNN00247PortType.SOWNN00216(DOCUMENT);
  }
  
  
}