import java.awt.*;
import java.applet.*;
/*
<applet code="Animation.class" width="600" height="800">
</applet>
*/
public class Animation extends Applet
{
 Image pic;
 public void init()
{
 pic=getImage(getDocumentBase(),"car.jpg");
}
public void paint(Graphics grp)
{
 for(int i=50;i<100;i++)
{
 grp.drawImage(pic,i,30,this);
 try
   {
    Thread.sleep(200);
   }
   catch(Exception e){}
}
}
}
