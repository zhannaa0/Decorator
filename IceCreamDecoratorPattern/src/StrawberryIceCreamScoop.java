public class StrawberryIceCreamScoop extends IceCreamDecorator{

    public StrawberryIceCreamScoop(IIceCream iIceCream) {
        super(iIceCream);
    }

    public StrawberryIceCreamScoop() {
        super(null);
    }
    @Override
    public String getDecoration() {
        return "strawberry ice cream scoop";
    }
}
