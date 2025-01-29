
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import read.ISymptomReader;
import write.ISymptomWriter;

public class AnalyticsCounter { 

	private ISymptomReader reader;
	private ISymptomWriter writer;
	
	public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
		this.reader = reader;
		this.writer = writer;
	}
				
	
	public List<String> getSymptoms() {  
		return reader.getSymptoms();
	}
		
	
	public Map<String, Integer> countSymptoms(List<String> symptoms) {
		Map<String, Integer> result = new HashMap<String, Integer>(); 
		
		for(String symptom : symptoms) {                                  
			result.put(symptom, result.getOrDefault(symptom, 0)+1);		    
		}		
		
		return result;
	} 
	
	
	public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
		return new TreeMap<String, Integer>(symptoms);
	} 
	
	
	public void writeSymptoms(Map<String, Integer> symptoms) { 
		writer.writeSymptoms(symptoms);
		}
	}