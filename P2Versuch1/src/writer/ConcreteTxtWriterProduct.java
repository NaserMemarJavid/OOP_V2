package writer;

import java.io.*;

import business.Freizeitbad;

public class ConcreteTxtWriterProduct extends WriterProduct {
	
	private BufferedWriter aus;
	public ConcreteTxtWriterProduct() {
		try {
			this.aus = new BufferedWriter( new FileWriter("Freizeitbaeder.txt", true));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void fuegeInDateiHinzu(Freizeitbad freizeitbad) throws IOException {
		
		String txt = "Daten des Freizeitbades " + 
				"\\n Name des Freizeitbades: \t" 			+ freizeitbad.getName()+ 
				"\n Oeffnungszeit des Freizeitbads: \t" 	+ freizeitbad.getGeoeffnetVon()+" - "+freizeitbad.getGeoeffnetBis()+
				"\n Beckenlaenge des Freizeitbads: \t" 		+ freizeitbad.getBeckenlaenge()+
				"\n Wassertemperatu des Freizeitbads: \t"	+ freizeitbad.getTemperatur();
		aus.write(txt);
		aus.newLine();
		aus.newLine();

	}

	@Override
	public void schliesseDatei() throws IOException {
		
		aus.flush();
		aus.close();

	}

}
