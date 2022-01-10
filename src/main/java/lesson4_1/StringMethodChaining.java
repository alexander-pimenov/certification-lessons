package lesson4_1;

public class StringMethodChaining {

    public static void main(String[] args) {

        String start = " ВаСиЛиЙ ";

        String trimmed = start.trim();
        String lowercase = trimmed.toLowerCase();
        String result = lowercase.replace('л', 'д');
        System.out.println(result);

        //а теперь эти методы выстоенные в цепочку
        System.out.println(start
                .trim()
                .toLowerCase()
                .replace('л', 'д')
        );
    }
}
