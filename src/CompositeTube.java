import java.util.ArrayList;
import java.util.List;

/**
 * Created by pidho on 12.04.2018.
 */
public class CompositeTube implements ComponentTube {

    private List<ComponentTube> nChildTubes = new ArrayList<>();
    private int Count=0;

    public Iterator CreateIterator(){
        return new TubeIterator(this);
    }

    @Override
    public void update() {
        for(ComponentTube Tubes: nChildTubes){
            Tubes.update();
        }

    }

    @Override
    public void stop() {
        for(ComponentTube Tubes: nChildTubes){
            Tubes.update();
        }
    }

    @Override
    public void reset() {
        for(ComponentTube Tubes: nChildTubes){
            Tubes.update();
        }
    }

    @Override
    public void onRestart() {
        for(ComponentTube Tubes: nChildTubes){
            Tubes.update();
        }
    }

    @Override
    public void start() {
        for(ComponentTube Tubes: nChildTubes){
            Tubes.update();
        }
    }

    public void add(ComponentTube tube){
        nChildTubes.add(tube);
        Count++;
        System.out.print("Add success!\n");
    }

    public void remove(ComponentTube tube){
        nChildTubes.remove(tube);
        Count--;
        System.out.print("Remove success!\n");
    }

    public void remove(int Index){
        if(Index<=nChildTubes.size()){
            nChildTubes.remove(Index-1);
            Count--;
            System.out.print("Remove success!\n");
        }
        else{
            System.out.print("Error. Object with index " + Index + " doesn't exist.\n");
        }
    }

    @Override
    public ComponentTube get(int index){
        return nChildTubes.get(index);
    }

    @Override
    public int getCount(){
        return Count;
    }
}
