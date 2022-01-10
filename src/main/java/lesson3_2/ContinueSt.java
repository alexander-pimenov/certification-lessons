package lesson3_2;

//continue - переход к следующей итерации цикла  не доходя до конца тела
public class ContinueSt {

    public static void main(String[] args) {

        FIRST_CHAR_LOOP:
        for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) {
                //условия чтобы пропустить 2b
                if (a == 2 || x == 'b') {
//                  1 - без continue
//                    continue; //2 - прерывается текущая итерация внутреннего цикла
//                    continue FIRST_CHAR_LOOP; //3 переход к внешнему циклу по метке
                }
                System.out.print(" " + a + x);
                // 1- 1a 1b 1c 2a 2b 2c 3a 3b 3c 4a 4b 4c
                // 2- 1a 1c 3a 3c 4a 4c
                // 3- 1a 3a 4a
            }
        }
    }
}
