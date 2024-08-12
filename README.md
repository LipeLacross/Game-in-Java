# MiniGame-in-Java

Um jogo text-based com múltiplas escolhas e finais, desenvolvido para o projeto requisitado pelo prof. Lucas Figueiredo.

## 🔨 Funcionalidades do Projeto

- **Múltiplas Escolhas:** Oferece ao jogador a possibilidade de tomar decisões que afetam o desenrolar da história.
- **Finais Alternativos:** Dependendo das escolhas do jogador, diferentes finais são apresentados.
- **Interface Textual:** Interações são realizadas através de texto, sem gráficos complexos.

### Exemplo Visual do Projeto

![image](https://github.com/user-attachments/assets/41cdbb62-55f6-42e9-90af-6f5aa11106c8)

## ✔️ Técnicas e Tecnologias Utilizadas

- **Java:** Linguagem principal utilizada para o desenvolvimento do jogo.
- **Programação Orientada a Objetos (POO):** Utiliza conceitos de classes e objetos para organizar o código.
- **Estruturas de Dados:** Implementação de classes para gerenciar capítulos, personagens e escolhas.

## 📁 Estrutura do Projeto

A estrutura do projeto é a seguinte:

- **rsc/**: Diretório contendo arquivos de recursos.
  - `chapters.txt`: Arquivo de texto com os capítulos do jogo.
  - `characters.txt`: Arquivo de texto com informações dos personagens.
- **src/**: Diretório contendo o código fonte compilado.
  - **App/**
    - `App.class`: Classe principal do aplicativo.
  - **Chapter/**
    - `Chapter.class`: Classe para gerenciamento de capítulos.
  - **Character/**
    - `Character.class`: Classe para gerenciamento de personagens.
  - **ChargerReader/**
    - `ChargerReader.class`: Classe para leitura de arquivos de dados.
  - **Choice/**
    - `Choice.class`: Classe para gerenciar escolhas do jogador.
- **.gitignore**: Arquivo para ignorar arquivos não necessários no controle de versão.
- **LICENSE**: Arquivo com a licença do projeto.
- **MiniGame-in-Java.iml**: Arquivo de configuração do projeto.
- **README.md**: Arquivo com a documentação do projeto.

## 🌐 Deploy

Para executar o jogo:

1. **Compilação do Código:**
   - Certifique-se de que o JDK esteja instalado.
   - Compile o código fonte usando `javac`:
     ```bash
     javac -d bin src/**/*.java
     ```

2. **Execução do Jogo:**
   - Navegue até o diretório de classes e execute o jogo com `java`:
     ```bash
     java App.App
     ```

3. **Arquivos de Recursos:**
   - Garanta que `chapters.txt` e `characters.txt` estejam localizados no diretório `rsc`.
