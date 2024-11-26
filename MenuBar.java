import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;;

public class MenuBar extends JFrame{
    JMenuBar menuBar;
    JMenu menuFile, menuEdit,menuExit;
    JMenuItem itemNew,itemOpen,itemcut,itemPaste,itemClose;

    MenuBar()
    {
        menuBar=new JMenuBar();
        menuFile=new JMenu("File");
        menuEdit=new JMenu("Edit");
        menuEdit=new JMenu("Exit");
        setJMenuBar(menuBar);

        menuBar.add(menuFile);
        menuBar.add(menuEdit);
        menuBar.add(menuExit);

        setTitle("my menu");
        setSize(600,400);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MenuBar mb=new MenuBar();
    }
}
