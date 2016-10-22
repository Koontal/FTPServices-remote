package org.koontal.edu;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MySocketServer {

	public static void main(String[] args) {
        
		ServerSocket server;
		try {
			server = new ServerSocket(4444);
			Socket sc=server.accept();
			
			DataInputStream dip=new DataInputStream(sc.getInputStream());
			String message=dip.readUTF();
			System.err.println("Message from client is::"+message);
			sc.close();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
