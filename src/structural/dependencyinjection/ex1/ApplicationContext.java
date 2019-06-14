package structural.dependencyinjection.ex1;

public class ApplicationContext {

    public Popcorn getPopCorn(String type, int proportion){
        if(type.equalsIgnoreCase(type)){
            ButterPopCorn p1 = new ButterPopCorn();
            p1.setProportion(proportion);
            return p1;
        } else {
            ChocoPopCorn c1 = new ChocoPopCorn(proportion);
            return c1;
        }
    }
}
