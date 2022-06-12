class Phone
{
    void call()
    {
        System.out.println("Calling and Hanging Up");
    }

    void sms()
    {
    System.out.println("Sending and Receiving SMS");   
    }
}

interface Camera
{
    static final int X=41;
    public abstract void clickPhoto();
    void recordVideo();
}
interface icamera extends Camera
{
    static final int Y=56;
    private void  slowMotion()
    {
        System.out.println("Slow Motion Video");
    }
    default void mthd1()
    {
        slowMotion();
    }
}

interface musicPlayer
{
    void playMusic();
    void stopMusic();
    void changeMusic();
}

class smartPhone extends Phone implements musicPlayer,icamera
{
    public void videoCall()
    {
        System.out.println("Video Calling....");
    }

    public void clickPhoto()
    {
        System.out.println("Clicking Photo");
    }
    public void recordVideo()
    {        
        System.out.println("Recording Video");    
    }
    public void playMusic()
    {
        System.out.println("Music Playing");
    }

    public void stopMusic()
    {        System.out.println("Stopping Music");

    }
    public void changeMusic()
    {
        System.out.println("Changing Music");
    }
}


public class intferface1 {
    public static void main(String[] args) {
        smartPhone obj=new smartPhone();
        obj.call();
        obj.changeMusic();
        obj.stopMusic();
        obj.clickPhoto();
        obj.mthd1();

        Camera objc=new smartPhone();
        objc.clickPhoto();
        objc.recordVideo();
        System.out.println(Camera.X);
    }
}
