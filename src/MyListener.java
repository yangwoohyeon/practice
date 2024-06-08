import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {
  public void actionPerformed(ActionEvent e){
      JButton button = (JButton)e.getSource();
      button.setText("버튼 눌림");
  }
}
