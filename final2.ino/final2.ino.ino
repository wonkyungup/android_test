#include <Servo.h>
#define SERVOMOTOR 9
#define LED 12

Servo myservo;
int angle=0;

void setup() {
  // put your setup code here, to run once:
    Serial.begin(9600);
    myservo.attach(SERVOMOTOR);
    pinMode(LED,OUTPUT);
    digitalWrite(LED,LOW);
}

void loop() {
  // put your main code here, to run repeatedly:
    if(Serial.available()){
        angle=Serial.read();
        if(0<=angle&&angle<=180){
        myservo.write(angle);
        Serial.println(angle);
      }}
    if (Serial.available()){
        char c=Serial.read();
        Serial.print("digital LED status : ");
        Serial.print(c);
        if(c=='n'){
          digitalWrite(LED,HIGH);
          Serial.println(digitalRead(LED));}
        if(c=='f'){
          digitalWrite(LED,LOW);
          Serial.println(digitalRead(LED));}
      }
}
