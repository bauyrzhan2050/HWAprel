
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
public class HomeWorkA {
    //1.Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        listSwapAndLast(list);
        System.out.printf("AA");
        System.out.print("BB");
        System.out.println(list);
    }

    public static <I> List<I> listSwapAndLast(List<I> list) {
        List<I> tempList = list;
        I firstElement = tempList.get(0);
        I lastElement = tempList.get(list.size() - 1);
        tempList.set(0, lastElement);
        tempList.set(tempList.size() - 1, firstElement);
        return tempList;

    }
    //2.Написать метод, который преобразует массив в ArrayList;

    Integer[] array = new Integer[]{1, 3, 5};
    LinkedList<Integer> linkedList = new LinkedList<Integer>(Arrays.asList(array));


   // 3.Большая задача:
   // a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
   // b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    //c. Для хранения фруктов внутри коробки можете использовать ArrayList;
    //d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
    //e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
    //f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
    //g. Не забываем про метод добавления фрукта в коробку.



}
