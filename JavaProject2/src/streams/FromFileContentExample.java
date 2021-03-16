package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {
	public static void main(String[] args) {
		Path path = Paths.get("list.txt");
		try {
			Stream<String> stream= Files.lines(path);
			stream.forEach(file -> System.out.println(file));
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		// Files.lines() 메소드 이름
		try {
			Stream<Path> stream = Files.list(Paths.get("c:/Program Files"));
			stream.forEach(f -> System.out.println(f.getFileName()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
