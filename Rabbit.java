package OOP;

class Rabbit extends Animal{
    private static String name = "口憐的兔兔🐰" ;

    public String getName(){ return name; }

    public void setName(String name){
        this.name = name;
    }

    public void move(String destination, int id){
        System.out.printf("%s moved to %s %s.%n", name, destination , id);
    }
    public void drink(){
        System.out.println(name+" put out it's tongue and drink.");
    }
}