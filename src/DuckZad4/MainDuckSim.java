package DuckZad4;

import java.util.ArrayList;

public class MainDuckSim {
    public static void main(String[] args) {

        ArrayList<Duck> ducks = new ArrayList<>();

        ducks.add(new MallardDuck(new FlyWithWings(),new Quack()));
        ducks.add(new RubberDuck(new FlyNoWay(), new Squeak()));
        ducks.add(new ModelDuck(new FlyNoWay(), new MuteQuack()));

        for(Duck a:ducks){
            a.performFly();
            a.performQuack();
        }
        ducks.get(1).setFlyBehaviour(new FlyBehaviour() {
            @Override
            public void fly() {
                System.out.println("DuckZad4.Duck is flying on a rocket");
            }
        });
        ducks.get(1).performFly();
    }
}
