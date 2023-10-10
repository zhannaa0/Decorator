public class Main {
    public static void main(String[] args) {
        IIceCream iIceCream = new BananaIceCreamScoop(new Sprinkles(new ChocolateIceCreamScoop()));
        System.out.println(iIceCream.make());

    }
}