package OOP;

public class Farmer {
    public void bringWater(String destination, int id) {
        System.out.printf("Farmer bring water to %s no.%s.%n", destination, id);
    }

//  feedWater()使用方法過載及重構

    public void feedWater(Animal a) {
        this.feedWater(a, "Feeding room", 1);
    }

    public void feedWater(Animal a, String destination) {
        this.feedWater(a, destination, 1);
    }

    public void feedWater(Animal a,String destination,int id ) {
        this.bringWater(destination, id);
        a.move(destination, id);
        a.drink();
    }

    public void bringAnimal(String destination, Animal beHunted){
        System.out.printf("Farmer brings %s to %s.%n", beHunted.getName(), destination );
    }

// hunter物件是由Huntable介面類別產生，而非Animal類別產生
// 因為不見得所有動物都會hunt()，而Huntable所產生的物件一定有hunt()方法
    public void feedAnimal(Huntable2<Animal> hunter, Animal beHunted){
        this.bringAnimal("Feeding room", beHunted);
//      由於hunter是Huntable2<Animal>介面所產生的物件，並沒有Animal類的功能
//      將介面類的物件再轉化成Animal類的物件:hunter_
        Animal hunter_ =  (Animal)hunter;
        hunter_.move("Feeding Room", 1);
        hunter.hunt(beHunted); // 這樣多型也能接上介面功能
    }

}

