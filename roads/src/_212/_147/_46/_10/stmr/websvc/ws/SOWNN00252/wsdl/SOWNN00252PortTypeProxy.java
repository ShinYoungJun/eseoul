package _212._147._46._10.stmr.websvc.ws.SOWNN00252.wsdl;

public class SOWNN00252PortTypeProxy implements _212._147._46._10.stmr.websvc.ws.SOWNN00252.wsdl.SOWNN00252PortType {
  private String _endpoint = null;
  private _212._147._46._10.stmr.websvc.ws.SOWNN00252.wsdl.SOWNN00252PortType sOWNN00252PortType = null;
  
  public SOWNN00252PortTypeProxy() {
    _initSOWNN00252PortTypeProxy();
  }
  
  private void _initSOWNN00252PortTypeProxy() {
    try {
      sOWNN00252PortType = (new _212._147._46._10.stmr.websvc.ws.SOWNN00252.wsdl.SOWNN00252ServiceLocator()).getSOWNN00252Port();
      if (sOWNN00252PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sOWNN00252PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sOWNN00252PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sOWNN00252PortType != null)
      ((javax.xml.rpc.Stub)sOWNN00252PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public _212._147._46._10.stmr.websvc.ws.SOWNN00252.wsdl.SOWNN00252PortType getSOWNN00252PortType() {
    if (sOWNN00252PortType == null)
      _initSOWNN00252PortTypeProxy();
    return sOWNN00252PortType;
  }
  
  public _212._147._46._10.stmr.websvc.ws.SOWNN00252.wsdl.ResponseType SOWNN00221(_212._147._46._10.stmr.websvc.ws.SOWNN00252.wsdl.RequestType DOCUMENT) throws java.rmi.RemoteException{
    if (sOWNN00252PortType == null)
      _initSOWNN00252PortTypeProxy();
    return sOWNN00252PortType.SOWNN00221(DOCUMENT);
  }
  
  
}