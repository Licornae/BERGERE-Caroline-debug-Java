package write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WriteSymptomDataToFile implements ISymptomWriter {
	
		private static Logger logger = LogManager.getLogger(WriteSymptomDataToFile.class);
		
		@Override
		public void writeSymptoms(Map<String, Integer> symptoms) {
			
			BufferedWriter writer;
			
			try {
				writer = new BufferedWriter(new FileWriter("result.out"));
				for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {
				    writer.write(entry.getKey() + " : " + entry.getValue());
				    writer.newLine();
				}
				writer.close();
			} catch (IOException e) {
				logger.error("Impossible d'écrire dans le fichier");
			}
			
		}
			
	}
