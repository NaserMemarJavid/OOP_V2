package business;

import java.io.*;

import ownUtil.PlausiException;
import writer.ConcreteCsvWriterCreator;
import writer.ConcreteTxtWriterCreator;
import writer.WriterCreator;
import writer.WriterProduct;

public class FreizeitbaederModel{
	
	private Freizeitbad freizeitbad;
	
	public  FreizeitbaederModel(){
		
	}
	
	public void nehmeFreizeitbadAuf(
			String name, String von, String bis, String laenge, String temp)
					throws PlausiException {
		freizeitbad = new Freizeitbad(name, von, bis, laenge, temp);
	}

	public String zeigeFreizeitbadAn () throws PlausiException {
		return this.freizeitbad.gibFreizeitbadZurueck(' ');
		
	}
	
	//---------------------------------------------------------
	// schreibeDatei in csvDatei aus prakt1
	/*
	public void schreibeFreizeitbaederInCsvDatei() 
	// Werfen einer IOException
			throws IOException{
		BufferedWriter aus = new BufferedWriter(
		new FileWriter("Freizeitbaeder.csv", true));
		aus.write(this.getFreizeitbad().gibFreizeitbadZurueck(';'));
		aus.close();
	}
	*/
	
	public void schreibeFreizeitbaederInCsvDatei() throws IOException {
		
		WriterCreator writerCreator = new ConcreteCsvWriterCreator();
		WriterProduct writer = writerCreator.factoryMethod();
		writer.fuegeInDateiHinzu(this.freizeitbad);
		
//		writer.fuegeZeileHinzu(this.freizeitbad);
		writer.schliesseDatei();
		
		
	}
	
	public void schreibeFreizeitbaederInTxtDatei() throws IOException{
		
		WriterCreator writercreator = new ConcreteTxtWriterCreator();
		WriterProduct writer = writercreator.factoryMethod();
		writer.fuegeInDateiHinzu(this.freizeitbad);
		writer.schliesseDatei();
		
	}

	private Freizeitbad getFreizeitbad() {
		// TODO Auto-generated method stub
		return this.freizeitbad;
	}

	
	
}




