package Task15;

import java.util.Random;

public class RobotInfinitloop {

    boolean currentLeg = true;
    int count = 0;

    class Leg implements Runnable {
        private final String name;
        private final boolean leg;

        Leg(String name, boolean leg) {
            this.name = name;
            this.leg = leg;
        }
        @Override
        public synchronized void run() {
            while(count < 10) {
                if (leg == currentLeg) {
                    step();
                    currentLeg = !leg;
                    Thread.yield();
                    count++;
                }
            }
        }

        private void step() {
            System.out.println(name);
        }
    }

    Leg left = new Leg("LEFT", false);
    Leg right = new Leg("RIGHT", true);

    void run() {
        new Thread(left).start();
        new Thread(right).start();
    }
}
