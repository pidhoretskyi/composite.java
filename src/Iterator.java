/**
 * Created by pidho on 21.04.2018.
 */
public interface Iterator {
    ComponentTube getNext();
    boolean hasNext();
    ComponentTube getFirst();
    ComponentTube getLast();
    ComponentTube getCurrent();
}
