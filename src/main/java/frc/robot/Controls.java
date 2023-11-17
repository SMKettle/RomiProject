package frc.robot;
import edu.wpi.first.wpilibj.XboxController;

public class Controls {

    Subsystems subsystems;

    // Controller + Button Variables
    public XboxController controller;
    

    // Constructor
    public Controls(Subsystems subsystems) {
        this.subsystems = subsystems;
        
        // Initialize Controller and Button variables here
        controller = new XboxController(0);


        // Call Bind Methods

    }

    // Control Bind Methods
    public void bindDriveBaseControls() {
        subsystems.driveBaseSubsystem.setDefaultCommand(new DriveCommand(subsystems));
    }
}
