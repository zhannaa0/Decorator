public class CherrySyrop extends IceCreamDecorator{
    public CherrySyrop(IIceCream iIceCream) {
        super(iIceCream);
    }

    @Override
    public String getDecoration() {
        return "cherry syrop";
    }

}
