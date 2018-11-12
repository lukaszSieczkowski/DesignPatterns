package designPatterns.behavioral.iterator.first;

/**
 * The iterator pattern is a design pattern in which an iterator is used to traverse a container and access the container's
 * elements. The iterator pattern decouples algorithms from containers; in some cases,
 * algorithms are necessarily container-specific and thus cannot be decoupled.
 */
public class Client {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
