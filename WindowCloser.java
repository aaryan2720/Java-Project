import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//allows us to close the window
class WindowCloser extends WindowAdapter
{

    public void windowClosing(WindowEvent evt)
    {
        System.exit(0);
    }

}



