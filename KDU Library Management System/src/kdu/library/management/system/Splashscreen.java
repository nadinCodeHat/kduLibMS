package kdu.library.management.system;
/**
 *
 * @author nadinCodeHat
 */
public class Splashscreen {
    public static void main(String[] args){
        SplashScreenForm Splash = new SplashScreenForm();
        Splash.setVisible(true);
        HomePageForm hmpg = new HomePageForm();
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(40);
                if(i==100){
                    Splash.setVisible(false);
                    hmpg.setVisible(true);
                }
            }
        }catch (InterruptedException e){
            
        }
    }
}