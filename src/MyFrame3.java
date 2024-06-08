import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame3 extends JFrame implements ActionListener {
    private JButton button;
    private JLabel label;

    public MyFrame3(){
        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("이벤트 예제");

        JPanel panel = new JPanel();
        button = new JButton("버튼을 누르시오");
        label = new JLabel("아직 버튼 안눌림");
        button.addActionListener(this);
        panel.add(button);
        panel.add(label);
        this.add(panel);
        this.setVisible(true);
        }

        public void actionPerformed(ActionEvent e){
        if(button==e.getSource()){
            button.setText("버튼 눌림");
            label.setText("정상 작동");
        }
    }
}
