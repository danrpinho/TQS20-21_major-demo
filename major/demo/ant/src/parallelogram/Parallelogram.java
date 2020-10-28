package parallelogram;

public class Parallelogram {

	public static enum Type {
		INVALID, RHOMBUS, RECTANGLE, SQUARE, PARALLELOGRAM
	};
	
	public static Type classify(int s1, int s2, double d) {
        // s1 < 0
		if (s1 <= 0 || s2 <= 0 || d <= 0)
            return Type.INVALID;

        int equal = 0;
        if (s1 == s2)
            equal++;;

        // ensures parallelogram's diagonals fit inside of the polygon
        if (s1 + s2 <= d || s1 + d <= s2 || s2 + d <= s1)
            return Type.INVALID;
        
        // checks if angle between s1 and s2 is 90 degrees
        if (d*d == s1 * s1 + s2 * s2){
            if (equal == 1)
                return Type.SQUARE;
            else if (equal == 0)
                return Type.RECTANGLE;
        }
        
        // assigns remaining types
        if (equal == 1)
            return Type.RHOMBUS;
        else if (equal == 0)
            return Type.PARALLELOGRAM;
        
        return Type.INVALID;
	}
}
