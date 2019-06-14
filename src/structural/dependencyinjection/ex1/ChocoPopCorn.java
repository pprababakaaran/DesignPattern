package structural.dependencyinjection.ex1;

public class ChocoPopCorn implements Popcorn {

    int proportion;

    ChocoPopCorn(int proportion){
        this.proportion = proportion;
    }

    @Override
    public void preparePopCorn() {
        System.out.println("Choco Popcorn with " +proportion + " Choco" );
    }



}
