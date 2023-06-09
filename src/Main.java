import com.sun.xml.internal.ws.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        //чтение в буфер введенного значения
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Угадай загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает" +
                "\nУ тебя есть три попытки." +
                "\nТолько сейчас ты можешь воспользоваться подсказкой, написав \"Подсказка\". " +
                "\nНо тогда у тебя всего одна попытка" +
                "\nОтвет: ");

        int chance = 2;
        String a;
        int help = 1;
        do{
            a = buffer.readLine();
            if (a.equalsIgnoreCase("Заархивированный вирус")) {
                System.out.println("Правильно!");
                break;
            }
            else if(chance==0){
                System.out.println("Обидно, приходи в другой раз");
                break;
            }
            else if(a.equalsIgnoreCase("Подсказка") && help!=0){
                chance = 0;
                System.out.println("Подсказка: винраровский грипп. Ответ: ");
            }
            else{
                System.out.println("Подумай еще! Ответ: ");
                chance--;
            }
            help = 0;
        }
        while(!a.equalsIgnoreCase("Заархивированный вирус"));

    }
}