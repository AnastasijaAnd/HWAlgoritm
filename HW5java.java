 
import java.util.*;
/**
 * Дан текст. Нужно отсортировать слова по длине (по возрастанию) и
 *  вывести статистику на экран.
 * Регистр слова не имеет значения. Формат вывода произвольный.
 * Программа-минимум:
 * 1. Слова, состоящие из дефисов, считаем одним словом. Т.е. каких-то - одно слово из 8 символов.
 * 2. Точки и запятые не должны входить в статистику.
 *
 * Доп. задание:
 * 1. * Не включать дефис в длину слова. Т.е. каких-то - одно слово из 7 символов.
 **/

public class HW5java { 
    public static void main(String[] args) {
        String text = "Это мой первый текст."+
        "Он состоит из каких-то тестовых слов и нужен для того,"+
        "чтобы выполнить тестовое задание GB." +
        "Данный текст не несет в себе какого-либо смысла," + 
        "он просто содержит набор слов.";

        printStats(text); 
    }

    static void printStats(String text){
        String[] formTextLCWithoutPunction =  text
                .replace(".", " ")
                .replace(","," ")
                .toLowerCase()
                .split(" ");
        Map<Integer, List<String>> map = new TreeMap<>();

        for (String item : formTextLCWithoutPunction) {

            char[] oneWord = item.toCharArray();
            int wordSize = oneWord.length;

            for(Character currentChar: oneWord) {
                if ('-' == currentChar) {
                    wordSize -= 1;
                }
            }

            if (map.containsKey(wordSize)) {
                if (!map.get(wordSize).contains(item) ) {
                    List<String> oldVal = map.get(wordSize);
                    oldVal.add(item);
                    map.put(wordSize, oldVal);
                }
            }else{
                List<String> newVal = new ArrayList<>();
                newVal.add(item);
                map.put(wordSize, newVal);
            }
        }
         System.out.println(map);                                                                                                                                                                                    
    }
}



