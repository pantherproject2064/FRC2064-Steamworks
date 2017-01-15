package org.usfirst.frc.team2064.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public interface RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	//Joysticks
		public static int leftJoystick = 0;
		public static int rightJoystick = 1;
		
	//Driving Motors
		public static int driveRight1 = 0; //talon 0
		public static int driveRight2 = 1; //talon 1
		public static int driveLeft1 = 2; //talon 2
		public static int driveLeft2 = 3; //talon 3
		public static int testMotorEWithENC = 4; //ENC ONE (1/15/17)
		
	//Encoders
		public static int ENC_ONE_P = 0; //P = primary pin, S = secondary pin
		public static int ENC_ONE_S = 1;
	
	//Pneumatics
		
		//Pneumatics Wiring
		public static final int COMPRESSOR = 0;
		public static final int FORWARD_CHANNEL_1 = 0;
		public static final int BACKWARD_CHANNEL_1 = 1;
		
		//Pneumatics Constants
		public static final Value EXT = DoubleSolenoid.Value.kForward;
		public static final Value RET = DoubleSolenoid.Value.kReverse;
		
	//Power
		
		//Motors
		//Pneumatics
		
}