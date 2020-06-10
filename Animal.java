package OOP;

abstract class Animal {

    public abstract String getName();

//  drink()交由子類別進行各自實作
    public abstract void drink();

//  也可以按照需求給予目的地和編號兩個參數。
    public void move(String destination, int id) {
        System.out.printf("%s moves to %s %s.%n", getName(), destination, id);
    }
//      子類別使用繼承母類別的方法，就不能使用自有屬性name，要用getName()才能存取a.name

}