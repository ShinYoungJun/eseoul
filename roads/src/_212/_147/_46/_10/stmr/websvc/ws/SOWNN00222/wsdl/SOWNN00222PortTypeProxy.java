package _212._147._46._10.stmr.websvc.ws.SOWNN00222.wsdl;

public class SOWNN00222PortTypeProxy implements _212._147._46._10.stmr.websvc.ws.SOWNN00222.wsdl.SOWNN00222PortType {
  private String _endpoint = null;
  private _212._147._46._10.stmr.websvc.ws.SOWNN00222.wsdl.SOWNN00222PortType sOWNN00222PortType = null;
  
  public SOWNN00222PortTypeProxy() {
    _initSOWNN00222PortTypeProxy();
  }
  
  private void _initSOWNN00222PortTypeProxy() {
    try {
      sOWNN00222PortType = (new _212._147._46._10.stmr.websvc.ws.SOWNN00222.wsdl.SOWNN00222ServiceLocator()).getSOWNN00222Port();
      if (sOWNN00222PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sOWNN00222PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sOWNN00222PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sOWNN00222PortType != null)
      ((javax.xml.rpc.Stub)sOWNN00222PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public _212._147._46._10.stmr.websvc.ws.SOWNN00222.wsdl.SOWNN00222PortType getSOWNN00222PortType() {
    if (sOWNN00222PortType == null)
      _initSOWNN00222PortTypeProxy();
    return sOWNN00222PortType;
  }
  
  public _212._147._46._10.stmr.websvc.ws.SOWNN00222.wsdl.ResponseType SOWNN00222(_212._147._46._10.stmr.websvc.ws.SOWNN00222.wsdl.RequestType DOCUMENT) throws java.rmi.RemoteException{
    if (sOWNN00222PortType == null)
      _initSOWNN00222PortTypeProxy();
    return sOWNN00222PortType.SOWNN00222(DOCUMENT);
  }
  
  
}