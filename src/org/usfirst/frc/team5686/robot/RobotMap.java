package org.usfirst.frc.team5686.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// drive train pwm ports
	public static int rightFrontDrive = 1;
	public static int rightRearDrive = 2;
	public static int leftFrontDrive = 3;
	public static int leftRearDrive = 4;
	
	
    
	// intake CAN ID
	public static int intakeLeft= 5;
	public static int intakeRight = 6;
	public static int arm = 7;
	
	}
