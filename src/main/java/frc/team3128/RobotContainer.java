package frc.team3128;

import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.RobotBase;
import edu.wpi.first.wpilibj.RobotController;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.PIDSubsystem;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.ProxyScheduleCommand;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.ScheduleCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.Trigger;

import static frc.team3128.Constants.HoodConstants.*;

import static frc.team3128.Constants.ClimberConstants.*;


import frc.team3128.common.hardware.input.NAR_Joystick;
import frc.team3128.common.hardware.input.NAR_XboxController;
import frc.team3128.common.hardware.limelight.LEDMode;
import frc.team3128.common.hardware.limelight.Limelight;
import frc.team3128.common.utility.Log;
import frc.team3128.common.utility.NAR_Shuffleboard;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a "declarative" paradigm, very little robot logic should
 * actually be handled in the {@link Robot} periodic methods (other than the
 * scheduler calls). Instead, the structure of the robot (including subsystems,
 * commands, and button mappings) should be declared here.
 */
public class RobotContainer {

    private NAR_Joystick m_leftStick;
    private NAR_Joystick m_rightStick;
    private NAR_XboxController m_operatorController;

    private CommandScheduler m_commandScheduler = CommandScheduler.getInstance();
  
    private boolean DEBUG = true; 

    public RobotContainer() {
        // ConstantsInt.initTempConstants();

        //Enable all PIDSubsystems so that useOutput runs
        m_leftStick = new NAR_Joystick(0);
        m_rightStick = new NAR_Joystick(1);
        m_operatorController = new NAR_XboxController(2);

        initDashboard();
        // configureButtonBindings();
        
        if(RobotBase.isSimulation())
            DriverStation.silenceJoystickConnectionWarning(true);
    }   

    private void configureButtonBindings() {

    }

    public void init() {
        
    }

    private void initDashboard() {        
        Log.info("NarwhalRobot", "Setting up limelight chooser...");

    }

    public void updateDashboard() {
    }
}