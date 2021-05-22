import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

class Maximum {
  public static void main(String[] args) {
      Integer[] numList = {1, 2, 3, 12, 4, 5};
      Integer max = maximum(numList);
      printNumberInWord(6);
      checkOddEven(max);
  }

  public static Integer maximum(Integer[] numList) {
      Integer currentMax = 0;
      for(int i = 0; i < numList.length; i++){
          if(numList[i] > currentMax){
		currentMax = numList[i];
	  }
      }
      return currentMax;
  }

  public static void printNumberInWord(int num){
	switch(num){
	        case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
		        break;
		case 3:
 			System.out.println("THREE");
   		        break;
	        case 4:
	                System.out.println("FOUR");
		        break;
		case 5:
		        System.out.println("FIVE");
		        break;
	        case 6:
		        System.out.println("SIX");
       		        break;
                case 7:
		        System.out.println("SEVEN");
		        break;
	        case 8:
		        System.out.println("EIGHT");
		        break;
	        case 9:
		        System.out.println("THREE");
		        break;
       	        default:
		        System.out.println(">10");
	}
  }

  public static void checkOddEven (int num){
	if (num % 2 == 0){
		System.out.println("Even Number");
	}
	else{
		System.out.println("Odd Number");
	}
 }

}
