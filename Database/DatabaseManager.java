package project1;

import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException; 
import java.util.ArrayList;
import java.io.*;

public class DatabaseManager {
	
	public DatabaseManager()
    {
        //will create new csv for all databases if one doesnt already exist
		File patientChart = new File("patientChart.csv");
		File treatmentChart = new File("treatmentChart.csv");
		File paymentInfo = new File("paymentInfo.csv");
		File report = new File("report.csv");
		try 
		{
			patientChart.createNewFile();
			treatmentChart.createNewFile();
			paymentInfo.createNewFile();
			report.createNewFile();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
    }
    
    public ArrayList<String[]> readCSV(String fileName)
    {
        String line = "";
        String splitBy = ",";
        ArrayList<String[]> values = new ArrayList<String[]>();
        
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while((line = br.readLine()) != null)
            {
                String[] value = line.split(splitBy);
                values.add(value);
            }
            br.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
        return values;
    }
    
    public void writeCSV(String fileName, ArrayList<String> line) throws IOException
    {
    	FileWriter writer = new FileWriter(fileName);
    	String total = "";
        for(String item : line) //concatenate all the values to one csv line
        {
        	total = total + ", " + item;
        }
        total = total.substring(2,total.length()); //to get rid of the first ", " probably a better way to write this
        writer.append(total);
        writer.close();
    }
    
    public String[] getInfo(String fileName, String identifier)
    {
        ArrayList<String[]> data = readCSV(fileName);
        String[] match = null;
        
        for(String[] line : data)
        {
            if(line[0].equals(identifier)) //assuming that all primary keys will be the first item
            {
                match = line;
                break;
            }
        }
        
        return match;
    }

}
