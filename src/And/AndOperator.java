package And;

public class AndOperator {
    public static void main(String[] args) {
        int gradeA = 100;
        int gradeB = 80;
        int gradeC = 70;
        int grageF = 69;

        int scoreTim = 89;
        int scoreTam = 50;
        int scoreTom = 75;

        // print out Tim score
        if (scoreTim == gradeA) {
            System.out.println("Tim got an A");
        } else if (scoreTim < gradeA && scoreTim >= gradeB) {
            System.out.println("Tim got an B");
        } else if (scoreTim < gradeB && scoreTim >= gradeC) {
            System.out.println("Tim got an C");
        } else {
            System.out.println("Tim got an F");
        }

        // print out Tom score
        if (scoreTom == gradeA) {
            System.out.println("Tom got an A");
        } else if (scoreTom < gradeA && scoreTom >= gradeB) {
            System.out.println("Tom got an B");
        } else if (scoreTom < gradeB && scoreTom >= gradeC) {
            System.out.println("Tom got an C");
        } else {
            System.out.println("Tom got an F");
        }

        // print out Tam score
        if (scoreTam == gradeA) {
            System.out.println("Tam got an A");
        } else if (scoreTam < gradeA && scoreTam >= gradeB) {
            System.out.println("Tam got an B");
        } else if (scoreTam < gradeB && scoreTam >= gradeC) {
            System.out.println("Tam got an C");
        } else {
            System.out.println("Tam got an F");
        }
    }
}