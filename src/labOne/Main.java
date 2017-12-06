package labOne;

public class Main {

    public static void main(String[] args){

        //In scenario 1, catch the specific exception as indicated by the error

        try {
            String input = "is";
            int user_input = Integer.parseInt(input);
        }catch (NumberFormatException nfe){
            System.out.println(nfe.getMessage());
        }catch (Exception e) { //2.	In scenario 2, catch a general exception

            System.out.println("Check the Number Format Error");
        }

    }

}
