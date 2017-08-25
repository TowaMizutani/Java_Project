import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

 class MainGame{
     public static void main(String args[]){
         Frame mainframe = new Frame("MT Project");
         mainframe.setVisible(true);
   }
}
class Frame extends JFrame implements ActionListener{
    JLabel label;
    Frame(String title){
        //Frame作成
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,600);
        setLocationRelativeTo(null);

        //Icon設定
        ImageIcon icon = new ImageIcon("./Image/reeva.jpg");
        setIconImage(icon.getImage());

        //コメント
        label = new JLabel("");

        //ボタン作成
        JButton btntop = new JButton("↑");
        btntop.addActionListener(this);
        JButton btnright = new JButton("→");
        JButton btnleft = new JButton("←");
        JButton btnunder = new JButton("↓");

        //パネル作成
        JLabel panel = new JLabel();
        ImageIcon picon = new ImageIcon("./Image/sr_s.jpg");
        panel.setIcon(picon);

        //ボタン配置
        Container contentPane = getContentPane();
        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(label, BorderLayout.CENTER);
        contentPane.add(btntop, BorderLayout.NORTH);
        contentPane.add(btnright, BorderLayout.EAST);
        contentPane.add(btnleft, BorderLayout.WEST);
        contentPane.add(btnunder, BorderLayout.SOUTH);
    }
    public void actionPerformed(ActionEvent e){
        label.setText("Ban");
        logger.fine(e);
    }
}
