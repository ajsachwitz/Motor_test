package frc.robot.commands;



import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subysystems.Arm;

public class ClampOutLeft extends CommandBase{
    public final Arm arm;
    public ClampOutLeft(Arm arm){
        this.arm = arm;
    }
    public void execute() {
        //arm.clampOutLeft();
        arm.clampOutVelocity();
    }

}
