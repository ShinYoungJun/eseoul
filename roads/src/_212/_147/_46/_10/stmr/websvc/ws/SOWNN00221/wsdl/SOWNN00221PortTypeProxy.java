package _212._147._46._10.stmr.websvc.ws.SOWNN00221.wsdl;

public class SOWNN00221PortTypeProxy implements _212._147._46._10.stmr.websvc.ws.SOWNN00221.wsdl.SOWNN00221PortType {
  private String _endpoint = null;
  private _212._147._46._10.stmr.websvc.ws.SOWNN00221.wsdl.SOWNN00221PortType sOWNN00221PortType = null;
  
  public SOWNN00221PortTypeProxy() {
    _initSOWNN00221PortTypeProxy();
  }
  
  private void _initSOWNN00221PortTypeProxy() {
    try {
      sOWNN00221PortType = (new _212._147._46._10.stmr.websvc.ws.SOWNN00221.wsdl.SOWNN00221ServiceLocator()).getSOWNN00221Port();
      if (sOWNN00221PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sOWNN00221PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sOWNN00221PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sOWNN00221PortType != null)
      ((javax.xml.rpc.Stub)sOWNN00221PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public _212._147._46._10.stmr.websvc.ws.SOWNN00221.wsdl.SOWNN00221PortType getSOWNN00221PortType() {
    if (sOWNN00221PortType == null)
      _initSOWNN00221PortTypeProxy();
    return sOWNN00221PortType;
  }
  
  public _212._147._46._10.stmr.websvc.ws.SOWNN00221.wsdl.ResponseType SOWNN00221(_212._147._46._10.stmr.websvc.ws.SOWNN00221.wsdl.RequestType DOCUMENT) throws java.rmi.RemoteException{
    if (sOWNN00221PortType == null)
      _initSOWNN00221PortTypeProxy();
    return sOWNN00221PortType.SOWNN00221(DOCUMENT);
  }
  
  
}