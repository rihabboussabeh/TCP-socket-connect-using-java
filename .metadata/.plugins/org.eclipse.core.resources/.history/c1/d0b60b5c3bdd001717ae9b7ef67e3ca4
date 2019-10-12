import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;


public class Connection extends Thread {
	
	private Socket s;
	 PrintWriter sortie;
	 BufferedReader entree;

	public Connection(Socket s){
	
	try{
		this.s=s;
	    entree = new BufferedReader (new InputStreamReader(s.getInputStream()));
	    sortie = new PrintWriter(new OutputStreamWriter (s.getOutputStream()));
			
	}catch (IOException e){
		e.printStackTrace();
	}
	
	}
	public void run(){
		try{
			String buff = entree.readLine();
			sortie.println(buff);
			sortie.flush();
			System.out.println("deconexion de client");
			s.close();
		  }
		  catch (IOException e){
				e.printStackTrace();
			}
		
		}

}