package wordcountprogram;

import java.io.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import org.w3c.dom.*;


public class WordCountProgram {
    private static Document document;
    private static File txtFile;
    public static void main(String[] args) {
        
        //The directory containing the text file that will be used:
        String directoryPath = "C:\\Users\\aayus\\Desktop\\Aayush\\Zensar\\Projects";
        String fileName = "Word Count text";
        
        txtFile = new File(directoryPath + fileName);
        
        //Configuring the number of worker threads required:
        int numThreads = 4;
        
        //Creating a thread pool with the number of threads specifically:
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        
        //Creating the atomic integer to check for the total word count:
        AtomicInteger totalWordCount = new AtomicInteger(0);
        
        //Getting a list of the text files required in the directory:
        File directory = new File(directoryPath);
        File[] files = directory.listFiles((dir, name)-> name.startsWith("Word"));
        
        //To measure the starting time:
        long startTime = System.nanoTime();
        
        //Submitting tasks for each file:
        for (File file: files) {
            Callable<Integer> task = new FileWordCounter(file);
            Future<Integer> future = executor.submit(task);
            
            try {
                int wordCount = future.get();
                totalWordCount.addAndGet(wordCount);
                
                System.out.println("File: " + file.getName() + ": " + wordCount + " words");
            }
            catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        
        //Close the executor once all the tasks are completed:
        executor.shutdown();
        
        try {
            //Telling the executor to await all tasks to complete:
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            
            //Measuring the end time of the process:
            long endTime = System.nanoTime();
            
            //Calculating the execution time of the program:
            long executionTimeMillis = (endTime - startTime)/1_000_000;
            
            //Getting the final word count:
            int finalTotalWordCount = totalWordCount.get();
            
            System.out.println("The total word count is: " + finalTotalWordCount + " words");
            System.out.println("The time taken to execute is: " + executionTimeMillis + " milliseconds");
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//Using an integer as the word count will be done in numeric form:
class FileWordCounter implements Callable<Integer> {
    private File file;
    
    public FileWordCounter(File file) {
        this.file = file;
    }
    
    //Read the file
    //Count the words in the file
    //Return the total word count
    @Override
    public Integer call() throws Exception {
        int wordCount = 0;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine())!=null) {
                //Splitting by whitespaces to count the number of words:
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
        return wordCount;
    }
}