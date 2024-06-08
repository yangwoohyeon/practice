import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame2 extends JFrame {
    private JButton button;
    private JLabel label;

    public MyFrame2(){
        this.setSize(300,200);
        this.setTitle("이벤트 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        button=new JButton("버튼을 누르시오");
        label=new JLabel("버튼을 누르시오");
        button.addActionListener(new MyListener2());
        panel.add(button);
        panel.add(label);
        this.add(panel);
        this.setVisible(true);
    }

    public class MyListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e){
            if(button==e.getSource()){
                button.setText("버튼이 눌림");
                label.setText("라벨도 바뀜");
            }
        }

    }
}
