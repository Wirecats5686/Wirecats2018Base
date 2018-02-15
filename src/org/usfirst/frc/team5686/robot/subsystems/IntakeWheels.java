package org.usfirst.frc.team5686.robot.subsystems;


import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.CANTalon;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import org.usfirst.frc.team5686.robot.RobotMap;

/**
 * The intake system
 */
public class IntakeWheels extends Subsystem {
	private static DigitalInput limit_switch;
	private static WPI_TalonSRX intakeRight;
	private static WPI_TalonSRX intakeLeft;
	
	private static final double INTAKE_SPEED = 1.0;
	private static final double INTAKE_OUT_SPEED = -1.0;

	public IntakeWheels(){
		super("IntakeWheels");
		
		intakeRight = new WPI_TalonSRX(RobotMap.intakeRight);
		intakeLeft = new WPI_TalonSRX(RobotMap.intakeLeft);
		
	//	limit_switch = new DigitalInput(RobotMap.ball_switch);
	}
	
	public void initDefaultCommand() {
		//setDefaultCommand(new MySpecialCommand());
	}
	
	public boolean getBallSwitch(){
		return !limit_switch.get();
	}

	public void intakeIn() {
		// if the limit switch is pressed, don't allow intake
		if(!limit_switch.get()){
			intakeRight.set(0);
			intakeLeft.set(0);
		}else{
			intakeRight.set(INTAKE_OUT_SPEED);
			intakeLeft.set(-INTAKE_OUT_SPEED);
		}
	}
	
	public void intakeOut() {
		intakeRight.set(-INTAKE_OUT_SPEED);
		intakeLeft.set(INTAKE_OUT_SPEED);
	}

	public void stop (){
		intakeRight.set(0);
		intakeLeft.set(0);
	}
}