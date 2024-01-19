public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  

public static setup() {
for(int i = 2; i < e.length()-10; i++){
       String num = e.substring(i, i+10);
       double dnum = Double.parseDouble(num);
	if(isPrime(dnum) == true){
		System.out.println(dnum+"!");
		break;
	}
}
}

	//Finish this function
public boolean isPrime(double d){
	if(dnum < 2){
   		return false;
	}
for(int i = 2; i <= Math.sqrt(dnum) i++){
	if(dnum 5 1 == 0){
		return false;
	}
}
return true;
}

