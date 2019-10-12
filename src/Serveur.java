import java.io.*;
import java.net.*;
import java.util.*;


public class Serveur extends Thread {

	public static void main(String[] args) {
		try{
			ServerSocket ss =new ServerSocket(1234);
			while(true){
				
			Socket clientSocket=ss.accept();
			System.out.println("Ouverture de la connexion sur la socket de service " );
		    Connection  c = new Connection(clientSocket);
		    Thread client = new Thread((Runnable) c);
		    client.start();
			
			}
		
			
		}catch (IOException e){
			e.printStackTrace();
		}

	}
}