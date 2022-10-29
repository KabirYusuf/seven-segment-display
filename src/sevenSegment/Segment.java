package sevenSegment;

public class Segment {

    private static final int[][] fill = new int[5][4];


    public static void main(String[] args) throws InterruptedException, IllegalAccessException {

        //myInput(1,0,1,1,1,0,1);
        inputValue("11101101");
        display();

    }
    static void fillA() throws InterruptedException {

        fill[0][0] = 1;
        fill[0][1] = 1;
        fill[0][2] = 1;
        fill[0][3] = 1;

    }

    static void fillB() throws InterruptedException {

        fill[0][3] = 1;
        fill[1][3] = 1;
        fill[2][3] = 1;
    }

    static void fillC() throws InterruptedException {

        fill[2][3] = 1;
        fill[3][3] = 1;
        fill[4][3] = 1;


    }

    static void fillD() throws InterruptedException {

        fill[4][0] = 1;
        fill[4][1] = 1;
        fill[4][2] = 1;
        fill[4][3] = 1;

    }

    static void fillE() throws InterruptedException {

        fill[2][0] = 1;
        fill[3][0] = 1;
        fill[4][0] = 1;

    }

    static void fillF() throws InterruptedException {


        fill[0][0] = 1;
        fill[1][0] = 1;
        fill[2][0] = 1;



    }

    static void fillG() throws InterruptedException {

        fill[2][0] = 1;
        fill[2][1] = 1;
        fill[2][2] = 1;
        fill[2][3] = 1;


    }

    static void  fillAll(){
        fill[0][0] = 1;
        fill[0][1] = 1;
        fill[0][2] = 1;
        fill[0][3] = 1;
        fill[1][3] = 1;
        fill[2][3] = 1;
        fill[3][3] = 1;
        fill[4][3] = 1;
        fill[4][0] = 1;
        fill[4][1] = 1;
        fill[4][2] = 1;
        fill[2][0] = 1;
        fill[3][0] = 1;
        fill[1][0] = 1;
        fill[2][1] = 1;
        fill[2][2] = 1;
    }

    static void display() throws InterruptedException {
        for (int[] i : fill) {
            for (int j : i) {
                if (j == 1){
                    System.out.print("# ");
                }
                else System.out.print("  ");

                Thread.sleep(300);
            }
            System.out.println();
        }
    }

    static void inputValue(String value) throws IllegalAccessException, InterruptedException {

        if(value.length() > 9){
            value = value.substring(0, 9);
        }

        char[] array = value.toCharArray();
        for(char i : array){
            if(!(i == '1' || i == '0')){
                throw  new IllegalAccessException("Input must be 0 and 1");
            }
        }

        for (int i = 0; i < value.length(); i++){
            if(value.charAt(i) == '1' && value.charAt(7) == '1' ){
                switch (i){

                    case 0 -> fillA();
                    case 1 -> fillB();
                    case 2 -> fillC();
                    case 3 -> fillD();
                    case 4 -> fillE();
                    case 5 -> fillF();
                    case 6 -> fillG();

                }
            }
        }

    }

    static  void myInput(int one, int two, int three, int four, int five, int six, int seven) throws InterruptedException {
        if(one == 1){
            fillA();
        }
        if(two == 1){
            fillB();
        }
        if(three == 1){
            fillC();
        }
        if(four == 1){
            fillD();
        }
        if(five == 1){
            fillE();
        }
        if(six == 1){
            fillF();
        }
        if(seven == 1){
            fillG();
        }
    }

}





