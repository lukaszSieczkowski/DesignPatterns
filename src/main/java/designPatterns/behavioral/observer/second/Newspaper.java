package designPatterns.behavioral.observer.second;

class Newspaper implements Observer {
    @Override
    public void update(float interest) {
        System.out.println("Newspaper: Interest Rate updated, new Rate is: "
                + interest);
    }
}