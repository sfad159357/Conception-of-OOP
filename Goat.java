package OOP;

class Goat extends Animal{
    private static String name = "羊咩咩";

    public String getName(){ return name; }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public void move(String destination, int id){
//      雖然要覆寫，但還是想要繼承母類別的方法及實作，記得也要附上引數
        super.move(destination, id);

//      對於母類別Animal的move()進行覆寫override，新增底下的code
        System.out.printf("%s plays water in %s %s happily.%n",name, destination , id);
    }
    public void drink(){
        System.out.println(name+" lowers it's head and drinks.");
    }
}