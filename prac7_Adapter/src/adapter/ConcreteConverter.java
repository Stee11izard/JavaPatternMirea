package adapter;

public class ConcreteConverter implements Converter{

    @Override
    public String reverse(String line) {
        char [] arr = line.toCharArray();
        String result = "";

        for(int i = arr.length-1; i >=0; i--){
            result += arr[i];
        }
        return result;
    }
}
