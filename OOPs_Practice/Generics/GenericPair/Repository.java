package GenericPair;
import java.util.ArrayList;
import java.util.List;

public class Repository<T> {
    private List<T> data=new ArrayList<>();

    public void save(T obj){
        data.add(obj);
    }

    public List<T> getAll(){
        return data;
    }
}
