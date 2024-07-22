import java.util.ArrayList;
import java.util.List;
public class JavaExercises {
    public static int[] makeDice(){
        return new int[]{1,2,3,4,5};
    }
    public static String[] takeOrder(String name){
        String[] Ergun={"beyti", "pizza", "hamburger", "tea"};
        String[] Erik={"sushi", "pasta", "avocado", "coffee"};
        if(name.equals(Ergun)){
            return Ergun;
        }else if(name.equals(Erik)){
            return Erik;
        }else{
            return new String[3];
        }
    }
    public static int findMinMax(int[] array){
        int min = array[0];
        int max =array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if(array[i]>max) {
                max =array[i];
            }
        }

        return (max-min);
    }
    public static List<Integer> hailstone(int n){
        return hailstoneHelp(n);
    }
    public static List<Integer> hailstoneHelp(int n){
        List<Integer> list =new ArrayList<>();
        list.add(n);
        if(n==1) {
            list.add(1);
            return list;
        }
        if(n%2==0){
            n=n/2;
            list.addAll(hailstoneHelp(n));
        }else{
            n=n*3+1;
            list.addAll(hailstoneHelp(n));
        }
        return list;
    }
}