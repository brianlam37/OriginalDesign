import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void face(){
	fill(0);
	ellipse(mouseX-30,mouseY-50,20,20);
	ellipse(mouseX+30,mouseY-50,20,20);
};
public void mouth(){
	fill(random(0,255),random(0,255),random(0,255),random(0,200));
	rect(mouseX-50,mouseY+25,100,40,20);
};


public void setup()
{
	size(400,400);
	background(0);
}
public void draw()
{
 	fill(random(0,255),random(0,255),random(0,255),random(0,200));
 	ellipse(mouseX,mouseY,200,200);
 	face();
 	mouth();
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
