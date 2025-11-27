public class Team {
    String teamname;
    int score;
    int wins = 0;
    public Team(String name){
        this.teamname = name;
    }
    public void addwins(){
        wins++;
//        System.out.println("test");
    }
    public int getwins (){
        return wins;
    }
}
