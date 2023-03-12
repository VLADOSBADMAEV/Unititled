import java.util.Random;
public class MagicBox<T> {
    T[] items;

    public MagicBox(int size) {
        items = (T[]) new Object[size];

    }


    public boolean add(T Object) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = Object;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException(String.format("коробка не полна и осталось заполнить %s элементов" , items.length - i));
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        return items[randomInt];


            }

        }



