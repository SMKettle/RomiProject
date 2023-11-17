import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveBaseSubsystem extends SubystemBase {
    //Varibales
    //Constants
    private final double MAX_SPEED = 1.0;


    //Instances
    private Spark lMotor;
    private Spark rMotor;
    private Encoder lSparkEncoder;
    private Encoder rSparkEncoder;
    
    


    // controller.getLeftY * maxSpeed
    //Constructors 
    public DriveBaseSubsystem(){
        lMotor = new Spark(DRIVEBASE_LEFT_MOTOR_CHANNEL);
        rMotor = new Spark(DRIVEBASE_RIGHT_MOTOR_CHANNEL);
        lSparkEncoder = new Encoder​(DRIVEBASE_LEFT_MOTOR_ENCODER_CHANNEL_A, DRIVEBASE_LEFT_MOTOR_ENCODER_CHANNEL_B);
        rSparkEncoder = new Encoder​(DRIVEBASE_RIGHT_MOTOR_ENCODER_CHANNEL_A, DRIVEBASE_RIGHT_MOTOR_ENCODER_CHANNEL_B);

        rMotor.setInverted(true);
            
    }
    
    //Methods
    public void setLeftSpeed(double speed){
        lMotor.set(speed);
    }
    public void setRightSpeed(double speed){
        rMotor.set(speed);
    }

    public double getRightSpeed(double yInput, double xInput){
        return (yInput - xInput);
    }

    public double getLeftSpeed(double yInput, double xInput){
        return (yInput + xInput);
    }

}
