import java.io.FileNotFoundException;
import java.io.PrintWriter;


//essendo cheked siamo costretti a verificare le eccezzioni non è possibile ignorarle o gestirle o dire esplicitamente che non le gestiremo


public class main {
	
	static int mediaInteraVett(int[] v, int diQuanti) {
		//fingiamo di voler fare un backup su disco del vettore
		try {
			PrintWriter backup = new PrintWriter("d:\\non Esisto.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   //fingo di creare un file di testo con la classe PrintWriter
		
		int somma=0;
		for(int i=0; i<diQuanti; i++)
			somma+=v[i];
		if (diQuanti!=0)	
		  return somma/diQuanti;
		else
			throw new ArithmeticException();
	}
	
	
	static int medotoIntermedio(int[] v, int diQuanti){
		
		//essendo uncheked neanche il metodo intermedio è obbligato a fare un check
		try 
		{
		     return mediaInteraVett(v, diQuanti);
		}
		catch (ArithmeticException errore) 
		{
			return -1;
		}
		
		catch (ArrayIndexOutOfBoundsException errore) 
		{
			return -2;
		}
		

	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vettore = { 3,8,-78,19,56,0,41,88,12,13,14,90};
		System.out.println("Media: " + medotoIntermedio(vettore, 15));
	
	}



}
