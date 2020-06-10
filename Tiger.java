package OOP;


// 介面Huntable只能獵捕動物類Animal,但介面Huntable2不限於動物類Animal，也可獵捕玩具類Toy
class Tiger extends Animal implements Huntable2<Toy>{
    private static String name = "tiger鬼";


    public String getName(){ return name; }

    public void setName(String name){
        this.name = name;
    }

    public void drink(){
        System.out.println(name+" lowers it's head and drinks.");
    }

    public void hunt(Animal a){
        System.out.printf("%s hunts %s and eats it.%n", name, a.getName());
    }

    public void hunt(Toy t) {
        System.out.printf("%s hunts %s and plays with it.%n", name, t.getName());
    }
}
