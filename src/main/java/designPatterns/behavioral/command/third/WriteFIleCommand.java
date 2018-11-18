package designPatterns.behavioral.command.third;

public class WriteFIleCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;

    public WriteFIleCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        fileSystemReceiver.writeFile();
    }
}
