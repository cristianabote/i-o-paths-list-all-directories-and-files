import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) throws IOException {
        Path specificPath= Paths.get("C:", "Java", "Proiecte");
        List<Path> allDirAndFiles=Files.list(specificPath).collect(Collectors.toList());
        System.out.println("Content of "+specificPath+" :");
        for(Path p: allDirAndFiles) {
            System.out.println("- "+ p.getFileName() + "; ");

        }
    }
}

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