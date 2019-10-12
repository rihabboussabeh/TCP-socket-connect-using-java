import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try{
			Socket s= new Socket ("localhost", 1234);
			BufferedReader entree = new BufferedReader (new InputStreamReader(s.getInputStream()));
		    PrintWriter sortie = new PrintWriter(new OutputStreamWriter (s.getOutputStream()));
		    Scanner clavier = new Scanner(System.in);
			System.out.println("Texte ? ");
			String saisie = clavier.nextLine();
			sortie.println(saisie);
			sortie.flush(); // vide le tampon en ecrivant les données dans le flux
			String buff2 = entree.readLine();
		    System.out.println(buff2);
			
			
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}