import java.util.LinkedList;

class Snippet{
	

static LinkedList<Pair<Integer,Integer>> pairs = new LinkedList<Pair<Integer, Integer>>();
 
    public static String isItPossible(Integer a, Integer b, Integer c, Integer d){
        pairs.addLast(new Pair<Integer, Integer>(a,b));
        while (!pairs.isEmpty()){
            Pair<Integer,Integer> pair = pairs.poll();
            Integer key = pair.getKey();
            Integer value = pair.getValue();
            if(key.equals(a) &&
                    value.equals(b)){
                return "YES";
            }
            int sum=key+value;
            if (sum<=c){
                pairs.addLast(new Pair<Integer, Integer>(sum,value));
            }
            if (sum<=d){
                pairs.addLast(new Pair<Integer, Integer>(key,sum));
            }
 
        }
 
        return "NO";
    }
    
    class Point{
    	int x;
    	int y;
    	Point(int x,int y){
    		this.x=x;
    		this.y=y;
    	}
    }
}