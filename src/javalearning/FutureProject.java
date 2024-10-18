package javalearning;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureProject {

    public static void main(String[] args) {
        // Create an ExecutorService with a single thread executor
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Submit a callable task using a lambda expression
        Future<String> future = executorService.submit(() -> {
            Thread.sleep(6000); // Simulate a long-running task
            return "Task's execution result";
        });

        try {
            // Wait for the task to complete and get the result
            String result = future.get();
            System.out.println("Result of FutureTask: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            // Shutdown the ExecutorService
            executorService.shutdown();
        }
        
        System.out.println("this is main method");
    }
}

