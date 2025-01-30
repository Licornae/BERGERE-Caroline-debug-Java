package write;

import java.util.Map;

/**
 * ISymptomWriter is an interface that writes the symptoms and their
 * occurrences.
 * 
 * @see WriteSymptomDataToFile
 */

public interface ISymptomWriter {
	
	/**
	 * This method writes the symptoms and their occurrences in a file.
	 * 
	 * @param symptoms is a map that contains the symptoms and their occurrences.
	 */
	
	public void writeSymptoms(Map<String, Integer> symptoms);

}
