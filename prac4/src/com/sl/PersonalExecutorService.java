package com.sl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PersonalExecutorService{
    public PersonalExecutorService(int count){
        ExecutorService executor = Executors.newFixedThreadPool(count);
        System.out.println("Запускаются потоки");
        executor.execute(new MyThread("Артём"));
        executor.execute(new MyThread("Борис"));
        executor.execute(new MyThread("Виталий"));
        executor.execute(new MyThread("Георгий"));
        executor.execute(new MyThread("Денис"));
        System.out.println("Закрываются потоки\n");
        executor.shutdown();
    }
}