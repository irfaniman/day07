package vttp2022.day07;

import java.util.concurrent.Executors;

public class App 
{
    public static void main( String[] args )
    {
        ExecutorService thrPool = Executors.newFixedThreadPool(4); //4 because cpu has 4 cores
    }
}
