package modules.gcalcz;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;

import javax.swing.*;
import java.awt.*;

public class GCalczGUI {
    //Main Window
    private JFrame mainFrame = new JFrame();
    //Menu Bar
    private JMenuBar mainMenu;
    //Top Panel
    private JPanel topPanelBuilder;
    //Button Panel
    private JPanel[][] gridButtonBuilder;

    public GCalczGUI(){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    System.out.println("Error creating main window");
                }
                mainFrame.setTitle("MW | GCalcz");
                mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                mainFrame.setLayout(new BorderLayout());
                mainFrame.setJMenuBar(mainMenu());
                mainFrame.add(new FullPane());
                mainFrame.pack();
                mainFrame.setLocationRelativeTo(null);
                mainFrame.setSize(500,450);
                mainFrame.setResizable(false);
                mainFrame.setVisible(true);
            }
        });
    }

    private class FullPane extends JPanel {
        private FullPane() {
            setLayout(new BorderLayout());
            setBackground(Color.WHITE);
            add(gridPanel(), BorderLayout.NORTH);
        }

        private JPanel gridPanel() {
            JPanel gridPanelBuilder = new JPanel(new GridBagLayout());
            GridBagConstraints textGridConstraints = new GridBagConstraints();
            GridBagConstraints button0GridConstraints = new GridBagConstraints();
            GridBagConstraints button1GridConstraints = new GridBagConstraints();
            GridBagConstraints button2GridConstraints = new GridBagConstraints();
            GridBagConstraints button3GridConstraints = new GridBagConstraints();
            GridBagConstraints button4GridConstraints = new GridBagConstraints();
            GridBagConstraints button5GridConstraints = new GridBagConstraints();
            GridBagConstraints button6GridConstraints = new GridBagConstraints();
            GridBagConstraints button7GridConstraints = new GridBagConstraints();
            GridBagConstraints button8GridConstraints = new GridBagConstraints();
            GridBagConstraints button9GridConstraints = new GridBagConstraints();
            GridBagConstraints buttonPlusGridConstraints = new GridBagConstraints();
            GridBagConstraints buttonMinusGridConstraints = new GridBagConstraints();
            GridBagConstraints buttonMultiplyGridConstraints = new GridBagConstraints();
            GridBagConstraints buttonDivideGridConstraints = new GridBagConstraints();
            GridBagConstraints buttonEqualsGridConstraints = new GridBagConstraints();

            JTextPane outputArea = new JTextPane();
            outputArea.setBackground(Color.white);
            outputArea.setEditable(false);

            JButton button0 = new JButton("0");
            JButton button1 = new JButton("1");
            JButton button2 = new JButton("2");
            JButton button3 = new JButton("3");
            JButton button4 = new JButton("4");
            JButton button5 = new JButton("5");
            JButton button6 = new JButton("6");
            JButton button7 = new JButton("7");
            JButton button8 = new JButton("8");
            JButton button9 = new JButton("9");
            JButton buttonPlus = new JButton("+");
            JButton buttonMinus = new JButton("-");
            JButton buttonMultiply = new JButton("*");
            JButton buttonDivide = new JButton("/");
            JButton buttonEquals = new JButton("=");

            textGridConstraints.fill = GridBagConstraints.HORIZONTAL;
            textGridConstraints.ipady = 40;
            textGridConstraints.gridwidth = 5;
            textGridConstraints.gridx = 0;
            textGridConstraints.gridy = 0;
            textGridConstraints.weighty = 1.0;
            textGridConstraints.weightx = 1.0;
            textGridConstraints.insets = new Insets(10,20,0,20);
            gridPanelBuilder.add(outputArea, textGridConstraints);

            //Top row
            button7GridConstraints.fill = GridBagConstraints.HORIZONTAL;
            button7GridConstraints.gridx = 0;
            button7GridConstraints.ipady = 20;
            button7GridConstraints.gridy = 1;
            button7GridConstraints.weightx = .25;
            button7GridConstraints.insets = new Insets(20,20,20,20);
            gridPanelBuilder.add(button7, button7GridConstraints);

            button8GridConstraints.fill = GridBagConstraints.HORIZONTAL;
            button8GridConstraints.gridx = 1;
            button8GridConstraints.ipady = 20;
            button8GridConstraints.gridy = 1;
            button8GridConstraints.weightx = .25;
            button8GridConstraints.insets = new Insets(20,20,20,20);
            gridPanelBuilder.add(button8, button8GridConstraints);

            button9GridConstraints.fill = GridBagConstraints.HORIZONTAL;
            button9GridConstraints.gridx = 2;
            button9GridConstraints.ipady = 20;
            button9GridConstraints.gridy = 1;
            button9GridConstraints.weightx = .25;
            button9GridConstraints.insets = new Insets(20,20,20,20);
            gridPanelBuilder.add(button9, button9GridConstraints);

            buttonDivideGridConstraints.fill = GridBagConstraints.HORIZONTAL;
            buttonDivideGridConstraints.gridx = 3;
            buttonDivideGridConstraints.ipady = 20;
            buttonDivideGridConstraints.gridy = 1;
            buttonDivideGridConstraints.weightx = .25;
            buttonDivideGridConstraints.insets = new Insets(20,20,20,20);
            gridPanelBuilder.add(buttonDivide, buttonDivideGridConstraints);

            //Row 2
            button4GridConstraints.fill = GridBagConstraints.HORIZONTAL;
            button4GridConstraints.gridx = 0;
            button4GridConstraints.ipady = 20;
            button4GridConstraints.gridy = 2;
            button4GridConstraints.weightx = .25;
            button4GridConstraints.insets = new Insets(20,20,20,20);
            gridPanelBuilder.add(button4, button4GridConstraints);

            button5GridConstraints.fill = GridBagConstraints.HORIZONTAL;
            button5GridConstraints.gridx = 1;
            button5GridConstraints.ipady = 20;
            button5GridConstraints.gridy = 2;
            button5GridConstraints.weightx = .25;
            button5GridConstraints.insets = new Insets(20,20,20,20);
            gridPanelBuilder.add(button5, button5GridConstraints);

            button6GridConstraints.fill = GridBagConstraints.HORIZONTAL;
            button6GridConstraints.gridx = 2;
            button6GridConstraints.ipady = 20;
            button6GridConstraints.gridy = 2;
            button6GridConstraints.weightx = .25;
            button6GridConstraints.insets = new Insets(20,20,20,20);
            gridPanelBuilder.add(button6, button6GridConstraints);

            buttonMultiplyGridConstraints.fill = GridBagConstraints.HORIZONTAL;
            buttonMultiplyGridConstraints.gridx = 3;
            buttonMultiplyGridConstraints.ipady = 20;
            buttonMultiplyGridConstraints.gridy = 2;
            buttonMultiplyGridConstraints.weightx = .25;
            buttonMultiplyGridConstraints.insets = new Insets(20,20,20,20);
            gridPanelBuilder.add(buttonMultiply, buttonMultiplyGridConstraints);

            //Row 3
            button1GridConstraints.fill = GridBagConstraints.HORIZONTAL;
            button1GridConstraints.gridx = 0;
            button1GridConstraints.ipady = 20;
            button1GridConstraints.gridy = 3;
            button1GridConstraints.weightx = .25;
            button1GridConstraints.insets = new Insets(20,20,20,20);
            gridPanelBuilder.add(button1, button1GridConstraints);

            button2GridConstraints.fill = GridBagConstraints.HORIZONTAL;
            button2GridConstraints.gridx = 1;
            button2GridConstraints.ipady = 20;
            button2GridConstraints.gridy = 3;
            button2GridConstraints.weightx = .25;
            button2GridConstraints.insets = new Insets(20,20,20,20);
            gridPanelBuilder.add(button2, button2GridConstraints);

            button3GridConstraints.fill = GridBagConstraints.HORIZONTAL;
            button3GridConstraints.gridx = 2;
            button3GridConstraints.ipady = 20;
            button3GridConstraints.gridy = 3;
            button3GridConstraints.weightx = .25;
            button3GridConstraints.insets = new Insets(20,20,20,20);
            gridPanelBuilder.add(button3, button3GridConstraints);

            buttonMinusGridConstraints.fill = GridBagConstraints.HORIZONTAL;
            buttonMinusGridConstraints.gridx = 3;
            buttonMinusGridConstraints.ipady = 20;
            buttonMinusGridConstraints.gridy = 3;
            buttonMinusGridConstraints.weightx = .25;
            buttonMinusGridConstraints.insets = new Insets(20,20,20,20);
            gridPanelBuilder.add(buttonMinus, buttonMinusGridConstraints);

            //Row 4
            button0GridConstraints.fill = GridBagConstraints.HORIZONTAL;
            button0GridConstraints.gridx = 0;
            button0GridConstraints.ipady = 20;
            button0GridConstraints.gridy = 4;
            button0GridConstraints.weightx = .25;
            button0GridConstraints.gridwidth = 2;
            button0GridConstraints.insets = new Insets(20,20,20,20);
            gridPanelBuilder.add(button0, button0GridConstraints);

            buttonPlusGridConstraints.fill = GridBagConstraints.HORIZONTAL;
            buttonPlusGridConstraints.gridx = 3;
            buttonPlusGridConstraints.ipady = 20;
            buttonPlusGridConstraints.gridy = 4;
            buttonPlusGridConstraints.weightx = .25;
            buttonPlusGridConstraints.insets = new Insets(20,20,20,20);
            gridPanelBuilder.add(buttonPlus, buttonPlusGridConstraints);

            buttonEqualsGridConstraints.fill = GridBagConstraints.HORIZONTAL;
            buttonEqualsGridConstraints.gridx = 4;
            buttonEqualsGridConstraints.ipady = 20;
            buttonEqualsGridConstraints.gridy = 4;
            buttonEqualsGridConstraints.weightx = .25;
            buttonEqualsGridConstraints.gridheight = 2;
            buttonEqualsGridConstraints.insets = new Insets(20,20,20,20);
            gridPanelBuilder.add(buttonEquals, buttonEqualsGridConstraints);

            return gridPanelBuilder;
        }
    }

    private JMenuBar mainMenu() {
        mainMenu = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu info = new JMenu("About");

        JMenuItem fileMenuItemNew = new JMenuItem("New", null);
        JMenuItem fileMenuItemExit = new JMenuItem("Exit", null);
        JMenuItem aboutMenuItemAbout = new JMenuItem("About", null);

        fileMenuItemNew.setToolTipText("Fresh Calculator!");
        fileMenuItemExit.setToolTipText("Exit!");
        aboutMenuItemAbout.setToolTipText("About!");

        //fileMenuItemNew.addActionListener(new fileMenuClickedNew());
        //fileMenuItemExit.addActionListener(new fileMenuClickedExit());
        //aboutMenuItemAbout.addActionListener(new aboutMenuClickedAbout());
        //aboutMenuItemLinks.addActionListener(new aboutMenuClickedLinks());

        file.add(fileMenuItemNew);
        file.add(fileMenuItemExit);
        info.add(aboutMenuItemAbout);

        mainMenu.add(file);
        mainMenu.add(info);

        return mainMenu;
    }
}
