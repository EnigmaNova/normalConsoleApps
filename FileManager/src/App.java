

public class App {

    private UserInput userInput;
    private Manager manager;

    public App(){
        this.userInput = new UserInput();
        this.manager = new Manager();
    }

    public void run(){
        while(true){
            printInfo();

            String choice = userInput.getString();
            switch(choice){
                case "1":
                    createFile();
                    break;
                case "2":
                    writeFile();
                    break;
                case "3":
                    readFile();
                    break;    
                case "4":
                    deleteFile();
                    break;  
                case "5":
                    return;
                default:
                    System.out.println("Invalid command");
            }
        }
    }

    public void printInfo(){
        System.out.println("welcome to my file Manager");
        System.out.println("1. create new file in txt format");
        System.out.println("2. write in a file");
        System.out.println("3. read the file");
        System.out.println("4. delete the file");
        System.out.println("5. exit from this program");
    }

    public void createFile(){
        System.out.println("Enter the name of this new file.");
        String name = userInput.getString();
        manager.createFile(name);
    }

    public void writeFile(){
        System.out.println("Enter the name of file");
        String name = userInput.getString();
        if(name == null){
            System.out.println("we cannot find this file");
            return;
        }
        System.out.println("enter the text that you want to safe in the file");
        String text = userInput.getString();

        manager.writeFile(name, text);
    }

    public void readFile(){
        System.out.println("enter the name of file that you want to read");
        String name = userInput.getString();
        if(name == null){
            System.out.println("we cannot read this file");
            return;
        }
        manager.readFile(name);
    }
    public void deleteFile(){
        System.out.println("Enter the name of file that you want to delete");
        String name = userInput.getString();
        manager.deleteFile(name);
    }
    public static void main(String[] args) throws Exception {
        /*Scanner scann = new Scanner(System.in);
        String path = scann.nextLine();
        String text = scann.nextLine();
        try(FileWriter writer = new FileWriter(path + ".txt", true)){
            writer.write(text + System.lineSeparator());
            System.out.println("we sucsessfully safe info in the file");
        } catch(IOException e){
            e.printStackTrace();
        }
        scann.close();*/
        new App().run();
    }
}
