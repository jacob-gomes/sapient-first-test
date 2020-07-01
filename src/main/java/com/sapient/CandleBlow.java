package com.sapient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Hello world!
 *
 */
public class CandleBlow 
{
    public static void main( String[] args )
    {
        System.out.println( findUniqueHeights(args) );
    }

	public static Integer findUniqueHeights(String[] args) {
		List<Integer> candleHeights;
		
		if(null == args || args.length ==0) {
			return 0;
		}
		
		candleHeights = new ArrayList<>();
		
		Arrays.asList(args).stream().forEach(str ->{
			Integer newEntry = Integer.parseInt(str);
			boolean entryPresent = false;
			
			for(Integer height: candleHeights) {
				if(height == newEntry) {
					entryPresent = true;
					break;
				}
			}
			if(!entryPresent) {
				candleHeights.add(newEntry);
			}
		});
		return candleHeights.size();
	}
}
