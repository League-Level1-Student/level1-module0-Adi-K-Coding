int X = 250;
int Y = 300;
int speedX = 3;
int speedY = 3;
import ddf.minim.*;  
Minim minim;
AudioSample sound;
PImage backgroundImage;
void setup(){
size(600, 600);
minim = new Minim (this);
sound = minim.loadSample("Ding2.wav", 128);
backgroundImage = loadImage("League.png");
}
void draw(){
background(0, 0, 0);
image(backgroundImage, 200, 5, 200, 100);
fill(255,255,255);
ellipse(X,Y, 25,25);
X=X+speedX;
if(X>=width){
speedX=-3;
}else if(X<=0){
speedX=3;
}
Y=Y+speedY;
if(Y>=height){
speedY=-3;
}else if(Y<=0){
speedY=3;
}
if(Y==height){
sound.trigger();                    
}
fill(255,255,255);
rect(575,mouseY,15, 100);


}