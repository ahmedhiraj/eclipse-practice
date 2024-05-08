import java.util.Scanner;
class AlphabetPosition{ //starting of class
    public static void main(String[] args){ //starting of the main function
        Scanner sc=new Scanner(System.in); //declaring an object of the Scanner class
        String input,output=""; 
        char c;
        int i,len;
        System.out.println("ENTER A SENTENCE.");
        input=sc.nextLine().trim(); //accepting the input
        len=input.length();
        for(i=0;i<len;i++){ //outer for loop to traverse each character
            c=input.charAt(i);
            output+=c;
            if(c==' '){
                while(input.charAt(i)==' '){ //inner while loop to skip through repeated spaces
                    i++;
                } //end of while loop
                i--; //decrementing i by 1 so that the immediate character after space is taken
            }
        } //end of for loop
        System.out.println(output); //printing the result
    } //closing of main function
} //closing of class