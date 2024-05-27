import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe {
    int widthBoarder = 600;
    int heightBoader = 650;

    JFrame Jframe = new JFrame("Tic-Tac-Toe");
    JLabel Jlabel = new JLabel();
    JPanel Jpanel = new JPanel();
    JPanel JboardPanel = new JPanel();

    JButton[][] Jbutton = new JButton[3][3];
    String x = "X";
    String o = "O";
    String currentPlayer = x;
    boolean over = false;

    TicTacToe() {
        Jframe.setVisible(true);
        Jframe.setSize(widthBoarder,heightBoader);
        Jframe.setLocationRelativeTo(null);
        Jframe.setResizable(false);
        Jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Jframe.setLayout(new BorderLayout());

        Jlabel.setBackground(Color.black);
        Jlabel.setForeground(Color.red);
        Jlabel.setFont(new Font("Arial", Font.BOLD, 50));
        Jlabel.setHorizontalAlignment(JLabel.CENTER);
        Jlabel.setText("TIC-TAC-TOE");
        Jlabel.setOpaque(true);

        Jpanel.setLayout(new BorderLayout());
        Jpanel.add(Jlabel);
        Jframe.add(Jpanel, BorderLayout.NORTH);

        JboardPanel.setLayout(new GridLayout(3,3));
        JboardPanel.setBackground(Color.black);
        Jframe.add(JboardPanel);

        for (int row = 0; row<3; row++){
            for (int column = 0; column < 3; column++){
                JButton tileBox = new JButton();
                Jbutton[row][column] = tileBox;
                JboardPanel.add(tileBox);

                tileBox.setBackground(Color.black);
                tileBox.setForeground(Color.red);
                tileBox.setFont(new Font("Arial", Font.BOLD, 120));
                tileBox.setFocusable(false);
                // tileBox.setText(currentPlayer);

                tileBox.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (over) return;
                        JButton box = (JButton) e.getSource();
                        if (box.getText() == "") {
                            box.setText(currentPlayer);
                            whoWon();
                            
                            if (!over) {
                                currentPlayer = currentPlayer == x ? o : x;
                                Jlabel.setText(currentPlayer + "'s turn"); 
                            }
                            
                        }
                       

                    }
                });
            }

        }

    }
    void whoWon() {
        //horizontal
        for (int row = 0; row<3; row++){
            if (Jbutton[row][0].getText() == "") continue;
            if (Jbutton[row][0].getText() == Jbutton[row][1].getText() && Jbutton[row][1].getText()== Jbutton[row][2].getText()) {
                for (int i = 0; i < Jbutton.length; i++) {
                    winner(Jbutton[row][i]);
                }
                over = true;
                return;
            }
        }
    }
    void winner(JButton box){
        box.setForeground(Color.blue);
        box.setBackground(Color.black);
        Jlabel.setText(currentPlayer + " WON!");
        Jlabel.setForeground(Color.blue);
    }
}
