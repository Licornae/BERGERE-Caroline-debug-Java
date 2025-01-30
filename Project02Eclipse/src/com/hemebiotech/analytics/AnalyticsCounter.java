
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import read.ISymptomReader;
import write.ISymptomWriter;

/**
 * AnalyticsCounter is a class that counts the occurrences of each symptom,
 * sorts them and writes them to a file. It implements the ISymptomReader
 * interface.
 * @see ISymptomReader
 * @see ISymptomWriter
 */
public class AnalyticsCounter { 

	private ISymptomReader reader;
	private ISymptomWriter writer;
	
	/**
	 * Constructor of the class AnalyticsCounter.
	 * @param reader
	 * @param writer
	 */
	public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
		this.reader = reader;
		this.writer = writer;
	}	
	 
	/**
	 * Method that returns a list of symptoms
	 * @return symptoms list
	 */
	public List<String> getSymptoms() {  
		return reader.getSymptoms();
	}
		
	/**
	 * Counts the occurrences of each symptom in the provided list.
	 * @param symptoms The list of symptoms to analyse.
	 * @return A map where the keys are symptoms and the values are their occurrences.
	 */
	public Map<String, Integer> countSymptoms(List<String> symptoms) {
		Map<String, Integer> result = new HashMap<String, Integer>(); 
		
		for(String symptom : symptoms) {                                  
			result.put(symptom, result.getOrDefault(symptom, 0)+1);		    
		}		
		
		return result;
	} 
	
	/**
	 * Sorts the given map of symptoms by symptom names in alphabetic order.
	 * @param symptoms A map containing symptoms and their occurrences.
	 * @return A TreeMap with symptoms sorted alphabetically.
	 */
	public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
		return new TreeMap<String, Integer>(symptoms);
	} 
	
	/**
	 * Method that writes the map of symptoms in a file
	 * @param symptoms A map of symptoms or a sorted map of symptoms
	 * @throws Exception
	 */
	public void writeSymptoms(Map<String, Integer> symptoms) { 
		writer.writeSymptoms(symptoms);
		}
	}