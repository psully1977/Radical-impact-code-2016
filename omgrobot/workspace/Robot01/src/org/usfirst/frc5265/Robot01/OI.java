// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5265.Robot01;

import org.usfirst.frc5265.Robot01.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc5265.Robot01.subsystems.*;
import org.usfirst.frc5265.Robot01.commands.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton buttonForward;
    public JoystickButton buttonBackward;
    public JoystickButton buttonStop;
    public JoystickButton autonomus;
    public JoystickButton buttonSpin;
    public JoystickButton gateUp;
    public JoystickButton gateDown;
    public JoystickButton shootButton;
    public Joystick driveStick;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
   
   
    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        driveStick = new Joystick(0);
        
        shootButton = new JoystickButton(driveStick, 8);
        shootButton.whenPressed(new Shoot());
        gateDown = new JoystickButton(driveStick, 31);
        gateDown.whileHeld(new LiftGateDown());
        gateUp = new JoystickButton(driveStick, 7);
        gateUp.whileHeld(new LiftGateUp());
        buttonSpin = new JoystickButton(driveStick, 5);
        buttonSpin.whenPressed(new BrushOn());
        autonomus = new JoystickButton(driveStick, 32);
        autonomus.whenPressed(new AutonomousGroup());
        buttonStop = new JoystickButton(driveStick, 27);
        buttonStop.whenPressed(new GoStop());
        buttonBackward = new JoystickButton(driveStick, 29);
        buttonBackward.whileHeld(new GoBackward());
        buttonForward = new JoystickButton(driveStick, 30);
        buttonForward.whileHeld(new GoForward());


        // SmartDashboard Buttons
        SmartDashboard.putData("GoForward", new GoForward());
        SmartDashboard.putData("GoBackward", new GoBackward());
        SmartDashboard.putData("GoDrive", new GoDrive());
        SmartDashboard.putData("GoArcade", new GoArcade());
        SmartDashboard.putData("GoStop", new GoStop());
        SmartDashboard.putData("FindThrottle", new FindThrottle());
        SmartDashboard.putData("BrushOn", new BrushOn());
        SmartDashboard.putData("Shoot", new Shoot());
        SmartDashboard.putData("AutonomousGroup", new AutonomousGroup());
        SmartDashboard.putData("LiftGateUp", new LiftGateUp());
        SmartDashboard.putData("LiftGateDown", new LiftGateDown());
        SmartDashboard.putData("Reset Ball", new ResetBall());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
//        Shoot.log();
    }
    
    

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getDriveStick() {
        return driveStick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS

    // code to return the -1 to +1 value of the throttle
    public double valueThrottle() {
        return driveStick.getThrottle();
    }
}

