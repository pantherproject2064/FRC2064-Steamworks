package org.usfirst.frc.team2064.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
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
		
					// Pin for motor with encoder - 4 (1/15/17)
					//encoder on pin 0,1
	//Encoders
		public static int 
	
	//Pneumatics
		
		//Pneumatics Wiring
		public static final int COMPRESSOR = 0;
		public static final int S_PIVOT_A = 0;
		public static final int S_HOLD_B = 6;
		public static final int S_HOLD_A = 1;
		public static final int S_PIVOT_B = 7;
		
		//Pneumatics Constants
		public static final Value = DoubleSolenoid.Value.kForward;
		public static final Value = DoubleSolenoid.Value.kBackward;
		
}