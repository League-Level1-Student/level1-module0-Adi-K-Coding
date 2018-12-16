int dropspeed=10;
int score = 0;
int y = 0;
int x;
void setup() {
  size(600, 600);
  x = (int)random(0, width);
}
void draw() {
  background(255, 255, 255);
  fill(10, 159, 198);
  ellipse(x, y, 10, 50);
  y=y+dropspeed;
  if (y>=600) {
    if (x>mouseX-35&&x<mouseX+35&&y<1000) {
      x = (int)random(0, width);
      y=0;
      score = score+1;
      if (score==25) {
        dropspeed=dropspeed+2;
      }else if(score==50){
        dropspeed=dropspeed+3;
      }
    } else {
      fill(0, 0, 0);
      textSize(50);
      dropspeed=0;
      text("GAME OVER", 150, 300);
      y=1001;
    }
  }
  fill(0, 0, 0);
  textSize(16);
  text("Score: " + score, 20, 20);
  fill(0, 0, 0);
  rect(mouseX-35, 550, 70, 100);
}