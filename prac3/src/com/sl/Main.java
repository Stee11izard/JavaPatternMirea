package com.sl;

import java.util.concurrent.*;
import java.util.*;

public class Main {

    public static List<Integer> list = new ArrayList<>();
    public static List<Integer> list2 = new ArrayList<>();

    private static final Semaphore sem = new Semaphore(1);

    synchronized static void add() {
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
    }

    public static void main(String[] argv) {
        try {
            Thread t1 = new Thread(()->{
                list.add(1);
                list.add(2);
                list.add(3);
                list.add(4);
                list.add(5);
            });

            Thread t2 = new Thread(()->{
                list.add(1);
                list.add(2);
                list.add(3);
                list.add(4);
                list.add(5);
            });

            t1.start();
            t2.start();
            System.out.println("Unsynchronized: " + list);

            Thread t3 = new Thread(()->{
                add();
            });

            Thread t4 = new Thread(()->{
                add();
            });

            t3.start();
            t4.start();
            Thread.sleep(1000);
            List<Integer> sync = Collections.synchronizedList(list2);
            System.out.println("  Synchronized: " + sync);
        }
        catch (IllegalArgumentException | InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Set<Integer> set = new HashSet<>();

            Thread s1 = new Thread(()->{
                try {
                    sem.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                set.add(2);
                sem.release();
            });

            Thread s2 = new Thread(()->{
                try {
                    sem.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                set.add(3);
                sem.release();
            });

            s1.start();
            s2.start();
            Thread.sleep(1000);
            System.out.println("Set: " + set);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
