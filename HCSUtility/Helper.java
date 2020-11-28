package HCSUtility;

import GUI.ErrorScreen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.UUID;

final public class Helper
{
    private Helper()
    {
    }

    static public ArrayList<String> loadChartData(String filePath)
    {
        try
        {
            File file = new File(filePath);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            ArrayList<String> chart = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null)
            {
                chart.add(line);
            }

            reader.close();

            if (!Files.deleteIfExists(file.toPath()))
            {
                ErrorScreen err = new ErrorScreen("Could not delete patient_id.txt");
                err.setVisible(true);
            }

            return chart;
        }
        catch (IOException e)
        {
            ErrorScreen err = new ErrorScreen(e.toString());
            err.setVisible(true);
            return new ArrayList<String>();
        }
    }

    static public String generateId(String input)
    {
        return UUID.nameUUIDFromBytes(input.getBytes()).toString();
    }

    static public String passwordHash(String password)
    {
        return UUID.nameUUIDFromBytes(password.getBytes()).toString();
    }
}
