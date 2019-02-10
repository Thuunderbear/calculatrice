import java.util.Scanner; //class pour Scanner

public class Calculatrice {

	public static void main(String[] args) {
		boolean error = false;
		float result = 0;
		char op;
		while(true && error == false) //commentaire
		{

			Scanner sc = new Scanner(System.in); 
			System.out.println("Bienvenu dans la calculatrice");
			
			System.out.println("Premier nombre ?");
			float nbr1 = sc.nextFloat();
			
			System.out.println("deuxieme nombre ?");
			float nbr2 = sc.nextFloat();
	
			
			sc.nextLine(); // permet de vider la ligne
			System.out.println("Choisir la prochaine opération");
			String str = sc.nextLine();
			op = str.charAt(0); //permet de recuperer le premier car
			
			switch(op)
			{
			case '*':
				result = nbr1 * nbr2;
				break;
			case '/':
				result = nbr1 / nbr2;
				break;
			case '+':
				result = nbr1 + nbr2;
				break;
			case'-':
				result = nbr1 - nbr2;
				break;
			default:
				error = true;
			}
			
			if (error == true)
			{
				System.out.println("Une erreur est survenue");
			}
			else
			{
				System.out.println("Le resultat de "+nbr1+op+nbr2+" = "+result);
			}
		
		
		}
	}

}
