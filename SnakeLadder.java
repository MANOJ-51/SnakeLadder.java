public class SnakeLadder {
    public static void main(String[] args) {
        System.out.println("WELCOME TO SNAKE & LADDER");
        int player_position=0;
        System.out.println("PLAYER POSITION AT START:" + player_position);
        int die =(int) Math.floor(Math.random()*6+1);
        System.out.println("DIE VALUE:"+ die);
    }
}
