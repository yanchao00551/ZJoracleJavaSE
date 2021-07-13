import java.util.EnumMap;
import java.util.Map;

enum Color {红色,绿色,蓝色};
public class EnumMapDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumMap<Color,String> eMap = new EnumMap<Color,String>(Color.class);
		eMap.put(Color.红色, "RED");
		eMap.put(Color.绿色, "GREEN");
		eMap.put(Color.蓝色, "BLUE");
		
		for(Map.Entry<Color, String> me:eMap.entrySet()) {
			System.out.println(me.getKey() + "---->" + me.getValue());
		}
	}
}