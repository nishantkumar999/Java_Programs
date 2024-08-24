import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int prevTime = 0;
        int totalTime = 0;
        boolean running = false;

        for (int i = 0; i < N; i++) {
            int currentTime = scanner.nextInt();
           // int elapsedTime = currentTime - prevTime;

            if (running) {
                 int elapsedTime = currentTime - prevTime;
                totalTime += elapsedTime;
            }

            running = !running;
            prevTime = currentTime;
        }

        if (N % 2 == 1) {
            System.out.println("still running");
        } else {
            System.out.println(totalTime);
        }

        scanner.close();
    }
}
