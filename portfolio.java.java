import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "Sunil ";
        String email = "sunilkurva9966@gmail.com";
        String phone = "+91-8688289759";
        String linkedin = "https://linkedin.com/in/sunil-kumar";
        String github = "https://github.com/sunilportfolio";
        while (true) {
            System.out.println("\n=== Personal Portfolio ===");
            System.out.println("1. View About Me");
            System.out.println("2. View Skills");
            System.out.println("3. View Projects");
            System.out.println("4. View Contact Info");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  
            switch (choice) {
                case 1:
                    System.out.println("\n--- About Me ---");
                    System.out.println("Hi, I'm " + name + ", a Computer Science student passionate about software development and problem-solving.");
                    break;
                case 2:
                    System.out.println("\n--- Skills ---");
                    System.out.println("Languages: Java, Python, C");
                    System.out.println("Tools: Git, VSCode, Eclipse");
                    System.out.println("Databases: MySQL, MongoDB");
                    break;
                case 3:
                    System.out.println("\n--- Projects ---");
                    System.out.println("1. Student Management System (Java)");
                    System.out.println("2. Portfolio Website (HTML/CSS/JS)");
                    System.out.println("3. Chat Application using Sockets");
                    break;
                case 4:
                    System.out.println("\n--- Contact Info ---");
                    System.out.println("Email: " + email);
                    System.out.println("Phone: " + phone);
                    System.out.println("LinkedIn: " + linkedin);
                    System.out.println("GitHub: " + github);
                    break;
                case 5:
                    System.out.println("Thank you for visiting my portfolio!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}