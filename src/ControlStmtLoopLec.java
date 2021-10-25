public class ControlStmtLoopLec {

   public static void main(String[]args)  {

//       boolean trueBool = true;
//       boolean otherTrueBool = true;
//       boolean falseBool = false;
//
//       System.out.println(trueBool && otherTrueBool); //true
//       System.out.println(trueBool && falseBool); //false

//       String myName = "Kenneth";
//
//       //DO THIS
//       System.out.println("myName == \"Kenneth\" = " + myName.equals("Kenneth"));
//
//        //DO **NOT** DO THIS
//       System.out.println("myName == \"Kenneth\" = " + myName == ("Kenneth"));


       //Weather IFs

       boolean isSunny = true;
       boolean hasUmbrella = false;

       if(!isSunny && hasUmbrella) {
           System.out.println("You're prepared and ready to go!");
       } else {
           System.out.println("Go check the weather!");
       }


       int caseSwitch = 1;

       switch(caseSwitch) {
           case 1:
               System.out.println("Case 1.");
               break;

           case 2:
               System.out.println("Case 2.");
               break;
       }

       char userInput = 'n';

       do {
           System.out.println("du hast");
       } while  (userInput == 'y');

       while(userInput == 'y') {
           System.out.println("du hast again! Good song");
       }


       //For Loop

       for(int i = 1; i < 100; i++) {
           System.out.println(i);
           if (i == 5) {
               break;
           }
       }





   }

}
