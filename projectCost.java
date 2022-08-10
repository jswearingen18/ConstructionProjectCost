import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // declare and instantiate a Scanner
		Scanner in = new Scanner(System.in);
        // declare and initialize variables
		double road_length = 0;
		int lane_count = 0;
		double depth = 0;
		int days = 0;
		double asphalt = 0;
		double truckload = 0;
		double stoplights = 0;
		double pipes = 0;
		double crew = 0;
		double asphaltcost = 0;
		double stoplightcost = 0;
		double pipecost = 0;
		double laborcost = 0;
		double projectcost = 0;
		
		// collect inputs
		System.out.print("Length of road project (miles) : ");
		road_length = in.nextDouble();
        System.out.print("Number of lanes                : ");
        lane_count = in.nextInt();
        System.out.print("Depth of asphalt (inches)      : ");
        depth = in.nextDouble();
        System.out.print("Days to complete project       : ");
        days = in.nextInt();
        
        // compute required values
        asphalt = Math.ceil((road_length * 5280) * (lane_count * 12) * (depth / 12) * 150 / 10000);
        truckload = Math.round(asphalt);
        stoplights = Math.floor(road_length) * 2 + Math.floor(road_length) * lane_count;
        pipes = Math.ceil(road_length * 5280 / 24);
        crew = Math.ceil((50 * road_length * lane_count) / days);
        asphaltcost = (truckload * 5) * 200;
        stoplightcost = stoplights * 25000;
        pipecost = pipes * 500;
        laborcost = crew * days * 8 * 25;
        projectcost = asphaltcost + stoplightcost + pipecost + laborcost;
        
        // display results
        System.out.println("=== Amount of materials needed ===");
        System.out.println("Truckloads of Asphalt          : " +Math.round(asphalt));
        System.out.println("Stoplights                     : " + Math.round(stoplights));
        System.out.println("Conduit Pipes                  : " + Math.round(pipes));
        System.out.println("Crew members needed            : " + Math.round(crew));
        System.out.println("=== Cost of Materials ============");
        System.out.println("Cost of Asphalt                : $"+String.format("%.2f",asphaltcost));
        System.out.println("Cost of Stoplights             : $"+String.format("%.2f",stoplightcost));
        System.out.println("Cost of Conduit Pipes          : $"+String.format("%.2f",pipecost));
        System.out.println("Cost of Labor                  : $"+String.format("%.2f",laborcost));
        System.out.println("Total cost of Project ============");
        System.out.println("Total cost of project          : $"+String.format("%.2f",projectcost));
		

	}

}
