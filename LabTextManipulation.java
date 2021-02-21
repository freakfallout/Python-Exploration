package textManipulation;

import java.util.*;

public class LabTextManipulation 
{
	public static void main(String[] args) 
	{
		ArrayList<String> parks = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);
		StringBuilder nationalParks = new StringBuilder(100);
		String input;
		
		while (true)
		{
			System.out.print("Enter a National Park or 'done' to stop: ");
			input = scanner.nextLine();
			
			if (input.toLowerCase().equals("done"))
				break;
			
			parks.add(updateSpelling(input));
			
		}
	
		for (int i = 0; i < parks.size(); i++) 
		{
			nationalParks.append(parks.get(i));
			
			if (i < parks.size() - 1)
				nationalParks.append( "| " );
		}

		System.out.println(nationalParks);
		
	}

	private static String updateSpelling(String input)
	{
		StringBuilder newString = new StringBuilder();

		int length = 0;
		String[] splitString = input.split(" ");
		
		for (int j = 0; j < splitString.length; j++) 
		{
			if (splitString[j].equals(""))
				continue;

			length = newString.length();
			newString.append(splitString[j].toLowerCase() + " ");
			newString.setCharAt(length, Character.toUpperCase(splitString[j].charAt(0)));
			
		}
		
		return newString.toString();
	}
	
}
