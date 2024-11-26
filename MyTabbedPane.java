import javax.swing.JTabbedPane;
import javax.swing.JFrame;

public class MyTabbedPane extends JFrame {

    JTabbedPane tp;

    MyTabbedPane() {
        tp=new JTabbedPane(JTabbedPane.BOTTOM);
        tp.addTab("Tab1",null);
        tp.addTab("Tab2",null);
        tp.addTab("Tab3",null);
        tp.setSize(120,120);

        setTitle("My Tabbed Pane Demo");
        setSize(600,400);
        setVisible(true);
        setResizable(false);

        add(tp);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        MyTabbedPane tp=new MyTabbedPane();

    }
}
