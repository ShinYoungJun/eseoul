package main.java.schedule.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPClientConfig;


 
public class FTPUtil {
    private FTPClient client = null;

 
     public void init(String host, String userName, String password, int port) {
         client = new FTPClient();
         client.setControlEncoding("euc-kr"); // 한글 encoding....

         FTPClientConfig config = new FTPClientConfig();
         client.configure(config);
         try {
             client.connect(host, port);
             client.login(userName, password);
             client.setSoTimeout(1000);
         } catch (SocketException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }

     }
   //하나씩
     public void upload(String dir, File file) {

         InputStream in = null;

         try {
             in = new FileInputStream(file);
             client.storeFile(dir + file.getName(), in);
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         } finally {
             try {
                 in.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
     }
   //하나씩
     public boolean download(String dir, String downloadFileName, String path) {

         FileOutputStream out = null;
         dir += downloadFileName;
         boolean result = false;
         try {
        	 

             out = new FileOutputStream(new File(path));
             result = client.retrieveFile(dir, out);
             
             
         } catch (IOException e) {
             e.printStackTrace();
         } finally {
        	 try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         }
         return result;

     };

     public void disconnection() {
         try {
             client.logout();
             if (client.isConnected()) {
                 client.disconnect();
             }
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
}

