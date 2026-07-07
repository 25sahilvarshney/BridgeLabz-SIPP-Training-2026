package GenericPair;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Pair<String,Integer> pair=new Pair<>("Age",22);
        System.out.println(pair);

        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop());

        Integer[] arr={10,50,20,70,30};
        System.out.println(GenericUtils.findMax(arr));

        Repository<String> repo=new Repository<>();
        repo.save("Java");
        repo.save("Python");
        System.out.println(repo.getAll());

        GenericUtils.printList(Arrays.asList("A","B","C"));
    }
}
