/* package org.usfirst.frc5265.Robot01.commands;

import com.ni.vision.NIVision;
import com.ni.vision.NIVision.Image;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Config;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
/* 
public class SwCam extends Command {

	private final int camFront;
	private final int camRear;
	private int curCam;
	private Image frame;
	private CameraServer server;


	
	
    public SwCam() {
    	// Get camera ids by supplying camera name ex 'cam0', found on roborio web interface
    	camFront = NIVision.IMAQdxOpenCamera(Config.SwitchCamera.camNameFront, NIVision.IMAQdxCameraControlMode.CameraControlModeController);
    	camRear = NIVision.IMAQdxOpenCamera(Config.SwitchCamera.camNameBack, NIVision.IMAQdxCameraControlMode.CameraControlModeController);
        curCam = camFront;
        // Img that will contain camera img
    	frame = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_RGB, 0);
        // Server that we'll give the img to
    	server = CameraServer.getInstance();
     	server.setQuality(Config.SwitchCamera.imgQuality);
	}

 // Called just before this Command runs the first time
  	public Command run()
  	{
  		if (curCam == camFront)
  			changeCam(camRear);
  		else
  			changeCam(camFront);
  		updateCam();
		return null;
  	}
     
     // Called once after isFinished returns true
     protected void end() {
     	NIVision.IMAQdxStopAcquisition(curCam);
     }

     public void changeCam(int newId)
     {
 		NIVision.IMAQdxStopAcquisition(curCam);
     	NIVision.IMAQdxConfigureGrab(newId);
     	NIVision.IMAQdxStartAcquisition(newId);
     	curCam = newId;
     }
     
     public void updateCam()
     {
     	NIVision.IMAQdxGrab(curCam, frame, 1);
         server.setImage(frame);
     }
     
     
     
     
     
          
     // Called just before this Command runs the first time
    public void initialize() {
    	changeCam(camFront);
    }
    
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
} */
