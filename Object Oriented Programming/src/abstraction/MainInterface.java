package abstraction;
public class MainInterface {
    public static void main(String[] args){ 
        SmartPhone SmartPhone = new SmartPhone();
        Nokia3310 nokia = new Nokia3310();
        
         System.out.println("\nSmartPhone Interface");
        SmartPhone.makeCall();
        SmartPhone.takePicture();
        SmartPhone.playMovie();
        SmartPhone.playMusic();
        SmartPhone.playGame();
        SmartPhone.connectToWifi();
        
         System.out.println("\nNokia3310 Interface");
         nokia.makeCall();
         nokia.playGame();
         nokia.playMusic();
    }
}