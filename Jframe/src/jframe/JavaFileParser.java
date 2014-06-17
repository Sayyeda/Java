package jframe;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class JavaFileParser extends JFrame implements ActionListener {
/*------------------------------------------------------------------------------
    CONSTRUCT
------------------------------------------------------------------------------*/
    public static void main( String[] args ) {
        JavaFileParser parser = new JavaFileParser();
        parser.pack();
        parser.setVisible( true );
    }

    public JavaFileParser() {
        System.out.println( "Generating user interface..." );

        this.setTitle( "Title" );
        this.setLocationRelativeTo( null );
        this.setDefaultCloseOperation( EXIT_ON_CLOSE );

        JPanel panel = addPanel();

        JLabel label = addLabel( "Contents" );
        panel.add( label );

        JButton button = addButton( "Open File", "Open a file to begin..." );
        panel.add( button );
    }

/*------------------------------------------------------------------------------
    PUBLIC METHODS
------------------------------------------------------------------------------*/

    public JPanel addPanel() {
        System.out.println( "Generating frame panel..." );

        JPanel panel = new JPanel();
        this.getContentPane().add( panel );
        panel.setLayout( new FlowLayout() );

        return panel;
    }

    public JLabel addLabel( String text ) {
        System.out.println( "Generating label with the following contents: " + text );

        return new JLabel( text );
    }

    public JButton addButton( String title, String tooltip ) {
        System.out.println( "Generating button with the value of: " + title );
        JButton button = new JButton( title );

        System.out.println( "Generating tooltip for button \"" + title + "\" with a value of: " + tooltip );
        button.setToolTipText( tooltip );
        button.addActionListener( this );

        return button;
    }

    public void actionPerformed( ActionEvent e ) {
        System.out.println( "Generating File Chooser Dialog..." );

        JFileChooser filechooser = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter( "Text Files", "txt" );
        filechooser.addChoosableFileFilter( filter );
        filechooser.setFileFilter( filter );

        int returnValue = filechooser.showDialog( this, "Open Report" );
        if( returnValue == JFileChooser.APPROVE_OPTION ) {
            System.out.println( "class and method not yet implemented" );
        }
    }
}