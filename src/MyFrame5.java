import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame5 extends JFrame {
    private JButton button;
    private JLabel label;

    public MyFrame5(){
        this.setTitle("이벤트 예제");
        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        button = new JButton("버튼을 누르시오");
        label = new JLabel("버튼이 아직 안눌림");
        button.addActionListener(e->{
            button.setText("마침내 버튼이 눌렸습니다.");
        });
        panel.add(button);
        panel.add(label);
        this.add(panel);
        this.setVisible(true);
    }
}
