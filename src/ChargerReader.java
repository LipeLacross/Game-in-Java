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

    HashMap<String, Chapter> readChapters(String pathArchiveChapters, HashMap<String, Character> characters, Scanner consoleScanner)
    {
        HashMap<String, Chapter> chapters = new HashMap<String, Chapter>();
        File archiveChapters = new File(pathArchiveChapters);

        try
        {
            Scanner scannerArchiveChapters = new Scanner(archiveChapters, "UTF-8");

            String characterName = "";
            String chapterName = "";
            String chapterText = "";
            String escanedLine = "";
            int energyVariation = 0;
            
            while (scannerArchiveChapters.hasNextLine())
            {
                while(escanedLine.equals("CHAPTER"))
                { 
                    escanedLine = scannerArchiveChapters.nextLine();
                }
                escanedLine = scannerArchiveChapters.nextLine();
                chapterName = scannerArchiveChapters.nextLine();
                escanedLine = scannerArchiveChapters.nextLine();
                chapterText = scannerArchiveChapters.nextLine();
                escanedLine = scannerArchiveChapters.nextLine();
                characterName = scannerArchiveChapters.nextLine();
                escanedLine = scannerArchiveChapters.nextLine();
                energyVariation = Integer.parseInt(scannerArchiveChapters.nextLine());
                chapters.put(chapterName, new Chapter(chapterText, escanedLine, characters.get(characterName), characters.get(characterName), characters.get(characterName), energyVariation, energyVariation, energyVariation, consoleScanner));
            }

            scannerArchiveChapters.close();
        }
        catch (FileNotFoundException exception)
        {
            exception.printStackTrace();
        }
        return chapters;
    }
}
