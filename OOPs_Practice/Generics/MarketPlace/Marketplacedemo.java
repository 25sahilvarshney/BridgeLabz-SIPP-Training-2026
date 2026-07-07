package MarketPlace;

public class Marketplacedemo {

    public static <T extends Product<?>> void applyDiscount(T product,double percentage){
        product.setPrice(product.getPrice()-(product.getPrice()*percentage/100));
    }

    public static void main(String[] args) {

        Product<BookCategory> book=
                new Product<>("Java Book",1000,new BookCategory());

        applyDiscount(book,10);

        System.out.println(book);
    }
}