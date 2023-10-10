public class BananaIceCreamScoop extends IceCreamDecorator {

    public BananaIceCreamScoop(IIceCream iIceCream) {
        super(iIceCream);
    }

    public BananaIceCreamScoop() {
        this(null);
    }

    @Override
    public String getDecoration() {
        return "banana ice cream scoop";
    }
}
