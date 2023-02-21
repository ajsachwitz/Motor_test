package frc.robot.commands;



import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subysystems.Arm;

public class rotateDown extends CommandBase{
    public final Arm arm;
    public rotateDown(Arm arm){
        this.arm = arm;
    }
    public void execute() {
        arm.armRotateDown();
    }

}

