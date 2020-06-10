package OOP;
// 參考資料：https://www.itread01.com/p/1449114.html

// 在OOP這package中使用了：封裝、繼承、多型、抽象化、過載、覆寫、重構、介面等OOP概念
public class Main {

    public static void main(String[] args) {

//      1.封裝(encapsulation)：初始化物件，運用物件的封裝性，每個動物或玩具被創造後有自己的名字
//        被封裝的物件，有私有的成員：name不可存取。其他有各自的方法可以對外進行存取。

        Farmer fm = new Farmer();
        Snake sn = new Snake();
        Goat gt = new Goat();
        Tiger tg = new Tiger();
        Rabbit rb = new Rabbit();
        Toy car = new Toy();
        Toy aircraft = new Toy("巡弋飛機");

//      2.繼承(Inheritance) ：每隻動物繼承父類Animal，繼承父類的方法，子類可以節省重複使用一樣的code。
//      3.多型(Polymorphism) ：農夫餵水給動物，其feedWater()內的參數是Animal類別而非個別動物類別。
//      4.抽象化(Abstract)：除了多型、繼承外，為了表現每隻動物drink()表現不一樣，父類必須抽象化，讓子類自己實作
//      5.過載(Overloading)：而fm農夫物件之方法feedWater()，有三種參數不同輸入方式，而不需改方法名，稱之為方法過載
//      6.覆寫(Overwritting):在snake.move()這段，雖然父類Animal已經有定義move()的實作出來，可以供子類繼承這方法的實作
//        但為了想表現snake的move是用crawl爬行，所以將在Snake類重新實作了move()這方法。
//      7.重構(Refatoring):在Farmer類中，雖然有三種feedWater()過載方法，但實作內容都一樣，改成this.feedWater()。

        fm.feedWater(sn);
        fm.feedWater(gt,"Lake");
        fm.feedWater(tg,"Water Pool", 3);
        System.out.println();

//      8.介面(interface): 假如今天要將Tiger、Snake和Toy新增hunt()的方法，有三個方案該如何選擇？

//      (1)各自在Tiger、Snake和Toy類別新增hunt方法，Goat和Rabbit則不加
//      這樣會造成無法使用多型，你無法用抽象類Animal透過多型直接呼叫派生類Tiger, Snake另外加的方法
//      因為那方法hunt()並沒有含在抽象類Animal裡面

//      (2)直接加在抽象類Animal，這樣就能使用多型
//      如此一來，Goat和Rabbit也繼承到hunt()，不過這類不會用這個方法，沒有is a關係，也造成資源浪費。
//      另外，Toy為了要用到多型，而去繼承到Animal類，這邏輯行不同，反而讓Toy存取到很多不必要的功能

//      (3)使用interface來讓有需要類，如同外掛般直接使用
//      可以將class Tiger || Snake || Toy implement Huntable2<Animal>，直接新增了介面功能hunt()，
//      同時可以使用Huntable2<Animal>，介面類別來使用多型，只要是Huntable2<Animal>所產生的物件都能被當作參數來使用

//      農夫給蛇餵兔子
        fm.feedAnimal(sn,rb);
        System.out.println();

//      9.泛型<Generic>:使用介面Huntable2後面多加個<T>，代表輸入<T>內可以是型別參數，可以帶入Animal或Toy不同類別
//      如果用戶端使用hunter.hunt(Animal類)，但是用到後來有需求換成hunter.hunt(Toy類)，
//      開發端可以透過泛型的機制，將裡頭的型別參數馬上換成Toy類，而減少開發修改上的麻煩。

//      直接使用Huntable2介面來創造一個hunter物件
        Huntable2 hunter = getHunter();

//      hunter.hunt()裡頭的參數是Animal還是Toy，隨著getHunter()靜態方法是怎麼定義的而被左右
        hunter.hunt(car);
        hunter.hunt(aircraft);

    }

//  可去修改到的code
//  return可以換成Toy、Snake、Tiger來獵捕動物Animal
//  想要hunt Animal類，就填入Huntable2<Animal>；想要hunt Toy類，就填入Hunable2<Toy>。
//  隨著介面的泛型更改成Huntable2<Animal>還<Toy>，會決定hunt(Animal類)還hunt(Toy類)，
//  相對的，子類別Toy、Snake、Tiger是implement Hunatble2<xxx>也要隨之更改成一致。
    public static Huntable2<Toy> getHunter(){
        return new Tiger();
    }
}


















