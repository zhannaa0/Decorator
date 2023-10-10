public class OreoCrunch extends IceCreamDecorator{
    public OreoCrunch(IIceCream iIceCream) {
        super(iIceCream);
    }

    @Override
    public String getDecoration() {
        return "oreo crunch";
    }
}
