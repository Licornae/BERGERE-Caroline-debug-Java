package read;

import java.util.List;

/**
 * ISymptomReader is an interface that reads the symptoms from a data source.
 */
public interface ISymptomReader {
	/**
	 * If no data is available, return an empty List
	 * 
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
	 */

	List<String> getSymptoms();
}
