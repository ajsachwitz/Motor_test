package frc.robot.commands;



import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subysystems.Arm;

public class ClampInLeft extends CommandBase{
    public final Arm arm;
    public ClampInLeft(Arm arm){
        this.arm = arm;
    }
    public void execute() {
        
        //arm.clampInLeft();
        arm.clampInVelocity();
    }

}
