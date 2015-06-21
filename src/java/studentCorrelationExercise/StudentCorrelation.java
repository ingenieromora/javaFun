package studentCorrelationExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem Statement

 You are given the scores of N students in three different subjects - Mathematics,*Physics* and Chemistry; all of which have been graded on a scale of 0 to 100. Your task is to compute the Pearson product-moment correlation coefficient between the scores of different pairs of subjects (Mathematics and Physics, Physics and Chemistry, Mathematics and Chemistry) based on this data. This data is based on the records of the CBSE K-12 Examination - a national school leaving examination in India, for the year 2013.

 Pearson product-moment correlation coefficient

 This is a measure of linear correlation described well on this Wikipedia page. The formula, in brief, is given by:

 where x and y denote the two vectors between which the correlation is to be measured.

 Input Format

 The first row contains an integer N.
 This is followed by N rows containing three tab-space ('\t') separated integers, M P C corresponding to a candidate's scores in Mathematics, Physics and Chemistry respectively.
 Each row corresponds to the scores attained by a unique candidate in these three subjects.

 nput Constraints

 1 <= N <= 5 x 105
 0 <= M, P, C <= 100

 Output Format

 The output should contain three lines, with correlation coefficients computed
 and rounded off correct to exactly 2 decimal places.
 The first line should contain the correlation coefficient between Mathematics and Physics scores.
 The second line should contain the correlation coefficient between Physics and Chemistry scores.
 The third line should contain the correlation coefficient between Chemistry and Mathematics scores.

 */
public class StudentCorrelation {
    final String SCORES_SEPARATOR = "\t";

    private class IntermediateResults {
        private double x;
        private double y;
        private double xy;
        private double xx;
        private double yy;
        private int count;

        public IntermediateResults(){
            xx = 1D ;
            xy = 1D ;
            yy = 1D ;
            count = 0 ;
        }

        public void calculateParcialResults(Double inputX, Double inputY){
            x = x + inputX;
            y = y + inputY;
            xx = xx + inputX * inputX ;
            xy = xy + inputX * inputY ;
            yy = yy + inputY * inputY ;
            count = count + 1 ;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public double getXy() {
            return xy;
        }

        public double getXx() {
            return xx;
        }

        public double getYy() {
            return yy;
        }

        public int getCount() {
            return count;
        }
    }

    /**
     * Read from StdIn and print the correlation from three diferent subjects.
     */
    public void printCorrelation(){
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        try{
            String outputString = calculateCorrelation(br);
            System.out.println(outputString);
        }catch (IOException io){
            io.printStackTrace();
        }
    }

    protected String calculateCorrelation(BufferedReader br) throws IOException {
            String input;
            IntermediateResults parcialResultsMathPhy = new IntermediateResults();
            IntermediateResults parcialResultsMathChem = new IntermediateResults();
            IntermediateResults parcialResultsPhyChem = new IntermediateResults();
            while((input=br.readLine())!=null){
                String[] cells = input.split(SCORES_SEPARATOR);
                if( cells.length == 3 && !cells[0].isEmpty() && !cells[1].isEmpty() && !cells[2].isEmpty()){
                    Double mathCell = new Double(cells[0]);
                    Double physicCell = new Double(cells[1]);
                    Double chemCell = new Double(cells[2]);
                    parcialResultsMathPhy.calculateParcialResults(mathCell, physicCell);
                    parcialResultsMathChem.calculateParcialResults(mathCell, chemCell);
                    parcialResultsPhyChem.calculateParcialResults(physicCell, chemCell);
                }
            }

            Double corrMathPhy = reducePartialResults(parcialResultsMathPhy);
            Double corrMathChem = reducePartialResults(parcialResultsMathChem);
            Double corrPhyChem = reducePartialResults(parcialResultsPhyChem);

            corrMathPhy = (double)Math.round(corrMathPhy * 100) / 100;
            corrMathChem = (double)Math.round(corrMathChem * 100) / 100;
            corrPhyChem = (double)Math.round(corrPhyChem * 100) / 100;

            return corrMathPhy.toString() + '\n' + corrPhyChem + '\n' + corrMathChem;
    }

    private double reducePartialResults(IntermediateResults partialResults){
        int n = partialResults.getCount();
        double x = partialResults.getX();
        double y = partialResults.getY();
        double xx = partialResults.getXx();
        double xy = partialResults.getXy() ;
        double yy = partialResults.getYy() ;

        double numerator = n * xy - (x * y);
        double denominator1 = Math.sqrt(n * xx - (Math.pow(x, 2.0d)));
        double denominator2 = Math.sqrt(n * yy - (Math.pow(y, 2.0d)));
        double denominator = denominator1 * denominator2;
        double corr = numerator / denominator;
        return corr;
    }

    public static void main(String[] args) {

        StudentCorrelation solution = new StudentCorrelation();
        solution.printCorrelation();

    }



}
