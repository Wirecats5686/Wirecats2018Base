package org.usfirst.frc.team5686.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Solenoid extends Subsystem {
	private static DoubleSolenoid solenoid;

	public Solenoid(){
		super("Solenoid");
    	solenoid = new DoubleSolenoid(0, 1);
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void SolenoidExtend (){
    	solenoid.set(DoubleSolenoid.Value.kForward);
    }
    public void SolenoidRetract(){
    	solenoid.set(DoubleSolenoid.Value.kReverse);
    }
    public void stop(){
    	solenoid.set(DoubleSolenoid.Value.kOff);
    }
}

