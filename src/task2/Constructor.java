package task2;

//Реализовать класс в конструкторе которого будет счетчик количества создаваемых объектов.
// Написать метод для получения информации о количестве.

//класс
class Constructor {
    int a;
    int b;
    static int NumberofObjects =0;

    //конструктор
    Constructor (){
        a=1;
        b=2;
        NumberofObjects++;

    }

    //метод
    public int GetNumberofObjects (){
        return (NumberofObjects);
    }

}