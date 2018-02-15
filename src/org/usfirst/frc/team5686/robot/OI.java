package org.usfirst.frc.team5686.robot;


import org.usfirst.frc.team5686.robot.triggers.IntakeInPOV;
import org.usfirst.frc.team5686.robot.triggers.IntakeOutPOV;
import org.usfirst.frc.team5686.robot.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.Trigger;
import edu.wpi.first.wpilibj.command.Command;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);\
	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.
	
	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released  and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
	// joysticks
	Joystick left;
	Joystick right;
	Joystick gamepad;
	
	JoystickButton intakeIn;
	JoystickButton intakeOut;
	JoystickButton cancelIntake;
	JoystickButton solenoidExtend;
	JoystickButton solenoidRetract;
	
	JoystickButton downScale;
	JoystickButton startScale;
	
	JoystickButton startScale2;
	
	JoystickButton arcadeDrive;
	JoystickButton arcadeDrive2;
	
	JoystickButton tankDrive;
	JoystickButton tankDrive2;
	JoystickButton tankDrive3;
	JoystickButton tankDrive4;
	
	JoystickButton slowDrive;
	JoystickButton slowDrive2;
	
	
	public OI(){
		// init joysticks
		left = new Joystick(0);
		right = new Joystick(1);
		gamepad = new Joystick(2);
		
		// set up buttons
		// 5 feeder 6 shooter
		cancelIntake = new JoystickButton(gamepad, 2);
		intakeIn = new JoystickButton(gamepad, 1);
		intakeOut = new JoystickButton(gamepad, 4);
		
		
		
		
		
		////downScale = new JoystickButton(js3,1);
		//downScale.toggleWhenActive(new DownScale());
		
		
		//arcadeDrive = new JoystickButton(js1, 8);
		//arcadeDrive2 = new JoystickButton(js2, 8);
		
		tankDrive = new JoystickButton(left, 9);
		tankDrive2 = new JoystickButton(right, 9);
		tankDrive3 = new JoystickButton(left, 4);
		tankDrive4 = new JoystickButton(right, 4);
		
		slowDrive = new JoystickButton(left, 3);
		slowDrive2 = new JoystickButton(right, 3);

		solenoidExtend = new JoystickButton(gamepad, 5);
		solenoidRetract = new JoystickButton(gamepad,6);
		solenoidRetract.whileHeld(new SolenoidRetract());
		solenoidExtend.whileHeld(new SolenoidExtend());
		
		intakeOut.whileHeld(new IntakeOut());
		intakeIn.whileHeld(new IntakeIn());
		cancelIntake.whenPressed(new IntakeCancel());
		
		// toggles because when this command is toggled off it defaults to tank
		//arcadeDrive.whenPressed(new ArcadeDrive());
		//arcadeDrive2.whenPressed(new ArcadeDrive());
		
		tankDrive.whenPressed(new TankDrive());
		tankDrive2.whenPressed(new TankDrive());
		tankDrive3.whenPressed(new TankDrive());
		tankDrive4.whenPressed(new TankDrive());
		
		slowDrive.whenPressed(new SlowDrive());
		slowDrive2.whenPressed(new SlowDrive());
	}
	
	public void setUpTriggers(){
		/*// intake POV controls
		intakeIn = new IntakeInPOV();
		intakeIn.whenActive(new IntakeIn());
		intakeOut = new IntakeOutPOV();
		intakeOut.whenActive(new IntakeOut());
		cancelIntake.whenActive(new IntakeOff ());*/
	}
	
	public Joystick getLeft(){
		return left;
	}
	
	public Joystick getRight(){
		return right;
	}
	
	public Joystick getlogitechController(){
		return gamepad;
	}
}

