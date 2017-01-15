package org.usfirst.frc.team2064.robot.commands;

import org.usfirst.frc.team2064.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class changeSpeedGear extends Command {
	public changeSpeedGear() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.comp);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		Robot.comp.solenoid1In();
		System.out.println("Low Gear");
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}


