For the class diagram in Question 1, create a
main method and do the following inside.
        (a) Create 3 SingleRoom objects, add them to a LinkedList named singleRooms.
        (b) Sort objects in the list by their PricePerNight values (Hint: Use Comparator interface)
        (c) Sort the elements in the list and print them using foreach loop.



class PricePerNightComparator implements Comparator<Room>{
    @Override
    public int compare(Room r1, Room2){
        return Double.compare(r1.gettPricePerNight(), r2.getPricePerNight());
    }
}

public class Main {
    public static void main(String[] args){
        SingleRoom room1 = new SingleRoom(101, 120.0);
        SingleRoom room2 = new SingleRoom(102, 100.0);
        SingleRoom room3 = new SingleRoom(103, 150.0);

        LinkedList<SingleRoom> singleRooms = new LinkedList<>();
        singleRooms.add(room1);
        singleRooms.add(room2);
        singleRooms.add(room3);

        Collections.sort(singleRooms, new PricePerNightComparator());
        System.out.println("Rooms sorted by price per night:");
        for (SingleRoom room : singleRooms) {
            System.out.println(room.displayDetails());
        }
    }
}