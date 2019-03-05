/* CREDITS : HiuHiu  -- Please don't remove this comment 
 */
package MainFrame.ChessMenuBar.ChessBar_Menus.Menu_Items.File_MenuItems;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


//import MainFrame.ChessMenuBar.ChessBar_Menus.Menu_Items.File_MenuItems.newGame_Dialoge.NewGameDialoge;  /* import to play on network */
import MainFrame.ChessFrame.MainFrame;
import MainFrame.ChessFrame.MainPanel;
import MainFrame.ChessFrame.StatusPanel;
import MainFrame.ChessFrame.ToolPanel;
import MainFrame.ChessFrame.ChatPanel;

public class New_Item extends JMenu
{
    
    /** Creates a new instance of New_Item */
    public New_Item(MainFrame ff)
    {
     //   Ndial=new NewGameDialoge(ff);
        setText("New Game");
        mynewFrame=ff;
        
        OnePlayer.setEnabled(false);
        TwoPlayer.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                
               // Ndial.setVisible(true); /* call frame to choose play local or network */
            	mynewFrame.start_Again();
                
                
                
                
                
                
                
                
            }
        } );
        add(OnePlayer);
        add(TwoPlayer);
    }
    
//    public String getIpAddress()
//    {
//        return  Ndial.GetIpAddress();
//    }
//    public String getportNumber()
//    {
//        return Ndial.GetPortnumber();
//    }
//    
//    private final NewGameDialoge Ndial;
    private final JMenuItem OnePlayer=new JMenuItem(" One Player");
    private final JMenuItem TwoPlayer=new JMenuItem(" Two Player");
    private MainFrame mynewFrame;
    
    
}