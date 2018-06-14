package _212._147._46._10.stmr.websvc.ws.SOWNN00216.wsdl;

public class SOWNN00216PortTypeProxy implements _212._147._46._10.stmr.websvc.ws.SOWNN00216.wsdl.SOWNN00216PortType {
  private String _endpoint = null;
  private _212._147._46._10.stmr.websvc.ws.SOWNN00216.wsdl.SOWNN00216PortType sOWNN00216PortType = null;
  
  public SOWNN00216PortTypeProxy() {
    _initSOWNN00216PortTypeProxy();
  }
  
  private void _initSOWNN00216PortTypeProxy() {
    try {
      sOWNN00216PortType = (new _212._147._46._10.stmr.websvc.ws.SOWNN00216.wsdl.SOWNN00216ServiceLocator()).getSOWNN00216Port();
      if (sOWNN00216PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sOWNN00216PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sOWNN00216PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sOWNN00216PortType != null)
      ((javax.xml.rpc.Stub)sOWNN00216PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public _212._147._46._10.stmr.websvc.ws.SOWNN00216.wsdl.SOWNN00216PortType getSOWNN00216PortType() {
    if (sOWNN00216PortType == null)
      _initSOWNN00216PortTypeProxy();
    return sOWNN00216PortType;
  }
  
  public _212._147._46._10.stmr.websvc.ws.SOWNN00216.wsdl.ResponseType SOWNN00216(_212._147._46._10.stmr.websvc.ws.SOWNN00216.wsdl.RequestType DOCUMENT) throws java.rmi.RemoteException{
    if (sOWNN00216PortType == null)
      _initSOWNN00216PortTypeProxy();
    return sOWNN00216PortType.SOWNN00216(DOCUMENT);
  }
  
  
}