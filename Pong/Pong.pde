import ddf.minim.*;  
AudioSample sound;
Minim minim;
PImage backgroundImage;
int X = 250;
int Y = 300;
int speedX = 3;
int speedY = 3;
int p1y = 0;
int p2y= 0;
boolean moveDown = false;
boolean moveUp = false;
boolean moveDown2 = false;
boolean moveUp2 = false;
void setup() {
  size(700, 800);
  minim = new Minim (this);
  sound = minim.loadSample("Ding2.wav", 128);
  backgroundImage = loadImage("League.png");
  backgroundImage.resize(200,100);
}
void draw() {
  background(0, 0, 0);
  image(backgroundImage, 200, 5);
  fill(255, 255, 255);
  ellipse(X, Y, 25, 25);
  X=X+speedX;
  if (X>=width) {
    sound.trigger();                    
    speedX=-3;
  } else if (X<=0) {
    sound.trigger();                    
    speedX=3;
  }
  Y=Y+speedY;
  if (Y>=height) {                   
    speedY=-3;
  } else if (Y<=0) {                    
    speedY=3;
  }
  fill(255, 255, 255);
  rect(675, p1y, 15, 100);
  fill(255, 255, 255);
  rect(25, p2y, 15, 100);
  if (intersects(X, Y, 675, p1y, 15, 100)) {
    speedX=speedX*-1;
  }
  if (intersects(X, Y, 25, p2y, 15, 100)) 
    speedX=speedX*-1;

  if (moveUp) {
    p1y-=10;
  } else if (moveDown) {
    p1y+=10;
  }
  if (moveUp2) {
    p2y-=10;
  } else if (moveDown2) {
    p2y+=10;
  }
}

boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength, int paddleHeight) {
  if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength&&ballY<paddleY+paddleHeight)
    return true;
  else 
  return false;
}

void keyPressed() {
  if (keyCode == 76) {
    moveDown = true;
  }  
  if (keyCode == 80) {
    moveUp = true;
  }
  if (keyCode == 65) {
    moveDown2 = true;
  }  
  if (keyCode == 81) {
    moveUp2 = true;
  }
}

void keyReleased() {
  if (keyCode == 76) {
    moveDown = false;
  }  
  if (keyCode == 80) {
    moveUp = false;
  }
  if (keyCode == 65) {
    moveDown2 = false;
  }  
  if (keyCode == 81) {
    moveUp2 = false;
  }
}