import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame4 extends JFrame { //무명클래스
    private JButton button;
    private JLabel label;

    public MyFrame4(){
        this.setSize(300,200);
        this.setTitle("이벤트 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        button = new JButton("버튼 눌러라");
        label = new JLabel("아직 버튼이 안눌림");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==button){
                    button.setText("버튼 눌림");
                    label.setText("정상 작동");
                }
            }
        });
        panel.add(button);
        panel.add(label);
        this.add(panel);
        this.setVisible(true);
    }
}
