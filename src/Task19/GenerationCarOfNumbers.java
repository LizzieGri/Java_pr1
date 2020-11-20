package Task19;

import java.util.*;

public class GenerationCarOfNumbers {
    Scanner scanner = new Scanner(System.in);
    String number;
    ArrayList<String> arrayList = new ArrayList<>();
    HashSet<String> hashSet = new HashSet<>();
    TreeSet<String> treeSet = new TreeSet<>();
    long start, end;
    boolean rez;

    public GenerationCarOfNumbers() {
        System.out.println("Сгенерированный авомобильный номер: ");
        int num = (int)(Math.random()*2000000);
        for(int i = 0; i < 2000000;i++)
        {
            String d = new Number().toString();
            arrayList.add(d);
            hashSet.add(d);
            treeSet.add(d);
        }
        number = arrayList.get(num);
        System.out.println(number);
        System.out.println("База данных заполненна");
        search();
    }

    private void search()
    {
        while (true) {
            System.out.println("Введите номер:");
            number = scanner.next();
            System.out.println("Запускаем поиск");
            met(arrayList, number, "Поиск перебором: ");
            start = System.nanoTime();
            Collections.sort(arrayList);
            rez = Collections.binarySearch(arrayList, number) >= 0;
            end = System.nanoTime();
            System.out.println("Бинарный поиск: " + (rez ? "номер найден" : "не найден") + ", поиск занял " + (end - start) + "нс");
            met(hashSet, number, "Поиск в HashSet: ");
            met(treeSet, number, "Поиск в TreeSet: ");
        }
    }

    private void met(AbstractCollection<String> baz, String num, String name)
    {
        start = System.nanoTime();
        rez = baz.contains(num);
        end = System.nanoTime();
        System.out.println(name + (rez ? "номер найден" : "не найден") + ", поиск занял " + (end - start) + "нс");
    }

}
