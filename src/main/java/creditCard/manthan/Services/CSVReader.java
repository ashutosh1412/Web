package creditCard.manthan.Services;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;
import creditCard.manthan.dbObject.Details;
import creditCard.manthan.repository.DetailsRepository;

@Service
public class CSVReader {

	@Autowired
	private DetailsRepository detailsRepository;
	
	public void readFile() {
		String csvFile = "C:\\Users\\Danger\\Downloads\\credit_card.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		int count=0;
		Details details;
		String []abc = new String[100];
		try {

			br = new BufferedReader(new FileReader(csvFile));
			System.out.println(br.readLine());
			while ((line = br.readLine()) != null) {
				line = line.replace("Â","");
				line = line.replace(".","_");
				details= new Details(line.split(cvsSplitBy));
				detailsRepository.save(details);
				System.out.println(line);
				count=count+1;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public Object getAllDetails()
	{
		return detailsRepository.findAll();	
	}
}
