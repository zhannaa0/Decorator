public class ChocolateIceCreamScoop extends IceCreamDecorator {
    public ChocolateIceCreamScoop(IIceCream iIceCream) {
        super(iIceCream);
    }

    public ChocolateIceCreamScoop() {
        this(null);
    }

    @Override
    public String getDecoration() {
        return "chocolate ice cream scoop";
    }
}
