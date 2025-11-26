public class BigDog extends Dog {
    public BigDog(String name){
        super(name);
    }

    @Override
    public void greets() {
        super.greets();
    }

    @Override
    public void greets(Dog anotherDog) {
        super.greets(anotherDog);
    }
    public void greets(BigDog anotherBigDog){
        System.out.println("Woooooooow");
    }
}
