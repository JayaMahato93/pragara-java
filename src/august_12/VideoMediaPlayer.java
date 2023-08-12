package august_12;

public class VideoMediaPlayer extends MediaPlayer{
    @Override
    public void play() {
        System.out.println("Video is playing");
    }

    @Override
    public void pause() {
        System.out.println("Video is pause");

    }

    @Override
    public void stop() {
        System.out.println("Video is Stop");

    }
}
