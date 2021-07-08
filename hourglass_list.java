import java.util.*;
import static java.lang.System.out;
class Load { 
    public static void main( String ... args ) { 

        List<List<Integer>> array = new ArrayList<List<Integer>>();

        Scanner input = new Scanner(System.in);
       
        out.println("Enter the values:");

        for( int i = 0 ; i < 6 ; i++ ) { 
            // add row:
            List<Integer> list = new ArrayList<Integer>();
            array.add( list );
            for( int j = 0 ; j < 6 ; j++ ) { 
                // add a column:
                // array.get( array.size() -1 ).add( 1 ); or
                list.add( input.nextInt() );
            }
        }
        int sum,maxscore=-9999999;
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<4;j++)
        {
            sum=array.get(i).get(j)+array.get(i).get(j+1)+array.get(i).get(j+2)+array.get(i+1).get(j+1)+array.get(i+2).get(j)+array.get(i+2).get(j+1)+array.get(i+2).get(j+2);
            maxscore = Math.max(maxscore,sum);
        }
    }
        out.println( array );
        out.println("Sum is : "+maxscore);
    }
}