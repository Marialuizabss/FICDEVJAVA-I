package desafio6.pkg2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Task {
    private String description;
    private String priority;
    private boolean isCompleted;

    public Task(String description, String priority) {
        this.description = description;
        this.priority = priority;
        this.isCompleted = false;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        isCompleted = true;
    }
}

class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.markAsCompleted();
            System.out.println("Tarefa concluída: " + task.getDescription());
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void printTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Não há tarefas cadastradas.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                Task task = tasks.get(i);
                System.out.println("Tarefa " + (i + 1) + ": " + task.getDescription() +
                        ", Prioridade: " + task.getPriority() +
                        ", Concluída: " + task.isCompleted());
            }
        }
    }
}

public class TaskManagerApp {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("========== Gerenciador de Tarefas ==========");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Marcar Tarefa como Concluída");
            System.out.println("3 - Listar Tarefas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0:
                    System.out.println("Encerrando o programa...");
                    return;
                case 1:
                    System.out.print("Descrição da tarefa: ");
                    String description = scanner.nextLine();
                    System.out.print("Prioridade da tarefa: ");
                    String priority = scanner.nextLine();
                    Task task = new Task(description, priority);
                    taskManager.addTask(task);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;
                case 2:
                    System.out.print("Índice da tarefa a ser concluída: ");
                    int index = scanner.nextInt();
                    taskManager.markTaskAsCompleted(index - 1);
                    break;
                case 3:
                    taskManager.printTasks();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println();
        }
    }
}
