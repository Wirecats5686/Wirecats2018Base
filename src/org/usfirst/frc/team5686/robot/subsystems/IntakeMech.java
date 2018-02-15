package org.usfirst.frc.team5686.robot.subsystems;

import org.usfirst.frc.team5686.robot.RobotMap;

import com.ctre.CANTalon;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class IntakeMech extends Subsystem {
	private static WPI_TalonSRX intakeLeft;
	private static WPI_TalonSRX intakeRight;
	

	private static final double INTAKE_SPEED = 1.0;
	
	public IntakeMech(){
		super("IntakeMech");
		

		intakeLeft = new WPI_TalonSRX(RobotMap.intakeLeft);
		intakeRight = new WPI_TalonSRX(RobotMap.intakeRight);
		
	}
	public void intakeIn() {
		intakeLeft.set(INTAKE_SPEED);
		intakeRight.set(-INTAKE_SPEED);
	}
	
	public void stop () {
		intakeLeft.set(0);
		intakeRight.set(0);
	}
	public void intakeOut(){
		intakeLeft.set(-INTAKE_SPEED);
		intakeRight.set(INTAKE_SPEED);
	}
    

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

