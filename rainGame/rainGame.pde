  import ddf.minim.*;
  Minim minim;
  AudioSample sound;
  minim = new minim (this);
 
  void setup(){
  sound = minim.loadSample("BD.wav", 128);
  size(1920, 1080);
  }
    float x = 960;
  int y = 1;
  int score = 1;
  
  int bucketSize = 400;
  long lives = 20;
  void drawBucket (int bucketX){
    fill(255,255,255);
    rect(bucketX,920,bucketSize,100);
  }

  void draw(){
    if(lives>0){
      y+=score*2+10;
     
      background(138,138,141);
      fill(0,119,200); 
      noStroke();
      ellipse(x,y,50,50); 
      if(y>1070){
        sound.trigger();  
        if(x > mouseX && x< mouseX+bucketSize){
          score++;
        }
        else{
          //score--;
          lives--;
        }
        y=0;
        x = random(1720)+100;
      }
      fill(0,0,0);
    
      drawBucket(mouseX);
      textSize(72);
      text("Score: " + score, 100, 100);
      textSize(24);
      text("lives " + lives, 1700, 100);
  
    }
    else{
      textSize(96);
      text("your score is " + score, 500, 500);
    }
  }
