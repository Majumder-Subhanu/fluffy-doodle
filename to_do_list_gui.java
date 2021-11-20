import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class to_do_list_gui extends JPanel {
    private JButton insert;
    private JButton clear_all;
    private JTextField task_input;
    private JTextArea task_list;
    private JLabel label;
    private int task_no = 1;
    String url = "/home/subhanu/Documents/task_list.txt";
    File file = new File(url);

    public to_do_list_gui() {
        // construct components
        insert = new JButton("INSERT");
        clear_all = new JButton("CLEAR");
        task_input = new JTextField(5);
        task_list = new JTextArea(5, 5);
        task_list.setEditable(false);
        label = new JLabel("TASK - LIST");

        // adjust size and set layout
        setPreferredSize(new Dimension(515, 352));
        setLayout(null);

        // add components
        add(insert);
        add(clear_all);
        add(task_input);
        add(task_list);
        add(label);

        // set component bounds (only needed by Absolute Positioning)
        insert.setBounds(5, 10, 100, 20);
        clear_all.setBounds(5, 35, 100, 20);
        task_input.setBounds(110, 10, 400, 45);
        task_list.setBounds(5, 80, 505, 270);
        label.setBounds(5, 55, 100, 25);

        // ActionListners
        try {
            prev_task();
        } catch (java.io.IOException ioe) {
            ioe.printStackTrace();
        }
        insert.addActionListener(e -> {
            try {
                list_task();
            } catch (java.io.IOException ioe) {
                ioe.printStackTrace();
            }
        });
        clear_all.addActionListener(e -> clear_all_list());
    }

    void prev_task() throws java.io.IOException {
        String url = "/home/subhanu/Documents/task_list.txt";
        File file = new File(url);
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            task_list.append("Task : " + task_no + " " + sc.nextLine() + "\n");
            task_no++;
        }
        sc.close();
    }

    void list_task() throws java.io.IOException {
        String task = task_input.getText();
        try (FileWriter fw = new FileWriter(file, true); BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(task);
            bw.newLine();
        }
        task_list.append("Task : " + task_no + " " + task + "\n");
        task_no++;
        task_input.setText("");
    }

    void clear_all_list() {
        task_list.setText("");
        file.delete();
        file = new File(url);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JAVA TO-DO LIST");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        new to_do_list_gui();
        frame.getContentPane().add(new to_do_list_gui());
        frame.pack();
        frame.setVisible(true);

    }
}
