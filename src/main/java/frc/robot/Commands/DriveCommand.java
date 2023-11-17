import edu.wpi.first.wpilibj2.command.CommandBase;
public class DriveCommand extends CommandBase{
    private DriveBaseSubsystem driveBaseSubsystem;
    public DriveCommand(DriveBaseSubsystem driveBaseSubsystem){
        this.driveBaseSubsystem = driveBaseSubsystem;
        addRequirments(driveBaseSubsystem);
    }

    public void execute(){
        driveBaseSubsystem.setLeftSpeed((controller.getLeftY(), controller.getLeftX())*MAX_SPEED);
        driveBaseSubsystem.setRightSpeed((controller.getLeftY(), controller.getLeftX())*MAX_SPEED);
    }   

    @Override
    public boolean isFinished(){
        return true;
    }


}