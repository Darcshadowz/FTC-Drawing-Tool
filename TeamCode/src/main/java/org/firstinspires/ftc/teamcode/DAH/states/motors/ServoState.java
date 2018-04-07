package org.firstinspires.ftc.teamcode.DAH.states.motors;

import com.qualcomm.robotcore.hardware.Servo;

import org.engine.State;
import org.engine.Engine;

/**
 * Created by Dylan on 4/7/2018.
 */

public class ServoState extends State {
    private Servo armServo;

    public ServoState(Engine engine) {
        this.engine = engine;
    }
    @Override
    public void init(){
        armServo = engine.hardwareMap.servo.get("servo");
    }
    @Override
    public void exec() {
        armServo.setPosition(1.0);
        setFinished(true);
    }
}
