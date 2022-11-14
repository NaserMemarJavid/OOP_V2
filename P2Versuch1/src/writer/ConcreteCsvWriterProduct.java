package writer;

import business.*;

import java.io.*;

public class ConcreteCsvWriterProduct extends WriterProduct {
	
	private BufferedWriter aus;
	
	public ConcreteCsvWriterProduct(){
		try {
			this.aus = new BufferedWriter( new FileWriter("FreizeitBaeder.csv", true));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void fuegeInDateiHinzu(Freizeitbad freizeitbad) throws IOException {
		this.aus.write(freizeitbad.gibFreizeitbadZurueck(';'));
		this.aus.newLine();
	}

//	@Override
//	public void fuegeZeileHinzu(Freizeitbad freizeitbad) throws IOException {
//		// TODO Auto-generated method stub
//		
//	}
	
	@Override
	public void schliesseDatei() throws IOException {
		aus.flush();
		aus.close();
		
	}

	

	
	
	
	
	

}
