package com.sl;

public class Numbers implements Comparator<Numbers>{
    int module;

    public Numbers(int in)
    {
        this.module = Math.abs(in);
    }

    public int compareTo(Numbers number)
    {
        if (this.module > number.module) {
            return 1;
        }
        else if (this.module < number.module) {
            return -1;
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        final StringBuffer out = new StringBuffer("");
        out.append(module);
        return out.toString();
    }

    public static void main(String[] args) {
        System.out.println("-3 and 3:");
        Numbers a = new Numbers(-3);
        Numbers b = new Numbers(3);
        System.out.println(a.compareTo(b));
        System.out.println("-4 and 3:");
        a = new Numbers(-4);
        b = new Numbers(3);
        System.out.println(a.compareTo(b));
    }
}