import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.*;
import java.util.Arrays;
import java.lang.String;


public class StreamListBand2{

	public static void main(String[] args) throws IOException{
	
		List<String> bands2 = Files.lines(Paths.get("data.txt"))
			.filter(x -> x.contains("de"))
			.collect(Collectors.toList());
		bands2.forEach(System.out::println);	

	}

}
