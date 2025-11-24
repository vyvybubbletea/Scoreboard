import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        read();
    }

    public static String read() throws FileNotFoundException {
        Team orange = new Team("Orange");
        Team yellow = new Team("Yellow");
        Team red = new Team("Red");
        Team indigo = new Team("Indigo");
        Team violet = new Team("Violet");
        Team green = new Team("Green");
        Team blue = new Team("Blue");
        int score1 = 0;
        int score2 = 0;
        int team = 1;
        String team1 = "";
        String team2 = "";
//        String x = null;
        int current = 0;
        int active = 1;
        int Orangewins = 0;
        int Yellowins = 0;
        int Redwins = 0;
        int Indigowins = 0;
        int Violetwins = 0;
        int Greenwins = 0;
        int Bluewins = 0;
        int[] Teamscores = new int[7];
        File f = new File("Scoreboard.txt");
        Scanner s = new Scanner(f);
        String input = "";
        while (s.hasNext()) {
//                System.out.print(s.next());
//                System.out.println(" " + s.next());
                team1 = s.next();
                team2 = s.next();
            while (s.hasNextInt()){
                current = s.nextInt();
//                System.out.println(active);
                if (current > 0){
                    if (active % 2 == 1){
                        score1 = score1 + current;
                    } else {
                        if (active % 2 == 0){
                            score2 = score2 + current;
                        }
                    }
                } else {
                    if (current == 0){
                        active++;
                    }
                }
            }
            System.out.println(score1);
            System.out.println(score2);
            System.out.print(team1);
            System.out.println(team2);
            if (score1 > score2){
                if (team1.equals("Orange")){
//                    System.out.println("test");
                    orange.addwins();
                } else {
                    if (team1.equals("Yellow")){
                        yellow.addwins();
                    } else {
                        if (team1.equals("Red")){
                            red.addwins();
                        } else {
                            if (team1.equals("Indigo")){
                                indigo.addwins();
                            } else {
                                if (team1.equals("Violet")){
                                    violet.addwins();
                                } else {
                                    if (team1.equals("Green")){
                                        green.addwins();
                                    } else {
                                        if (team1.equals("Blue")){
                                            blue.addwins();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (score1 < score2){
                    if (team1.equals("Orange")){
                        orange.addwins();
                    } else {
                        if (team1.equals("Yellow")){
                            yellow.addwins();
                        } else {
                            if (team1.equals("Red")){
                                red.addwins();
                            } else {
                                if (team1.equals("Indigo")){
                                    indigo.addwins();
                                } else {
                                    if (team1.equals("Violet")){
                                        violet.addwins();
                                    } else {
                                        if (team1.equals("Green")){
                                            green.addwins();
                                        } else {
                                            if (team1.equals("Blue")){
                                                blue.addwins();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            current = 0;
            active = 1;
            score1 = 0;
            score2 = 0;
            team1 = "";
            team2 = "";
        }
//        System.out.println(score1);
//        System.out.println(score2);
//        System.out.println("hello " + blue.getwins());
        Teamscores[0] = orange.getwins();
        System.out.println(orange.getwins() + " orange");
        Teamscores[1] = yellow.getwins();
        System.out.println(yellow.getwins() + " yellow");
        Teamscores[2] = red.getwins();
        System.out.println(red.getwins() + " red");
        Teamscores[3] = indigo.getwins();
        System.out.println(indigo.getwins() + " indigo");
        Teamscores[4] = violet.getwins();
        System.out.println(violet.getwins() + " violet");
        Teamscores[5] = green.getwins();
        System.out.println(green.getwins() + " green");
        Teamscores[6] = blue.getwins();
        System.out.println(blue.getwins() + " blue");
        System.out.println(Arrays.toString(Teamscores));
        Arrays.sort(Teamscores);
        System.out.println(Arrays.toString(Teamscores));
//        System.out.println(Greenwins);
        return null;
    }
}
