/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mertdemirok
 */
import java.util.Scanner;

public class UserInterface {

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.contains("stop")) {
                break;
            }
            manageCommand(command);
        }

    }

    public void manageCommand(String command) {
        if (command.contains("add")) {
            this.addTodo();
        }
        
        if(command.contains("list")){
            this.printList();
        }
        
        if(command.contains("remove")){
            this.removeTodo();
        }
    }

    public void addTodo() {
        System.out.print("To add: ");
        String todo = scanner.nextLine();
        this.todoList.add(todo);
    }
    
    public void printList(){
        this.todoList.print();
    }
    
    public void removeTodo(){
        System.out.print("Which one is removed? ");
        int index = Integer.valueOf(scanner.nextLine());
        this.todoList.remove(index);
    }

}
