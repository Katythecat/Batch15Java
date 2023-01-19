package RandomPractice;

public class Grades {
    public static void main(String[] args) {
            String [][] namesAndGrades={{"Daniel","Nelson","Saud","Zafar"},
                    {"A","B","C","D"},
            };
            for(int i=0;i< namesAndGrades.length;i++){
                for(int j=0;j< namesAndGrades[i].length;j++){
                    if(namesAndGrades[i][j].equals("A")||namesAndGrades[i][j].equals("B")){
                        System.out.println(namesAndGrades[0][j]+" Has either an A or B grade ");
                    }
                }
                System.out.println();
            }
        }
    }


