import java.util.ArrayList;
import java.util.Arrays;

public class Dalek3 {
    private ArrayList<String> sayings = new ArrayList<String>();

    public void setSayings(String[] arr)
    {

        sayings.addAll(Arrays.asList(arr));

    }


    public void speak() {

        int rnd = (int) (Math.random() * sayings.size());

        System.out.println(sayings.get(rnd));

    }
}
