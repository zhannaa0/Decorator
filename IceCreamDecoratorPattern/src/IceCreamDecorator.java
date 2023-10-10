public abstract class IceCreamDecorator implements IIceCream {
    private IIceCream iIceCream;
    public IceCreamDecorator(IIceCream iIceCream){
        this.iIceCream = iIceCream;
    }

    public IceCreamDecorator() {
        this.iIceCream = new IceCreamScoop();
    }

    @Override
    public String make() {
        if (iIceCream != null) {
            return iIceCream.make() + ", " + getDecoration() + " added";
        } else {
            return getDecoration();
        }
    }

    public abstract String getDecoration();
}
