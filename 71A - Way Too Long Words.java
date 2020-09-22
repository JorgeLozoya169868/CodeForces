import java.util.Scanner;
/*"localization" will be spelt as "l10n", and "internationalization» will be spelt as "i18n".*/
public class Main {
  public static void main(String[] args) {
 boolean flagWhile = true;
 int n=1;
 do{
   Scanner sc = new Scanner(System.in);
    int cont = 0;
    if(sc.hasNextLine()){
        String wordString = sc.nextLine();
        char[] word = wordString.toCharArray();
        
        
        boolean flag = true;
        if(wordString.equals("")){
            flagWhile=false;
            flag=false;
            sc.close();
        }
        for(int i=0; i<word.length;i++)
        {
        if (new String(word).contains("0")||new String(word).contains("1")||
                  new String(word).contains("2")||new String(word).contains("3")
                  ||new String(word).contains("4")||new String(word).contains("5")
                  ||new String(word).contains("6")||new String(word).contains("7")
                  ||new String(word).contains("8")||new String(word).contains("9")) {
        // do something
            i=word.length+1;
            flag= false;
        }
        if (word.length < 10 && flag==true){
            flag=false;
            System.out.println(wordString);
            i=word.length+1;
        }
          else if(i>0 && i<word.length-1){
            cont++;
          }
        }
        if(flag==true)
        System.out.println(word[0]+""+cont+""+word[word.length-1]);
    }
    else{
    sc.close();
    flagWhile=false;
    }
    n++;
}while(flagWhile && n<100);
System.exit(0);

  }
}