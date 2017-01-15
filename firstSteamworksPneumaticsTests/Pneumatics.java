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
	protected final DoubleSolenoid pivot, hold;

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
		comp.start();
	
		pivot = new DoubleSolenoid(FORWARD_CHANNEL_1, BACKWARD_CHANNEL_1);
		hold = new DoubleSolenoid(FORWARD_CHANNEL_2, BACKWARD_CHANNEL_2);
		time = new Timer();
	}
	
	public void pivotOut() {
		pivot.set(EXT);
	}

	public void pivotIn() {
		pivot.set(RET);
	}

	public void release() {
		hold.set(EXT);
	}

	public void contain() {
		hold.set(RET);
	}

	public void start() {
		time.reset();
		time.start();
	}

	public double getTime() {
		return time.get();
	}

}