void face(){
	fill(0);
	ellipse(mouseX-30,mouseY-50,20,20);
	ellipse(mouseX+30,mouseY-50,20,20);
};
void mouth(){
	fill(random(0,255),random(0,255),random(0,255),random(0,200));
	rect(mouseX-50,mouseY+25,100,40,20);
};


void setup()
{
	size(400,400);
	background(0);
}
void draw()
{
 	fill(random(0,255),random(0,255),random(0,255),random(0,200));
 	ellipse(mouseX,mouseY,200,200);
 	face();
 	mouth();
}

