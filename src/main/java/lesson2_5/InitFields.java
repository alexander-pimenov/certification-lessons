package lesson2_5;

public class InitFields {
    String zooName; //по умолчанию null
    int numberOfAnimals; //по умолчанию 0

    {
        zooName = "ZOO NAME";
        numberOfAnimals = 15;
    }

    //инициализация при объявлении
    String name = "Name";
    int number = 159;


    //пример области видимости
    int qty;
    public void doSomething(){
        //локальная переменная в методе должна быть инициализированна в методе
        int newQty = 0;
        if (qty< -1){
            qty = 28;
            newQty = 17;
        }else{
            ////
        }
        System.out.println(qty);
        System.out.println(newQty);
    }

    public void calculate(){
        int summ = 17 + qty;
    }
}
