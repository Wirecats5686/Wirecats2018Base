package org.usfirst.frc.team5686.robot.commands;

import org.usfirst.frc.team5686.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Command;


public class SolenoidExtend extends Command {

    public SolenoidExtend() {
        requires(Robot.solenoid);
        setInterruptible(true);
    }
    protected void execute() {
        Robot.solenoid.SolenoidExtend();
    }
	protected boolean isFinished() {
		return isTimedOut();
	}
    protected void end() {
    	Robot.solenoid.stop();
    }
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }

}

    