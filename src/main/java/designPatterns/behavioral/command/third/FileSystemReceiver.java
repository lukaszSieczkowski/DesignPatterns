package designPatterns.behavioral.command.third;

public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}
