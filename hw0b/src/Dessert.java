public class Dessert{
    int flavor,price;
    static int numDessert=0;
    public Dessert(int flavor, int price){
        this.flavor=flavor;
        this.price=price;
        numDessert++;
    }
    public void printDessert(){
        System.out.println(this.flavor+" "+ this.price +" "+numDessert);
    }
    public static void main(String[] args){
        System.out.println("I love dessert!");
    }
}
