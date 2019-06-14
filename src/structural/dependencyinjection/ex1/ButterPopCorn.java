package structural.dependencyinjection.ex1;

public class ButterPopCorn implements Popcorn{

    int proportion;

    public int getProportion() {
        return proportion;
    }

    public void setProportion(int proportion) {
        this.proportion = proportion;
    }

    @Override
    public void preparePopCorn() {
        System.out.println("Butter Popcorn with "+ proportion + " butter");
    }
}
