package OOP;

class Snake extends Animal implements Huntable2<Animal>{
    private static String name = "snake~~~";

    public String getName(){ return name; }

    public void setName(String name){
        this.name = name;
    }

    public void drink(){ System.out.println(name +" dives into water and drink.");
    }

    public void move(String destination, int id){
        System.out.printf("%s crawls to %s %s.%n", getName(), destination, id);
    }

    // 使用介面huntable2類別，將hunt進行實作
    public void hunt(Animal a) {
        System.out.printf("%s hunts %s and eats it.%n", name, a.getName());
    }

    public void hunt(Toy t) {
        System.out.printf("%s hunts %s and plays with it.%n", name, t.getName());
    }
}