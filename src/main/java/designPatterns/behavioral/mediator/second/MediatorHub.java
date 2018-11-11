package designPatterns.behavioral.mediator.second;

import java.util.ArrayList;
import java.util.List;

class MediatorHub implements Mediator{

    private List<JobWorker> jobWorkers = new ArrayList();

    public void addJobWorker(JobWorker jobWorker){
        jobWorkers.add(jobWorker);
    }

    public void removeJobWorker(JobWorker jobWorker){
        jobWorkers.remove(jobWorker);
    }

    @Override
    public void sendMessage(String message){
        for (JobWorker jobWorker : jobWorkers){
            jobWorker.receiveMessage(message);
        }
    }
}
