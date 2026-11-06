public class Multiple {
    public static void main(String[] args) {
        smartPhone phone = new smartPhone();
        phone.takePic();
        phone.playMusic();
        phone.makeCall();

    }
}
interface Camera{
    void takePic();
}
interface MusicPlayer{
    void playMusic();
}
class smartPhone implements Camera, MusicPlayer{
    @Override
    public void takePic (){
    System.out.println("taking picture: ");
}
 @Override
    public void playMusic (){
    System.out.println("playing music: ");
    }
    void makeCall (){
    System.out.println("making call: ");
    }
}
