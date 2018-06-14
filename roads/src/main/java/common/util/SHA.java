package main.java.common.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA {

	public static String SHA(String sVal,String sEncryptionName){
		//String sha256 = SHA(testString,"SHA-256");//SHA-256
		
		String sMsg="";//암호화 결과 값 문자열
		try{
			MessageDigest sh=MessageDigest.getInstance(sEncryptionName);
			sh.update(sVal.getBytes());
			byte byteData[]=sh.digest();
			StringBuffer sb = new StringBuffer();
			
			for(int i=0; i<byteData.length;i++){
				sb.append(Integer.toString((byteData[i]&0xff)+0x100,16).substring(1));
			}
			
			sMsg=sb.toString();
		}catch(NoSuchAlgorithmException e){
			e.printStackTrace();
			sMsg = null;
		}
		return sMsg;
	}
	
}
