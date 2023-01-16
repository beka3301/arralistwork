import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        Random random=new Random();
        for (int i = 0; i < 50; i++) {
            int count=random.nextInt(1,100);
            list.add(count);
        }
        for (int a:list) {
            if(a%2==0){
                list1.add(a);

            }else{
                list2.add(a);
            }

        }
        System.out.println(list1);
        System.out.println(list2);
    }
}