/**
 * Created by pidho on 21.04.2018.
 */
public class TubeIterator implements Iterator {

    private ComponentTube aggligate;
    private int Count;

    public TubeIterator(ComponentTube aggligate){
        this.aggligate = aggligate;
        Count=0;
    }

    @Override
    public ComponentTube getNext() {
        if(++Count>=aggligate.getCount()) {
            Count = 0;
            return aggligate.get(Count);
        }
        return aggligate.get(Count);
    }

    @Override
    public boolean hasNext() {
        return Count < aggligate.getCount() - 1;
    }


    @Override
    public ComponentTube getFirst() {
        return aggligate.get(0);
    }

    @Override
    public ComponentTube getLast() {
        return aggligate.get(aggligate.getCount()-1);
    }

    @Override
    public ComponentTube getCurrent() {
        return aggligate.get(Count);
    }
}
