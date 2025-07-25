import java.util.*;
public class ToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> todoList = new ArrayList<>();
        while(true){
            try{
                System.out.println("====Welcome to ToDoList App====");
                System.out.println("1. Add Tasks");
                System.out.println("2. View Tasks");
                System.out.println("3. Remove Tasks");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        addTasks(sc, todoList);
                        break;
                    case 2:
                        viewTask(todoList);
                        break;
                    case 3:
                        removeTasks(sc, todoList);
                        break;
                    case 4:
                        System.out.println("Exiting...Goodbye!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice!");
                        break;
                    }
            }
            catch(InputMismatchException e){
                    System.out.println("Invalid Input!");
                    sc.nextLine();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void addTasks(Scanner sc, ArrayList<String>todoList){
        while(true){
            try{
                System.out.print("How many tasks do you want to enter: ");
                int n = sc.nextInt();
                sc.nextLine();
                for(int i=0;i<n;i++){
                    System.out.println("Enter task "+(i+1)+":");
                    String added = sc.nextLine();
                    todoList.add(added);
                    System.out.println("Task "+(i+1)+" added!");
                }
                break;
            }
            catch(InputMismatchException e){
                System.out.println("Inavlid Input!");
                sc.nextLine();
            }
        }
    }
    public static void viewTask(ArrayList<String>todoList){
        if(todoList.isEmpty()){
            System.out.println("No tasks to view!");
        }
        else{
            for(int i=0;i<todoList.size();i++){
                System.out.println((i+1)+". "+todoList.get(i));
            }
        }
    }
    public static void removeTasks(Scanner sc, ArrayList<String>todoList){
        if(todoList.isEmpty()){
            System.out.println("No tasks to remove!");
        }
        else{
            for(int i=0;i<todoList.size();i++){
                System.out.println((i+1)+". "+todoList.get(i));
            }
        }
        System.out.print("Which task you want to remove: ");
        int index = sc.nextInt();
        sc.nextLine();
        if(index>=1 && index<=todoList.size()){
            String remove = todoList.remove(index-1);
            System.out.println("Removed: "+remove);
        }
        else {
                System.out.println("Invalid task number!");
            }
    }
}