package _212._147._46._10.stmr.websvc.ws.SOWNN00253.wsdl;

public class SOWNN00253PortTypeProxy implements _212._147._46._10.stmr.websvc.ws.SOWNN00253.wsdl.SOWNN00253PortType {
  private String _endpoint = null;
  private _212._147._46._10.stmr.websvc.ws.SOWNN00253.wsdl.SOWNN00253PortType sOWNN00253PortType = null;
  
  public SOWNN00253PortTypeProxy() {
    _initSOWNN00253PortTypeProxy();
  }
  
  private void _initSOWNN00253PortTypeProxy() {
    try {
      sOWNN00253PortType = (new _212._147._46._10.stmr.websvc.ws.SOWNN00253.wsdl.SOWNN00253ServiceLocator()).getSOWNN00253Port();
      if (sOWNN00253PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sOWNN00253PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sOWNN00253PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sOWNN00253PortType != null)
      ((javax.xml.rpc.Stub)sOWNN00253PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public _212._147._46._10.stmr.websvc.ws.SOWNN00253.wsdl.SOWNN00253PortType getSOWNN00253PortType() {
    if (sOWNN00253PortType == null)
      _initSOWNN00253PortTypeProxy();
    return sOWNN00253PortType;
  }
  
  public _212._147._46._10.stmr.websvc.ws.SOWNN00253.wsdl.ResponseType SOWNN00222(_212._147._46._10.stmr.websvc.ws.SOWNN00253.wsdl.RequestType DOCUMENT) throws java.rmi.RemoteException{
    if (sOWNN00253PortType == null)
      _initSOWNN00253PortTypeProxy();
    return sOWNN00253PortType.SOWNN00222(DOCUMENT);
  }
  
  
}