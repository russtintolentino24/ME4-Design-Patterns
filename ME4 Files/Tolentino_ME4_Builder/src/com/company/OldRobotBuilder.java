package com.company;

public class OldRobotBuilder implements RobotBuilder {

    private Robot robot;

    public OldRobotBuilder() {

        this.robot = new Robot();

    }

    public void buildRobotHead() {

        robot.setRobotHead("Diamond Head");

    }

    public void buildRobotTorso() {

        robot.setRobotTorso("Diamond Torso");

    }

    public void buildRobotArms() {

        robot.setRobotArms("Grenade Launcher Arms");

    }

    public void buildRobotLegs() {

        robot.setRobotLegs("Thruster Skates");

    }

    public Robot getRobot() {

        return this.robot;
    }



}