package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.SwerveSubsystem;

public class SwerveTurn extends CommandBase {

    private SwerveSubsystem swerve;

    public SwerveTurn(SwerveSubsystem swerve)  {
        this.swerve = swerve;
        addRequirements(swerve);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        swerve.getBackLeftSwerveModule().setTurnVelocity(0.1);
        swerve.getFrontLeftSwerveModule().setTurnVelocity(0.1);
        swerve.getBackRightSwerveModule().setTurnVelocity(0.1);
        swerve.getFrontRightSwerveModule().setTurnVelocity(0.1);
      
    }

    @Override
    public void end(boolean interrupted) {
        swerve.getBackLeftSwerveModule().turnVelocityStop();
        swerve.getFrontLeftSwerveModule().turnVelocityStop();
        swerve.getBackRightSwerveModule().turnVelocityStop();
        swerve.getFrontRightSwerveModule().turnVelocityStop();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
