package basicSorting;
import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;

public class Generics {
	public static <E extends Comparable<E>> void selectionSort(E[] list)
    {
        Arrays.sort(list);
    }
	
	public static <E extends Comparable<E>> void selectionSortDecending(E[] list)
    {
		Arrays.sort(list, Collections.reverseOrder());
    }

	public static <E extends Comparable<E>> void selectionSortCaseSensitive(E[] list)
    {
		Arrays.sort(list);
    }
	
	public static <E extends Comparable<E>> void selectionSortDecendingCaseSensitive(E[] list)
    {
		Arrays.sort(list, Collections.reverseOrder());
    }
	
	public static <E extends Comparable<E>> void selectionSortCaseInsensitive(E[] list)
    {
		Arrays.sort(list, Collator.getInstance());
    }
	
	public static <E extends Comparable<E>> void selectionSortDecendingCaseInsensitive(E[] list)
    {
		Arrays.sort(list, Collator.getInstance().reversed());
		//Arrays.sort(list, Collections.reverseOrder());
    }
	
    public static <E> void printArray(E[] list)
    {

        for(int i=0; i<list.length; i++)
        {
            System.out.print(list[i] + ", ");
        }
    }
}

