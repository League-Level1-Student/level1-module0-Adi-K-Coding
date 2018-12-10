int y = 0;
int x;
void setup() {
  size(600,600);
 x = (int)random(0,width);
}
void draw(){
  background(255,255,255);
  fill(10,159,198);
ellipse(x, y, 10, 50);
y=y+5;
}