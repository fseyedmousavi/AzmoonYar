package SaveLoad;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.*;

public class Loader {

    private ArrayList<String> exams;
    private ArrayList<Double> grades;

    public ArrayList load(String username, String mode) {
        exams = new ArrayList<>();
        File file;
        if (mode == "m") {
            file = new File("managersList\\" + username + ".txt");
        } else {
            file = new File("studentsList\\" + username + ".txt");
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st = br.readLine();
            st = br.readLine();
            st = br.readLine();
            if (mode == "s") {
                st = br.readLine();
            }
            while ((st = br.readLine()) != null) {
                exams.add(st);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exams;
    }

    public ArrayList studentsInExam(String examName, String musername) {
        ArrayList<String> students = new ArrayList<>();
        File f = new File("Exams\\" + examName + " " + musername + "\\students.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String str = br.readLine();
            while (str != null) {
                students.add(str);
                str = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public void WholeGrade(String examName, String musername) {
        ArrayList<String> susernames = studentsInExam(examName, musername);
        grades = new ArrayList<>();
        for (int j = 0; j < susernames.size(); j++) {
            File f = new File("Exams\\" + examName + " " + musername + "\\Answers\\" + susernames.get(j) + "\\");
            int count = f.list().length - 1;
            double sum = 0;
            File[] files = f.listFiles();
            BufferedReader br;
            try {
                for (int i = 0; i < files.length; i++) {
                    if (files[i].getName().contains("TF.txt") || files[i].getName().contains("Test.txt")) {
                        br = new BufferedReader(new FileReader(files[i]));
                        if (br.readLine().equals("true")) {
                            sum += 20;
                        }
                    } else if (files[i].getName().equals("grade.txt")) {
                        Scanner scanner = new Scanner(files[i]);
                        while (scanner.hasNext()) {
                            if (scanner.hasNextDouble()) {
                                sum += scanner.nextDouble();
                            } else {
                                scanner.next();
                            }
                        }
                    }
                }
                grades.add(sum / count);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        File file = new File("Exams\\" + examName + " " + musername + "\\" + "wholeGrades.txt");
        try {
            FileWriter fw = new FileWriter(file);
            for (int i = 0; i < susernames.size(); i++) {
                fw.write(susernames.get(i) + "\r\n" + grades.get(i) + "\r\n");
            }
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList WholeGrades(String examName, String musername) {
        ArrayList<String> susernames = studentsInExam(examName, musername);
        grades = new ArrayList<>();
        for (int j = 0; j < susernames.size(); j++) {
            File f = new File("Exams\\" + examName + " " + musername + "\\Answers\\" + susernames.get(j) + "\\");
            int count = f.list().length - 1;
            double sum = 0;
            File[] files = f.listFiles();
            BufferedReader br;
            try {
                for (int i = 0; i < files.length; i++) {
                    if (files[i].getName().contains("TF.txt") || files[i].getName().contains("Test.txt")) {
                        br = new BufferedReader(new FileReader(files[i]));
                        if (br.readLine().equals("true")) {
                            sum += 20;
                        }
                    } else if (files[i].getName().equals("grade.txt")) {
                        Scanner scanner = new Scanner(files[i]);
                        while (scanner.hasNext()) {
                            if (scanner.hasNextDouble()) {
                                sum += scanner.nextDouble();
                            } else {
                                scanner.next();
                            }
                        }
                    }
                }
                grades.add(sum / count);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        File file = new File("Exams\\" + examName + " " + musername + "\\" + "wholeGrades.txt");
        try {
            FileWriter fw = new FileWriter(file);
            for (int i = 0; i < susernames.size(); i++) {
                fw.write(susernames.get(i) + "\r\n" + grades.get(i) + "\r\n");
            }
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return grades;
    }

    public ArrayList AvarageGrades(ArrayList<String> examName, String musername) {
        for (int i = 0; i < examName.size(); i++) {
            WholeGrade(examName.get(i), musername);
        }
        ArrayList<Double> avarages = new ArrayList<>();
        for (int i = 0; i < examName.size(); i++) {
            ArrayList<String> susernames = studentsInExam(examName.get(i), musername);
            int count = susernames.size();
            double sum = 0;
            File f = new File("Exams\\" + examName.get(i) + " " + musername + "\\" + "wholeGrades.txt");
            try {
                Scanner scanner = new Scanner(f);
                for (int k = 0; scanner.hasNext(); k++) {
                    if (scanner.hasNextDouble() && k % 2 != 0) {
                        sum += scanner.nextDouble();
                    } else {
                        scanner.next();
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
            }
            avarages.add(sum / count);
        }
        return avarages;
    }

    public ArrayList deletedstudents(String examName, String musername) {
        File file = new File("Exams\\" + examName + " " + musername + "\\" + "deleted.txt");
        ArrayList<String> deleted = new ArrayList<>();
        try {
            if (file.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String str;
                str = br.readLine();
                while (str != null) {
                    deleted.add(str);
                    str = br.readLine();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return deleted;
    }
}
