package ex03;

public class TigerAdepter extends Animal {

    private OuterTiger outerTiger;

    public TigerAdepter(OuterTiger outerTiger) {
        this.outerTiger = outerTiger;
    }

    @Override
    public String getName() {
        return outerTiger.getfullname();
    }

}
