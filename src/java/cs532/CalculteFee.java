/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs532;

/**
 *
 * @author shraddha
 */
public class CalculteFee {

    private String subject1;
    private String subject2;
    private String subject3;
    private String subject4;
    private int total = 0;

    public CalculteFee() {
        
    }


    
    public void setSubject1(String subject1) {
        this.subject1 = subject1;
        
    }

    public void setSubject2(String subject2) {
        this.subject2 = subject2;
        System.out.println(subject2);
    }

    public void setSubject3(String subject3) {
        this.subject3 = subject3;
        System.out.println(subject3);
    }

    public void setSubject4(String subject4) {
        this.subject4 = subject4;
        System.out.println(subject4);
    }

    public String getSubject1() {
        return subject1;
    }

    public String getSubject2() {
        return subject2;
    }

    public String getSubject3() {
        return subject3;
    }

    public String getSubject4() {
        return subject4;
    }

    public int CalculteTutionFee() {
        if ((subject1.matches("Chemistry")) || (subject2.matches("Chemistry")) || (subject3.matches("Chemistry")) || (subject4.matches("Chemistry"))) {
            //selectedsub += "Chemistry +";
            total += 900;
        }
        if ((subject1.matches("Physics")) || (subject2.matches("Physics")) || (subject3.matches("Physics")) || (subject4.matches("Physics"))) {
            //selectedsub += "Physics +";
            total += 900;
        }

        if ((subject1.matches("Java")) || (subject2.matches("Java")) || (subject3.matches("Java")) || (subject4.matches("Java"))) {
            //selectedsub += "Java +";
            total += 1000;
        }
        if ((subject1.matches("Algorithm")) || (subject2.matches("Algorithm")) || (subject3.matches("Algorithm")) || (subject4.matches("Algorithm"))) {
            //selectedsub += "Algorithm +";
            total += 1000;
        }
        if ((subject1.matches("Capstone")) || (subject2.matches("Capstone")) || (subject3.matches("Capstone")) || (subject4.matches("Capstone"))) {
            //selectedsub += "Capstone";
            total += 1000;
        }
        
        return total;
    }
    
    

}
