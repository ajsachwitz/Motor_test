// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import frc.robot.commands.ClampInLeft;
import frc.robot.commands.ClampInRight;
import frc.robot.commands.ClampOutLeft;
import frc.robot.commands.ClampOutRight;
import frc.robot.commands.moveDownCommand;
import frc.robot.commands.moveUpCommand;
import frc.robot.commands.rotateDown;
import frc.robot.commands.rotateUp;
import frc.robot.subysystems.Arm;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;


/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
 
  private final CommandXboxController driver = new CommandXboxController(0);


  // Replace with CommandPS4Controller or CommandJoystick if needed
  
  public final Arm arm = new Arm();

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    

    driver.a().whileTrue(new moveUpCommand(arm));
    driver.y().whileTrue(new moveDownCommand(arm));

    driver.leftBumper().whileTrue(new ClampOutLeft(arm));
    driver.rightBumper().whileTrue(new ClampOutRight(arm));

    driver.leftTrigger().whileTrue(new ClampInLeft(arm));
    driver.rightTrigger().whileTrue(new ClampInRight(arm));
    
    driver.b().whileTrue(new rotateUp(arm));
    driver.x().whileTrue(new rotateDown(arm));

  }

}
