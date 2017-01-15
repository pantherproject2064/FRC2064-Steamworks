package org.usfirst.frc.team2064.robot.subsystems;

import org.usfirst.frc.team2064.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Pneumatics extends Subsystem implements RobotMap {

	private static Pneumatics instance;

	private Timer time;
	protected final Compressor comp;
	protected final DoubleSolenoid solenoid1;

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(null);
	}

	public static Pneumatics getInstance() {
		if (instance == null) {
			instance = new Pneumatics();
		}
		return instance;
	}

	private Pneumatics() {
		comp = new Compressor(COMPRESSOR);
		comp.start(); // starts the compressor by setting closed loop mode true
		
		System.out.println("Compressor Status: " + comp.getClosedLoopControl());
		
		solenoid1 = new DoubleSolenoid(FORWARD_CHANNEL_1, BACKWARD_CHANNEL_1);
		
		time = new Timer();
	}
	
	public void solenoid1Out() {
		solenoid1.set(EXT);
	}

	public void solenoid1In() {
		solenoid1.set(RET);
	}

	public void start() {
		time.reset();
		time.start();
	}

	public double getTime() {
		return time.get();
	}

}