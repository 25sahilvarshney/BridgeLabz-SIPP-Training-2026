package Warehouse;
public abstract class WarehouseItem {
    protected String name;

    public WarehouseItem(String name){
        this.name=name;
    }

    @Override
    public String toString(){
        return name;
    }
}