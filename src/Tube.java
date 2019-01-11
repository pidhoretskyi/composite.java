/**
 * Created by pidho on 12.04.2018.
 */
public class Tube implements ComponentTube{

    public Tube(){
        System.out.print("Tube: Created\n");
    }

    @Override
    public void update() {
        System.out.print("Tube: Update\n");
    }

    @Override
    public void stop() {
        System.out.print("Tube: Stop\n");
    }

    @Override
    public void reset() {
        System.out.print("Tube: Reset\n");
    }

    @Override
    public void onRestart() {
        System.out.print("Tube: onRestart\n");
    }

    @Override
    public void start(){
        System.out.print("Tube: Start\n");
    }

    @Override
    public ComponentTube get(int index) {
        return null;
    }

    @Override
    public int getCount() {
        return -1;
    }

}
