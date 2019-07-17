package _02_robot_graffiti;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class a {
public static void main(String[] args) {
	Robot one = new Robot();
one.penDown();
one.setPenColor(Color.GRAY);
one.setSpeed(1/1000000000);
one.turn(30);
one.move(200);
one.turn(120);
one.move(200);
one.turn(180);
one.move(100);
one.turn(-60);
one.move(100);
}
}