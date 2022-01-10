package lesson4_2;

public class SBufferVsSBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder; //не потоко безопасный - изменяемый

        StringBuffer stringBuffer; //потокобезопасный - неизменяемый


        //StringBuilder более оптимизированный и предназначен,
        //для работы в одном потоке.
        //Подсказка: если даже мы применяем многопоточность, то чаще всего мы остаемся в каком то одном потоке!!!
    }
}
