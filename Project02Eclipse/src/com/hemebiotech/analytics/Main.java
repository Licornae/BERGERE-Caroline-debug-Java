
import java.util.List;
import java.util.Map;

import read.ISymptomReader;
import read.ReadSymptomDataFromFile;
import write.ISymptomWriter;
import write.WriteSymptomDataToFile;

/**
 * Main is a class that reads symptoms from a file, counts the occurrences of
 * each symptom, sorts them and writes them to a file.
 * 
 * @see ISymptomReader
 * @see ISymptomWriter
 * @see AnalyticsCounter
 */
public class Main {

	public static void main(String[] args) {
		
		ISymptomReader reader = new ReadSymptomDataFromFile("C:\\Users\\User\\Documents\\Alternance\\OpenClassrooms\\Projet2\\"
				+ "Etape1_repoGit\\BERGERE-Caroline-debug-Java\\Project02Eclipse\\symptoms.txt");
		ISymptomWriter writer = new WriteSymptomDataToFile();

		AnalyticsCounter analyticsCounter = new AnalyticsCounter(reader, writer);
		
		List<String> symptoms = analyticsCounter.getSymptoms();
		
	    Map<String, Integer> countedSymptoms = analyticsCounter.countSymptoms(symptoms);
		
	    Map<String, Integer> sortedSymptoms = analyticsCounter.sortSymptoms(countedSymptoms);

	    analyticsCounter.writeSymptoms(sortedSymptoms);
	}				

}