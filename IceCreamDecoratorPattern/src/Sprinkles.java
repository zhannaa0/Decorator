public class Sprinkles extends IceCreamDecorator{
    public Sprinkles(IIceCream iIceCream) {
        super(iIceCream);
    }

    @Override
    public String getDecoration() {
        return "sprinkles";
    }

}
