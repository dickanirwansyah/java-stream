import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;

public class StreamListBand {

	//split & menghitung data dengan banyaknya huruf 13

	public static void main(String[] args) throws IOException{
		Stream<String> bands = Files.lines(Paths.get("data.txt"));
		bands.sorted()
			.filter(x -> x.length() > 13)
			.forEach(System.out::println);
		bands.close();
	}
}
