import java.util.EnumMap;
import java.util.Map;

enum Color {��ɫ,��ɫ,��ɫ};
public class EnumMapDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumMap<Color,String> eMap = new EnumMap<Color,String>(Color.class);
		eMap.put(Color.��ɫ, "RED");
		eMap.put(Color.��ɫ, "GREEN");
		eMap.put(Color.��ɫ, "BLUE");
		
		for(Map.Entry<Color, String> me:eMap.entrySet()) {
			System.out.println(me.getKey() + "---->" + me.getValue());
		}
	}
}