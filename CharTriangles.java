package loopsExamples;

public class CharTriangles {
	
//	*				*		00	01	02	03	04			*		1  star		 2 stars		**
//	**			   **		10	11	12	13	14		   ***		3 stars		 4 stars	   ****		
//	***			  ***		20	21	22	23	24		  *****		5 stars		 6 stars	  ******
//	****		 ****		30	31	32	33	34		 *******	7 stars		 8 stars	 ********
//	*****		*****		40	41	42	43	44		*********	9 stars		10 stars	**********

	public static void main(String[] args) {
		
		System.out.println("Left Aligned:");
		leftAligned('*', 8);

		System.out.println("Left Aligned:");
		leftAligned('*', 5);
		
		System.out.println();
		
		System.out.println("Right Aligned:");
		rightAligned('#', 7);

		System.out.println("Right Aligned:");
		rightAligned('#', 4);

		System.out.println();
		
		System.out.println("Centered:");
		centered('$', 10);

		System.out.println("Centered:");
		centered('$', 3);
		
	}
	
//	r; k = 2r
//	00 01 02 03 04 05 06 07 08 09
//	10 11 12 13 14 15 16 17 18 19
//	20 21 22 23 24 25 26 27 28 29
//	30 31 32 33 34 35 36 37 38 39
//	40 41 42 43 44 45 46 47 48 49
	
	public static void centered(char c, Integer height) {
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < i + height; j++) {
				if (i + j < height - 1)
					System.out.print(' ');
				else 
					System.out.print(c);
			}
			System.out.println();
		}
		
	}
	

	public static void rightAligned(char c, Integer height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height; j++) {
				if (i + j > height - 1 - 1)
					System.out.print(c);
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}
	
	public static void leftAligned(char c, Integer height) {
		for (int i = 0; i < height; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	

}
