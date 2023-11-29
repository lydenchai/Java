import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        double attendance, midterm, assignment, finalExam;
        String att, mid, ass, fin;
        att = JOptionPane.showInputDialog("Input attendance: ");
        attendance = Double.parseDouble(att);
        mid = JOptionPane.showInputDialog("Input midterm: ");
        midterm = Double.parseDouble(mid);
        ass = JOptionPane.showInputDialog("Input assignment: ");
        assignment = Double.parseDouble(ass);
        fin = JOptionPane.showInputDialog("Input final exam: ");
        finalExam = Double.parseDouble(fin);

        double total = attendance + midterm + assignment + finalExam;
        String message = "Student Result :";
        message += "\n-------------";
        message += "\nAttendance : " + attendance;
        message += "\nMidterm : " + midterm;
        message += "\nAssignment : " + assignment;
        message += "\nFinal Exam : " + finalExam;
        message += "\nTotal score: " + total;
        message += "\nSo,"
                + (total >= 50 ? "He/She is Passed." : "He/She is Failed.");
        message += "\n" + (total <= 49 ? 'F'
                : total <= 59 ? 'E' : total <= 69 ? 'D' : total <= 79 ? 'C' : total <= 89 ? 'B' : 'A');

        JOptionPane.showMessageDialog(null, message);

    }
    // 1234567890-/:;()$&@".,?!'
}
