/* CREDITS : HiuHiu  -- Please don't remove this comment 
 */

package MainFrame.ChessMenuBar;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import MainFrame.ChessMenuBar.ChessBar_Menus.File_Menu;
import MainFrame.ChessMenuBar.ChessBar_Menus.Edit_Menu;
import MainFrame.ChessMenuBar.ChessBar_Menus.Help_Menu;
import MainFrame.ChessFrame.MainFrame;

public class Chess_MainMenuBar extends JMenuBar
{
    
    /** Creates a new instance of Chess_MainMenuBar */
    public Chess_MainMenuBar(MainFrame ff)
    {
        Fmenu=new File_Menu(ff);
        add(Fmenu);
        add(Emenu);
        add(Hmenu);
        
    }
//    public String getIpAddress()
//    {
//        return Fmenu.getIPaddress();
//    }
//    public String getPortnumber()
//    {
//        return Fmenu.getportNumber();
//    }
//    
    private final File_Menu Fmenu;
    private final Edit_Menu Emenu=new Edit_Menu();
    private final Help_Menu Hmenu=new Help_Menu();
    
    
}
