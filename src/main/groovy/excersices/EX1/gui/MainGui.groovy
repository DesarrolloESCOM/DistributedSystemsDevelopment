import javax.swing.JButton
import javax.swing.JFrame

class MainGui{
    static void main(String []args){
        def frame = new JFrame()
        def button = new JButton()
        button.setText("Boton")
        frame.setTitle("Frame")
        frame.setVisible(true)
    }
}