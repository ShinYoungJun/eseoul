package _212._147._46._10.stmr.websvc.ws.SOWNN00214.wsdl;

public class SOWNN00214PortTypeProxy implements _212._147._46._10.stmr.websvc.ws.SOWNN00214.wsdl.SOWNN00214PortType {
  private String _endpoint = null;
  private _212._147._46._10.stmr.websvc.ws.SOWNN00214.wsdl.SOWNN00214PortType sOWNN00214PortType = null;
  
  public SOWNN00214PortTypeProxy() {
    _initSOWNN00214PortTypeProxy();
  }
  
  private void _initSOWNN00214PortTypeProxy() {
    try {
      sOWNN00214PortType = (new _212._147._46._10.stmr.websvc.ws.SOWNN00214.wsdl.SOWNN00214ServiceLocator()).getSOWNN00214Port();
      if (sOWNN00214PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sOWNN00214PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sOWNN00214PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sOWNN00214PortType != null)
      ((javax.xml.rpc.Stub)sOWNN00214PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public _212._147._46._10.stmr.websvc.ws.SOWNN00214.wsdl.SOWNN00214PortType getSOWNN00214PortType() {
    if (sOWNN00214PortType == null)
      _initSOWNN00214PortTypeProxy();
    return sOWNN00214PortType;
  }
  
  public _212._147._46._10.stmr.websvc.ws.SOWNN00214.wsdl.ResponseType SOWNN00214(_212._147._46._10.stmr.websvc.ws.SOWNN00214.wsdl.RequestType DOCUMENT) throws java.rmi.RemoteException{
    if (sOWNN00214PortType == null)
      _initSOWNN00214PortTypeProxy();
    return sOWNN00214PortType.SOWNN00214(DOCUMENT);
  }
  
  
}