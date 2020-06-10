package OOP;

// 讓玩具也擁有獵捕的功能
class Toy implements Huntable2<Animal>{

//  如果表達static，表示此變數屬於類別，不屬於物件，記憶體是共享的
//  因為想表達不同物件擁有不同name，這裡就不加static
    private String name;

//  使用方法多載：使用不同的參數形式去實現同一個方法
//  初始化不用代入參數
    public Toy(){
        this("遙控賽車");
    }

    public Toy(String name){
        this.name = name;
    }

//  物件初始化後改name
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void hunt(Toy t){
        System.out.printf("%s hunts %s and captures it back.%n", name, t.getName());
    }

    public void hunt(Animal a){
        System.out.printf("%s hunts %s and captures it back.%n", name, a.getName());
    }
}


