package designPatterns.behavioral.mediator.second;
class JobWorker{

    private String name;
    private Mediator mediator;

    public JobWorker(String name, Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }

    public void sendMessage(){
        this.mediator.sendMessage(name + " send msg");
    }


    public void receiveMessage(String message){
        System.out.println("Message -> msg: '" + message + "' to: " + name);
    }
}