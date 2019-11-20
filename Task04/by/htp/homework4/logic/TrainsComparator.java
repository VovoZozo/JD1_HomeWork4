package by.htp.homework4.logic;

import java.util.Comparator;
import by.htp.homework4.entity.Train;

public class TrainsComparator implements Comparator<Train> {
 
    @Override
    public int compare(Train o1, Train o2) {
    	
        int flag = o1.getDestination().compareTo(o2.getDestination());
         
        if(flag == 0) flag = o1.getDepartureHour() - (o2.getDepartureHour());
        
        if(flag == 0) flag = o1.getDepartureMinute() - (o2.getDepartureMinute());
        
        return flag;
        
    }

	public static Comparator<Train> trainNumberComparator = new Comparator<Train>() {

		@Override
		public int compare(Train e1, Train e2) {
			return (int) (e1.getTrainNumber() - e2.getTrainNumber());
		}
	};

	public static Comparator<Train> departureHourComparator = new Comparator<Train>() {

		@Override
		public int compare(Train e1, Train e2) {
			return e1.getDepartureHour() - e2.getDepartureHour();
		}
	};

	public static Comparator<Train> departureMinuteComparator = new Comparator<Train>() {

		@Override
		public int compare(Train e1, Train e2) {
			return e1.getDepartureMinute() - e2.getDepartureMinute();
		}
	};
	
	public static Comparator<Train> departureHourAndMinuteComparator = new Comparator<Train>() {

		@Override
	    public int compare(Train o1, Train o2) {
	    	
	        int flag = o1.getDepartureHour() - o2.getDepartureHour();
	        
	        if(flag == 0) flag = o1.getDepartureMinute() - (o2.getDepartureMinute());
	        
	        return flag;
	        
	    }
	};

	public static Comparator<Train> destinationComparator = new Comparator<Train>() {

		@Override
		public int compare(Train e1, Train e2) {
			return e1.getDestination().compareTo(e2.getDestination());
		}
	};

	public static Comparator<Train> pointDepartureComparator = new Comparator<Train>() {

		@Override
		public int compare(Train e1, Train e2) {
			return e1.getPointDeparture().compareTo(e2.getPointDeparture());
		}
	};
}