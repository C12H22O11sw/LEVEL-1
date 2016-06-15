void setup() {
  size(1920, 1200);
  background(100, 75, 50);
}
float x = 960;
float y = 600;
float variant = 6;
void draw() {
  fill(80, 60, 40);
  ellipse(x, y, 100, 50);
  x += random(variant*2)-variant;
  y += random(variant*2)-variant;
  variant = mouseY/20;
  variant = sqrt(pow(mouseY-y,2)+pow(mouseX-x,2));
  constrain(x,0,1900);
    constrain(y,0,1100);

}

