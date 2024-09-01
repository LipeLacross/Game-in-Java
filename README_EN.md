# MiniGame-in-Java

A text-based game with multiple choices and endings, developed for the project requested by Professor Lucas Figueiredo.

## 🔨 Project Features

- **Multiple Choices:** Offers the player the ability to make decisions that affect the progression of the story.
- **Alternative Endings:** Different endings are presented depending on the player's choices.
- **Textual Interface:** Interactions are performed through text, without complex graphics.

### Visual Example of the Project

![image](https://github.com/user-attachments/assets/41cdbb62-55f6-42e9-90af-6f5aa11106c8)

## ✔️ Techniques and Technologies Used

- **Java:** Main language used for game development.
- **Object-Oriented Programming (OOP):** Utilizes classes and objects to organize the code.
- **Data Structures:** Implementation of classes to manage chapters, characters, and choices.

## 📁 Project Structure

The project structure is as follows:

- **rsc/**: Directory containing resource files.
  - `chapters.txt`: Text file with the game's chapters.
  - `characters.txt`: Text file with character information.
- **src/**: Directory containing compiled source code.
  - **App/**
    - `App.class`: Main application class.
  - **Chapter/**
    - `Chapter.class`: Class for managing chapters.
  - **Character/**
    - `Character.class`: Class for managing characters.
  - **ChargerReader/**
    - `ChargerReader.class`: Class for reading data files.
  - **Choice/**
    - `Choice.class`: Class for managing player choices.
- **.gitignore**: File for ignoring unnecessary files in version control.
- **LICENSE**: File with the project's license.
- **MiniGame-in-Java.iml**: Project configuration file.
- **README.md**: File with project documentation.

## 🌐 Deploy

To run the game:

1. **Compile the Code:**
   - Make sure the JDK is installed.
   - Compile the source code using `javac`:
     ```bash
     javac -d bin src/**/*.java
     ```

2. **Run the Game:**
   - Navigate to the classes directory and run the game with `java`:
     ```bash
     java App.App
     ```

3. **Resource Files:**
   - Ensure that `chapters.txt` and `characters.txt` are located in the `rsc` directory.
