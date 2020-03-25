package task.tdd;

public class RemoveAChar {

	public String remove(String string) {
		if(string.charAt(0)=='A' && string.charAt(1)=='A') {
			string=string.substring(2);
			}
		else if(string.charAt(0)=='A')
		{
			string=string.substring(1);
		}
		return string;
	}
	}