public class ChocolateSyrop extends IceCreamDecorator{
   public ChocolateSyrop(IIceCream machine){
       super(machine);
   }

    @Override
    public String getDecoration() {
        return "chocolate syrop";
    }
}
