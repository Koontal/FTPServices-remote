package org.koontal.edu;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MySocketClient {

	public static void main(String[] args) {

		try {
			Socket client=new Socket("localhost", 4444);
			DataOutputStream dout=new DataOutputStream(client.getOutputStream());
			dout.writeUTF("Hello Koontal!!");
			dout.flush();
			dout.close();
			client.close();
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
