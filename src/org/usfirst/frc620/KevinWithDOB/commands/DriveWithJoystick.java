package org.usfirst.frc620.KevinWithDOB.commands;

import java.awt.Robot;
import java.io.IOError;

import org.usfirst.frc620.KevinWithDOB.RobotMap;
import org.usfirst.frc620.KevinWithDOB.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class DriveWithJoystick  extends Command{
	Joystick stick;
	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void initialize() {
		stick = OI.getJoystick();
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
