import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class DiceGame extends JPanel implements KeyListener {

    Random dice = new Random();
    private int i;
    private int y;

    public DiceGame()
    {
        JFrame w = new JFrame();
        w.addKeyListener(this);
        w.setVisible(true);
    }

    public void Startimi_I_Lojes() {
        while (true) {
            int dice1 = dice.nextInt(6) + 1;
            int dice2 = dice.nextInt(6) + 1;

            System.out.println(dice1+ "       " + dice2);

            if (dice1 == 6 && i == 0) {
                i++;
                System.out.println(" -----");
                System.out.println("|     |");
                System.out.println("|     |");
                System.out.println(" -----");
                System.out.println(" Lojtari1 ka plotësuar kushtin ");
            } else if(dice1 == 5 && i == 1) {
                i++;
                System.out.println("  /\\");
                System.out.println(" /  \\");
                System.out.println(" -----");
                System.out.println("|     |");
                System.out.println("|     |");
                System.out.println(" -----");
                System.out.println(" Lojtari1 ka plotësuar kushtin");
            } else if(dice1 == 4 && i == 2) {
                i++;
                System.out.println("  /\\");
                System.out.println(" /  \\");
                System.out.println(" -----");
                System.out.println("|  _  |");
                System.out.println("| | | |");
                System.out.println(" -----");
                System.out.println(" Lojtari1 ka plotësuar kushtin");
            } else if(dice1 == 3 && i == 3) {
                i++;
                System.out.println("  /\\");
                System.out.println(" /  \\");
                System.out.println(" -----");
                System.out.println("|  _  |");
                System.out.println("|x| | |");
                System.out.println(" -----");
                System.out.println(" Lojtari1 ka plotësuar kushtin");
            }else if(dice1 == 2 && i == 4) {
                i++;
                System.out.println("  /\\");
                System.out.println(" /  \\");
                System.out.println(" -----");
                System.out.println("|  _  |");
                System.out.println("|x| |x|");
                System.out.println(" -----");
                System.out.println(" Lojtari1 ka plotësuar kushtin");
            }else if (i==5) {
                System.out.println("Lojtari1 fiton lojen!");
                break;
            }  else {
                System.out.println("reroll ...");
            }


            if (dice2 == 6 && y == 0) {
                System.out.println("        -----");
                System.out.println("       |     |");
                System.out.println("       |     |");
                System.out.println("        -----");
                y++;
                System.out.println("        Lojtari2 ka plotësuar kushtin");
            } else if(dice2 == 5 && y == 1) {
                System.out.println("         /\\");
                System.out.println("        /  \\");
                System.out.println("        -----");
                System.out.println("       |     |");
                System.out.println("       |     |");
                System.out.println("        -----");
                y++;
                System.out.println("       Lojtari2 ka plotësuar kushtin");
            } else if(dice2 == 4 && y == 2) {
                System.out.println("         /\\");
                System.out.println("        /  \\");
                System.out.println("        -----");
                System.out.println("       |  _  |");
                System.out.println("       | | | |");
                System.out.println("        -----");
                y++;
                System.out.println("       Lojtari2 ka plotësuar kushtin");
            } else if(dice2 == 3 && y == 3) {
                System.out.println("         /\\");
                System.out.println("        /  \\");
                System.out.println("        -----");
                System.out.println("       |  _  |");
                System.out.println("       |x| | |");
                System.out.println("        -----");
                y++;
                System.out.println("       Lojtari2 ka plotësuar kushtin");
            }else if(dice2 == 2 && y == 4) {
                System.out.println("         /\\");
                System.out.println("        /  \\");
                System.out.println("        -----");
                System.out.println("       |  _  |");
                System.out.println("       |x| |x|");
                System.out.println("        -----");
                y++;
                System.out.println("       Lojtari2 ka plotësuar kushtin");
            }else if (y==5) {
                System.out.println("       Lojtari2 fiton Lojen!");
                break;
            }
            else {
                System.out.println("       reroll ...");
            }

        }
    }

    public void keyTyped(KeyEvent e) {

        switch ((e.getKeyChar()))
        {
            case 'w':Startimi_I_Lojes();
        }
    }

    public void keyPressed(KeyEvent e) {}

    public void keyReleased(KeyEvent e) {}


}
