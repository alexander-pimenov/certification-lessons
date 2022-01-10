package lesson4_2;

/* Пример для понимания отличия String и StringBuilder*/
public class UnderstandingStringBuilder {
    public static void main(String[] args) {

        //Пул стрингов существует только для стрингов
        String word = ""; //создаем в пуле стрингов "" и даем переменную на ссылку
        for (char current = 'a'; current <= 'z'; current++) {
            word += current;
        }
        //word - эта ссылка будет уже сотреть совсем на другой объект, не тот что создали в самом насале
        //в строке 7, т.е. String не изменяемый объект и каждый раз в цикле создавался новый объект и на нанего
        //перенаправлялась ссылка word
        System.out.println(word);

        //создаем StringBuilder с пустой строкой ""
        StringBuilder wordSB = new StringBuilder("");
        for (char current = 'a'; current <= 'z'; current++) {
            wordSB = wordSB.append(current);
        }
        //wordSB - эта ссылка будет смотреть на тоже самое местов памяти что и при создании
        //в строке 18, т.к. StringBuilder изменяемый объект, и каждый раз в цикле мы его изменяли, но
        //ссылка wordSB так и продолжала смотреть на ненго же!!!
        System.out.println(wordSB);

    }
}
