package main.java.mdb.util;


public class EncryptData {
	
	public EncryptData() {
		// TODO Auto-generated constructor stub
	}
	
	public String EncryptCode(String pString, String cString){
		char[] pwdString;
		char[] cptString;
		String tmpSTR1 = "";
		String tmpSTR2 = "";
		String tmpSTR3 = "";
		
		int i = 0;
		int flag = 0;
		int pCnt = 0;
		int cCnt = 0;
		
		pCnt = pString.length();
		cCnt = cString.length();
	    
    	pwdString = pString.toCharArray();
    	cptString = cString.toCharArray();
    	
	    flag = 0;
	    for(i = 0; i< pCnt; i++){
	    	tmpSTR1 = String.valueOf((int)pwdString[i] ^ (int)cptString[flag]);
	        tmpSTR2 += tmpSTR1;
	        tmpSTR3 = tmpSTR3 + String.valueOf(tmpSTR1.length());
	        
	        if(flag == cCnt-1){
	        	flag = 0;
	        }else{
	        	flag = flag+1;
	        }
	    }
	    return tmpSTR2 + "#" + tmpSTR3;
	}
	
	public String DecryptCode(String eString, String cString){
		
		String[] eptString;
		char[] cptString;
		String rtnString = "";
		
		int i = 0;
		int ePos = 0;
		int eSize = 0;
		int tPos = 0;
		int eCnt = 0; 
		int cCnt = 0; 
		int flag = 0;
		
		String tmpSTR1 = "";
		String tmpSTR2 = "";
		
		if(eString.indexOf("#") == -1){
			return "null";
		}
		
		ePos = eString.indexOf("#");
		
		tmpSTR1 = eString.substring(0, ePos);

		tmpSTR2 = eString.substring(ePos+1, eString.length());

		
		eptString = new String[tmpSTR2.length()];
		
		
		for(i = 0;i<tmpSTR2.length();i++){
			eSize = Integer.parseInt(tmpSTR2.substring(i,i+1));
			eptString[i] = tmpSTR1.substring(tPos,tPos+eSize);
			tPos = tPos + eSize;
		}

		eCnt = eptString.length;
		
		cCnt = cString.length();
		
		cptString = cString.toCharArray();
		
		if(flag == 0){
			rtnString = "";
		}
		
		for(i = 0; i < eCnt ; i++){
			rtnString = rtnString + (char)(Integer.parseInt(eptString[i]) ^ (int)cptString[flag]);
			
	        if(flag == cCnt-1){
	        	flag = 0;
	        }else{
	        	flag = flag+1;
	        }
		}

		return rtnString;
	
	
	}
}
	





