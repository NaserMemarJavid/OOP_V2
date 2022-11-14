package writer;

import business.*;

import java.io.IOException;

public abstract class WriterProduct {
	
	public abstract void fuegeInDateiHinzu( Freizeitbad freizeitbad ) throws IOException;
	
//	public abstract void fuegeZeileHinzu( Freizeitbad freizeitbad) throws IOException; 
	
	public abstract void schliesseDatei()  throws IOException;

	
	

}
