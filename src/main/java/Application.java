import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) throws IOException {
        /*
I/O - Paths - List all directories and files
List all files and directories from a specific path.

Input (example)
/users/andrei/IdeaProjects

Output
exception-handling
.IntelliJ
notes.txt
 */
        Path specificPath= Paths.get("C:", "JAVA-modul 1", "kit");
        //System.out.println( specificPath+" is directory? "+ Files.isDirectory(specificPath));
        //System.out.println(specificPath+" is regular file? "+Files.isRegularFile(specificPath));
        List<Path> allDirAndFiles=Files.list(specificPath).collect(Collectors.toList());
        System.out.println("Content of "+specificPath+":");
        for(Path p: allDirAndFiles) {
            System.out.println("- "+ p.getFileName() + "; ");

        }
    }
}

