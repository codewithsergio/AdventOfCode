import java.io.File;
import java.util.Objects;
import java.util.Scanner;

public class Day1Trebuchet {
    public void solve(){
        File file = new File("src/data.txt");
        Scanner input = new Scanner(System.in);
        try{
            input = new Scanner(file);
        } catch(Exception e){
            System.out.println(e);
            System.exit(1);
        }
        int sum = 0;
        while(input.hasNextLine()){
            String currentLine = input.nextLine();
            char firstNum = '\0';
            char secondNum = '\0';
            for(char character: currentLine.toCharArray()){
                if(Character.isDigit(character)){
                    if(firstNum == '\0')
                        firstNum = character;
                    else
                        secondNum = character;
                }
            }
            if(secondNum == '\0') secondNum = firstNum;
            sum += Character.getNumericValue(firstNum)*10 + Character.getNumericValue(secondNum);
        }
        System.out.println(sum);
    }
}
