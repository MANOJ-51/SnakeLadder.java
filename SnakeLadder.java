public class SnakeLadder {
    public static void main(String[] args) {
        System.out.println("WELCOME TO SNAKE & LADDER");
        int player_position=0;
        final int Ladder=1;
        final int snake =2;
        System.out.println("PLAYER POSITION AT START:" + player_position);
        int die =(int) Math.floor(Math.random()*6+1);
        int options=(int)Math.floor(Math.random()*3);
        switch (options){
            case Ladder:
                player_position += die;
                System.out.println("PLAYER CLIMBED LADDER WITH :" +die);
                break;
            case snake:
                player_position -= die;
                System.out.println("PLAYER WAS BITE BY A SNAKE WITH:"+die);
                break;
            default:
                System.out.println("PLAYER HAS CHOOSED NO PLAY OPTION");
        }
    }
}
