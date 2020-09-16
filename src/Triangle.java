
class Triangle {
	static float findArea(float a, float b, float c) 
    { 
        // Length of sides must be positive and sum of any two sides 
        // must be smaller than third side. 
        if (a < 0 || b < 0 || c <0 || (a+b <= c) || 
            a+c <=b || b+c <=a) 
        { 
            System.out.println("Not a valid triangle");
            return 0.0f;
        } 
        
        float s = (a+b+c)/2; 
        return (float)Math.sqrt(s*(s-a)*(s-b)*(s-c)); 
    } 
}
