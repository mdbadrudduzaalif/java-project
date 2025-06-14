package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import Entity.Conversion;
import File.FileIO;

public class ConverterPage extends JFrame implements ActionListener {
    Font font15 = new Font("Consolas", Font.BOLD, 20);

    JLabel titleLabel, inputLabel, typeLabel, outputLabel;//creating function
    JTextField inputField, outputField;//creating function
    JComboBox<String> typeBox;//creating function
    JButton convertButton, clearButton, saveButton;//creating function
    JTextArea historyArea;//creating function
    ArrayList<Conversion> history = new ArrayList<>();//creating function

    public ConverterPage() {
        super("Unit Converter");//set application name
        this.setSize(810, 450);
        this.setLocation(200, 50);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(new ImageIcon("./images/icon.png").getImage());//java run icon
        this.setResizable(true);//resize
		
        JLabel background = new JLabel(new ImageIcon("./images/bg.jpg"));//background image
        background.setBounds(0, 0, 800, 600);//(x,y,h,w)
        this.setContentPane(background);
        background.setLayout(null);//set the layout of the gui buttons 

        titleLabel = createLabel(320, 0, 300, 30, "Unit Converter");

        inputLabel = createLabel(10, 40, 150, 30, "Enter Value:");
        inputField = createTextField(160, 40, 170, 30, "");

        typeLabel = createLabel(10, 80, 150, 30, "Convert Type:");
        typeBox = new JComboBox<>(new String[]{
            "cm->inches", "inches->cm", "kg->pounds", "pounds->kg", "liters->gallons", "gallons->liters"
        });
        typeBox.setBounds(160, 80, 170, 30);
        typeBox.setFont(font15);
        background.add(typeBox);//input box

        outputLabel = createLabel(10, 120, 150, 30, "Result:");
        outputField = createTextField(160, 120, 170, 30, "");
        outputField.setEditable(false);
		
		
		outputLabel = createLabel(55, 170, 150, 30, "Convert");
		
		outputLabel = createLabel(215, 170, 150, 30, "Refresh");
		
		
        convertButton = createButton(10, 190, 157, 30, "");
        convertButton.setIcon(new ImageIcon("./images/convert.png"));
		convertButton.setBackground(Color.GRAY);//button background

        clearButton = createButton(172, 190, 157, 30, "");
        clearButton.setIcon(new ImageIcon("./images/refresh.png"));
		clearButton.setBackground(Color.GRAY);

        saveButton = createButton(10, 230, 320, 30, "Save History");
        saveButton.setBackground(Color.GRAY);

        historyArea = new JTextArea();
        historyArea.setFont(font15);
		historyArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(historyArea);
        scroll.setBounds(340, 40, 440, 300);
        background.add(scroll);

        this.setVisible(true);
    }

    JLabel createLabel(int x, int y, int w, int h, String text) {//constructor
        JLabel l = new JLabel(text);
        l.setBounds(x, y, w, h);
        l.setFont(font15);
        l.setForeground(Color.BLACK);
        this.add(l);
        return l;
    }

    JTextField createTextField(int x, int y, int w, int h, String text) {//constructor
        JTextField t = new JTextField(text);
        t.setBounds(x, y, w, h);
        t.setFont(font15);
        t.addActionListener(this);
        this.add(t);
        return t;
    }

    JButton createButton(int x, int y, int w, int h, String text) {//constructor
        JButton b = new JButton(text);
        b.setBounds(x, y, w, h);
        b.setFont(font15);
        b.setBackground(new Color(66, 245, 179));
        b.addActionListener(this);
        this.add(b);
        return b;
    }

    public void actionPerformed(ActionEvent e) {//button fuction
        if (e.getSource() == convertButton) {
            String inputText = inputField.getText();
            String type = (String) typeBox.getSelectedItem();
            if (!inputText.isEmpty()) {
                try {
                    double input = Double.parseDouble(inputText);
                    Conversion c = new Conversion(type, input);
                    outputField.setText(c.getFormattedResult());
                    history.add(c);
                    historyArea.append(c.getInfo());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Invalid input!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Enter a value!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } else if (e.getSource() == clearButton) {
            inputField.setText("");
            outputField.setText("");
        } else if (e.getSource() == saveButton) {
            FileIO.saveHistory(history);
        }
    }
}