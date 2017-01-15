package org.usfirst.frc.team2064.robot.subsystems;

import org.usfirst.frc.team2064.robot.RobotMap;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem implements RobotMap{
	
	public static RobotDrive bot;
	private static Encoder instance;
	
	private Timer time;
	private Encoder ENC1;

	public void initDefaultCommand() {
		setDefaultCommand(null);
	}
	
	public DriveTrain(){
		ENC1 = new Encoder(ENC_ONE_P, ENC_ONE_S, true, EncodingType.k4X);
		bot = new RobotDrive(driveRight1, driveRight2, driveLeft1, driveLeft2);
		
		
	}
}
