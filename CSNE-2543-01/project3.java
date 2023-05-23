package SP2023;

class project3
{
    
    // Max Function For Array
    public static int MaxArray(int dataset[])
    {
        int BigV = 0;
        for (int i = 0; i < dataset.length; i++)
        {
            if (dataset[i]> BigV)
            {
                BigV = dataset[i];  
            }
        }
        return BigV;
    }

    //Function Ends

    public static void main(String[] args)
    {
        
        //BC TEST CODE
        System.out.println("Hello! Starting program now...");
        
        //Knapscack Problem
        // Value array

        int []  Values = {160,60,45,60,40,30,10,70,30,15,10,40,70,75,80,20,12,50,10};

        // Weight array

        int []  Weight = {50,15,68,27,39,23,52,11,32,24,48,73,42,43,22,7,18,4,30};

        // Names array

        String [] Names = {"sandwich","glucose","tin","banana","apple",
"cheese","beer","suntan cream","camera","T-shirt","trousers",
"umbrella","waterproof trousers","waterproof overclothes"
,"note-case","sunglasses","towel","socks","book"};

        // Variables to keep track of weight and value
        int weighttotal = 0;
        int valuetotal = 0;

        // Loops throughs all three list starting with Values and return the highest value 
        for (int i = 0; i <= Values.length; i++)
        {
            
            //BC TEST CODE
            System.out.println("- Entering FOR Loop [" + i + "], of ["+ Values.length +"] -");
            
            if (Values[i] == MaxArray(Values))
            {
                
                //BC TEST CODE
                System.out.println("- Entering IF[" + Values[i] + " = [" + MaxArray(Values) + "] -");
                
                valuetotal += Values[i];
                
                // Adds to total Value

                System.out.println("Max Value " + Values[i]);
                System.out.println("Current Value Total " + valuetotal);

                // Sets max item to zero to avoid loop
                Values[i] = 0;

                // Incremets weight

                weighttotal += Weight[i];

                // print weight of object

                System.out.println("Weight of Object " + Weight[i]);

                // print weighttotal

                System.out.println("Current Weight Total " + weighttotal);

                // print name of item

                System.out.println("Name Of Item Value " + Names[i]);

                if (weighttotal >= 400) 
                {
                    System.out.println("Maximum Capacity");
                    System.out.println("Max Weight " + weighttotal);
                    System.out.println("Max Value " + valuetotal);
                }

            }
        }

    }
}


    




