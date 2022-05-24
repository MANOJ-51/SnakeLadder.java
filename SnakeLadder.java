public class SnakeLadder {
    public static void main(String[] args) {
        System.out.println("WELCOME TO SNAKE & LADDER");
        int player_position = 0;
        int present_position = 0;
        final int Ladder = 1;
        final int snake = 2;
        while (true) {
            die_roll++;
            int die = (int) Math.floor(Math.random() * 6 + 1);
            System.out.println("DIE ROLLED BY PLAYER AND VALUE IS:" + die);
            if (player_position == 1) {
                int options = (int) Math.floor(Math.random() * 3);
                switch (options) {
                    case Ladder:
                        present_position += die;
                        System.out.println("PLAYER CLIMBED LADDER WITH :" + die);
                        break;
                    case snake:
                        present_position -= die;
                        if (present_position < 0) {
                            player_position = 0;
                            present_position = 0;
                            System.out.println("PLAYER GOT ELIMINATED. PLAYER PRESENT POSITION :" + present_position);
                        }
                        System.out.println("PLAYER WAS BITE BY A SNAKE WITH:" + die);
                        break;
                    default:
                        System.out.println("PLAYER HAS CHOOSED NO PLAY OPTION");
                }
            }
            if (player_position == 0 && die == 6) ;
            {
                player_position = 1;
                present_position = 1;
                System.out.println("PLAYER GOT " + die + "AND ENTERED INTO THE GAME");
            }
            if (present_position >= 100) ;
            {
                System.out.println("PLAYER REACHED " + present_position + "AND WON GAME");
                return;
            }
        }
    }
}

