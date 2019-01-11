/**
 * Created by pidho on 12.04.2018.
 */
public interface ComponentTube {
    void update();
    void stop();
    void reset();
    void onRestart();
    void start();
    ComponentTube get(int index);
    int getCount();
}
