public class PeanutTopping extends IceCreamDecorator{
    public PeanutTopping(IIceCream iIceCream) {
        super(iIceCream);
    }

    @Override
    public String getDecoration() {
        return "peanut topping";
    }
}
