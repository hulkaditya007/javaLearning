package javalearning;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ComplitableFuture {

    public static void main(String[] args) {
        // Asynchronous task
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                // Simulate long-running task
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello, World!";
        });

        // Continue processing after the future completes
        future.thenApply(result -> {
            System.out.println("Thread "+Thread.currentThread().getName()+" Result: " + result);
            return result.toUpperCase();
        }).thenAccept(result -> {
            System.out.println("Thread "+Thread.currentThread().getName()+" Uppercase Result: " + result);
        }).exceptionally(ex -> {
            System.err.println("Something went wrong: " + ex.getMessage());
            return null;
        });

        // Block and wait for the future to complete (not recommended for real async programming)
        try {
            future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        
		 System.out.println("Thread "+Thread.currentThread().getName()+" Hello world"); 
    }
}

