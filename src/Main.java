public class Main {
    public static void main(String[] args){
        Integer[] data = new Integer[]{1,2,3,4,5};

        Argument func = (int x, int y) -> x + y;

        reduce(data,func);
        
    }
public static void reduce(Integer[] numbers, Argument z){
        int sum = 0;
        for(int i = 0; i < numbers.length-1 ; i++ ){
            sum = sum + numbers[i];
           System.out.println(z.argument(sum, numbers[i]+1));
        }
}
}
