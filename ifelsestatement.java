package sahil;

public class ifelsestatement {

	public static void main(String[] args) {
	char gender1='m';
	//char gender2='f';
	int m=20;

	if(gender1=='m')
	{
		System.out.println("Male Pessenger");
			if(m<2)
			{
				System.out.println("Free");
				}
					if(m>2 && m<12 ) {
						System.out.println("half");
					}
						if(m>18) {
							System.out.println("Adult");
							}
								if(m>65) {
									System.out.println("Sr Citizen");
									}
						}
	else
	{
	System.out.println("Female Pessenger");
	}
	}

	}

