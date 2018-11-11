package designPatterns.behavioral.mediator.second;

/**
 *  The mediator pattern defines an object that encapsulates how a set of objects interact.
 */
public class Client {
    public static void main(String[] args) {
        MediatorHub mediatorHub = new MediatorHub();

        JobWorker job1 = new JobWorker("Job1", mediatorHub);
        JobWorker job2 = new JobWorker("Job2", mediatorHub);
        JobWorker job3 = new JobWorker("Job3", mediatorHub);
        JobWorker job4 = new JobWorker("Job4", mediatorHub);

        mediatorHub.addJobWorker(job1);
        mediatorHub.addJobWorker(job2);
        mediatorHub.addJobWorker(job3);
        mediatorHub.addJobWorker(job4);


        job1.sendMessage();


        mediatorHub.removeJobWorker(job2);
        job2.sendMessage();
    }
}
