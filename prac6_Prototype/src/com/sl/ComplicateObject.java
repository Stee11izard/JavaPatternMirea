package com.sl;

public class ComplicateObject implements Copyable{
    private int data;

    ComplicateObject(int in){
        this.data = in;
    }

    @Override
    public ComplicateObject copy() {
        return new ComplicateObject(data);
    }

    public void setData(int in){
        this.data = data;
    }

    public int getData(){
        return this.data;
    }
}