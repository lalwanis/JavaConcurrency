import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.Set;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by lalwa_000 on 10/03/2016.
 */
public class FileStreaming {
    public static void main(String[] args) {
        Path file1Path = Paths.get("C:\\dev\\TestData\\File1.txt");
        Path file2Path = Paths.get("C:\\dev\\TestData\\File2.txt");

        try(
                Stream<String> file1Stream = Files.lines(file1Path);
                Stream<String> file2Stream = Files.lines(file2Path)

            ){
                //Stream<String> files = Stream.concat(file1Stream,file2Stream);

                //files.forEach(System.out::println);
                Function<String,Stream<String>> splitIntoWord= line -> Pattern.compile(" ").splitAsStream(line);
                //Stream of streams of lines -> stream of lines -> stream of words
                //Stream.of(file1Stream,file2Stream).flatMap(Function.identity()).flatMap(splitIntoWord).forEach(System.out::println);
                Set<String> words = Stream.of(file1Stream,file2Stream).flatMap(Function.identity()).flatMap(splitIntoWord).collect(Collectors.toSet());
                words.stream().forEach(System.out::println);


        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
