package designPatterns.behavioral.command.third;

public class Client {
    public static void main(String[] args) {
        FileSystemReceiver fileSystemReceiver = new UnixFIleSystemReceiver();
        Command command = new OpenFileCommand(fileSystemReceiver);
        FileInvoker fileInvoker = new FileInvoker(command);
        fileInvoker.execute();

        command = new CloseFileCommand(fileSystemReceiver);
        fileInvoker = new FileInvoker(command);
        fileInvoker.execute();

        command = new WriteFIleCommand(fileSystemReceiver);
        fileInvoker = new FileInvoker(command);
        fileInvoker.execute();

        fileSystemReceiver = new WindowsFIleSystemReceiver();
        command = new OpenFileCommand(fileSystemReceiver);
        fileInvoker = new FileInvoker(command);
        fileInvoker.execute();

        command = new CloseFileCommand(fileSystemReceiver);
        fileInvoker = new FileInvoker(command);
        fileInvoker.execute();

        command = new WriteFIleCommand(fileSystemReceiver);
        fileInvoker = new FileInvoker(command);
        fileInvoker.execute();

    }

}
