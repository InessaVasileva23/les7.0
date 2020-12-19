package task3;

//Реализовать два класса: договор и акт. В каждом сделать поля: номер, дата, список товаров (массив строк).
//Написать класс со статическим методом конвертации договора в акт (на вход передавать договор, на выходе получаем акт).

import java.util.Arrays;

//Класс Договор
class Contract {
    int number;
    int date;
    String [] goods ={"ноутбук", "принтер", "системный блок", "монитор", "ксерокс"};

}
//Класс Акт
class Act {
    int number;
    int date;
    String [] goods;

}
//Класс со статическим методом конвертации договора в акт
class Conversion {
    public static Act DoConversion(Contract c){
        Act Act1 = new Act();
        Act1.number = c.number +100;
        Act1.date = c.date +1;
        Act1.goods = Arrays.copyOf(c.goods,c.goods.length);
        return Act1;

    }
}

public class Main {

    public static void main(String[] args) {
        Contract Contract1 = new Contract();//экземпляр класса
        Contract1.number = 10;
        Contract1.date = 20201118;
        System.out.println("Дата договора: " +Contract1.date + " Номер договора: "+ Contract1.number  + " Список товаров: " + Arrays.toString(Contract1.goods));

        Act Act1 = new Act();
        Act1 = Conversion.DoConversion(Contract1);
        System.out.println("Дата акта: " +Act1.date +" Номер акта: " + Act1.number + " Список товаров: " + Arrays.toString(Act1.goods));


    }



}
