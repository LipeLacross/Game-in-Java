import java.io.FileNotFoundException;
import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class ChargerReader {

    HashMap<String, Character> readCharacters(String pathArchiveCharacters)
    {
        HashMap<String, Character> characters = new HashMap<String, Character>();
        File archiveCharacters = new File(pathArchiveCharacters);

        try
        {
            Scanner scannerArchiveCharacters = new Scanner(archiveCharacters, "UTF-8");

            String characterName = "";
            String escanedLine = "";
            int characterEnergy = 0;
            while (scannerArchiveCharacters.hasNextLine())
            {
                while(escanedLine.equals("CHARACTER"))
                {
                    escanedLine = scannerArchiveCharacters.nextLine();
                }
                escanedLine = scannerArchiveCharacters.nextLine();
                characterName = scannerArchiveCharacters.nextLine();
                escanedLine = scannerArchiveCharacters.nextLine();
                characterEnergy = Integer.parseInt(scannerArchiveCharacters.nextLine());
                characters.put(characterName, new Character(characterName, characterEnergy));
            }

            scannerArchiveCharacters.close();
        }
        catch (FileNotFoundException exception)
        {
            exception.printStackTrace();
        }
        return characters;
    }
}
