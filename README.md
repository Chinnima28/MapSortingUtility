# MapSortingUtility

MapSortingUtility is a Java library designed to simplify the sorting of maps by their keys or values. This library provides methods to sort maps in ascending or descending order based on their values and to sort them lexicographically by their keys. The code is packaged as a JAR file for easy integration into Java projects.

## How It Works

The MapSortingUtility library includes the `MapSorter` class with the following functionalities:

- **Sort by Value (Ascending):** Sorts a map based on its values in ascending order.
- **Sort by Value (Descending):** Sorts a map based on its values in descending order.
- **Sort by Key (Lexicographical):** Sorts a map based on its keys in lexicographical order.

## How I Created This

1. **Developed the MapSorter Class:**
   - Implemented sorting methods to handle maps based on values and keys.

2. **Compiled the Source Code:**
   - Compiled the Java source files into bytecode.

3. **Packaged into a JAR File:**
   - Created a JAR file to distribute the compiled classes.

## How to Use

## Command Prompt

### 1. Download or Clone the Repository

**Clone or download the repository:**

```bash
git clone https://github.com/yourusername/MapSortingUtility.git
```


### 2. Include the Package in Your Project Command-Line Interface (CLI):

**Navigate to the Project Directory:**

```bash
cd MapSortingUtility
```


**Compile the Source Code (If you need to modify or recompile):**

```bash
javac com/example/utils/MapSorter.java
```


**Package the Compiled Classes into a JAR File:**

```bash
jar cf MapSortingUtility.jar com/example/utils/MapSorter.class
```


**Include the JAR File in Your Project:**

Compile Your Java Files:

```bash
javac -cp .;MapSortingUtility.jar YourJavaFile.java
```

Run Your Java Program:

```bash
java -cp .;MapSortingUtility.jar YourMainClass
```

## Integrated Development Environment (IDE):

### Import the Project:

- Open the project folder in your IDE.

### Add the JAR File to Your Project:

- **For VS Code:**  
  Modify `launch.json` and `tasks.json` to include the JAR file in the classpath.

- **For IntelliJ IDEA:**  
  Go to `File > Project Structure > Libraries`, click **Add**, and select the `MapSortingUtility.jar` file.

## Additional Notes

- Ensure that your Java development environment is correctly set up with JDK installed.
- If you encounter issues, verify that the JAR file is correctly included in your classpath.


## License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).


